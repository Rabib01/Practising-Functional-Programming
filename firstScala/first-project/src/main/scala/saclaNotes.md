```scala
class Cafe:
  def buyCoffee(cc: CreditCard): Coffee =
    val cup = Coffee()
    cc.charge(cup.price)
    cup

class CreditCard:
  def charge(price: Double): Unit =
    println("charging " + price)

class Coffee:
  val price: Double = 2.0

```

# Confusing parts

cc.charge(cup.price)
Charges the credit card the coffee's price, which is 2.0.
