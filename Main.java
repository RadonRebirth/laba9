package com.company;

import java.util.Scanner;

public class Main {
    interface Tovar{
        String name();
        int cost();
        int rate();
    }
    interface User {
        String userLogin();
        String userPassword();
    }
    static class displayInfoUsers implements Tovar,User {
        String name;
        String userlogin;
        String userpassword;
        int cost;
        int rate;

        displayInfoUsers(String name, String userlogin, String userpassword, int cost, int rate) {
            this.name = name;
            this.userlogin = userlogin;
            this.userpassword = userpassword;
            this.cost = cost;
            this.rate = rate;
        }
        public String name() {
            return name;
        }
        public int cost() {
            return cost;
        }
        public int rate() {
            return rate;
        }
        public String userLogin() {
            return userlogin;
        }
        public String userPassword() {
            return userpassword;
        }
        public void InfoUsers() {
            System.out.println("Введёный пользователь: " + userlogin);
            System.out.println("Купленный вами товар: " + name);
            System.out.println("Цена за данный товар: " + cost);
            System.out.println("Рейтинг среди покупателей за данный товар: " + rate + "\n");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш логин: ");
        String userlogin = in.nextLine();
        System.out.println("Введите ваш пароль: ");
        String userpassword = in.nextLine();
        displayInfoUsers u1 = new displayInfoUsers("Печенья",userlogin, userpassword, 125,100);
        u1.InfoUsers();
        System.out.println("Введите ваш логин: ");
        userlogin = in.nextLine();
        System.out.println("Введите ваш пароль: ");
        userpassword = in.nextLine();
        displayInfoUsers u2 = new displayInfoUsers("Батарейки",userlogin, userpassword, 250,500);
        u2.InfoUsers();
        System.out.println("Введите ваш логин: ");
        userlogin = in.nextLine();
        System.out.println("Введите ваш пароль: ");
        userpassword = in.nextLine();
        displayInfoUsers u3 = new displayInfoUsers("Сахар",userlogin, userpassword, 1250,10000);
        u3.InfoUsers();
    }
}
