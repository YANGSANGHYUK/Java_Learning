package pt01;

public class Three {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            String number = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9') {
                    count++;
                }
            }
            if (count > 0) {
                for (int k = 0; k < count; k++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }

        }

    }

}
