package pgschool;

public class Number {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (ab.compareTo(ba) >= 0) {
            answer = Integer.parseInt(ab);
        } else {
            answer = Integer.parseInt(ba);
        }

        return answer;

    }

}
