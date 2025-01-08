package e;

public class NamesHandling {
    public static void main(String[] args) {
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

    }
}
