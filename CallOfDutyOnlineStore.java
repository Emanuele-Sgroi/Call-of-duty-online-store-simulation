/*
Name Project: Call Of Duty - Online Store
Author: Nunzio Emanuele Sgroi

Description
This Java programs simulate an online shop of the famous game “Call of Duty”.
I got the idea while purchasing an item in the real Call of Duty, so I decided to create a simulation for fun.
Following instructions, the user needs to enter a correct key in order to make actions such as: adding items to cart,
removing items, opening and closing the cart, checkout and closing the application.
 */

package com.company;

import java.util.Scanner;
import java.text.NumberFormat;

public class CallOfDutyOnlineStore {
    static void menu(){
        System.out.println("--- [ Enter one of the following codes to make actions ] ---");
        System.out.println(" ");
        System.out.println("\"Standard\" 500 CREDITS ~ 4.99£\n" +
                "[ 1 ] Add to cart --- [ r1 ] Remove from cart");
        System.out.println("-");
        System.out.println("\"Silver\" 850 CREDITS ~ 6.99£\n" +
                "[ 2 ] Add to cart --- [ r2 ] Remove from cart");
        System.out.println("-");
        System.out.println("\"Gold\" 1000 CREDITS ~ 9.99£\n" +
                "[ 3 ] Add to cart --- [ r3 ] Remove from cart");
        System.out.println("-");
        System.out.println("\"Platinum\" 1500 CREDITS ~ 12.99£\n" +
                "[ 4 ] Add to cart --- [ r4 ] Remove from cart");
        System.out.println("-");
        System.out.println("\"Super\" 5000 CREDITS ~ 29.99£ (most popular)\n" +
                "[ 5 ] Add to cart --- [ r5 ] Remove from cart");
        System.out.println(" ");
        System.out.println("[ c ] Go to cart");
        System.out.println("[ 0 ] Exit application");
    }
    public static void main(String[] args) {

        //Introduction
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ##############################################
                #                                            #
                #               CALL OF DUTY                 #
                #                                            #
                ##############################################
                \s""");
        System.out.print("Username: ");
        String userName = input.nextLine().trim();

        System.out.println("Account: " + userName);
        System.out.println("""
                Gun: m4a1
                        |\\_______________ (_____\\\\______________
                HH======#H###############H#######################
                        ' ~""\"""\"""\"""\"""`##(_))#H\\""\"""Y########
                                          ))    \\#H\\       `"Y###
                                         "       }#H)""");

        System.out.println(" ");
        System.out.println("CREDITS: 0");
        System.out.println("You need CREDITS in order to power up your gun");
        System.out.println(" ");
        System.out.println("You can use the CALL OF DUTY store to purchase CREDITS");
        System.out.println(" ");

        //Open online store or close application
        String instructions = "---- Enter [ 1 ] to open the store ----\n" +
                "---- Enter [ 0 ] to exit the game ----";
        System.out.println(instructions);

        while (true) {
            String pressKey = input.nextLine().trim();

            if (pressKey.equals("1")) {
                System.out.println("You have been redirected to CALL OF DUTY store");
                System.out.println("Please, follow instructions");
                System.out.println(" ");
                break;
            } else if (pressKey.equals("0")) {
                System.out.println("Closing the application...");
                System.exit(1);
            }
            System.out.println(" ");
            System.out.println("Sorry, I don't understand");
            System.out.println(instructions);
            System.out.println();
        }

        //Online store - introduction
        System.out.println("""
                ##############################################
                #                                            #
                #                 CALL OF DUTY               #
                #                    STORE                   #
                #                                            #
                ##############################################
                \s
                \s""");

        System.out.println("[ " + userName + " ] here you can purchase the packages that you like.\n" +
                "You can purchase the same package more times.\n" +
                " ");

        //Online store - list items
        menu();

        //Storing number of credits, prices and quantity
        int standardCredits = 500;
        int silverCredits = 850;
        int goldCredits = 1000;
        int platinumCredits = 1500;
        int superCredits = 5000;

        double standardPrice = 4.99;
        double silverPrice = 6.99;
        double goldPrice = 9.99;
        double platinumPrice = 12.99;
        double superPrice = 29.99;

        int standardQuantity = 0;
        int silverQuantity = 0;
        int goldQuantity = 0;
        int platinumQuantity = 0;
        int superQuantity = 0;

        NumberFormat usePounds = NumberFormat.getCurrencyInstance();

        //online store main loop
        while (true){
            String userChoice = input.nextLine().trim().toLowerCase();

            //Shopping
            if (!userChoice.equals("c")){
                switch (userChoice) {
                    case "1":
                        ++standardQuantity;
                        System.out.println("\"Standard\" added to cart");
                        break;
                    case "r1":
                        if (standardQuantity > 0) {
                            --standardQuantity;
                            System.out.println("\"Standard\" removed from cart");
                        } else {
                            System.out.println("The cart has 0 \"Standard\"");
                        }
                        break;
                    case "2":
                        ++silverQuantity;
                        System.out.println("\"Silver\" added to cart");
                        break;
                    case "r2":
                        if (silverQuantity > 0) {
                            --silverQuantity;
                            System.out.println("\"Silver\" removed from cart");
                        } else {
                            System.out.println("The cart has 0 \"Silver\"");
                        }
                        break;
                    case "3":
                        ++goldQuantity;
                        System.out.println("\"Gold\" added to cart");
                        break;
                    case "r3":
                        if (goldQuantity > 0) {
                            --goldQuantity;
                            System.out.println("\"Gold\" removed from cart");
                        } else {
                            System.out.println("The cart has 0 \"Gold\"");
                        }
                        break;
                    case "4":
                        ++platinumQuantity;
                        System.out.println("\"Platinum\" added to cart");
                        break;
                    case "r4":
                        if (platinumQuantity > 0) {
                            --platinumQuantity;
                            System.out.println("\"Platinum\" removed from cart");
                        } else {
                            System.out.println("The cart has 0 \"Platinum\"");
                        }
                        break;
                    case "5":
                        ++superQuantity;
                        System.out.println("\"Super\" added to cart");
                        break;
                    case "r5":
                        if (superQuantity > 0) {
                            --superQuantity;
                            System.out.println("\"Super\" removed from cart");
                        } else {
                            System.out.println("The cart has 0 \"Super\"");
                        }
                        break;
                    case "0":
                        System.out.println("Closing the application...");
                        System.exit(1);
                    default:
                        System.out.println("You entered a wrong code");
                        break;
                }
            }
            else { //open the cart

                //Conversion fro currencies
                String standardTotalPrice = usePounds.format(standardQuantity * standardPrice);
                String silverTotalPrice = usePounds.format(silverQuantity * silverPrice);
                String goldTotalPrice = usePounds.format(goldQuantity * goldPrice);
                String platinumTotalPrice = usePounds.format(platinumQuantity * platinumPrice);
                String superTotalPrice = usePounds.format(superQuantity * superPrice);
                String totalPrice = usePounds.format((standardQuantity * standardPrice) + (silverQuantity * silverPrice)
                        + (goldQuantity * goldPrice) + (platinumQuantity * platinumPrice) + (superQuantity * superPrice));

                int totalItems = standardQuantity + silverQuantity + goldQuantity + platinumQuantity + superQuantity;

                System.out.println("----------CART----------");
                System.out.println(" ");
                System.out.println("Standard qty --> " + standardQuantity + " = " + standardTotalPrice);
                System.out.println("Enter [ r1 ] to remove qty 1");
                System.out.println(" ");
                System.out.println("Silver qty --> " + silverQuantity + " = " + silverTotalPrice);
                System.out.println("Enter [ r2 ] to remove qty 1");
                System.out.println(" ");
                System.out.println("Gold qty --> " + goldQuantity + " = " + goldTotalPrice);
                System.out.println("Enter [ r3 ] to remove qty 1");
                System.out.println(" ");
                System.out.println("Gold qty --> " + platinumQuantity + " = " + platinumTotalPrice);
                System.out.println("Enter [ r4 ] to remove qty 1");
                System.out.println(" ");
                System.out.println("Super qty --> " + superQuantity + " = " + superTotalPrice);
                System.out.println("Enter [ r5 ] to remove qty 1");
                System.out.println(" ");
                System.out.println("Total items: " + totalItems + " --- Total price: " + totalPrice);
                System.out.println(" ");
                System.out.println("""
                        Enter...
                        [ y ] Checkout
                        [ n ] Back to Store
                        [ 0 ] Exit the application""");

                //cart actions - checkout, back to store, remove items
                while (true) {
                    String cartAction = input.nextLine().trim().toLowerCase();
                    if (cartAction.equals("n")){
                        menu();
                        break;
                    }
                    else if(cartAction.equals("y")) {
                        //if the cart is empty
                        if (totalItems <= 0) {
                            System.out.println("The cart is empty");
                            System.out.println("[ n ] Go back to store");
                        } else {
                            int totalCredits = (standardCredits * standardQuantity) + (silverCredits * silverQuantity) +
                                    (goldCredits * goldQuantity) + (platinumCredits * platinumQuantity) + (superCredits * superQuantity);
                            System.out.println("----------CHECKOUT----------");
                            System.out.println(" ");
                            System.out.println("Total paid: " + totalPrice);
                            System.out.println("CREDITS in your account: " + totalCredits);
                            System.out.println(" ");
                            System.out.println("Payment method:\n" +
                                    "VISA **** **** **** 9389");
                            System.out.println("The payment was successful");
                            System.out.println(" ");
                            System.out.println("Thank you [ " + userName + " ] for using CALL OF DUTY store\n" +
                                    "The application needs to be closed to update your CREDITS\n");
                            System.out.println("CALL OF DUTY will be closed automatically after this message");
                            System.exit(1);
                        }
                    }
                    else {
                        //remove items from cart
                        switch (cartAction) {
                            case "r1":
                                if (standardQuantity > 0) {
                                    --standardQuantity;
                                    System.out.println("\"Standard\" removed from cart");
                                } else {
                                    System.out.println("The cart has 0 \"Standard\"");
                                }
                                break;
                            case "r2":
                                if (silverQuantity > 0) {
                                    --silverQuantity;
                                    System.out.println("\"Silver\" removed from cart");
                                } else {
                                    System.out.println("The cart has 0 \"Silver\"");
                                }
                                break;
                            case "r3":
                                if (goldQuantity > 0) {
                                    --goldQuantity;
                                    System.out.println("\"Gold\" removed from cart");
                                } else {
                                    System.out.println("The cart has 0 \"Gold\"");
                                }
                                break;
                            case "r4":
                                if (platinumQuantity > 0) {
                                    --platinumQuantity;
                                    System.out.println("\"Platinum\" removed from cart");
                                } else {
                                    System.out.println("The cart has 0 \"Platinum\"");
                                }
                                break;
                            case "r5":
                                if (superQuantity > 0) {
                                    --superQuantity;
                                    System.out.println("\"Super\" removed from cart");
                                } else {
                                    System.out.println("The cart has 0 \"Super\"");
                                }
                                break;
                            case "0":
                                System.out.println("Closing the application");
                                System.exit(1);
                                break;
                            default:
                                System.out.println("You entered a wrong code");
                                break;
                        }
                    }
                }
            }
        }
    }
}
