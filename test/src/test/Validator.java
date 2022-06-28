/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fifak
 */
public class Validator {

    String getStringWithRegex(boolean b, String regex, String mess, String err) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input could not be null!!!!");
            }
            if (b == true) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.out.println(err);
                }

            }
        } while (b);
        return input;
    }

    String getGroup() {
        String[] allgroup = {"Family", "Colleague", "Friend", "Other"};
        List<String> list = Arrays.asList(allgroup);
        String input;
        do {
            input = getStringWithRegex(false, "", "Enter group: ", "");
            if (list.contains(input)) {
                if (input.equals(allgroup[3])) {
                    System.out.print("Other: ");
                    input = getStringWithRegex(false, "", "Enter group: ", "");
                }
                break;
            }
        } while (true);
        return input;
    }

    String[] getPhoneNumberList() {
        String input;
        String[] phoneStrings;
        do {
            int sizeList = getSize(0, Integer.MAX_VALUE);
            phoneStrings = new String[sizeList];
            for (int i = 0; i < sizeList; i++) {
                input = getStringWithRegex(true, "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})", "Enter phone number " + i + " : ", "plss follow this \\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})");
                phoneStrings[i] = input;
            }
            break;
        } while (true);
        return phoneStrings;
    }

    int getSize(int min, int max) {
        int choice = 0;
        String a;
        while (true) {
            try {

                a = getStringWithRegex(false, "", "Enter size of phone number list", "");

                choice = Integer.parseInt(a);
                if (choice >= min && choice <= max) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("size must be integer");
            }

        }
        return choice;
    }
}
