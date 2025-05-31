public class Main {
    public static void main(String[] args) {
        // Method Overloading
        Bank bank = new Bank();
        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "9876543210", "BRI");
        bank.transferUang(300000, "1111222233", "Mandiri", "Biaya kuliah");
        bank.sukuBunga();

        // Method Overriding
        BankBNI bni = new BankBNI();
        bni.sukuBunga();
        bni.transferUang(150000, "555666777", "BNI");

        BankBCA bca = new BankBCA();
        bca.sukuBunga();
        bca.transferUang(175000, "888999000", "BCA");
    }
}
