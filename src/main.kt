fun main() {
   name()
    var y=parameter("Epuu",25)
    println(y)
    var name=country("Kenya")
    println(name.count())
    goodname("Lucy Amekwi")
}

fun name(){
    var name="Akirachix"
    var y =name[0].toString()+name[2]+name[3]
    println (y)

}
fun parameter(name:String, age:Int){
    println("Hi, my name is $name and I am $age years old")
}
fun country(name:String):String{
    return name
}
fun goodname(name:String){
    if(name==("Lucy Amekwi")){
        println("that is me!")

    }
    else
        println("I don't know who that is")
}