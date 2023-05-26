package ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("날짜를 입력해 주세요.");
        String sd = sc.nextLine();
        LocalDate date = LocalDate.parse(sd, DateTimeFormatter.ISO_DATE);

        boolean chanhgeOther = false;
        do {
            System.out.println("변경할 항목을 선택해 주세요");
            System.out.println("1.년도");
            System.out.println("2.월");
            System.out.println("3.일");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("변경하고 싶은 년도를 입력해 주세요");
                int year = sc.nextInt();
                date = date.withYear(year);
            } else if (choice == 2) {
                System.out.println("변경하고 싶은 월을 입력해 주세요");
                int month = sc.nextInt();
                date = date.withMonth(month);
            } else if (choice == 3) {
                System.out.println("변경하고 싶은 일을 입력해 주세요");
                int day = sc.nextInt();
                date = date.withDayOfMonth(day);
            } else {
                System.out.println("올바르지 않은 선택입니다. 다시 선택해주세요.");
                continue;
            }

            System.out.println("다른 항목도 변경하시겠습니까?");
            System.out.println("Y or N");
            String answer = sc.next();

            if (answer.equals("Y")) {
                chanhgeOther = true;
            } else {
                chanhgeOther = false;
            }
        } while (chanhgeOther);
        String formattedDate = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("변경된 날짜: " + formattedDate);

        sc.close();
    }
}
