## 第二章 单元测试和JUnit

### 第一节 单元测试

**软件测试的经典定义是：**

在 **规定的条件** 下对程序进行操作，以发现 **程序错误**，衡量软件质量，并对其是否能 **满足设计要求** 进行评估的过程。

**软件测试分类**

- 单元（函数） vs 集成测试（多个函数组合）
- 白盒（程序员） vs 黑盒测试（使用者）
- 自动（程序） vs 手动测试（人工）
- 回归测试（修改旧代码后，重新进行测试）
- 压力测试

#### 代码 (1) Calculator/CalculatorTest

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
    
}
```

```java
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(3 == c.add(1, 2));
        System.out.println(-1 == c.subtract(1, 2));
        System.out.println(3 == c.multiply(1, 2));
        System.out.println(0 == c.divide(1, 2));
    }
    
}
```

#### 代码 (2) CalculatorJunitTest

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJunitTest {
    
    @Test
    public void testAdd() {
        assertEquals(3, new Calculator().add(1, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, new Calculator().subtract(1, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(2, new Calculator().multiply(1, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(0, new Calculator().divide(1, 2));
    }
    
}
```

#### 代码(3) pom.xml

```xml
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>
    <groupId>com.test</groupId>
    <artifactId>MOOC14-01</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>

</project>
```

### 第二节 JUnit

####  JUnit简介
**JUnit：一个Java语言的单元测试框架**

- Kent Beck (极限编程) 和Erich Gamma (设计模式)建立的
- 是xUnit家族中最成功的一个
- 大部分的Java IDE都集成了JUnit作为单元测试工具
- 官网： https://junit.org
- 版本
  - 5 ：最后稳定版5.3.2， 2018.11发布
  - **4 ：最后稳定版4.12, 2014.12发布**
  - 3 ：最后稳定版3.8.2, 2007.5发布

#### 代码(1) Triangle.java

```java
public class Triangle {

    public boolean judgeEdges(int a, int b, int c) {
        boolean result = true;
        //边长非负性
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        //两边和大于第三边
        if (a + b <= c) {
            result = false;
        }
        if (b + c <= a) {
            result = false;
        }
        if (c + a <= b) {
            result = false;
        }
        return result;
    }

}
```

#### 代码(2) TriangeTest.java

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals; // 导入Assert类的所有静态方法，自JDK1.5引入

public class TriangleTest {

    @Test
    public void test() {
        assertEquals(true, new Triangle().judgeEdges(1, 2, 3));
        //Assert.assertEquals(false, new Triangle().judgeEdges(1,2,3));
    }

}
```

