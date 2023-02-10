public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java ");
        int age = 19;
        if(age>20) {
            System.out.println("скорее всего бумер");
        } else {
            System.out.println("зумер");
        } 
        boolean isMale = true;
        if(!isMale) {
            System.out.println("НЕ мужчина");
        } else {
            System.out.println("мужчина");
        }
        float height = 1.7f;
        if(height<1.8) {
            System.out.println("забираем");
        } else {
            System.out.println("ДЫЛДЫ НЕ НУЖНЫ");
        }
        char symb = "Дима".charAt(0);
        if(symb == 'M') {
            System.out.println("ПОШЕЛ НАХУЙ");
        } else if(symb == 'I' ){
            System.out.println("ПОШЕЛ НАХУЙ");
        } else {
            System.out.println("идем обнимать");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num = 2;
        int num1 = 5;
        if(num>num1) {
            System.out.println("MAX" + num);
            System.out.println("min" + num1);
        } else if(num<num1) {
            System.out.println("max" + num1);
            System.out.println("min" + num);
        } else {
            System.out.println("они равны");
        }

        System.out.println("\n3.Проверка числа");
        int x= -5;
        System.out.println("" + x);
        if(x == 0) {
            System.out.println("Число равно нулю");
        } else if (x%2 == 0) {
            System.out.println("число четное");
        } else if (x%2 != 0) {
            System.out.println("число нечетное");
        } 
        if (x>0) {
            System.out.println("число положительное");
        } else if (x<0) {
            System.out.println("число отрицательное");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num_1 = 123;
        int num_2 = 456;
        System.out.println(num_1 + " " + num_2);
        boolean equalNumbers = false;
        if(num_1/100 == num_2/100) {
            equalNumbers = true;
             System.out.println("одинаковые сотни " + num_1/100);
        } 
        if (num_1%10 == num_2%10) {
            equalNumbers = true;
            System.out.println("одинаковые единицы " + num_1%10);
        } 
        if (num_1%100/10 == num_2%100/10) {
            equalNumbers = true;
            System.out.println("одиновые десятки " + num_1%100/10);
        }
        if(equalNumbers == false){
            System.out.println("равных цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char y = '\u0057';
        System.out.println("" + y);
        if(y>='0' && y<='9') {
            System.out.println("это число");
        } else if (y>= 'A' && y<= 'Z') {
            System.out.println("большая буква");
        } else if (y>= 'a' && y<= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }


        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int vklad = 300000;
        float percent = 0.05f;
        float percent1 = 0.07f;
        float percent2 = 0.1f;
        int vklad2;
        System.out.println(""+ vklad);
        if( vklad < 100000) {
            vklad2 = (int) (vklad * percent);
        } else if (vklad >= 100000 && vklad < 300000) {
            vklad2 = (int) (vklad * percent1);
        } else {
            vklad2 = (int) (vklad * percent2);
        } 
        System.out.println(vklad2);

        int vklad3 = vklad + vklad2;
        System.out.println(vklad3);



        System.out.println("\n7.Определение оценки по предметам");
        int hist = 59;
        int programm = 91;
        int mark = 2;
        int mark1 = 3;
        int mark2 = 4;
        int mark3 = 5;
        int grade;
        int midgrade;
        int histgrade;
        int programmgrade;
        if (hist<=60) {
            System.out.println("оценка по истории "+ mark);
            histgrade = mark;
        } else if (hist<73) {
            System.out.println("оценка по истории "+ mark1);
            histgrade = mark1;
        } else if (hist<91) {
            System.out.println("оценка по истории "+ mark2);
            histgrade = mark2;
        } else {
            System.out.println("оценка по истории "+ mark3);
            histgrade = mark3;
        }
        if (programm<=60) {
            System.out.println("оценка про программированию "+ mark);
            programmgrade = mark;
        } else if (programm<73) {
            System.out.println("оценка про программированию "+ mark1);
            programmgrade = mark1;
        } else if (programm<91) {
            System.out.println("оценка про программированию "+ mark2);
            programmgrade = mark2;
        } else {
            System.out.println("оценка про программированию "+ mark3);
            programmgrade = mark3;
        }
        grade = (hist + programm)/2;
        System.out.println("средний процент про предметам " + grade);
        midgrade = (histgrade + programmgrade)/2;
        System.out.println("средний балл оценок по предметам " + midgrade);

        System.out.println("\n8.Расчет прибыли за год");
        int ar = 5000;
        int d = 13000;
        int t = 9000;
        int prib = (d - ar - t)*12;
        if (prib>0){
            System.out.println("+ " +prib);
        } else {
            System.out.println(prib);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sum = 77;
        int doz = sum % 100 / 10;
        int unit = sum % 100 % 10;
        System.out.println("выдаваемая сумма: " + sum);
        int s = sum/100;
        if (s>10) {
            System.out.println("недостаточно количества банкнот");
        } else {
            System.out.println("100 долларов " + s + " купюр");
            if (doz>5) {
                System.out.println("10 долларов 5 купюр " + "\n1 доллар " + ((doz - 5)*10+unit)+ " купюр");
            } else { 
                System.out.println("10 долларов " + doz + " купюр" + "\n1 доллар " + unit + " купюр");
            }
        }
    }
}


