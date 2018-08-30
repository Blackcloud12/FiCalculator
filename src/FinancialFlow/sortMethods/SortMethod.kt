package FinancialFlow.sortMethods

import FinancialFlow.DebtItem

interface SortMethod {
    val methodName:String
    fun sort(list: List<DebtItem>) : List<DebtItem>
}
