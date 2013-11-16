package cc.crappie.entity;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AuthorTest {
    @Test
    public void shouldGetArticles(){
        Author luxun = new Author();
        Charset charset = Charset.defaultCharset();
        String s = "朱然";
        try {
            System.out.println(s);
            String b = new String("朱然".getBytes(), "UTF-8");
            System.out.println(b);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
