public class Primes {
    // метод, с которого начинается программа
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    // проверка на наличие делителей, если делится false, если делителей нет - возвращаем true
    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}