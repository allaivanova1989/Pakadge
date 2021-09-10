package dog;

import java.util.Scanner;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = "Bob";
    }

    public Dog() {
        this.name = "default";
    }

    public String getName() {
        if (this.name == "default") {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input new name:");
            String name2 = scanner.nextLine();
            this.name = name2;
        } else {
        }
        return name;
    }

}











