package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import test.PhoneBook;
import test.PhoneBookManagement;
import test.Validator;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        PhoneBookManagement pm = new PhoneBookManagement();
        Validator v = new Validator();
        String[] phone_list = {"0915931786", "0972188633"};
        List<PhoneBook> phoneBooks = new ArrayList<PhoneBook>();
        PhoneBook book = new PhoneBook("Bui", phone_list, "fifakillmen@gmail.com", "haNoi", "Family");
        
        phoneBooks.add(book);
        while (true) {
            System.out.println("======PhoneBook Management=====");
            System.out.println("1. Add a new list of phone book ");
            System.out.println("2. Add a new phone number to existed contact ");
            System.out.println("3. Display all contatcs in the phone book, sort by name ");
            System.out.println("4. Find phone number list by name ");
            System.out.println("5. Delete contact by name ");
            System.out.println("6. Delete contact by group ");
            System.out.println("7. Close program ");
            System.out.println("Enter choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    phoneBooks = pm.inputData(phoneBooks);
                    break;
                    
                }
                case "2": {
                    phoneBooks = pm.addnewphoneNumber(phoneBooks);
                    break;
                    
                }
                case "3": {
                    pm.Display(phoneBooks);
                    break;
                    
                }
                case "4": {
                    pm.findPhoneNumberListByName(phoneBooks);
                    break;
                    
                }
                case "5": {
                    phoneBooks = pm.delete(phoneBooks);
                    break;
                    
                }
                case "6": {
                    phoneBooks = pm.deleteByGroup(phoneBooks);
                    break;
                    
                }
                case "7": {
                    System.exit(0);
                }
            }
        }
    }
    
}
