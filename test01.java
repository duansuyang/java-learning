public class test01 {
    public static void main(String[] args) {
        System.out.println("hello");
        String str = "Runoob";
        String str2 = new String("Runoob");
        boolean isPass = true;
        if (isPass){
            System.out.println("pass");
        } else {
            System.out.println("not pass");
        }
        int n1 = 10;
        float n2 = n1 + 1.1F;
        
        System.out.println("PeiKing\t TianJin\t Shanghai");
        System.out.println("jack\nsmith\nmary");
        System.out.println("C:\\Windows\\Sytem32");
        System.out.println("This is a \"");
        System.out.println("This is a \'");

        System.out.println(100+3+"str");
        System.out.println("str"+100+3);

        double mum1 = 8.1/3;
        System.out.println(mum1);
        System.out.println(Math.abs(mum1-2.7));

        char c1 =38889;
        System.out.println(c1);

        char c2 = 'x';
        double mum2 = c2;
        System.out.println(mum2);

        byte b1 = 8;
        byte b2 = 9;
        int s1 = b1+b2;
        System.out.println(s1);

        int n3 = Integer.parseInt("123");
        float f1 = Float.parseFloat("123.1");
        double d1 = Double.parseDouble("123.22");
        short s2 = Short.parseShort("22");
        long l1 = Long.parseLong("1234");
        boolean b4 = Boolean.parseBoolean("true");
        byte b5 = Byte.parseByte("2");

        // int n4 = Integer.parseInt("hahaha");
        // System.out.println(n4);

        int i = 1;
        i = i++;
        System.out.println(i);






    }
}
