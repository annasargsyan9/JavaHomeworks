public class Operations {
    public static void main(String[] args) {
        int x = 'A';
        int _x = '4';
        int $a = 9;
        System.out.println($a);
        int a45 = 95;
        System.out.println(a45);

        String FirstName = "Anna";
        System.out.println(FirstName);

        int a = 4, A = 3;
        int c = a + A;
        System.out.println(c);
        c = a - A;
        System.out.println(c);

        System.out.println(a*A);

        int q = 7, y = 5;
        System.out.println(q/y);
        // qani vor 7 ev 5 mboghj tver en,
        // nshanakum e veradardzra bajanman qanorde,
        // aysinqn 7 i mej ka mi hat 5

        System.out.println(q%y);
        // nshanakum e vercru bajanumic stacats mnacorde,
        // 7 baajanats 5 i = 1, mnacorde 2
        // qni vor gorts unenq  amboghj tveri het,
        // nshanakum e stanalu enq amboghj tiv

        double t = 7.0, p = 5.0;
        System.out.println(t/p);
        //qani vor double tver en, kstananq  aynpes vonc vor sovorabar stanum enq babjanum anelis

        int gg = 5;
        // gg = gg + 1; //or
//        gg++;
        ++gg;
        System.out.println(gg);

        x = 8;
        System.out.println(x++); // astegh ktpi 8, qani vor arajine ktesni x u ktpi,
        // ete es anem ayspes
        // System.out.println(x); // aystegh cuyc kta vor arden plus a arel 8in mek
        System.out.println(++x); // ays depqum ktpi 9, kkarda ++ @ u heto ktpi x @

        x = 3;
        y = 4;
        c = x++ - --y; //nshanakum e ogtagortsir x i arjeqe gortsogutyan mej,
        // heto nor vor gortsoghutyune prtsni  gumari mek
        // c = 3 - 3 = 0
        // x = 4, y = 3
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);


        System.out.println("----------");
        x = 7;
        y = 8;
        c = ++x + y--;
        System.out.println(x++);// x++ = 8
        System.out.println(c);// c = 16
        System.out.println(x);// x = 9
        System.out.println(--y);// --y = 6
        System.out.println(y);// y = 6

        //boolean relational operators
        System.out.println("---------------");
         boolean bb = x == 98;
        System.out.println(bb);
        System.out.println(x != 9);
        System.out.println(x > 8);
        System.out.println(x <= 9);

        // tpel true kam false ete x zuyg e,
        // false hakarak  depqum
        x = 4;
        System.out.println(x % 2 == 0); // true
        // ete x liner 41 kstanayinq false qani vor,
        // 41-e amboghj tiv che


        //the logical operators
        // && ev
        x = 41;
        System.out.println("--------&&");

        System.out.println(x>= 0 && x<=9); //false

        // || kam
        System.out.println("--------||");
        x = 101;
        System.out.println(x< 0 || x > 100);

        // ! reverse the state
        Boolean vv = true;
        System.out.println(!vv); //false


        // Java program to illustrate
        // bitwise operators

                // Initial values
                int ka = 5;
                int b = 7;

                // bitwise and
                // 0101 & 0111=0101 = 5
        System.out.println("..........Bitwise");
                System.out.println("a&b = " + (a & b));

                // bitwise or
                // 0101 | 0111=0111 = 7
                System.out.println("a|b = " + (a | b));

                // bitwise xor
                // 0101 ^ 0111=0010 = 2
                System.out.println("a^b = " + (a ^ b));

                // bitwise not
                // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
                // will give 2's complement (32 bit) of 5 = -6
                System.out.println("~a = " + ~a);

                // can also be combined with
                // assignment operator to provide shorthand
                // assignment
                // a=a&b
                a &= b;
                System.out.println("a= " + a);

                int dd = 8;
                dd += 8;
        System.out.println(dd);


        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            float numb = 19/2;
            System.out.println(numb + "NUM");


        }

            }
        }

        




