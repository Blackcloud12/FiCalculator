package FinancialFlow.sortMethods

import FinancialFlow.DebtItem

class DebtSnowball : SortMethod {
    override val methodName: String = "Debt Snowball Method"

    override fun sort(list: List<DebtItem>): List<DebtItem>{
        return list.sortedBy { d -> d.balance }
    }
}