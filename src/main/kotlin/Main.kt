fun main() {
var human=Human("Apiu",23,20)
    human.eat(3)
    human.weight
    println(human.weight)
    human.speak("graet")
    human.birthday()

    println(human.age)
    var user = User("Glory","Sniada","apiuagou@gmail.com","0704586024","lofty")

    println(user.firstName)
    println(user.email)
    }







class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("i am eating $foodWeight kgs of food")
        weight+=foodWeight


    }
    fun speak(speech:String){
        println(speech)



    }
    fun birthday(){
        age+1


    }

    }
data class User(var firstName: String,var lastName:String,var email:String,var number:String,var password:String){

}
