package mypackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        System.out.println(); //превратить строку "Шаурмяу" в строку "Шаурма"
        String line = "Шаурмяу";
        System.out.println("до: " + line);
        line = line.substring(0,5);
        String lineA = "а";
        line = line.concat(lineA);
        System.out.println("после: " + line);

        System.out.println(); //"Много $" превратить в "Много &"
        String s1 = "Много $";
        System.out.println("до: " + s1);
        String s2 = s1.replace("$", "&");
        System.out.println("после: " + s2);

        System.out.println(); //"осталось много времени до нового года" - превратите в "осталось 4 месяца до нового года".
        String NG = "осталось много времени до нового года";
        System.out.println("до: " + NG);
        NG = NG.replace("много времени", "4 месяца");
        System.out.println("после: " + NG);

        System.out.println();//превратите из предыдущей строки количество месяцев в цифру. Уменьшите ее на единицу. выведите.
        System.out.println("до: " + NG);
        String[] array = NG.split("\\s");
        Integer i = Integer.parseInt(array[1]);
        i-=1;
        String m = Integer.toString(i);
        System.out.println("после: " + array[0] + " " + m + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5]);

        System.out.println();//задание со звездочкой: превратить "сосед и децибелы" в "соседи имбецилы"
        String sosed = "сосед и децибелы";
        System.out.println("до: " + sosed);
        sosed = sosed.replace(" и децибе", "и имбеци");
        System.out.println("после: " + sosed);*/
        //цикл интовой переменной от 1 до 5. Когда переменная равна 3, выбросите любое исключение :).

/*        for (int i = 0; i < 5; i++) {
            try {
                int x = i + 1;
                if (x == 3) throw new Exception(x + " найдено исключение");
                System.out.println(x);
            } catch (Exception ex) {
                ex.printStackTrace();
            }*/
        Scanner vvod = new Scanner(System.in);
        System.out.println("Веди стороку");
        String stoka = vvod.nextLine();
        System.out.println("Введи число");
        int chiclo = vvod.nextInt();
        System.out.println("вывод строки " + stoka);
        System.out.println("вывод числа " + chiclo);
        Integer str;
        str = Integer.parseInt(stoka);
        int sum;
        sum = chiclo + str;
        System.out.println("сумма " + sum);

    }

}

