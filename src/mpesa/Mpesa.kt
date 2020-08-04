package mpesa


/*
*  This is an  abstraction  that helps main mpesa
*
* */
abstract class Mpesa {

    /*
    *
    * */
    abstract fun SendMoney()

    /*
    *
    * */
    abstract fun WithdrawCash()

    /*
    *
    * */
    abstract fun BuyAirtime()

    /*
    *
    * */
    abstract fun LoanSavings()

    /*
    *
    * */
    abstract fun LipaMpesa()

    /*
    *
    * */
    abstract fun MyAccount()

}