package company;

import java.util.UUID;

public class Buyer<llogin> extends User{
    /*
    2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» ,
 а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
     */
    String FullName;
    String phoneNumber;
    String passWord;
    String ID;

    public Buyer(String fullName, String login, String phoneNumber, String passWord) {
        super(login);
        FullName = fullName;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }

    //------------- getters & setters ----------


    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    //------------- ^ getters & setters  ^-------------

     public UUID getID() {
        UUID uuid = UUID.randomUUID();
        return uuid; // можно реализовать именно присвоение гуида, а не как сейчас (to do)
    }


    public boolean isActive() {

        int  rand = (int) (Math.random() * 10);
    if (rand % 2 == 0)
        {            return true;         }
        else
        {            return false;        }

    }


}
