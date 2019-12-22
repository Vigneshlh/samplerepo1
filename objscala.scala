package org.inceptez.scala

object objscala {

	//main method is the entry point of the scala program

	def main(args:Array[String])
	{
		//semicolon is optional
		//single line and /* */ multi line comments

		println("Welcome to Scala...")
		println("Welcome to Inceptez..")

		/* 1. SCALA VALUES
		 * Two types of variables
    		1. Mutable Variable - can change value
    		2. Immutable Variable - only assign value, cannot change 
		 * */

		val bonus2:Int = 1000
		var salary:Int = 20000

		//bonus2 = 2000

		//Not allowed to reassign value because declared as val

		//Able to reassign value because declared as var

		salary = bonus2 + 1000;

		println("Variable Types..")

		/*Type Inference - compiler can infer the datatype based on the assignment 

		 * */	
		println("Type Inference..")
		val a = 10
		var b = 20.0

		//statically typed -  each variable and expression is already known at compile time
		//cannot assign different datatype once the value is assigned
		var name = "Inceptez"
		name = "Inceptez Technologies Pvt Ltd"
		println(name)
		//name = 25
		println("Statically Type..")


		// 2. DATATYPE 


		//Byte: Byte is an 8 bit signed value.The value ranges from -128 to 127
		val num0:Byte = 100
		println("Num0 of Byte type is " + num0);
		//Short: is an 16 bit signed value ranging from -32768 to 32767
		val num1:Short = 10

				//Int: is an 32 bit signed value ranging from -2147483648 to 2147483647
				val num2:Int = 100

				//Long: is a 64 bit signed value ranging from -9223372036854775808 to 9223372036854775807
				val num3:Long = 100

				//Float: is a 32 bit floating point ranges 6-7 decimal digits precision
				val num4:Float = 250.25f

				//Double: is a 64 bit double with 15-16 decimal digits precision
				val num5:Double = 250.25

				//Boolean: literal with true and false values
				val bstr:Boolean = true

				//Char: is a 16 bit unsigned unicode character ranging from U+0000 to U+FFFF.
				val cstr:Char = 'A'

				//Unit: Corresponds to no value
				val str4:Unit = ()

				//AnyVal: is the root class of all value types

				val av1:AnyVal = 10
				val av2:AnyVal = 10.0
				val av3:AnyVal = 'D'
				val av4:AnyVal = ()

				val a1:AnyVal = 10

				/******DataTypes - Any type**************/

				//Any: Super type of any value or reference type
				val atype1:Any = "Inceptez"
				val atype2:Any = 100
				val atype3:Any = 200.50
				val atype4:Any = 'G'
				val atype5:Any = null


				/* 3. SCALA BASICS
				 * if statement consists of Boolean expression followed by one or more statements.

    Syntax:
    if(boolean_expression) {
				statements
			}
				 * */	

				var studmarks = 75

				if( studmarks > 65) 
				{
					println("Student passed the exam with distinction")
				}

				//Else
				var marks1 = 80
						if( marks1 > 65) 
						{
							println("Student passed the exam with distinction")

						} 
						else 
						{
							println("Student mark is less than 65")
						}

				//Else If
				val x =10;
				val attendance="p";
				var marks = 90;
				//mark 70 and 40 - c, mark 71 and 79 - b, mark 71 and 79 - b


				if ((marks == 0 | attendance != "p") & x==10)
					println("Either Student didnt attended exam or he scored 0");
				else 
				{  
					if ( attendance == "p") 
					{
						if ( marks < 70 & marks > 40)
						{
							println("Grade is C")
						}
						else if(marks >= 70 & marks < 80) 
						{
							println("Grade is B")
						} 
						else if(marks >= 80 & marks < 90) 
						{
							println("Grade is A")
						} 
						else if(marks >= 90) 
						{
							println("Grade is A+")
						} 
						else 
						{
							println("Student is not performing well hence no grade is awarded")
						}
					}
				}


				/* Control Statements */	

				//print numbers from 1 to 10
				val n=10;
				for(i <- 1 to n)
				{
					println("For Loop : " + i)
				}

				//Decrement from 10 to 1
				for(i <- 10 to 1 by -1)
				{
					println("Negative For Loop : " + i)
				}

				//using until which will not include the final number
				for(i <- 1 until 10)
				{

					println("For loop until : " + i)
				}

				//using while loop
				var i = 0;
				while (i <= 10)
				{
					println("while loop : " + i)
					i = i + 1
				}

				//using do while loop

				var j = 20;
				do
				{

					println("Do while : " + j)
					j = j + 1

				}
				while(j <= 10)

					// multi level looping      
					for(i <- 1 to 10; j <- 1 to 3)
					{
						println("i value:" + i + " j value:" + j)
					}


				// 4. SCALA METHODS AND FUNCTIONS
				//   Methods, accept/returns arguments or not (Unit), overloading 

				/* Methods in Scala
     Syntax:
         def functionName(parameters : typeofparameters) : returntypeoffunction = 
         {  
    				statements to be executed  
    		 }  
				 * */
				println(add1(100,200));
				println(add2(150,300));
				println(add3(100,400));
				println(add4(20,3));
				println(add5(200,500));
				println("add5 curly braces is optional if there is no more than 1 expression")
				println(add6(100));
				println(add6("200" ));
				println(add6("How are you"," doing"));

				//Anonymous function or Lambda function or Function literal
				// Functions -> Ananymous, lambda, literals, value functions - quick functionalities 
				// without considering reuability accross , cant have return keyword

				println(sub(20,50))


				def calcuator(a:Int,b:Int,op:String):Any = 
				op match
				{

				case "add" | "addition" =>
				{
					println("Add Numbers")
					a + b
				}
				case "sub" | "subtract" =>
				{
					println("Sub Numbers")
					a - b
				}
				case "mul" | "multiply" =>
				{
					println("Multiply Numbers")
					a * b
				}
				case _ =>
				{
					println("Operation Not matched")
					"No Match"
				}
				}


				/* 5. SCALA COLLECTIONS
				 * Seq -
				 * 			- mutable Array
				 * 			- immutable List
				 *      
				 * */


				// Also we can define as
				var s2 = Seq(10,20,30,40,50)
						//s2(4) =40 
						println("This shows Seq is mutable " + s2(4))

						//An array is sequential and is of a fixed size.
						//Array - Array in scala is sequential, fixed in size and mutable 


						//Declare Array with 1 element with type of Int
						val ar1 = Array(1,2,3,4,5)

						println("Fourth element of Array(1,2,3,4,5) is : " + ar1(3))

						//Creating array with range
						println(ar1(1));
				println(ar1.length)

				ar1.sorted.take(3).foreach(println)
				ar1.contains(1)
				println(ar1.length)
				println(ar1.isEmpty)
				ar1.sorted
				ar1(2)=10;

				ar1(3)=100;         

				/*
				 * A list of Scala Collections is much like a Scala array. 
				 * Except that, it is immutable and represents a linked list. 
				 * An Array, on the other hand, is flat and mutable.
				 */

				val lst = List(10,20,30,40)

						val fruits = List("apples", "oranges", "mangoes")

						val g = fruits(0)

						var list = List(1,8,5,6,9,58,23,15)
						//var list11 = List(List(1,"a",100000),List(2,"b",200000))

						//Access value from the list
						//list(2) = 10
						val lstval = list(0)

						//Merging 2 list
						var list3 = list ++ lst 
						//or
						var list4 = list ::: lst 

						println(list3)
						println(list4)

					Println("Edited")	println(list.contains(2))

						println(list4.head)
						list4.tail.foreach(println)
						println(list4.length)
						println(list4.isEmpty)
						list4.sorted.foreach(println)
						list4.reverse.foreach(println)


						/*
   Tuples are immutable, contains fixed length of different type elements
						 */

						val emp = (101,"Karthik",200.00)
						val empid = emp._1
						val empname = emp._2
						val empsal = emp._3

						val emp1 = (101,"Karthik",200.00,("New Street","Chennai","TN"))

						val empcity = emp1._4._2


						//// ARRAY PROGRAMS

						val ar222=Array[Int]();
				if (ar222.isEmpty)
				{
					println("Array is empty");
				}


				/*
				 * A Map in Scala is a collection of key-value pairs, and is also called a hash table. 
				 * We can use a key to access a value. 
				 * Keys are unique and values may be in common
				 * Map is by default immutable   	 
				 * */

				var m = Map("Mani" -> 10000,"Karthik" -> 20000)

						//Add an element
						m += ("Raj" -> 30000) 

						//Remove an element
						m -= ("Mani")

						//println(m)
						var m2 = Map.empty[String,String]

								//Add multiple Map elements

								m2 += ("1"->"A","2"->"B")
								println(m2)


								//Immutable map, doesn't allow to modify but allows to add or remove by recreating

								var immutablemap = scala.collection.immutable.Map(1 -> "Alto",2 -> "Swift")  

								immutablemap -= (2)

								//Below update is not possible
								//immutablemap(1)="Alto k10"

								var mutablemap = scala.collection.mutable.Map(1 -> "Alto",2 -> "Swift")
								mutablemap(1)="Alto k10"

								m.keys
								m.values
								m.isEmpty

								val lst1 = m.toList
								val arr = m.toArray


	}  

