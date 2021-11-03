package neewPackage;

public class WorkWithString {
    public static void main(String[] args) {

        String s1 = "HELLO THERE";

        System.out.println(s1);
        System.out.println(s1.length());
        //   System.out.printf( "the length of string is " + "%d" + s1.length());


        for (int count = s1.length() -1 ; count > 0; count--){
            System.out.print(s1.charAt(count));
        }
    }
    }

    class kfkk{
        public static void main(String[] args) {

            String s1 = new String("hello");
            String s2 = new String("birthday");
            String s3 = new String("lockdown");
            String s4 = new String("lOCKDOWN");


            if ( s1.equals("hello")) {
                System.out.println("s1 equals hello");
            }
            else
            {
                System.out.println("does not equal");
                }


            if ( s1 == "hello"){
                System.out.println("s1 == hello");
            }
            else
            {
                System.out.println("does not equal");
            }


            if ( s3.equalsIgnoreCase(s4)){
                System.out.println(true);

            }
            else {
                System.out.println(false);
            }

            }




        }



    class startWith {
        public static void main(String[] args) {

            String strings[] = {"started", "starting", "ending", "ended"};

            for (String string : strings) {
                if (string.startsWith("st"))
                    System.out.println(string);

            }

            for (String string : strings) {
                if (string.startsWith("art", 2)) {
                    System.out.println(string);
                }
            }

            for (String string : strings) {
                if (string.endsWith("ed")) {
                    System.out.println(string);
                } else {
                    System.out.println();
                }
            }
        }
    }

                       class GetIndexOf{
                    public static void main(String[] args) {

                        String s1  = "ahfjksopspdlswpmd";

                        System.out.println(s1.indexOf('k'));

                    }
                }

                class lastIndex{

                    public static void main(String[] args) {

                        String s1 = "hello there";

                        for ( int count = s1.length() -1 ; count > 0; count --){
                            System.out.print(s1.charAt(count));
                        }
                    }
                }





