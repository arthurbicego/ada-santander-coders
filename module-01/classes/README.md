# Module 1 - Classes

<details>
<summary>Object Oriented Prgramming</summary>

### Functional Programming

```
Functional programming (FP) is a programming paradigm based on the concept of pure functions, which avoid changing state and mutable data. It treats computation as the evaluation of mathematical functions and emphasizes immutability and higher-order functions to create modular and predictable code.
```

```Java
Integer n = 7;
List<Integer> list = List.of(0,1,2,3,4,5,6,7,8,9,10);

list.forEach((i)->System.out.println("7 + " + i + " = " + (7+i)));
```

### Object Oriented Prgramming

```
Object-oriented programming (OOP) is a programming paradigm based on the concept of objects, which can contain data and code: data in the form of fields (often known as attributes or properties), and code in the form of procedures (often known as methods).
```

</details>

---

<details>
  <summary>Variables and Types</summary>

### Primitive and Wrap Types

```Java
// the word 'final' defines a fixed value for the variable.
final Short FIRST_NUMBER = 100;
short firstNumber = 100;

Integer m1 = 1000000;
int m = 1000000;

Long a1 = 1000000000L;
long a = 10000000000L;

Float c1 = 100000f;
float c = 1.0000f;

Double y1 = 100.0;
double y = 2.00000000000000;
// or
double z = 2.00000000000000d;

Boolean q1 = false;
boolean q = false;

//A part of UNICODE is the charset. UTF-8
Character w1 = 'P';
char w = 'P';

//A String is not a Wrap it is only an object.
String name = "Pedro";

//var is used for Java defines the type.
//var num5 = '0';
```

### Object Equals and get Class

```Java
Object number1 = 10.0;
Object number2 = "10.0";

System.out.println(number1.equals(number2));
System.out.println(number1.getClass().getName());
System.out.println(number1 instanceof Double);
```

</details>

---

<details>
  <summary>Casting</summary>

```Java
short firstNumber = 123;
int m = 1000;
firstNumber = (short) m;
System.out.println(firstNumber);

// Casting is recommended only adapting a high hierarchy to its child.
// i.e: Object num1 = 10.0;
// Double num2 = (Double) num1;

//Casting primitive numbers:
double num3 = 121.33;
var num4 = 123;
num4 = (int) num3;

//Casting Wrap numbers
Double num6 = 121.33;
var num7 = 123;
num7 = num6.intValue();
String num8 = "121.33";
num7 = Integer.parseInt(num8);

//Casting from Double to String
String.valueOf(num6);
num6.toString();
```

</details>

---

<details>
  <summary>Big Types</summary>

```Java
BigInteger intBig = new BigInteger("12");
intBig = intBig.add(new BigInteger("6"));
System.out.println(intBig);

//decBig has many methods to calculate something
BigDecimal decBig = new BigDecimal("12.14241312312421");
decBig = decBig.setScale(2, RoundingMode.DOWN);
System.out.println(decBig);
```

</details>

---

<details>
  <summary>Inputs and Outputs</summary>

### Inputs
```Java
Scanner scanner = new  Scanner(System.in);

String emailLogin = "arthurbq5@gmail.com";
System.out.println("Type your e-mail: ");
String email = scanner.nextLine();

System.out.println(emailLogin.equals(email));
```


### Outputs

```Java
System.out.print("Welcome\t");
System.out.print("Arthur");

System.out.println("Welcome");
System.out.println("Arthur");

String name = "Arthur";
Integer age = 12;
Double LuckyNumber = 25.1232;

//Locale.setDefault(Locale.US) - since printf formats the number to your local machine's default, you can change the formatting using Locale (. instead of ,) ;
System.out.printf("Welcome %s, your age is %d and your lucky number is %.2f", name, age, LuckyNumber);
```

</details>

---

<details>
  <summary>String Functions</summary>

### String Manipulation

```Java
Scanner scanner = new Scanner(System.in);

System.out.println("Type your email: ");
String email = scanner.nextLine();

// .trim: remove spaces from beginning and end
System.out.println(email.trim());

// .toLowerCase
System.out.println(email.toLowerCase());

// .toUperCase
System.out.println(email.toUpperCase());
```

