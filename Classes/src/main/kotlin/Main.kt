class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "eowns36@gmail.com")

    println(contact.id)
    contact.email = "djcho@gmail.com"
    println(contact.email)
}