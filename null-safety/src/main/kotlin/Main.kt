fun main() {
//    var neverNull: String = "This can't be null"            //1
//
//    neverNull = null                                        //2
//
//    var nullable: String? = "You can keep a null here"      //3
//
//    nullable = null                                         //4
//
//    var inferredNonNull = "The compiler assumes non-null"   //5
//
//    inferredNonNull = null                                  //6
//
//    fun strLength(notNull: String): Int {                   //7
//        return notNull.length
//    }
//
//    strLength(neverNull)                                    //8
//    strLength(nullable)                                     //9

      println(describeString(null))
}

fun describeString(mayString: String?): String{
    if(mayString != null && mayString.length > 0){         //1
        return "String of length ${mayString.length}";     //2
    }else {
        return "Empty or null string";                     //3
    }
}