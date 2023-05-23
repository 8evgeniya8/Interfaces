package Tsukanova;
//Зробіть інтерфейс Smartphones,
// який має містити методи call(), sms(), internet()
//
//Зробіть класи, які його
// імплементують: Androids, iPhones.
//
//Андроїди повинні також
// імплементувати LinuxOS, айфони повинні
// імплементувати iOS
//
// Створіть екземпляри
// кожного виду у мейн-класі
public class InterfacesMain {
    public static void main (String []args){

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.linux();

        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.iOS();


    }
}
