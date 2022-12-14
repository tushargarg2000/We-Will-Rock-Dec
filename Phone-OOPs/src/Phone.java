public interface Phone
{

    void powerOn();
    void dialNo(String no);
    boolean answerPhone();

    boolean receivePhone(String phoneNo);

    boolean isRinging();
}
