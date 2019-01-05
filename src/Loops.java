
public class Loops {

    //1
    public static int usingForLoop(int i) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        return usingForLoop(i);
    }

    //2
    public int usingWhileLoop(int i) {
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        return usingWhileLoop(i);
    }

    //3

    public static int justNums(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
        }
        return justNums(n);
    }

    //4
    public static int numEven(int n) {

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        return numEven(n);
    }

    //5
    public static int printSums() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        return printSums();
    }

    //6
    public static int sumNums(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += n;
        }
        return result;
    }

    //7
    public static int modify6(int n) {
        int result = 0;
        for (int i = 0; i < 10000; i++) {
            result += n;
        }
        return result;
    }

    //8
    public static void question8(int n, String s) {
        if (n >= 0) {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s);
            } else if (n < 0) {
                System.out.println("");
            }
        }

        //9
        public static void question9 ( int n, String s){
            for (String s : n) {
                System.out.println(s);
            }
        }


        //10
        public static int firstTen () {
            int a = 0;
            int b = 1;
            int c;
            int count = 2;
            System.out.print(a + ",");
            System.out.print(b + ",");
            while (count != 10) {
                c = a + b;
                count++;
                System.out.print(c + ",");
                a = b;
                b = c;
            }
            return count;
        }

        //11
        public int sumOfFirstTen ( int n){
            if (n <= 0)
                return 0;

            int fibNum[] = new int[n + 1];
            fibNum[0] = 0;
            fibNum[1] = 1;
            int sum = fibNum[0] + fibNum[1];
            for (int i = 2; i <= n; i++) {
                fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
                sum += fibNum[i];
            }
            return sum;
        }

        public int sumNumbers (String str){
            int length = str.length();
            int sum = 0;
            String temp = "";
            for (int i = 0; i < length; i++) {
                if (Character.isDigit(str.charAt(i))) {
                    if (i < length - 1 && Character.isDigit(str.charAt(i + 1))) {
                        temp += str.charAt(i);
                    } else {
                        temp += str.charAt(i);
                        sum += Integer.parseInt(temp);
                        temp = "";
                    }
                }
            }
            return sum;
        }

        public String isNot (String str){
            String result = "";
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                        || i + 2 < length && Character.isLetter(str.charAt(i + 2))) {
                    result += str.charAt(i);
                } else if (i + 1 < length && str.substring(i, i + 2).equals("is")) {
                    result += "is not";
                    i++;
                } else {
                    result += str.charAt(i);
                }
            }
            return result;
        }

        public static String betweenWords (String str, String word){
            int lengthStr = str.length();
            int lengthWord = word.length();
            String f = "";
            for (int i = 0; i < lengthStr - lengthWord + 1; i++) {
                String tmp = str.substring(i, i + lengthWord);
                if (i > 0 && tmp.equals(word))
                    f += str.substring(i - 1, i);
                if (i < lengthStr - lengthWord && tmp.equals(word))
                    f += str.substring(i + lengthWord, i + lengthWord + 1);
            }
            return f;
        }

        public static int numberPuzzle () {
            for (int i = 10; i <= 50; i++) {
                for (int j = 10; j <= 50; j++) {
                    if ((i + j) == 60 && Math.abs(i - j) == 14) {
                        System.out.print("(" + i + ", " + j + ")\n");
                    }
                }
            }
            return numberPuzzle();
        }

        public static int digits ( int n){
            int sum;
            int upperLimit;
            for (int i = 0; i < 100; i++) {
                upperLimit += n;
                for (int j = 0; j < upperLimit; j++) {
                    sum = sum + i;
                }
                System.out.println("Sum is " + sum);
            }
            return digits(n);
        }


        public static void main (String args[]){

        }

    }
