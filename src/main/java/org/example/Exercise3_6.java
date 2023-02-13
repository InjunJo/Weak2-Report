package org.example;

public class Exercise3_6 {

    public static void main(String[] args) {

        //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
        //변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
        // 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!

        int fahrenheit = 100;
        float celcius = ((float) 5/9)*(fahrenheit-32);

        int fore = (int)celcius;
        float decimal = celcius - fore;
        int temp = (int)(decimal*1000);

        if(temp % 10 >=5) {
            temp = (temp /10 +1) * 10;
        }else {
            temp = (temp/10) * 10;
        }

        StringBuilder builder = new StringBuilder();

        builder.append(fore);
        builder.append(".");
        builder.append(temp);

        celcius = Float.parseFloat(builder.toString());

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);

        //예상 결과 : Fahrenheit:100, Celcius:37.78

    }

}
