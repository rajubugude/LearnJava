package ExceptionHandlig;

public class Main {

        public static void main(String[] args)  throws ClassNotFoundException{
            Main sampleObj = new Main();
            sampleObj.method1();
        }

        private void method1(){
            try {
                method3();
                return ;
            }
            catch (ClassNotFoundException obj){
//                obj.printStackTrace();
                System.out.println("Here is error, handled in parent");
            }
            finally {
                System.out.println("Inside finally");
            }

        }

        private void method2() {
            try {
                throw new ClassNotFoundException();
            }
            catch (ClassNotFoundException exception){
                exception.printStackTrace();
            }
        }

        private void method3() throws ClassNotFoundException{
//            int b = 5/0;

//            throw new ArithmeticException();

//            Object val = 0;
//            System.out.println((String) val);

            throw new ClassNotFoundException();


        }
    }


