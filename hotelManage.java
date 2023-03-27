import java.util.Scanner;

class hotelManage {
    Scanner sc = new Scanner(System.in);
    hotel h;

    public void selectFood() {
        System.out.println("1.Veg      2.Non-Veg");
        switch (sc.nextInt()) {
            case 1:
                h = new Veg();
                break;
            case 2:
                h = new NonVeg();
                break;

        }

    }

    // End of the SelectFood Method.

    // -----------------------------------------------------------------------------

    public void orderFood() {
        if (h instanceof Veg) {
            Veg v1 = (Veg) h;
            for (;;) {
                System.out.println("1.  " + v1.food1 + "                   Price " + v1.price1);
                System.out.println("2.  " + v1.food2 + "                      Price " + v1.price2);
                System.out.println("3.  " + v1.food3 + "                      Price " + v1.price3);
                System.out.println("4.  " + v1.food4 + "                     Price " + v1.price4);
                System.out.println("5.  " + v1.food5 + "                Price " + v1.price5);
                System.out.println("6.  " + v1.food6 + "      Price " + v1.price6);
                System.out.println("7.  " + v1.food7 + "             Price " + v1.price7);
                System.out.println("8.  " + v1.food8 + "                   Price " + v1.price8);
                System.out.println("9.  Please Bring Food     " + (char) 2);
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Please enter qty");
                        v1.qty1 = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Please enter qty");
                        v1.qty2 = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Please enter qty");
                        v1.qty3 = sc.nextInt();

                        break;
                    case 4:
                        System.out.println("Please enter qty");
                        v1.qty4 = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Please enter qty");
                        v1.qty5 = sc.nextInt();
                        break;
                    case 6:
                        System.out.println("Please enter qty");
                        v1.qty6 = sc.nextInt();
                        break;
                    case 7:
                        System.out.println("Please enter qty");
                        v1.qty7 = sc.nextInt();
                        break;
                    case 8:
                        System.out.println("Please enter qty");
                        v1.qty8 = sc.nextInt();
                        break;
                    case 9:
                        return;
                }
            }
        }

