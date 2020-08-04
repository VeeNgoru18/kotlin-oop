package mpesa


class MpesaImp : Mpesa() {

    /*
    *
    * */
    override fun SendMoney() {
        SendMoneyImp().EnterContact("254746445198","200")
    }

    /*
    *
    * */
    override fun WithdrawCash() {
        TODO("Not yet implemented")
    }

    /*
    *
    * */
    override fun BuyAirtime() {
        TODO("Not yet implemented")
    }

    /*
    *
    * */
    override fun LoanSavings() {
        TODO("Not yet implemented")
    }

    /*
    *
    * */
    override fun LipaMpesa() {
        TODO("Not yet implemented")
    }


    /*
    *
    * */
    override fun MyAccount() {
        TODO("Not yet implemented")
    }

}


fun main() {
    var mpesa = MpesaImp()
    mpesa.SendMoney()
}