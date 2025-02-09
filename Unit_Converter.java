
//Unit Conversion System
//Java Project
import java.util.Scanner;

class Input {
    
    public int n;
    public float in, m, cm, f, yd, mile, km, acre, msq, h, s, speed, oz, g, lb, kg, atm, pa, mmHg, hp, kw, F, C, cal, J, wrong, select;
    public void intro() {
       System.out.println("Project by Narayan Bhusal(25) & Nishan Regmi(28)");
        System.out.println("<----------------------Mathematical Unit Conversion--------------------->");
        System.out.println("<-------------There are total 30 unit conversion in this project------------->");
        System.out.println();
        System.out.println("No.   Unit\t\t\t\t" + "No.   Unit");
        System.out.println();
        System.out.println(" 1.   in -> cm\t\t\t\t" + "16.   m/s -> km/h");
        System.out.println(" 2.   cm -> in\t\t\t\t" + "17.   oz -> g");
        System.out.println(" 3.   ft -> m\t\t\t\t" + "18.   g -> oz");
        System.out.println(" 4.   m -> ft\t\t\t\t" + "19.   lb -> kg");
        System.out.println(" 5.   yd -> m\t\t\t\t" + "20.   kg -> lb");
        System.out.println(" 6.   m -> yd\t\t\t\t" + "21.   atm -> pa");
        System.out.println(" 7.   mile -> km\t\t\t" + "22.   Pa -> atm");
        System.out.println(" 8.   km -> mile\t\t\t" + "23.   mmHg -> pa");
        System.out.println(" 9.   mile -> m\t\t\t\t" + "24.   pa -> mmHg");
        System.out.println("10.   m -> mile\t\t\t\t" + "25.   hp -> kW");
        System.out.println("11.   acre -> m^2\t\t\t" + "26.   kW -> hp");
        System.out.println("12.   m^2 -> acre\t\t\t" + "27.   F -> C");
        System.out.println("13.   yd -> km\t\t\t\t" + "28.   C -> F");
        System.out.println("14.   km -> yd\t\t\t\t" + "29.   J -> cal");
        System.out.println("15.   km/h -> m/s\t\t\t" + "30.   cal -> J");
        System.out.println();
        System.out.println("You have to select the corresponding number of the required unit conversion !");
        System.out.println("Example : If you want to select in -> cm, you should enter 1 below! ");
        System.out.println();
    }
}

class Mains extends Input {
    Scanner scanner = new Scanner(System.in);

    public int condition() {
        System.out.print("Do you want to do more conversions ? 1. Yes 2. No Enter (1/2) : ");
        select = scanner.nextInt();
        if (select == 1) {
            return choose();
        } else {
            System.out.println("Alright ! Thank You !");
            return 0;
        }
    }

