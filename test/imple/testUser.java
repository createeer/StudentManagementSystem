package imple;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.stumanage.implement.UserDAOimpl;
import com.stumanage.service.UserDAO;
import com.test.entity.User;

public class testUser {
    @Test
    public void testUserdao() {
        User u = new User("xiaoning", "123456", new Date());
        UserDAO udao = new UserDAOimpl();
        Assert.assertEquals(true, udao.userLogin(u));
    }
}
