
public class Triangle {	
	public boolean judgeEdges(int a, int b, int c)
	{
		boolean result = true;
		
		//�߳��Ǹ���
		if(a<=0 || b<=0 || c<=0) {
			return false;
		}
		
		//���ߺʹ��ڵ�����
		if(a+b<=c) {
			result = false;
		}
		if(b+c<=a) {
			result = false;
		}
		if(c+a<=b) {
			result = false;
		}
		return result;
	}	
}