### String Validation

```Java
Scanner scanner = new Scanner(System.in);

System.out.println("Type your email: ");
String email = scanner.nextLine();

// .contains: checks if a string contains another string.
System.out.println("Contains @: " + email.contains("@"));
System.out.println("Contains .: " + email.contains("."));

//.length returns the number of characters
System.out.println("Email size: " + email.length());
System.out.println("Minimum size: " + (email.length() >= 5));

// .indexOf returns the position of a character in a String.
System.out.println("Validate characters before @:" + (email.indexOf("@") > 0));

// .substring returns a piece of the String (1 - puts only the initial position until the end of the String; 2 - defines the initial and final position of the String).
String emailAfterAtSign = email.substring(email.indexOf("@"));

System.out.println("Validate characters between @ e .:" + (emailAfterAtSign.indexOf(".") > 1));

System.out.println("Validate characters after .:" + (emailAfterAtSign.length() > emailAfterAtSign.indexOf(".") + 1));

// .split splits the string into an array by the number of times according to the declared criteria
System.out.println("Split array: " + Arrays.toString(email.split("@")));
        System.out.println("Validate just one @: " + (email.split("@").length == 2));
```

### String Handling

```Java
Scanner scanner = new Scanner(System.in);

System.out.println("Type the name: ");
String nome = scanner.nextLine();

// Every String is immutable - wherever change you do in String you are creating another String.
nome = nome.toUpperCase();

String firstUpperCase = nome.substring(0, 1).toUpperCase();
// If you want to get only 1 character:
// Character firstUpperCase = nome.toUpperCase().charAt(0);

String nameWithoutFirst = nome.substring(1).toLowerCase();
String nameHandled = firstUpperCase + nameWithoutFirst;
System.out.println(nameHandled);

//it does not counter spaces
System.out.println(nome.isEmpty());

//it counters spaces
System.out.println(nome.isBlank());
```

### String Handling Example: Names Handling

```Java
String namePedro = "Pedro Bomfim Costa";

String firstName = namePedro.split(" ")[0];
String secondName = namePedro.split(" ")[1];
String thirdName = namePedro.split(" ")[2];

String fullName = firstName + " " + secondName + " da " + thirdName;
System.out.println(fullName);

// Another way to do it: Handling the Array
String name = "Pedro Bomfim Costa";

String[] nameParts = name.split(" ");
nameParts[1] += " da";
name = String.join(" ", nameParts);
System.out.println(name);

// Another way to do it: Replace
name.replace("Bomfim", "Bomfim da");
```

</details>

---

<details>
  <summary>Operators</summary>

```Java
// Comparison Operators (boolean)
// >
// <
// >=
// <=
// ==
// !=

// Logical Operators (boolean)
// And: &&
// Or: ||
// Not: !

Integer i = 10;

System.out.println(i.equals(2) || i.equals(26) || i.equals(28));
// Negating the expression requires changing the operator.
System.out.println(!i.equals(2) && !i.equals(26) && !i.equals(28));
System.out.println(i >= 1 && i <= 4);
System.out.println(List.of(2,26,28).contains(i));
```

</details>

---

<details>
  <summary>Selection Structures</summary>

### If

```Java
Scanner scanner = new Scanner(System.in);

/*
System.out.println("Type your name: ");
String name = scanner.nextLine().toUpperCase();
*/

/*
if(nome.contains("A")){
    System.out.println("Your name contains A. You are at the front of the queue.");
} else if (nome.contains("B")) {
    System.out.println("Your name contains B. You are second in line.");
} else {
    System.out.println("You are at the end of the queue.");
}
*/

System.out.println("Type your age: ");
Integer age = scanner.nextInt();

if (age < 12) {
    System.out.println("You are a child.");
} else if (age < 18) {
    System.out.println("You are a teenager.");
} else if (age < 60) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are an elderly.");
}
```

### Switch case

