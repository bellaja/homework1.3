package ru.netology
fun main(args: Array<String>) {
    println(calculatePrice(500, 1, true))

}

val discount = 100
val premiumDiscount = 1 - 0.05
val vipDiscount = 1 - 0.01
var totalPrice = 0
fun calculatePrice(amount: Int,
                   itemCount: Int,
                   buyer: Boolean): Int {
    val result = amount * itemCount
    when {
        amount > 0 && amount < 1001 -> if (buyer === false) totalPrice = result
        amount > 1000 && amount < 10001 -> if (buyer === false) totalPrice = result - discount
        amount > 10_000 -> if (buyer === false) {
            totalPrice = (result * premiumDiscount).toInt()
        } else totalPrice = ((result * premiumDiscount) * vipDiscount).toInt()
    }
    return totalPrice
}





