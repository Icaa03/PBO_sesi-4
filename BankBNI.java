class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            System.out.println("Transfer BNI: " + jumlah + " ke " + rekeningTujuan);
        } else {
            super.transferUang(jumlah, rekeningTujuan, bankTujuan);
        }
    }
}

class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BCA")) {
            System.out.println("Transfer BCA: " + jumlah + " ke " + rekeningTujuan);
        } else {
            super.transferUang(jumlah, rekeningTujuan, bankTujuan);
        }
    }
}
