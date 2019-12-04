package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Enemy bob = new Enemy();
        bob.name = "Bob";
        bob.health = 100;
        bob.strength = 5;
        Enemy garret = new Enemy();
        garret.name = "Garret";
        garret.health = 1000;
        garret.strength = 50;
        Enemy kaden = new Enemy();
        kaden.name = "Kaden";
        kaden.health = 500;
        kaden.strength = 10;
        String gender = "place";
        String lastName = "place";
        String firstName = "place";
        int balance = 100;
        int officeL = 0;
        int office = 2000;
        int officeM = 100;
        int gymL = 0;
        int gym = 1;
        int kitchenL = 0;
        int kitchen = 50;
        int health = 200;
        int strength = 0;
        boolean canbuy = true;
        System.out.println("\n If you are new, type 'new'.");
        System.out.println("Please Enter Your Name.\n");
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        if (code.equals("new")){
            System.out.println("Welcome new user!");
            System.out.println("Firstname: \n");
            firstName = sc.nextLine();
            System.out.println("Lastname: \n");
            lastName = sc.nextLine();
            System.out.println("Gender: \n");
            gender = sc.nextLine();
        } else if (code.equals("Tyson")){
            firstName = "Tyson";
            lastName = "Watson";
            gender = "Male";
        }
        if (gender.equals("Male")) {
            System.out.println("Welcome back Mr. " + lastName + "\n");
        } else if(gender.equals("Female")){
            System.out.println("Welcome back Mrs. " + lastName + "\n");
        } else if(gender.equals("male")) {
            System.out.println("Welcome back Mr. " + lastName + "\n");
        } else if (gender.equals("female")) {
            System.out.println("Welcome back Mrs. " + lastName + "\n");
        }
        while (true){
            if (officeL == 1){
                office = 1000;
                officeM = 150;
            } else if (officeL == 2){
                office = 500;
                officeM = 250;
            } else if (officeL == 3){
                office = 250;
                officeM = 400;
            } else if (gymL == 1){
                gym = 10;
            } else if (gymL == 2){
                gym = 25;
            } else if (gymL == 3){
                gym = 50;
            } else if (kitchenL == 1){
                kitchen = 25;
            } else if (kitchenL == 2){
                kitchen = 10;
            } else if (kitchenL == 3){
                kitchen = 5;
            } else if (balance <= 0){
                canbuy = false;
            } else {
            }
            System.out.println("If you need help type: " + "'help'");
            System.out.println("What can I do for you?");
            String command = sc.nextLine();
            if (command.equals("food")){
                System.out.println("What should I fix for you?");
                String food = sc.nextLine();
                if (food.equals("AAAAA")){
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    health = health + 10000;
                }
                System.out.println("Ok making " + food + "");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ok making " + food + ".");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ok making " + food + "..");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ok making " + food + "...");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ok making " + food + ".....");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Done making " + food);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Balance -  " + kitchen);
                balance = balance - kitchen;
                health = 200;
                System.out.println("Health Restored.");
            } else if (command.equals("exit")){
                System.out.println("Goodbye");
                System.exit(1);
            } else if (command.equals("bal")){
                System.out.println("Your balance is: " + balance);
            } else if (command.equals("nothing")){
                System.out.println("Oh, ok.");
                System.exit(1);
            } else if (command.equals("work")) {
                System.out.println("Working");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working..");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Done.");
                System.out.println("You made " + officeM +  " dollars.");
                balance = balance + officeM;
            } else if (command.equals("buy")){
                System.out.println("If you need help type: " + "'help'");
                while (true){
                    System.out.println("What would you like to buy?");
                    String buy = sc.nextLine();
                    if (buy.equals("help")){
                        System.out.println("Buying items costs money based on the item. \n There are many items that range from helping you fight better to work harder and earn more money.\n");
                        System.out.println("Gym - Increases Damage \n Kitchen - reduces the cost of food. \n Office - Increases money earned. \n");
                    } else if(buy.equals("gym")){
                        System.out.println("What upgrade do you want?\n");
                        System.out.println("Level 1 - 10 strength gain. $250 \n");
                        System.out.println("Level 2 - 25 strength gain. $500 \n");
                        System.out.println("Level 3 - 50 strength gain. $1000 \n");
                        String gymB = sc.nextLine();
                        if (gymB.equals("1")){
                            if (balance > 250){
                                gymL = 1;
                                gym = 10;
                                balance = balance - 250;
                                System.out.println("You bought Level 1 Gym!");
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        } else if (gymB.equals("2")){
                            if (balance > 500){
                                gymL = 2;
                                gym = 25;
                                balance = balance - 500;
                                System.out.println("You bought Level 2 Gym!");
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        } else if (gymB.equals("3")){
                            if (balance > 1000){
                                gymL = 3;
                                gym = 50;
                                balance = balance - 1000;
                                System.out.println("You bought Level 3 Gym!");
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        }

                    } else if(buy.equals("office")){
                        System.out.println("Level 1 - You make $150. Cost: $500 \n");
                        System.out.println("Level 2 - You make $250. Cost: $1000 \n");
                        System.out.println("Level 3 - You make $400. Cost: $2500 \n");
                        String officeB = sc.nextLine();
                        if(officeB.equals("1")){
                            if (balance > 500){
                                officeL = 1;
                                balance = balance - 500;
                                System.out.println("You bought Level 1 Office!");
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        } else if (officeB.equals("2")){
                            if (balance > 1000){
                                officeL = 2;
                                balance = balance - 1000;
                                System.out.println("You bought Level 2 Office!");
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        } else if (officeB.equals("3")){
                            if (balance > 2500){
                                officeL = 3;
                                balance = balance - 2500;
                                System.out.println("You bought Level 3 Office!");
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        }
                    } else if (buy.equals("exit")){
                        System.out.println("Exiting...");
                        break;
                    } else if (buy.equals("kitchen")){
                        System.out.println("Level 1 - decreases the price it costs to heal you to $25. Cost $250 \n");
                        System.out.println("Level 2 - decreases the price it costs to heal you to $10. Cost $500 \n");
                        System.out.println("Level 3 - decreases the price it costs to heal you to $5. Cost $1000 \n");
                        String kitchenB = sc.nextLine();
                        if (kitchenB.equals("1")){
                            if (balance > 250){
                                kitchen = 25;
                                balance = balance - 250;
                                System.out.println("You bought Level 1 Kitchen! \n");
                                System.out.println("Your balance is now " + balance);
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        } else if (kitchenB.equals("2")){
                            if(balance > 500){
                                kitchen = 10;
                                balance = balance - 500;
                                System.out.println("You bought Level 2 Kitchen! \n");
                                System.out.println("Your balance is now " + balance);
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        } else if (kitchenB.equals("3")){
                            if (balance > 1000){
                                kitchen = 5;
                                balance = balance - 1000;
                                System.out.println("You bought Level 3 Kitchen! \n");
                                System.out.println("Your balance is now " + balance);
                            } else {
                                System.out.println("You don't have enough money. \n");
                            }
                        }
                    }
                }
            } else if (command.equals("workout")){
                System.out.println("Working out.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working out..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working out...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Working out....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Done.");
                System.out.println("Strength increased by " + gym);
                strength = strength + gym;
                System.out.println("Your strength is now " + strength);
            } else if (command.equals("fight")){
                System.out.println("Choose your Opponent. \n");
                System.out.println("Bob (easy) \n Bet: $100");
                System.out.println("Garret (hard) \n Bet: $1000");
                System.out.println("Kaden (medium) \n Bet: $500");
                while (true){
                    String enemySelect = sc.nextLine();
                    if (enemySelect.equals("bob")){
                        if (bob.health < 1){
                            System.out.println("You already defeated Bob.");
                            break;
                        } else{
                            if (balance > 100){
                                balance = balance - 100;
                                System.out.println("Starting Fight.");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight..");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight...");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight.....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Done.\n");
                                while (bob.health > 0 && health > 0){
                                    System.out.println("Bob attacks!");
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    health = health - bob.strength;
                                    System.out.println("Your health is " + health);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("You attack!");
                                    bob.health = bob.health - strength;
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Bobs health is: " + bob.health);
                                }
                                if (health > bob.health){
                                    balance = balance + 200;
                                    System.out.println("You won $200! \n You balance is now: " + balance);
                                    System.out.println("Type 'exit' to go exit.");
                                } else {
                                    System.out.println("You lost $100. \n Your balance is now: " + balance);
                                    System.out.println("Type 'exit' to exit.");
                                }
                            } else {
                                System.out.println("You don't have enough money.");
                                break;
                            }
                        }

                    } else if (enemySelect.equals("exit")){
                        System.out.println("Exiting...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    } else if (enemySelect.equals("garret")){
                        if (garret.health < 1){
                            System.out.println("You already defeated Garret");
                            break;
                        } else {
                            if (balance > 1000){
                                balance = balance - 1000;
                                System.out.println("Starting Fight.");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight..");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight...");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight.....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Done.\n");
                                while (garret.health > 0 && health > 0){
                                    System.out.println("Garret attacks!");
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    health = health - garret.strength;
                                    System.out.println("Your health is " + health);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("You attack!");
                                    garret.health = garret.health - strength;
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Garret's health is: " + garret.health);
                                }
                                if (health > garret.health){
                                    balance = balance + 2000;
                                    System.out.println("You won $2000! \n You balance is now: " + balance);
                                    System.out.println("Type 'exit' to exit.");
                                    System.out.println("You have won the game! type 'ending' to claim your reward.");
                                } else{
                                    System.out.println("You lost $1000. \n Your balance is now: " + balance);
                                    System.out.println("Type 'exit' to exit");
                                }
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        }

                    } else if (enemySelect.equals("kaden")){
                        if (kaden.health < 1){
                            System.out.println("You already defeated Kaden.");
                            break;
                        } else {
                            if (balance > 500){
                                balance = balance - 500;
                                System.out.println("Starting Fight.");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight..");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight...");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Starting Fight.....");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Done.\n");
                                while (kaden.health > 0 && health > 0){
                                    System.out.println("Kaden attacks!");
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    health = health - kaden.strength;
                                    System.out.println("Your health is " + health);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("You attack!");
                                    kaden.health = kaden.health - strength;
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Kaden's health is: " + kaden.health);
                                }
                                if (health > kaden.health){
                                    System.out.println("You have beaten Kaden!");
                                    balance = balance + 1000;
                                    System.out.println("You won $1000! \n Your balance is now: " + balance);
                                } else {
                                    System.out.println("You lost $500. \n Your balance is now: " + balance);
                                }
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        }
                    }
                }
            } else if (command.equals("help")){
                System.out.println("Commands are typed with no uppercase letters. \n Current commands are: \n workout \n fight \n food \n buy \n work \n bal \n exit");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" Working gives you money. \n Working out increases strength. \n Making food heals you. \n Fighting allows you to gain money but only if you win. \n ");
            } else if (command.equals("debug")){
                gymL = 3;
                gym = 50;
                balance = 10000;
                System.out.println("Debug activated. \n");
            } else if (command.equals("ending")){
                System.out.println("Checking if you have beaten Bob.");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Bob..");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Bob...");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Bob....");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Bob.....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (bob.health < 1){
                    System.out.println("You have beaten Bob!");
                } else {
                    System.out.println("You need to beat Bob.");
                }
                System.out.println("Checking of you have beaten Kaden.");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking of you have beaten Kaden..");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking of you have beaten Kaden...");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking of you have beaten Kaden....");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking of you have beaten Kaden.....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (kaden.health < 1){
                    System.out.println("You have beaten Kaden!");
                } else {
                    System.out.println("You need to beat Kaden.");
                }
                System.out.println("Checking if you have beaten Garret.");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Garret..");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Garret...");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Garret....");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Checking if you have beaten Garret.....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (garret.health < 1){
                    System.out.println("You have beaten Garret.");
                } else {
                    System.out.println("You need to beat Garret.");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (garret.health < 1 && bob.health < 1 && kaden.health < 1){
                    System.out.println("Congratulations! You have won the game!");
                }
            }
        }
    }
}