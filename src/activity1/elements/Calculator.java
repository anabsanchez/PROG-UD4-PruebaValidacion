package activity1.elements;

public class Calculator {

    public static int sumSquaredN(int n) {

        int sum = 0;
        StringBuilder sumString = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            sumString.append(i).append("^2 + ");
            sum += (i * i);
        }

        System.out.print(sumString.substring(0, sumString.length() - 3) + " = ");

        return sum;
    }

    public static float media(int[] numbers) {

        float media = 0;

        for (int i = 0; i < numbers.length; i++) {

            media += numbers[i];
        }

        media /= numbers.length;

        return media;
    }
}
