

import static org.junit.Assert.*; //����Assert������о�̬��������JDK1.5����

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		assertEquals(true, new Triangle().judgeEdges(1,2,3));
		//Assert.assertEquals(false, new Triangle().judgeEdges(1,2,3));
	}

}
