package Tsukanova;

public class Androids implements Smartphones,LinuxOS {


    @Override
    public void call() {
        System.out.println("Дзвінок Android: ");

    }

    @Override
    public void sms() {
        System.out.println("Sms Android: ");

    }

    @Override
    public void internet() {
        System.out.println("internet Android: ");
    }

    @Override
    public void linux() {
        System.out.println("Системна команда linux Android: ");
    }
}