    public int choose() {
        System.out.print("Enter the number : ");
        n = scanner.nextInt();
        
        switch (n) {
            case 1:
                System.out.print("\nEnter the value of inches(in) : ");
                in = scanner.nextFloat();
                cm = in * 2.54f;
                System.out.println("The result in centimeters(cm) is : " + cm + "cm\n");
                break;

            case 2:
                System.out.print("\nEnter the value of centimeters(cm) : ");
                cm = scanner.nextFloat();
                in = cm / 2.54f;
                System.out.println("The result in inch(in) is : " + in + "inch\n");
                break;

            case 3:
                System.out.print("\nEnter the value of foot(f) : ");
                f = scanner.nextFloat();
                m = f * 0.3048f;
                System.out.println("The result of meters(m) is : " + m + "m\n");
                break;

            case 4:
                System.out.print("\nEnter the value of meter(m) : ");
                m = scanner.nextFloat();
                f = m / 0.3048f;
                System.out.println("The result of foot(f) is : " + f + "f\n");
                break;

            case 5:
                System.out.print("\nEnter the value of yard(yd) : ");
                yd = scanner.nextFloat();
                m = yd * 0.9144f;
                System.out.println("The result of meter(m) is : " + m + "m\n");
                break;

            case 6:
                System.out.print("\nEnter the value of meter(m) : ");
                m = scanner.nextFloat();
                yd = m / 0.9144f;
                System.out.println("The result of yard(yd) is : " + yd + "yd\n");
                break;

            case 7:
                System.out.print("\nEnter the value of mile : ");
                mile = scanner.nextFloat();
                km = mile * 1.60934f;
                System.out.println("The result of kilometers(km) is : " + km + "km\n");
                break;

            case 8:
                System.out.print("\nEnter the value of kilometers(km) : ");
                km = scanner.nextFloat();
                mile = km / 1.60934f;
                System.out.println("The result of mile is : " + mile + "mile\n");
                break;

            case 9:
                System.out.print("\nEnter the value of mile : ");
                mile = scanner.nextFloat();
                m = mile * 1609.34f;
                System.out.println("The result of meter(m) is : " + m + "m\n");
                break;

            case 10:
                System.out.print("\nEnter the value of meter(m) : ");
                m = scanner.nextFloat();
                mile = m / 1609.34f;
                System.out.println("The result of mile is : " + mile + "mile\n");
                break;

            case 11:
                System.out.print("\nEnter the value of acre : ");
                acre = scanner.nextFloat();
                msq = acre * 4046.86f;
                System.out.println("The result of meter(m) is : " + msq + "m\n");
                break;

            case 12:
                System.out.print("\nEnter the value of meter(m) : ");
                msq = scanner.nextFloat();
                acre = msq / 4046.86f;
                System.out.println("The result of acre is : " + acre + "acre\n");
                break;

            case 13:
                System.out.print("\nEnter the value of yard(yd) : ");
                yd = scanner.nextFloat();
                km = yd * 0.0009144f;
                System.out.println("The result of kilometers(km) is : " + km + "km\n");
                break;

            case 14:
                System.out.print("\nEnter the value of kilometers(km) : ");
                km = scanner.nextFloat();
                yd = km / 0.0009144f;
                System.out.println("The result in yard(yd) is : " + yd + "yd\n");
                break;

            case 15:
                System.out.print("\nEnter the value of km/h : ");
                km = scanner.nextFloat();
                m = km * 1000;
                speed = m / 3600;
                System.out.println("The result in m/s is : " + speed + "m/s\n");
                break;

            case 16:
                System.out.print("\nEnter the value of m/s : ");
                m = scanner.nextFloat();
                km = m * 3600 / 1000;
                System.out.println("The result in km/h is : " + km + "km/h\n");
                break;

            case 17:
                System.out.print("\nEnter the value of ounces(oz) : ");
                oz = scanner.nextFloat();
                g = oz * 28.3495f;
                System.out.println("The result in gram(g) is : " + g + "g\n");
                break;

            case 18:
                System.out.print("\nEnter the value of gram(g) : ");
                g = scanner.nextFloat();
                oz = g / 28.3495f;
                System.out.println("The result in ounces(oz) is : " + oz + "oz\n");
                break;

            case 19:
                System.out.print("\nEnter the value of pounds (lb) : ");
                lb = scanner.nextFloat();
                kg = lb * 0.453592f;
                System.out.println("The result in kilograms(kg) is : " + kg + "kg\n");
                break;

            case 20:
                System.out.print("\nEnter the value of kilograms(kg) : ");
                kg = scanner.nextFloat();
                lb = kg / 0.453592f;
                System.out.println("The result in pounds(lb) is : " + lb + "lb\n");
                break;

            case 21:
                System.out.print("\nEnter the value of Atmospheres(atm) : ");
                atm = scanner.nextFloat();
                pa = atm * 101325;
                System.out.println("The result in pascals(pa) : " + pa + "pa\n");
                break;

            case 22:
                System.out.print("\nEnter the value of Pascals(pa) : ");
                pa = scanner.nextFloat();
                atm = pa / 101325;
                System.out.println("The result in Atmospheres(atm) is : " + atm + "atm\n");
                break;

            case 23:
                System.out.print("\nEnter the value of mmHg : ");
                mmHg = scanner.nextFloat();
                pa = mmHg * 133.3223684f;
                System.out.println("The result in Pascals(pa) is : " + pa + "pa\n");
                break;

            case 24:
                System.out.print("\nEnter the value of pascals(pa) : ");
                pa = scanner.nextFloat();
                mmHg = pa / 133.3223684f;
                System.out.println("The result in mmHg is : " + mmHg + "mmHg\n");
                break;

            case 25:
                System.out.print("\nEnter the value of HorsePower (hp): ");
                hp = scanner.nextFloat();
                kw = hp * 0.7355f;
                System.out.println("The result in Kilowatts(kW) is : " + kw + "kW\n");
                break;

            case 26:
                System.out.print("\nEnter the value of KiloWatts(kW) : ");
                kw = scanner.nextFloat();
                hp = kw / 0.7355f;
                System.out.println("The result in HorsePower(hp) is : " + hp + "Hp\n");
                break;

            case 27:
                System.out.print("\nEnter the value of Fahrenheit(F) : ");
                F = scanner.nextFloat();
                C = 0.555555555556f * (F - 32);
                System.out.println("The result in Celsius(C) is : " + C + "C\n");
                break;

            case 28:
                System.out.print("\nEnter the value of Celsius(C) : ");
                C = scanner.nextFloat();
                F = 1.8f * C + 32;
                System.out.println("The result in Fahrenheit(F) is : " + F + "F\n");
                break;

            case 29:
                System.out.print("\nEnter the value of calories(cal) : ");
                cal = scanner.nextFloat();
                J = cal * 4.184f;
                System.out.println("The result in Joule(j) is : " + J + "J\n");
                break;

            case 30:
                System.out.print("\nEnter the value of Joule(J) : ");
                J = scanner.nextFloat();
                cal = J / 4.184f;
                System.out.println("The result in calories(cal) is : " + cal + "cal\n");
                break;

            default:
                System.out.println("Wrong Input Provided !");
                System.out.print("Do you want to re-input ? 1. Yes 2. No Enter (1/2): ");
                wrong = scanner.nextInt();
                if (wrong == 1) {
                    return choose();
                } else {
                    System.out.println("Alright ! Thank You!");
                    return 0;
                }
        }
        return condition();
    }
}

public class Main{
    public static void main(String[] args) {
        Mains x = new Mains();
        x.intro();
        x.choose();
    }
}
