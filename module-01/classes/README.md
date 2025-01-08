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
  <summary>Operators</summary>

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
  <summary>Functions</summary>

```Java
```

</details>

---

<details>
  <summary>Repetition Structures</summary>

```Java
```

</details>

---

<details>
  <summary>Arrays, Matrices, String</summary>

```Java
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