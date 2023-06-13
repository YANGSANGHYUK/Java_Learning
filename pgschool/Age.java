package pgschool;

public class Age {
    public static int solution(int age) {
        int currentYear = 2022;
        int birthYear = currentYear - age + 1;
        return birthYear;
    }

    public static void main(String[] args) {
        int age = 40;
        int birthYear = solution(age);
        System.out.println(birthYear);
        age = 20;
        birthYear = solution(age);
        System.out.println(birthYear);
    }

}
