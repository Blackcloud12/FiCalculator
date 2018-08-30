package FinancialFlow

import FinancialFlow.sortMethods.SortMethod
import java.util.*

object DebtStacker {
    val list = ArrayList<DebtItem>()

    fun Add(item: DebtItem): Boolean {
        if(list.contains(item))
            return false
        else {
            list.add(item)
            return true
        }
    }

    fun Remove(item: DebtItem): Boolean {
        if(list.contains(item)) {
            list.remove(item)
            return true
        } else {
            return false
        }
    }

    fun Sort(method: SortMethod): List<DebtItem> {
        return method.sort(list)
    }

    fun formatToCurrency(amount: Double): String {
        var input = (String.format("%.2f", amount)).split(".")
        var dollars = input[0]
        var cents = input[1]

        val  returnString = StringBuilder()
        var counter = 0
        for(i in dollars.reversed()) {
            if (counter == 3) {
                returnString.append(",")
                returnString.append(i)
                counter = 1
                continue
            }
            counter++
            returnString.append(i)
        }
        return "$${returnString.reverse()}.$cents"
    }
}

