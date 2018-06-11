package HomeWork3;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность
с помощью регулярных выражений.
ФИО ​- только буквы английского алфавита, дефис и пробел
Мобильный телефон​ - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и.
Проверить все вводимые данные и вывести неверно введенные.
*/


public class Task4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter your name");
        String userName = sc1.nextLine();

        Pattern pattern = Pattern.compile("^[A-z\\-\\s]+$");

        if (pattern.matcher(userName).matches()) {
            System.out.println("Correct name");
        } else {
            System.out.println("Invalid name " + userName);
        }


        System.out.println("Enter your phone number");
        String phoneNumber = sc1.nextLine();

        Pattern pattern1 = Pattern.compile("^\\+380(50|96|97|98|63|93)[0-9]{7}$");

        if (pattern1.matcher(phoneNumber).matches()) {
            System.out.println("Correct phone number");
        } else {
            System.out.println("Invalid phone number " + phoneNumber);
        }


        System.out.println("Enter your email");
        String email = sc1.nextLine();

        Pattern pattern2 = Pattern.compile("^[A-z0-9\\-_]+@[a-z0-9_-]+[.][a-z]{2,6}$");

        if (pattern2.matcher(email).matches()) {
            System.out.println("Correct email");
        } else {
            System.out.println("Invalid email " + email);
        }

    }


}
