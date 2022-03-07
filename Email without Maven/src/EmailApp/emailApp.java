package EmailApp;

public class emailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Cassie", "Corrie");
        //em1.changePassword(em1.getPassword());
        //em1.setMailboxCapacity(em1.getMailboxCapacity());
        //em1.setAlternateEmail(em1.getAlternateEmail());

        System.out.println(em1.showInfo());
    }
}
