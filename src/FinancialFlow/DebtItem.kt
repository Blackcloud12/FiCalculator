package FinancialFlow

 data class DebtItem( val name:String,
                      val balance:Double,
                      val interestRate:Double,
                      val monthlyPayment:Double = 0.00
                    )