	// no return values
	def add1(a:Int,b:Int):Unit =  
		{
			println("add1 No return values")
			val c = a + b;
			println(c);
			//c
			//return c;

		}

	// return an expression
	def add2 (a:Int,b:Int):Int = 
		{
			println("add2 Return an expression")
			val x=a;
			val c=a+b
					return c
		}

	//return keyword optional
	def add3(a:Int,b:Int):Int = 
		{
			println("add3 Return keyword in optional")
			val y =a + b;
			a - y
		}

	//return/input datatype is optional
	def add4(a:Int,b:Int):Any=  
		{
			println("add4 Return datatype is optional")
			val x  = a.toFloat/b.toFloat;
			println(x)
			//return x
			x
		}

	//for single statement curly braces are optional
	def add5(a:Int,b:Int) = println(a + b)


			// Overloading
			def add6 (a:Int):Int = 
		{
		println("add6 Function overloading")
		return a + a
		}

	// Overloading  
	def add6(a:String):Int = 
		{
		println("add6 Function Type overloading with 1 arg")
		return 100 + a.toInt;
		} 

	def add6(a:String,b:String):String = 
		{
		println("add6 Function Type overloading with 2 args")
		return "Hello " + a;
		} 


	// Also we can define the same function in the short form assigned to a variable called as anonymous functions
	var sub = (a:Int,b:Int) => a - b


}







