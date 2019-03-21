import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "我是中国人";

        String b = new String(a.getBytes(StandardCharsets.UTF_8), "GBK");
        System.out.println(b); // 鎴戞槸涓浗浜?

        String c = new String(b.getBytes("GBK"), StandardCharsets.UTF_8);
        System.out.println(c); // 我是中国??

    }

}
