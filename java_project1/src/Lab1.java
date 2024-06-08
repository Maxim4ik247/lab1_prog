import java.util.Random;

import static java.lang.Math.*;


public class Lab1 {
    public static void main(String[] args) {
        short d[] = get_array(6, 22);
        print_array(d);
        float x[] = get_float_array();
        print_array2(x);
        double[][] twoDimArray = new double[9][12];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (d[i] == 20) {
                    twoDimArray[i][j] = pow (4 * pow(3 - pow((1-x[j])/3,2) / (3-pow(0.25 + x[j] ,2)), cbrt(x[j])),3);
                } else if (d[i] == 6 || d[i] == 8 || d[i] == 12 || d[i] == 16) {
                    twoDimArray[i][j] =asin( 1 / exp(pow ((acos((x[j]+2.5) / 23) + 1) / 2, 2)));
                } else {
                    twoDimArray[i][j] = sin( pow( sin(tan(x[j])),log( exp(x[j]) ) / (0.25 - tan( atan( (x[j] +2.5) / 23)))));
                }
            }
        }
        print_array3(twoDimArray);
    }

    public static float[] get_float_array() {
        float result[] = new float[12];
        float Min = -9;
        float Max = 14;
        for (int i = 0; i < 12; i++) {
            Random rand = new Random();
            result[i] = rand.nextFloat() * (Max - Min) + Min;
        }
        return result;
    }

    public static short[] get_array(int frm, int to) {
        int counter = 0;
        for (int i = frm; i <= to; i++) {
            if (i % 2 == 0) counter++;
        }
        short[] result = new short[counter];
        int j = 0;
        for (short i = (short) frm; i <= (short) to; i++) {
            if (i % 2 == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

    public static void print_array(short[] elems) {
        for (short i = 0; i < elems.length; i++) {
            System.out.print(elems[i] + " ");
        }
        System.out.println('\n');
    }

    public static void print_array2(float[] elems) {
        for (short i = 0; i < elems.length; i++) {
            System.out.print(elems[i] + " ");
        }
        System.out.print('\n');
    }
    public static void print_array3(double[][] elems){
        for (short i = 0; i < elems.length; i++) {
            for (short j=0; j<(elems[i]).length; j++){
                System.out.print(String.format( "%.3f", elems[i][j]) + " ");
            }
            System.out.print('\n');
        }

    }
}