        if (h instanceof NonVeg) {
            NonVeg v2 = (NonVeg) h;
            for (;;) {
                System.out.println("1.  " + v2.food1 + "                   Price " + v2.price1);
                System.out.println("2.  " + v2.food2 + "                      Price " + v2.price2);
                System.out.println("3.  " + v2.food3 + "             Price " + v2.price3);
                System.out.println("4.  " + v2.food4 + "           Price " + v2.price4);
                System.out.println("5.  " + v2.food5 + "          Price " + v2.price5);
                System.out.println("6.  " + v2.food6 + "            Price " + v2.price6);
                System.out.println("7.  " + v2.food7 + "             Price " + v2.price7);
                System.out.println("8.  " + v2.food8 + "                   Price " + v2.price8);
                System.out.println("9.  Please Bring Food     " + (char) 2);
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Please enter qty");
                        v2.qty1 = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Please enter qty");
                        v2.qty2 = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Please enter qty");
                        v2.qty3 = sc.nextInt();

                        break;
                    case 4:
                        System.out.println("Please enter qty");
                        v2.qty4 = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Please enter qty");
                        v2.qty5 = sc.nextInt();
                        break;
                    case 6:
                        System.out.println("Please enter qty");
                        v2.qty6 = sc.nextInt();
                        break;
                    case 7:
                        System.out.println("Please enter qty");
                        v2.qty7 = sc.nextInt();
                        break;
                    case 8:
                        System.out.println("Please enter qty");
                        v2.qty8 = sc.nextInt();
                        break;
                    case 9:
                        return;
                }
            }
        } else {
            System.out.println("Firstly Select Veg Hote or Non-Veg Hotel");
        }
    }

    // OrderFood Non-Static Method End.

    // ---------------------------------------------------------------------------------------

    public void bill() {
        int c = 1;
        double sum = 0;
        if (h instanceof Veg) {
            Veg v1 = (Veg) h;
            System.out.println("S.no" + "           Food name" + "           Qty" + "           Price");
            if (v1.qty1 != 0) {
                System.out.println(
                        c++ + "              " + v1.food1 + "              " + +v1.qty1 + "   "
                                + (v1.qty1 * v1.price1));
                sum = sum + (v1.qty1 * v1.price1);
            }
            if (v1.qty2 != 0) {
                System.out.println(
                        c++ + "              " + v1.food2 + "              " + v1.qty2 + "  " + (v1.qty2 * v1.price2));
                sum = sum + (v1.qty2 * v1.price2);
            }
            if (v1.qty3 != 0) {
                System.out.println(
                        c++ + "              " + v1.food3 + "              " + v1.qty3 + "  " + (v1.qty3 * v1.price3));
                sum = sum + (v1.qty3 * v1.price3);
            }
            if (v1.qty4 != 0) {
                System.out.println(
                        c++ + "              " + v1.food4 + "              " + v1.qty4 + "  " + (v1.qty4 * v1.price4));
                sum = sum + (v1.qty4 * v1.price4);
            }
            if (v1.qty5 != 0) {
                System.out.println(
                        c++ + "              " + v1.food5 + "              " + v1.qty5 + "  " + (v1.qty5 * v1.price5));
                sum = sum + (v1.qty5 * v1.price5);
            }
            if (v1.qty6 != 0) {
                System.out.println(
                        c++ + "              " + v1.food6 + "              " + v1.qty6 + "  " + (v1.qty6 * v1.price6));
                sum = sum + (v1.qty6 * v1.price6);
            }
            if (v1.qty7 != 0) {
                System.out.println(
                        c++ + "              " + v1.food7 + "              " + v1.qty7 + "  " + (v1.qty7 * v1.price7));
                sum = sum + (v1.qty7 * v1.price7);
            }
            if (v1.qty8 != 0) {
                System.out.println(c++ + "              " + v1.food8 + "           " + v1.qty8 + "            "
                        + (v1.qty8 * v1.price8));
                sum = sum + (v1.qty8 * v1.price8);
            }
            System.out.println("_____________________________________________________");
            System.out.println();
            System.out.println("Total :-                                " + sum);
            System.out.println();
            System.out.println();

        }

        // -------------------------------------------------------------------------

        if (h instanceof NonVeg) {
            NonVeg v2 = (NonVeg) h;
            System.out.println("S.no" + "           Food name" + "           Qty" + "           Price");
            if (v2.qty1 != 0) {
                System.out.println(
                        c++ + "              " + v2.food1 + "              " + +v2.qty1 + "   "
                                + (v2.qty1 * v2.price1));
                sum = sum + (v2.qty1 * v2.price1);
            }
            if (v2.qty2 != 0) {
                System.out.println(
                        c++ + "              " + v2.food2 + "              " + v2.qty2 + "  " + (v2.qty2 * v2.price2));
                sum = sum + (v2.qty2 * v2.price2);
            }
            if (v2.qty3 != 0) {
                System.out.println(
                        c++ + "              " + v2.food3 + "              " + v2.qty3 + "  " + (v2.qty3 * v2.price3));
                sum = sum + (v2.qty3 * v2.price3);
            }
            if (v2.qty4 != 0) {
                System.out.println(
                        c++ + "              " + v2.food4 + "              " + v2.qty4 + "  " + (v2.qty4 * v2.price4));
                sum = sum + (v2.qty4 * v2.price4);
            }
            if (v2.qty5 != 0) {
                System.out.println(
                        c++ + "              " + v2.food5 + "              " + v2.qty5 + "  " + (v2.qty5 * v2.price5));
                sum = sum + (v2.qty5 * v2.price5);
            }
            if (v2.qty6 != 0) {
                System.out.println(
                        c++ + "              " + v2.food6 + "              " + v2.qty6 + "  " + (v2.qty6 * v2.price6));
                sum = sum + (v2.qty6 * v2.price6);
            }
            if (v2.qty7 != 0) {
                System.out.println(
                        c++ + "              " + v2.food7 + "              " + v2.qty7 + "  " + (v2.qty7 * v2.price7));
                sum = sum + (v2.qty7 * v2.price7);
            }
            if (v2.qty8 != 0) {
                System.out.println(c++ + "              " + v2.food8 + "           " + v2.qty8 + "            "
                        + (v2.qty8 * v2.price8));
                sum = sum + (v2.qty8 * v2.price8);
            }
            System.out.println("_____________________________________________________");
            System.out.println();
            System.out.println("Total :-                                " + sum);
            System.out.println();
            System.out.println();

        } else {
            System.out.println("Please  Select Order Food First Then We Generate Bill...");
        }
    }
}
