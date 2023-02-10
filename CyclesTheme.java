public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int x = 0;
        int y = 0;
        do {
            if (i % 2 == 0){
                x = x + i;
            } else {
                y = y + i;
            }
            i++;
        } while (i<=21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + x + ", а нечетных = " + 
            y);


        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max;
        int min;
        if(a>b && a>c) {
            max = a;
        } else if (b>a && b>c) {
            max = b;
        } else {
            max = c;
        }
        if (a<b && a<c) {
            min = a;
        } else if (b<a && b<c) {
            min = b;
        } else {
            min = c;
        }
        for(int j = max-1; j > min; j--) {
            System.out.println( j );
        }
        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while(num!= 0) {
            System.out.print(num%10);
            sum=sum + num%10;
            num = num/10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int x1 = 1;
        int x2 = 23;
        int symb = x2 - x1 + 1;
        for (int z = 0; z< symb/10; z++) {
            for ( int k = 0; k < 5; k++) {
                System.out.printf("%10d ", x1);
                x1 = x1 + 2;
            }
            System.out.println();
        }
        if (x1 <= x2) {
            for (int i1 = 0; i1<5; i1 ++) {
                if (x1 <=x2) {
                System.out.printf("%10d " , x1);
                x1 = x1 + 2;
                } else {
                System.out.printf("%10d " , 0);
                }
            }
        }
        

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        int numb = 3242592;
        sum = 0;
        while (numb %10 !=0) {
            if (numb%10 ==2){
                sum = sum+1;
            }
            numb = numb/10;
        }
        if (sum%2 ==0) {
            System.out.println("число X содержит N  четное количество двоек");
        } else {
            System.out.println("число X содержит N  нечетное количество двоек");
        }


        System.out.println("\n6.Отображение фигур в консоли");
        char p = '*';
        char ptr = '#';
        char tr = '$';
        for (int str = 0; str<5; str++){
            for ( int st = 0; st<10; st++) {
                System.out.print(p);
            }
            System.out.println();
        } 
        System.out.println();
        int v =0;
        int v1 =5;
        while (v < 5) {
            int v3 = v1;
            v1--;
            while (v3 > 0){
                System.out.print(ptr);
                v3--;
            }
            System.out.println();
            v++;
        } 
        System.out.println();
        int w = 0;
        int w1 = 1;
        do {
            int inn = 0;
            do{
                inn++;
                System.out.print(tr);
            } while (inn < w1);
            w++;
            if(w < 3) {
                w1++;
            } else {
                w1--;
            }
            System.out.println();
        } while (w<5);

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num_1 = 1234321;
        int zapas = num_1;
        int st = 0;
        while (zapas/10!=0){
            zapas = zapas/10;
            st = st + 1;
        }
        System.out.println(st);
        zapas = num_1; 
        int mult = 1;
        for (int z = 0; z<st; z++){
            mult = mult *10;
        }
        System.out.println(mult);
        int konteyner = 0;
        for (int g = mult; g !=0; g = g/10) {
            konteyner = konteyner + g * (zapas % 10);
            zapas = zapas/10;

        }
        System.out.println(konteyner);
        if (num_1 == konteyner){
            System.out.println("число X является палиндромом");
        } else {
            System.out.println("число X не является палиндромом");
        }



        System.out.println("\n9.Определение, является ли число счастливым");
        int nymb = 154325;
        int zapas2 = nymb;
        int kol = 0;
        int abc = 0;
        int abc2 = 0;
        while (kol<3) {
            kol = kol +1;
            abc = abc + zapas2%10;
            zapas2 = zapas2/10;

        }
        while (zapas2 != 0) {
            abc2 = abc2 + zapas2%10;
            zapas2 = zapas2/10;

        }
        System.out.println("Сумма цифр " + abc + "= " + abc2);
        if (abc == abc2) {
            System.out.println("Число является счастливым");

        } else {
            System.out.println("Число не является счастливым");
        }


        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        int y1 = 2;
        int y0 = y1;
        int y2 = 3;
        int y3 = 4;
        int y4 = 5;
        int y5 = 6;
        int y6 = 7;
        int y7 = 8;
        int y8 = 9;
        char tab = '|';
        char tab1 = '_';
        boolean built = false;
        for (int column = 0; column <9; column ++){
            if(column == 1 && !built) {
            for (int ii = 0;ii < 53 ; ii++) {
                System.out.print(tab1);
            }
            built = true;
            column--;
            System.out.println();
            continue;
            
        }
        if ( column == 0){
            System.out.printf("%5s",tab);
        } else {
            System.out.printf("%2d %2s", y0, tab);
            y0 = y0+1;

        }

        
        System.out.printf("%5d %5d %5d %5d %5d %5d %5d %5d \n", y1, y2, y3, y4, y5, y6, y7, y8);
        y1 = y1+2;
        y2 = y2 + 3;
        y3 = y3 + 4;
        y4 = y4 +5;
        y5 = y5+6;
        y6 = y6 +7;
        y7 = y7+8;
        y8 = y8+9;
        
        } 





        

         
        

    }
}

    