```Java
Scanner scanner = new Scanner(System.in);
System.out.println("Type your age category: ");
String ageCategory = scanner.nextLine();

switch (ageCategory){
    case "child":
        System.out.println("You are a child.");
        break;

    case "teenager":
        System.out.println("You are a teenager.");
        break;

    case "adult":
        System.out.println("You are an adult.");
        break;

    case "elderly":
        System.out.println("You are an elderly.");
        break;

    default:
        System.out.println("Error. Category not found!");
}
```

### Enhanced Switch

```Java
Scanner scanner = new Scanner(System.in);
System.out.println("Type your age category: ");
String ageCategory = scanner.nextLine();

switch (ageCategory) {
case "child","teenager" -> {
    System.out.println("You are a child anyway.");
    System.out.println("Young!");
}

// case "teenager" -> System.out.println("You are a teenager");

case "adult" -> System.out.println("You are an adult.");

case "elderly" -> System.out.println("You are an elderly.");

default -> System.out.println("Error. Category not found!");
}
```

### Ternary Operator
```Java
Scanner scanner = new Scanner(System.in);
System.out.println("Type your age category: ");
String ageCategory = scanner.nextLine();

Integer number = ageCategory.equals("child") ? 1 : 2;
System.out.println(number);
```


</details>

---

<details>
  <summary>Function/Methods</summary>

### Function Declarations

```Java
public static void main(String[] args) {

// function accesses:
// private -> accessed only through same class
// protected -> accessed only through same class or child
// public -> accessed only through any class of the project
// no identity (package) -> accessed only through classes for same package

// No static
FunctionMethods sum = new FunctionMethods();
String result1 = sum.sumValues1(2.0,3.0);
System.out.println(result1);

// With static in the same class in both methods
String result2 = sumValues2(3.0,4.0);
// No static in the method that calls the other:
// String result2 = FunctionMethods.sumValues2(3.0,4.0);
System.out.println(result2);
}

// No static
public String sumValues1(Double number1, Double number2) {
Double sum = number1 + number2;
return sum.toString();
}

// With static
public static String sumValues2(Double number1, Double number2) {
Double sum = number1 + number2;
return sum.toString();
}
```

### Function Methods

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Double number1, number2;

    System.out.println("Enter the first number: ");
    number1 = scanner.nextDouble();
    System.out.println("Enter the second number: ");
    number2 = scanner.nextDouble();

    scanner.nextLine();

    System.out.println("Choose the desired operation (+, -, /, *): ");
    String operation = scanner.next().trim();

    switch (operation){
        case "+" -> System.out.println(sumValues(number1, number2));
        case "-" -> System.out.println(subtractValues(number1, number2));
        case "/" -> System.out.println(divideValues(number1, number2));
        case "*" -> System.out.println(multiplyValues(number1, number2));
        default -> System.out.println("Unidentified operation.");
    }
}

private static BigDecimal sumValues(Double number1, Double number2) {
    BigDecimal num1 = new BigDecimal(number1);
    BigDecimal num2 = new BigDecimal(number2);
    BigDecimal sumValues = num1.add(num2).setScale(20, RoundingMode.UP);
    return sumValues;
}

private static Double subtractValues(Double number1, Double number2) {
    Double subtractValues = number1 - number2;
    return subtractValues;
}

private static Double divideValues(Double number1, Double number2) {
    Double divideValues = number1 / number2;
    return divideValues;
}

private static Double multiplyValues(Double number1, Double number2) {
    Double multiplyValues = number1 * number2;
    return multiplyValues;
}
```


</details>

---

<details>
  <summary>Repetition Structures</summary>

### For

```Java
for (int i = 0; i < 10; i++) {
    System.out.println("hello");
}
```

### While

```Java
Scanner scanner = new Scanner(System.in);

boolean keep = true;

while (keep) {
    System.out.println("1. Register Product.");
    System.out.println("2. List Product.");
    System.out.println("3. Delete Product.");
    System.out.println("0. Exit Menu.");
    Integer choice = scanner.nextInt();
    switch (choice) {
        case 1 -> System.out.println("Register Product.");
        case 2 -> System.out.println("List Product.");
        case 3 -> System.out.println("Delete Product.");
        case 0 -> {
            System.out.println("Exit Menu.");
            keep = false;
        }
    }
}
```

### Do-While

```Java
Scanner scanner = new Scanner(System.in);

