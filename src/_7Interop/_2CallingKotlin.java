package _7Interop;
import _4Classes.BankAccount;
import _3Functions.*;

public class _2CallingKotlin
    {
        public static void main(String[] args) {
            // Using a Kotlin class
            BankAccount account = new BankAccount("Al");
            double bal = account.getBalance();
            System.out.println(account.getAccountNumber());
            account.setActive(false);

            // Using Kotlin top-level functions, and properties
            double d = _1BasicsKt.circleArea(2.0);
            d = _1BasicsKt.circleArea(); // It's possible since we are using @JvmOverloads annotation
            System.out.println(d);

            System.out.println(_1BasicsKt.getTopLevelProperty());

            // Using extension function
            System.out.println(_3ExtensionsKt.yell("Hi"));
        }
    }
