import com.github.houbb.opencc4j.util.ZhConverterUtil;

public class ChineseText {

	public static void main(String[] args) {
		String original = "���������˶�";
		
		//��������ת��Ϊ��������
		String result = ZhConverterUtil.convertToTraditional(original);
		
		System.out.println(result);

	}

}
