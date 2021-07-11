package repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends JpatestApplicationTests{
    @Autowired
    private UserRepository UserRepository;

    @Test
    public void create(){
        User user = new User();

        user.setAccount("testId12");
        user.setPassword("testPw12");
        user.setName("test");

        User newUser = UserRepository.save(user);
    }
}