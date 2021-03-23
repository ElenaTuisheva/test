package mypackege;

public class Main {
    public static void main(String[] args) {
        System.out.println(); //превратить строку "Шаурмяу" в строку "Шаурма"
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
        System.out.println(NG);
        NG = NG.replace("много времени", "4 месяца");
        System.out.println(NG);

        System.out.println();//превратите из предыдущей строки количество месяцев в цифру. Уменьшите ее на единицу. выведите.
        String[] array = NG.split("\\s");
        Integer i = Integer.parseInt(array[1]);
        i-=1;
        String m = Integer.toString(i);
        System.out.println(array[0] + " " + m + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5]);
        System.out.println();//задание со звездочкой: превратить "сосед и децибелы" в "соседи имбецилы"
        String sosed = "сосед и децибелы";
        System.out.println(sosed);
        sosed = sosed.replace(" и децибе", "и имбеци");
        System.out.println(sosed);

    }
}