boolean keep = true;

do {
    System.out.println("1. Register Product.");
    System.out.println("2. List Product.");
    System.out.println("3. Delete Product.");
    System.out.println("0. Exit Menu.");
    Integer choice = scanner.nextInt();
    switch (choice) {
        case 1 -> System.out.println("Register Product.");
        case 2 -> System.out.println("List Product.");
        case 3 -> System.out.println("Delete Product.");
        case 0 -> {
            System.out.println("Exit Menu.");
            keep = false;
        }
    }
} while (keep);
```

### Recursion

```Java
public static void main(String[] args) {
    repeat(0, 10);
}

public static void repeat(int repeatNumber, int finalNumber) {
    if (repeatNumber<=finalNumber) {
        System.out.println(repeatNumber);
        repeat(++repeatNumber, finalNumber);
    }
}
```

### Array Recursion

```Java
public static void main(String[] args) {

    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    repeat(list, 4);
}

public static void repeat(int[] list, int startPosition) {
    if (list.length>startPosition) {
        System.out.println(list[startPosition]);
        startPosition++;
        repeat(list, startPosition);
    }
}
```

### ForList

```Java
int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
for (int number : list) {
    System.out.println(number);
}
```

### ForEach

```Java
List<String> list = List.of("arthur", "pedro", "amanda");
list.forEach(item -> {
    String firstLetter = item.substring(0, 1).toUpperCase();
    String restOfName = item.substring(1, item.length());
    String fullName = firstLetter + restOfName;
    System.out.println(fullName);
});
```

</details>

---

<details>
  <summary>Matrix</summary>

### Tic Tac Toe

```Java
public class Matrix {
    static Scanner scanner = new Scanner(System.in);

    static String[][] board = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
    };

    public static void main(String[] args) {
        boolean keep = true;

        while (keep) {
            turn(1);
            keep = showResult();
            if (keep) {
                turn(2);
                keep = showResult();
            }
        }
    }

    public static Boolean showResult() {
        Integer winner = verifyResult();
        if (winner != null) {
            if (winner.equals(1)) {
                System.out.println("Player 1 is the winner!");
            } else if (winner.equals(2)) {
                System.out.println("Player 2 is the winner!");
            } else if (winner.equals(0)) {
                System.out.println("Draw!");
            }
            return false;
        }
        return true;
    }

    public static void turn(int player) {
        boolean choice = true;

        do {
            System.out.println("Player " + player + " turn.");
            System.out.println("Choose a Column between 1 and 3.");
            int column = scanner.nextInt();
            System.out.println("Choose a Line between 1 and 3.");
            int line = scanner.nextInt();
            if (board[line - 1][column - 1].equals("_")) {
                board[line - 1][column - 1] = (player == 1) ? "X" : "O";
                choice = false;
                printBoard(board);
            } else {
                printBoard(board);
                System.out.println("Space already used.");
            }
        } while (choice);
    }

    public static void printBoard(String[][] board) {
        System.out.println("\n");
        for (String[] line : board) {
            for (String column : line) {
                System.out.print(column + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public static Integer verifyResult() {

        if (!board[0][0].equals("_") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0].equals("X") ? 1 : 2;
        }

        if (!board[2][0].equals("_") && board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) {
            return board[2][0].equals("X") ? 1 : 2;
        }

        for (int i = 0; i < board.length; i++) {
            if (!board[i][0].equals("_") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0].equals("X") ? 1 : 2;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (!board[0][j].equals("_") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                    return board[0][j].equals("X") ? 1 : 2;
                }
            }
        }

        if (boardIsFull()) {
            return 0;
        }
        return null;
    }

    public static boolean boardIsFull() {
        boolean boardIsFull = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("_")) {
                    boardIsFull = false;
                }
            }
        }

        return boardIsFull;
    }

}
```

</details>

---

<details>
  <summary>Error Handling</summary>

```Java
```

</details>

---

<details>
  <summary>Code Versioning</summary>

```Java
```

</details>