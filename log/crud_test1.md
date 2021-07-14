파일 구조

![image-20210712230040592](../images/image-20210712230040592.png)

```java
package com.example.jpatest.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    
}
```

```java
package com.example.jpatest.model.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String name;
}
```

```java
package com.example.jpatest.repository;

import com.example.jpatest.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long>{
}
```

```java
package com.example.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class JpatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpatestApplication.class, args);
	}

}
```

```java
package com.example.jpatest.repository;

import com.example.jpatest.JpatestApplicationTests;
import com.example.jpatest.model.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTests extends JpatestApplicationTests{
    @Autowired
    private UserRepositoty userRepositoty;

    @Test
    public void create(){
        User user = new User();

        user.setAccount("test");
        user.setPassword("test");
        user.setName("onin");

        User newUser = userRepositoty.save(user);
        System.out.print(newUser);
    }

}
```

extends JpatestApplicationTests 부분에서 오류가 발생한다.. 다시 시도해 보면서 이해해야겠다. 아직 자바를 잘 모르기 때문에 이런 부분에서 오류를 못 잡는 것 같다

```java
package com.example.jpatest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpatestApplicationTests {
	@Test
	void contextLoads() {
	}

}
```