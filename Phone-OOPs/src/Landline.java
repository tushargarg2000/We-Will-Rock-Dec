public class Landline implements Phone{

    private String myPhoneNo;

    private boolean isRinging;

    boolean powerOn;

    public Landline(String phoneNo){
        myPhoneNo = phoneNo;
        isRinging = false;
        powerOn = true;
    }


    @Override
    public void powerOn() {

        powerOn = true;
    }

    @Override
    public void dialNo(String no) {

        System.out.println("Dialing the no" + no);
    }

    @Override
    public boolean answerPhone() {

        if(isRinging==true){

            System.out.println("Please answer the phone "+myPhoneNo);
            isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean receivePhone(String phoneNo) {

        if(phoneNo==myPhoneNo){
            System.out.println("We have recevied the phone on" +myPhoneNo);
            isRinging = true;
            return true;
        }
        return false;

    }

    @Override
    public boolean isRinging() {

        if(isRinging==true)
            return true;
        else
            return false;

    }
}
