public class TypeCasting {
    public static void main(String[] args) {
        ///  TypeCasting
        int a =(int)(5.600);
        System.out.println(a);
        ///  we are taking a float value and asking ouput in int it remove the decimal values in the float value

        ///  automatic type conversion in expressions
        int b = 257;
        System.out.println((byte)(b));
        ///  the output is 1 becasue the byte can store only upto 256
        ///  what actually working is 257 % 256 = 1
    }
}
