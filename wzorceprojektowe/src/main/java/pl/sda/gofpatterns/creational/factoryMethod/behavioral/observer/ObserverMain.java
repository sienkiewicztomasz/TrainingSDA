package pl.sda.gofpatterns.creational.factoryMethod.behavioral.observer;

public class ObserverMain {

    public static void main(String[] args) {

        RegisterUserService registerUserService

                = new RegisterUserService();

        ActivationMailSender mailSender = new ActivationMailSender();

        registerUserService.registerObserver(mailSender);

        DiscountSender discountSender = new DiscountSender();

        registerUserService.registerObserver(discountSender);

        registerUserService.register(new Person("Przemek", "Zawadzki"));

        registerUserService.unregisterObserver(discountSender);

        registerUserService.register(new Person("Roman", "Zagadka"));

    }

}