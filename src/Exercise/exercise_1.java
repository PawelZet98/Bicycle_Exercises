package Exercise;

public class exercise_1 {


    static byte default_byte;
    static int default_int;
    static short default_short;
    static long default_long;
    static float default_float;
    static double default_double;
    static char default_char;
    static String default_String_or_any_object;
    static boolean default_boolean;

    public static void main(String[] args) {

        byte b_max = Byte.MAX_VALUE;
        System.out.println("b_max = " + b_max);
        System.out.println("bytePrintBits(b_max) = " + getByteBits(b_max));
        byte b_min = Byte.MIN_VALUE;
        System.out.println("b_min = " + b_min);
        System.out.println("getByteBits(b_min) = " + getByteBits(b_min) + "+\n");


        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        short s_1 = -1025;
        System.out.println("getShortBits(s_1) = " + getShortBits(s_1) + "+\n");


        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.toBinaryString(Integer.MAX_VALUE) = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.toBinaryString(Integer.MIN_VALUE) = " + Integer.toBinaryString(Integer.MIN_VALUE));


        long l_num = 99999999999999L;
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.toBinaryString(Long.MAX_VALUE) = " + Long.toBinaryString(Long.MAX_VALUE));
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.toBinaryString(Long.MIN_VALUE) = " + Long.toBinaryString(Long.MIN_VALUE));


        double inf = Double.POSITIVE_INFINITY;
        System.out.println("inf = " + inf);
        System.out.println("inf + 5 = " + inf + 5);
        System.out.println("inf - inf = " + (inf - inf));
        System.out.println("inf * -1  = " + inf * -1);


        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);


        float f_value = 3.14F;


        char c = '\u03C0';
        System.out.println("c = " + c);


        System.out.println("default_byte = " + default_byte);
        System.out.println("default_short = " + default_short);
        System.out.println("default_int = " + default_int);
        System.out.println("default_long = " + default_long);
        System.out.println("default_float = " + default_float);
        System.out.println("default_double = " + default_double);
        System.out.println("default_char = " + default_char);
        System.out.println("default_String_or_any_object = " + default_String_or_any_object);
        System.out.println("default_boolean = " + default_boolean);

        int age = 15;
        double height = 2.1;
        boolean is_task_done = false;
        var temperature = 36.6;

        System.out.println("age = " + age + " height = " + height + " temperature = " + temperature);


    }

    public static String getByteBits(byte b) {
        return String.format("%8s",
                Integer.toBinaryString(b & 255))
                .replace(' ', '0');
    }

    public static String getByteBits2(byte b) {
        return String.format("%8s",
                Integer.toBinaryString(b & 255))
                .replace(' ', '0');
    }

    public static String getShortBits(short s_1) {
        return String.format("%8s",
                Integer.toBinaryString(s_1 & (Short.MAX_VALUE - Short.MIN_VALUE)))
                .replace(' ', '0');
    }

    public static <T extends Object> String tester(T ToTest)
    {
        if (ToTest instanceof Integer) return ("Integer");
        else if (ToTest instanceof Double) return ("Double");
        else if (ToTest instanceof Float) return ("Float");
        else if (ToTest instanceof String) return ("String");
        else if (ToTest.getClass().isArray()) return ("Array");
        else return ("Unsure");
    }

}