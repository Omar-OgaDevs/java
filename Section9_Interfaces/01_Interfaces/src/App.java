public class App {
    public static void main(String[] args) throws Exception {
        
        ITelephone omarsPhone;
        omarsPhone = new DeskPhone(29767457);
        omarsPhone.powerOn();
        omarsPhone.callPhone(29767457);
        omarsPhone.answer();

        omarsPhone = new MobilePhone(29767457);
        omarsPhone.powerOn();
        omarsPhone.callPhone(29767457);
        omarsPhone.answer();
    }
}
