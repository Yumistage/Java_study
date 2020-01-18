
import com.zeroten.javales.String.StringUtils;
import org.junit.Test;
import org.testng.Assert;

public class StringUtilsTest {
    //去掉字符串开头/结尾/中间的空格（‘不使用.trim（）函数’）


    @Test
    public void testTrimALL() {

        String hello="hello";

        Assert.assertEquals(StringUtils.trimAll(" hello"),hello);
        Assert.assertEquals(StringUtils.trimAll("   hello"),hello);
        Assert.assertEquals(StringUtils.trimAll("hello "),hello);

        Assert.assertEquals(StringUtils.trimAll("h ello"),hello);
        Assert.assertEquals(StringUtils.trimAll("h    ello"),hello);
        Assert.assertEquals(StringUtils.trimAll("h    el    lo"),hello);
        Assert.assertEquals(StringUtils.trimAll(" h    el    lo "),hello);

    }

    @Test
    public void TestReversr(){
        Assert.assertEquals(StringUtils.Reversr("Hello"),"olleH");
    }
}
