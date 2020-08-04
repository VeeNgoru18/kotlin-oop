package mpesa

interface Send {
    fun SearchContact(phone: String, amount: String)
    fun EnterContact(phone: String, amount: String)
}

class SendMoneyImp : Send {

    /*
    *
    * */
    override fun SearchContact(phone: String, amount: String) {
        TODO("Not yet implemented")
    }


    /*
    *
    *
    * */
    override fun EnterContact(phone: String, amount: String) {
        println("Phone: $phone")
        println("Amount: $amount")
    }


}