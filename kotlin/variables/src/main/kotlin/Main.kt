fun someCondition() = true

fun main(args: Array<String>) {
    var a: String = "initial";    //1
    println(a)
    val b: Int = 1                //2
    val c = 3;                    //3

    val d: Int             //1
    if(someCondition()){
        d = 1              //2
    }else{
        d = 2              //2
    }

    println(d)             //3
}