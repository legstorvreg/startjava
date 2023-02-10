public class VariablesTheme {

     
        System.out.println("1.Вывод значений переменных на консоль");
        byte num = 4;
        System.out.println("количество ядер "+ num);
        short num_1 = 8;
        System.out.println("логических процессов "+ num_1);
        int num_2 = 19044;
        System.out.println("СБОРКА "+ num_2);
        long num_3 = 2001L;
        System.out.println("количество Мгц "+ num_3);
        float num_4 = 15.9f;
        System.out.println("полный объем физической памяти "+ num_4);
        double num_5 = 22.9d;
        System.out.println("всего виртуальной памяти "+ num_5);
        char num_6= 'R';
        System.out.println("процессор Intel "+ num_6);
        boolean num_7 = true;
        System.out.println("Виртуализация включена во встроенном ПО "+ num_7);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        byte price1 = 100;
        int price2 = 200;
        System.out.println(price1 + price2);
        byte x = 11;
        int dis = (price1 + price2)*x/100;
        System.out.println(dis);
        System.out.println(price1 + price2 - dis);

        System.out.println("\n3Вывод слова JAVA");
        System.out.println("   J   a  v     v  a");
        System.out.println("   J  a a  v   v  a a");
        System.out.println("J  J aaaaa  V V  aaaaa");
        System.out.println(" JJ a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte num1 = Byte.MAX_VALUE;
        short num2 = Short.MAX_VALUE;
        int num3 = Integer.MAX_VALUE;
        long num4 = Long.MAX_VALUE;
        System.out.println(num1);
        System.out.println(++num1);
        System.out.println(--num1);
        System.out.println(++num2);
        System.out.println(--num2);
        System.out.println(++num3);
        System.out.println(--num3);
        System.out.println(++num4);
        System.out.println(--num4);

        System.out.println("\n5.Перестановка значений переменных");
        int x1 = 2;
        int x2 = 5;
        int x3 = x1;
        System.out.println("с помощью третьей переменной");
        System.out.println("" + x1 + " " + x2);
        x1 = x2;
        x2 = x3;
        System.out.println("" + x1 + " " + x2);
        System.out.println("с помощью арифметических действий");
        System.out.println("" + x1 + " " + x2);
        x1 = x1 + x2;
        x2 = x1 - x2;
        x1 = x1 - x2;
        System.out.println("" + x1 + " " + x2);
        System.out.println("с помощью побитовой операции");
        System.out.println("" + x1 + " " + x2);
        x1 = x1 ^ x2;
        x2 = x2 ^ x1;
        x1 = x1 ^ x2;
        System.out.println("" + x1 + " " + x2);

        System.out.println("\n6.Вывод символов и их кодов");
        char sym1 = '#';
        int sym_1 = 35;
        System.out.println("" + sym_1 + " "+ sym1);
        char sym2 = '&';
        int sym_2 = 38;
        System.out.println("" + sym_2 + " "+ sym2);
        char sym3 = '@';
        int sym_3 = 64;
        System.out.println("" + sym_3 + " "+ sym3);
        char sym4 = '^';
        int sym_4 = 94;
        System.out.println("" + sym_4 + " "+ sym4);
        char sym5 = '_';
        int sym_5 = 95;
        System.out.println("" + sym_5 + " "+ sym5);
        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char symb = '/';
        char symb1 = '\\';
        char symb2 = '_';
        char symb3 = '(';
        char symb4 = ')';
        System.out.println("    " + symb + symb1);
        System.out.println("   " + symb + "  " + symb1);
        System.out.println("  " + symb + symb2 + symb3 + " " + symb4 + symb1);
        System.out.println(" "+ symb + "      " + symb1);
        System.out.println("" + symb + symb2 + symb2 + symb2 + symb2 + symb + symb1 + symb2 + symb2
         + symb1);
        
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int N = 123;
        int X = N/100;
        System.out.println("Число " + N + " содержит");
        System.out.println("" + X + "  сотен");
        int Y = N%100/10;
        System.out.println("" + Y + "  десятков");
        int Z = N%10;
        System.out.println("" + Z + "  единиц");
        System.out.println("\n9.Вывод времени");
        int sec = 86399;
        int h = sec/3600;
        int m = sec % 3600 / 60;
        int s= sec % 3600 % 60;
        System.out.printf("%d:%d:%d", h, m, s);




    }
}