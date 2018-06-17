package HomeWork2;/*
Сначала единственным программистом в компании был ее основатель,
а каждый следующий программист, которого нанимали на работу,
проходил по одному собеседованию с каждым из программистов,
которые уже работали в компании на тот момент.
ная текущее количество программистов (вводится пользователем),
определите, сколько всего собеседований было проведено в стенах компании.
 */


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter the number of programmers:");
        Scanner sc = new Scanner(System.in);
        int pr_number = sc.nextInt();

        System.out.println(numOhInterview(pr_number));


    }

    private static int numOhInterview (int pr_number) {

        int result;

        if (pr_number == 1)
            return 0;
        result = (pr_number-1) + numOhInterview(pr_number-1);

        return result;
    }


}
