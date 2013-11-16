package integration.cc.crappie;

import cc.crappie.entity.Author;
import cc.crappie.mapper.AuthorMapper;
import cc.crappie.service.AuthorService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AuthorMapperTest extends MapperTestBase {

    private AuthorMapper authorMapper;

    @Before
    public void setup() throws Exception{
        super.setup();
        authorMapper = getSqlSession().getMapper(AuthorMapper.class);
    }

    @Test
    public void shouldInsertAuthorAndGet(){
        Author oscar = new Author().setEmail("some@email.com").setName("oscar").setPassword("123456");
        //       authorMapper.insert(oscar);
        new AuthorService().insert(oscar);
        assertThat(authorMapper.all().get(0).getName(), is("oscar"));
    }
}
