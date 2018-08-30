import FinancialFlow.DebtItem
import FinancialFlow.DebtStacker
import FinancialFlow.InvestmentCalculator
import FinancialFlow.sortMethods.DebtAvalanche
import FinancialFlow.sortMethods.DebtSnowball

fun main(args: Array<String>) {
    InvestmentCalculator(60000.00, 10.00, 0.00, 30)
    println("\n")

    val expenses = 2000.00
    val fiNumberGenerator = FinancialFlow.FIFinder(expenses)
    println("Fi Number at 25x: %s".format(DebtStacker.formatToCurrency(fiNumberGenerator.FiNumber)))
    println("Fat Fi Number at 30x: %s".format(DebtStacker.formatToCurrency(fiNumberGenerator.FatFiNumber)))
    println()
    val debt1 = DebtItem("TSP Loan",14569.36, 1.8)
    val debt2 = DebtItem("School Loan",13710.69, 3.5)
    val debt3 = DebtItem( "Citicard CC",392.78, 11.74)

    DebtStacker.Add(debt1)
    DebtStacker.Add(debt2)
    DebtStacker.Add(debt3)


    val ds = DebtStacker.Sort(DebtSnowball())
    val da = DebtStacker.Sort(DebtAvalanche())

    println("Method Used: Debt Snowball")
    for(i in ds){
        println("%s\t\t$%-10.2f\t\t%-10.2f".format(i.name, i.balance, i.interestRate))
    }

    println("\n")

    println("Method Used: Debt Avalanche")
    for(i in da){
        println("%s\t\t$%-10.2f\t\t%-10.2f".format(i.name, i.balance, i.interestRate))
    }

    var ic = InvestmentCalculator(131762.00, 8.00, 1320.54, 12)
}