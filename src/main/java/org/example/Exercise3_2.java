package org.example;

public class Exercise3_2 {

    public static void main(String[] args) {
        //3-2. 다음 연산의 결과와 그 이유를 적으세요.

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        /*System.out.println(y >= 5 || x < 0 && x > 2);*/  /* false  => 정답은 true이다

             이유는 비교 연산자에서 &&는 || 보다 우선순위를 갖는다. -> 이 사실을 모르고 있었음.
             */

        /*System.out.println(y += 10 - x++);*/  /* 결과는 13 */

        /*System.out.println(x += 2);*/  /* 결과는 4 */

        /*System.out.println(!('A' <= c && c <= 'Z'));*/ /*true  -> 답은 false 앞에 !를 못봤다.. */

        /*System.out.println('C' - c);*/ /* 'C'는 67이므로 결과는 2   */

        /*System.out.println('5' - '0');*/ /* '5'는 53, '0'은 48 결과는 5  */

        System.out.println(c + 1); /*  결과는 66 */

        System.out.println(++c); /* 결과는 B */

        System.out.println(c); /* 결과는 B  */
    }

}
