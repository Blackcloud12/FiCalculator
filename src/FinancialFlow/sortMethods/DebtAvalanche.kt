package FinancialFlow.sortMethods

import FinancialFlow.DebtItem

class DebtAvalanche : SortMethod {
    override val methodName: String = "Debt Avalanche Method"

    override fun sort(list: List<DebtItem>): List<DebtItem>{
        return list.sortedBy { d -> d.interestRate }
    }
}

