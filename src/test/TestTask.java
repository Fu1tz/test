package test;

public class TestTask {
    public static void main(String[] args) {

        int finalBalance = 25000; // нужно накопить
        double currentBalance = 20000; // текущий баланс
        int payment = 2000; // откладываем в год
        int years = 0; // количество лет за которые мы должны накопить
        double proc = 0.1; // проценты

        while (currentBalance < finalBalance) {  // если текущий баланс не будет > конечного,
            // то будут выполнятся условия в цикле, до того момента пока условие не будет возвращать false

            currentBalance += payment; // к текущему балансу ( (+=) - прибавляем и присваеваем) то что отложили
            currentBalance = currentBalance + currentBalance * proc; // условие по которому расчитывается наш баланс
            years++; // каждый год увеличивается на 1 (++), пока условие не вернет false (сумма накоплена)
            System.out.println("Year " + years+ " - " +currentBalance);
        }


        do {
            currentBalance += payment; // к текущему балансу ( (+=) - прибавляем и присваеваем) то что отложили
            currentBalance = currentBalance + currentBalance * proc; // условие по которому расчитывается наш баланс
            years++; // каждый год увеличивается на 1 (++), пока условие не вернет false (сумма накоплена)
            System.out.println("Year " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance);

    }
}
