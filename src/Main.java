public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] monthlyExpenses = new int[30];
        for (int i = 0; i < monthlyExpenses.length; i++) {
            monthlyExpenses[i] = random.nextInt(100_000) + 100_000;
        }
        return monthlyExpenses;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] monthlyExpenses = generateRandomArray();
        int expenses = 0;
        for (int totalExpenses : monthlyExpenses) {
            expenses += totalExpenses;
        }
        System.out.println("Сумма трат за месяц составила " + expenses + " рублей");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] monthlyExpenses = generateRandomArray();
        int maxExpenses = 0;
        int minExpenses = 222000;
        for (int monthlyExpens : monthlyExpenses) {
            if (monthlyExpens > maxExpenses) {
                maxExpenses = monthlyExpens;
            }
        }
        for (int monthlyExpens : monthlyExpenses) {
            if (monthlyExpens < minExpenses) {
                minExpenses = monthlyExpens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] monthlyExpenses = generateRandomArray();
        var averageCost = 0;
        for (int totalExpenses : monthlyExpenses) {
            averageCost += totalExpenses / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1; i >=0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}