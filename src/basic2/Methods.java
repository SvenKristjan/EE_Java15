package basic2;

public class Methods {
    public static void main(String[] args) {

       //printPersonInfo("Sven",1976);
       //printPersonInfo("Bob", 2000);
        String[] names = new String [] {"Karlis", "Tom", "Bob"};
        getFirstInLine(names);

        System.out.println(getFirstInLine(names));

    }

    static void printPersonInfo(String name, int birthYear){
        int age;
        age = 2021 - birthYear;
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        System.out.println("Hello " + name);
        System.out.println("Birth year: " + birthYear);

         //...
    }

     public static String getFirstInLine(String[] namesList){
       return namesList[0];



     }
    public static void multi(int num1, int num2){
        System.out.println(num1 * num2);
    }
}
