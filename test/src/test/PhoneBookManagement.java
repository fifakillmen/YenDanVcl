/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author fifak
 */
public class PhoneBookManagement {

    Validator v = new Validator();

    List<PhoneBook> inputData(List<PhoneBook> arrayList) {

        String name = v.getStringWithRegex(true, "^[A-Z][a-zA-Z]+$", "Enter your name: ", "plss follow this format ^[A-Z][a-zA-Z]+$  ");
        String[] phoneNumberList = v.getPhoneNumberList();
        String email = v.getStringWithRegex(true, "^((.{6,})@(.+))$", "Enter your mail: ", "plss folow this format ^((.{6,})@(.+))$");
        String address = v.getStringWithRegex(true, "^[#.0-9a-zA-Z\\s,-]+$", "Enter your address: ", "plss follow this format ^[#.0-9a-zA-Z\\s,-]+$");
        String group = v.getGroup();
        boolean isExist = checkExist(arrayList, name, email);
        if (isExist == true) {
            System.out.println("dupblicate");
        } else {
            PhoneBook book = new PhoneBook(name, phoneNumberList, email, address, group);
            arrayList.add(book);
            System.out.println("Add successfull!!!!");
        }
        return arrayList;
    }

    public void save() {
    }

    public boolean checkExist(List<PhoneBook> arrayList, String name, String email) {
        for (PhoneBook phoneBook : arrayList) {
            if (name.equals(phoneBook.getName()) && email.equals(phoneBook.getEmail())) {
                return true;
            }
        }
        return false;
    }

    //Delete contact by name
    List<PhoneBook> delete(List<PhoneBook> phoneBooks) {
        if (phoneBooks.isEmpty()) {
            System.out.println("No data!!!!!");
        } else {
            String name = v.getStringWithRegex(true, "^[A-Z][a-zA-Z]+$", "Enter name you want to delete : ", "plss follow this format ^[A-Z][a-zA-Z]+$  ");
            for (PhoneBook phoneBook : phoneBooks) {
                if (name.equals(phoneBook.name)) {
                    phoneBooks.remove(phoneBook);
                    System.out.println("Remove successfull!!!");

                }
            }

            System.out.println("Remove unsuccsessfull!!!");
        }
        return phoneBooks;

    }

    List<PhoneBook> deleteByGroup(List<PhoneBook> phoneBooks) {
        if (phoneBooks.isEmpty()) {
            System.out.println("No data!!!!!");
        } else {
            String group = v.getGroup();
            for (PhoneBook phoneBook : phoneBooks) {
                if (group.equals(phoneBook.group)) {
                    phoneBooks.remove(phoneBook);
                    System.out.println("Remove successfull!!!");

                }
            }

            System.out.println("Remove unsuccsessfull!!!");
        }
        return phoneBooks;
    }

    void Display(List<PhoneBook> phoneBooks) {
        if (phoneBooks.isEmpty()) {
            System.out.println("No data!!!");
        } else {

            System.out.println("====================================================Phone Book=======================================================");
            System.out.printf("%-20s%-20s%-40s%-20s%-20s", "Name", "Phone Number", "Email", "Address", "Group");
            System.out.println("");
            for (PhoneBook phoneBook : phoneBooks) {
                System.out.println(phoneBook);
            }
            System.out.println("======================================================================================================================");
        }

    }

}
