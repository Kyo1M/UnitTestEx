package moe.lisp;

/**
 * テスト対象の例．下記引用元のリスト1.11を元に一部改変．
 * 渡辺 著『JUnit実践入門』技術評論社, p.21 (2012).
 * @author y-takata
 */
public class Calculator {
    /**
     * 2引数の積を返す．
     * @return xとyの積
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * 3引数a, b, cの最大値を返す
     * テストの練習のため，わかりにくいコードにしてある．
     * @param a
     * @return a, b, cの最大値
     */
    public int max(int a, int b, int c) {
        int x;
        if (a >= b){
            if (b >= c){
                x = a;
            }
            //else if(c >= b && a >= c){
            else if (a >= c){
                x = a;
            }
            else{
                x = c;
            }
        }
        else{
            if(a >= c){
                x = b;
            }
            //else if(c >= a && b >= c){
            else if(b >= c){
                x = b;
            }
            else {
                x = c;
            }
        }
        return x;
    }
        /*
        int x;
        if (a > b) {
            if (b > c) {
                x = a;
            } else {
                x = c;
            }
        } else {
            if (b > c) {
                x = b;
            } else {
                x = c;
            }
        }
        return x;
    }
*/
        
}
