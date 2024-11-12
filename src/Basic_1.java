public class Basic_1 {
        static int var;
        int var1;
        public static void main(String args[]) {
            System.out.println("Hello World");
            //this is a comment

            /* this is
            a multiline comment
            observe
             */

            int a = 4;
            System.out.println(a);

            System.out.println("Calling static class member: " + var);

            Basic_1 obj = new Basic_1();
            System.out.println("Calling class member by creating instance: " +obj.var1);



            char c = 'a';
            System.out.println(c);

            String s = "raju";
            System.out.println(s);

            float d = 5;
            System.out.println(d);


        }
}
