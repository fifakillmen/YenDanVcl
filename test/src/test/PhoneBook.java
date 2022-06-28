/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author fifak
 */
public class PhoneBook {

    String name;
    String[] phone_number_list;
    String email;
    String address;
    String group;

    public PhoneBook() {
    }

    public PhoneBook(String name, String[] phone_number_list, String email, String address, String group) {
        this.name = name;
        this.phone_number_list = phone_number_list;
        this.email = email;
        this.address = address;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhone_number_list() {
        return phone_number_list;
    }

    public void setPhone_number_list(String[] phone_number_list) {
        this.phone_number_list = phone_number_list;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        String result;
        if (phone_number_list.length == 1) {
            result = String.format("%-20s%-20s%-40s%-20s%-20s", name, phone_number_list[0], email, address, group);
        } else {
            result = String.format("%-20s%-20s%-40s%-20s%-20s", name, phone_number_list[0], email, address, group);
            for (int i = 1; i < phone_number_list.length; i++) {
                result +="\n"+ String.format("%-20s%-20s", "                    ", phone_number_list[i]);

            }
        }

        return result;
    }

}
