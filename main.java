public class main {
    public static int method1(int x, int y, int i) {
        if (y == 0) {
            return i;
        } else {
            return method1(x , y - 1, i + x);
        }
    }

    public static int method2(int x, int y) {return 0;}

    public static float method3(int n, int i) {
        if (i == n) {
            return 1/(float)n;
        } else {
            return 1/(float)i + method3(n, i+1);
        }
    }

    public static String method4(String s, String resultado, int i) {
        if(resultado.length() == s.length()) {
            return resultado;
        } else {
            return method4(s, resultado + s.charAt(s.length() - i), i + 1);
        }
    }

    public static int method5(int n) {
        if (n < 3) {
            return n;
        } else {
            return 2 * method5(n-1) + 3 * method5(n-2);
        }
    }

    public static int method6(int m, int n) {
        if(m == 0) return n +1;
        else if(m != 0 && n == 0) return method6(m -1, 1);
        else return method6(m - 1, method6(m, n - 1)); 
    }

    public static int method7(int[] v, int i) {
        if (i == v.length) {
            return 0;
        } else {
            return v[i] + method7(v, i+1);
        }
    }

    public static int method72(int[] v, int i) {
        if (i == v.length) {
            return 1;
        } else {
            return v[i] * method72(v, i+1);
        }
    }

    public static boolean method8(String s, int i) {
        if(s.charAt(i) != s.charAt(s.length() - i-1)) {return false;}
        else if (i == s.length()-1) {return true;}
        else {return method8(s, i+1);}
    }

    public static void main(String[] args) {
        System.out.println(method8("abkjsadbfjlaa", 0));
    }
}