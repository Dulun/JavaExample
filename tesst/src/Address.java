/**
 * Created by butter on 16-9-29.
 */
public class Address {
    String m_sName;
    String m_sPhone;
    String m_sEmailaddress;

    Address(String name, String phone, String emall){
        m_sName = name;
        m_sPhone = phone;
        m_sEmailaddress = emall;
    }

    void ShowInfo(){
        System.out.printf("name: %s\n", m_sName);
        System.out.printf("phone number: %s\n", m_sPhone);
        System.out.printf("emaill address: %s\n\n", m_sEmailaddress);
    }
}
