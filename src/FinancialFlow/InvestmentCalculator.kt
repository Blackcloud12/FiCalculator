package FinancialFlow

class InvestmentCalculator(val balance: Double,
                           val interestRate: Double,
                           val contribution: Double,
                           val yearsInvested: Int) {

    init {
        runSimulation() // for debugging purposes
    }

    fun runSimulation() {
        var currentBalance = balance
        var currentInterestRate = (interestRate / 100) + 1
        println("Interest rate: $currentInterestRate")
        for(i in 1..yearsInvested) {
            if(contribution != 0.00)
                currentBalance += contribution * 12
            currentBalance *= currentInterestRate
            println("Year %2d: balance = %s".format(i, DebtStacker.formatToCurrency(currentBalance)) )
        }
    }
}