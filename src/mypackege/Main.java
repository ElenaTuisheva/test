package mypackege;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание"); //превратить строку "Шаурмяу" в строку "Шаурма"
        String line = "Шаурмяу";
        System.out.println("до: " + line);
        line = line.substring(0,5);
        String lineA = "а";
        line = line.concat(lineA);
        System.out.println("после: " + line);
        System.out.println("2 задание"); //"Много $" превратить в "Много &"
        String s1 = "Много $";
        System.out.println("до: " + s1);
        String s2 = s1.replace("$", "&");
        System.out.println("после: " + s2);
        System.out.println("3 задание"); //"осталось много времени до нового года" - превратите в "осталось 4 месяца до нового года".
        String NG = "осталось много времени до нового года";
        System.out.println(NG);
        System.out.println(NG.replace("много времени", "4 месяца"));




//        4) превратите из предыдущей строки количество месяцев в цифру. Уменьшите ее на единицу. выведите.
//          задание со звездочкой: 5) задание со звездочкой: превратить "сосед и децибелы" в "соседи имбецилы"   =). работой со строкой, естественно.
//          покажите работу с методами substring, parse, trim
    }
}
