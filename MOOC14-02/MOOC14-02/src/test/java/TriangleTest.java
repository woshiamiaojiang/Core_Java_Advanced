

import static org.junit.Assert.*; //导入Assert类的所有静态方法，自JDK1.5引入

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		assertEquals(true, new Triangle().judgeEdges(1,2,3));
		//Assert.assertEquals(false, new Triangle().judgeEdges(1,2,3));
	}

}
