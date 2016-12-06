/**
 * Created by Praktika on 6.12.2016.
 */
public class exercise74 {
    public static void main(String[] args) {
        oddSum(5);
    }

    public static void oddSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i = i + 2){
            result +=i;
        }
        System.out.println(result);
    }
}
