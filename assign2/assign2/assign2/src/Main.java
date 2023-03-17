public class Main {
    public static void main(String[] args) {
        Account a=new Account(20100432,200000);
        a.setAnnualIntersetRate(4.5);
        a.withdraw(5000);
        a.deposit(3900);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterset());
        System.out.println(a.getDateCreated());
    }}