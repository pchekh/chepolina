public class task_one {

    public static void main(String[] args) {

        int number = 11511;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сумма всех чисел = " + sum);
    }
}
