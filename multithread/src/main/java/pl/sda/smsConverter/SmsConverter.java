package pl.sda.smsConverter;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsConverter {

    String convert (String message) {

        Scanner scanner = new Scanner(System.in);
        String sms = scanner.nextLine();

        int lenghtSms = sms.length();
        int quantityOfSms;



        if (lenghtSms%160 == 0) {
          quantityOfSms = lenghtSms/160;
        }else{quantityOfSms = lenghtSms/160 + 1;}

        System.out.println("Ilośc sms'ów wynosi : " + quantityOfSms);

//        List<String> stringList = Pattern.compile(" ")
//                .splitAsStream(sms)
//                .collect(Collectors.toList());

//        newMessage = "";

//
//
//        for (String wordSms : stringList) {
//
//        newMessage +=  wordSms.toUpperCase().charAt(0);
//        newMessage +=  wordSms.substring(1);
//
//
//        }

        String [] words = message.split(" ");
        String newMessage = "";

        for (String word : words) {

            if(word.isEmpty()) continue;

            newMessage += word.toUpperCase().charAt(0); // chce dodac prierwszą litere dużą

            newMessage += word.substring(1); // chce dodac reszte wyrazu
        }

           return newMessage;
    }
}
