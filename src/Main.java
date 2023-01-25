public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("123456");
        Landline l2 = new Landline("78910");

        l1.callNumber("78910");
        l2.receiveCall("78910");
        System.out.println(l2.answerCall());
    }
}