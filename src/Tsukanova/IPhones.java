package Tsukanova;

public class IPhones implements Smartphones,IOS {
    @Override
    public void call() {
        System.out.println("Дзвінок iPhone: ");
    }

    @Override
    public void sms() {
        System.out.println("Sms iPhone: ");
    }

    @Override
    public void internet() {
        System.out.println("internet iPhone: ");
    }

    @Override
    public void iOS() {
        System.out.println("Системна команда iOS iPhone: ");
    }
}
