import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Vyacheslav.returnHelloForVyacheslav(name);

        System.out.println("Введите число:");
        Hello hello = new Hello();
        String number = scanner.nextLine();
        try{
            System.out.println(hello.helloReturn(Integer.parseInt(number)));
        }catch (Exception e){
            System.out.println("Нужно было ввести число");
        }

        System.out.println("Введите массив чисел через пробел");
        ReturnInt returnInt = new ReturnInt();
        String mas = scanner.nextLine();
        returnInt.divisibleThree(mas);

    }
}
