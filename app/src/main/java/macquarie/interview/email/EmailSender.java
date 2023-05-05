package macquarie.interview.email;

import macquarie.interview.NoArgFunction;

import java.util.function.Function;

public class EmailSender {

    private final boolean isGWM;

    private final NoArgFunction<Email> emailSender;

    public EmailSender(boolean isGWM) {
        this.isGWM = isGWM;
        emailSender = isGWM ? this::gwmEmail : this::eighteenYoEmail;
    }

    private Email gwmEmail() {
        System.out.println("Sending GWM Email...");
        return new Email("gwm", "some gwm email");
    }

    private Email eighteenYoEmail() {
        System.out.println("Sending 18 yo Email...");
        return new Email("18yo", "some 18yo email");
    }

    public NoArgFunction<Email> getEmailSender() {
        return emailSender;
    }

    public String someMethod() {
        return "somemethodddd";
    }
}
