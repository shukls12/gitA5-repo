import java.util.Scanner; // Import the Scanner class

class MyClass {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input
        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input
        sum = x + y; // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum
    }
//adding a new block 
void addition(double a,double b)
{
// hotfix code  
double c=a+b;
system.out.println("addition of two floating nos are "+c);
}

<<<<<<< HEAD
=======
}
}

//featureA  block adding string to int code
void  StringToIntExample {
        String numberAsString = "1234";
        int number = Integer.parseInt(numberAsString);
        System.out.println(number);
    }
//Adding one more block in featureA
System.out.println("In FeatureB");

}
>>>>>>> release/1.0.0
