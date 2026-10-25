@main def hello(): Unit =
  val cc = CreditCard()                         
  val cafe = Cafe()
  val cup = cafe.buyCoffee(cc)
  
  println("Hello world!")
  println(msg)
   

def msg = "I was compiled by Scala 3. :)"
