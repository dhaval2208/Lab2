

object LAB2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val option = Scanner(System.`in`)

//ask option from user for option
        println("choose your option")
        println("1 :- search number")
        println("2 :- Average")
        println("3 :- Array reverse")
        println("4 :- Ceasar cipher")
        val choice = option.nextInt()
        when (choice) {
            1 -> {
                //asking total number for search number
                println("Enter the total number of value for search")
                val value = option.nextInt()
                val search = IntArray(value)
                var i = 0
                while (i < value) {
                    println("Enter the number$i")
                    search[i] = option.nextInt()
                    i++
                }
                println("Enter the numbers to be search")
                val count = option.nextInt()
                arraycontains(search, count)
            }

            2 -> {
                //asking total value for average
                println("Enter the total number of values for average")
                val digit = option.nextInt()
                val average = IntArray(digit)
                var i = 0
                while (i < digit) {
                    println("Enter the number$i")
                    average[i] = option.nextInt()
                    i++
                }
                arrayavg(average)
            }

            3 -> {
                //asking total number for array reversed
                println("Enter the total number of value to be reversed")
                val reversenumber = option.nextInt()
                val reverse = IntArray(reversenumber)
                var i = 0
                while (i < reverse.size) {
                    println("Enter the value$i")
                    reverse[i] = option.nextInt()
                    i++
                }
                arrayreverse(reverse, reversenumber)
            }

            4 -> {
                // asking string value for string encrypt
                println("Enter the name to be encrypt")
                val encrypt = option.next()
                println("Enter the number to be change")
                val changevalue = option.nextInt()
                val encryptedvalue = Ceaser_cipher(encrypt, changevalue)
                println("Encrypted name is  : $encryptedvalue")
            }

            else -> println("choose the valid option")
        }
    }

    fun arraycontains(search: IntArray, count: Int) {
        var test = false
        //using loop for serch value
        for (k in search.indices) {
            //if user enter number is include array output is true
            if (count == search[k]) {
                test = true
            }
        }
        //System.out.println(test);
    }

    fun arrayavg(average: IntArray) {
        // sum value is zero
        var sum = 0f
        // The loop will run until the user input the value
        for (j in average.indices) {
            // it will sum up all the value
            sum += average[j].toFloat()
        }
        // its logic of avrage find sum devide number of value
        val avg = sum / average.size
        println(" Average of numbers is : $avg")
    }

    fun arrayreverse(reverse: IntArray, reversenumber: Int) {
        val updatedarray = IntArray(reversenumber)
        var j = reversenumber
        // the loop will run until the last value
        for (i in 0 until reversenumber) {
            updatedarray[j - 1] = reverse[i]
            j = j - 1
        }
        println("The reverse number is")
        for (m in 0 until reversenumber) {
            println(updatedarray[m].toString() + " ")
        }
    }

    fun Ceaser_cipher(encrypt: String, changevalue: Int): String {
        var encryptedvalue = ""
        var name: Char
        //the loop will run until the last letter
        for (i in 0 until encrypt.length) {
            name = encrypt[i]
            if (name >= 'a' && name <= 'z') {
                name = (name.code + changevalue).toChar()
                if (name > 'z') {
                    name = (name.code + 'a'.code - 'z'.code - 1).toChar()
                }
                encryptedvalue = encryptedvalue + name
            } else if (name >= 'A' && name <= 'Z') {
                name = (name.code + changevalue).toChar()
                if (name > 'z') {
                    name = (name.code + 'A'.code - 'z'.code - 1).toChar()
                }
                encryptedvalue = encryptedvalue + name
            } else {
                encryptedvalue = encryptedvalue + name
            }
        }
        return encryptedvalue
    }
}
