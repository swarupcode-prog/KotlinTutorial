
/*
*   Class, Primary Constructor, Secondary Constructor and Init Block
* */

** When we use var with name  it basically makes it the property of the class **
fun main(args: Array<String>) {

    var student = Student("Steve", 10)

    println(student.id)
}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int): this(n) {
        // The body of the secondary constructor is called after init block
        this.id = id
    }
}

/*Other Way Of Variable Assigning
*/
* */
fun main(args: Array<String>) {

    var student = Student("Steve", 10)

    println(student.id)
}

class Student(name: String) {

    var id: Int = -1
    var name : String

    init {
        this.name = name
        println("Student has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int): this(n) {
        // The body of the secondary constructor is called after init block
        this.id = id
    }
}

/*doing it by the java way*/
// Class Declaration

public class Dog
{
	// Instance Variables
	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class
	public Dog(String name, String breed,
				int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1
	public String getName()
	{
		return name;
	}

	// method 2
	public String getBreed()
	{
		return breed;
	}

	// method 3
	public int getAge()
	{
		return age;
	}

	// method 4
	public String getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
		return("Hi my name is "+ this.getName()+
			".\nMy breed,age and color are " +
			this.getBreed()+"," + this.getAge()+
			","+ this.getColor());
	}

	public static void main(String[] args)
	{
		Dog tuffy = new Dog("tuffy","papillon", 5, "white");
		System.out.println(tuffy.toString());
	}
}


