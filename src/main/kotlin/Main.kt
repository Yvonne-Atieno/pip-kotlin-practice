fun main(){
personDetails("Lucy",23,"kenyan")
    sumNumbers(1,2,3,4)
    var sum=returnAverage(1,2,3,4,5)
    println("The averrage as $ sum")
}
//Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya”

fun personDetails(name:String,Age:Int,nationality:String){
    println("Hello my name is $, I am $ age years old and I am from $ nationality")
}

//Create and invoke a function that returns the sum of any given 4 numbers.
fun sumNumbers(num1:Int,num2:Int,num3:Int,num4:Int):Int{
   var sum= num1 + num2 +  num3 + num4
    return sum

}


//Create and invoke a function that given any 5 numbers, it returns their average
fun returnAverage(num1: Int,num2: Int,num3: Int,num4: Int,num5:Int):Double{
    return (num1 +num2 + num3 +num4 +num5)/5

}





//You are creating an app to capture a person’s records. Some of the data you will
//apture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun person(
    fullName:String,
    age:Int,
    phoneNumber: String,
    email:String,
    weight:Double,
    isUgandanCitizen:Boolean
){
    println(isUgandanCitizen)
}
