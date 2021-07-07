# SpringBootTutorial
- 사실 듀토리얼보다 기록에 가깝다.

## Settings

- OpenJDK 11 [https://jdk.java.net/java-se-ri/11](https://jdk.java.net/java-se-ri/11)
- Maven
- Jetty Server 11
- Jar packaging
	- War packaging의 경우, WAS 에 deploy(배포)한 후 실행
	- Jar는 단독 앱으로 실행이 가능, 보다 편리
- Lombok
	- Java의 라이브러리로 반복되는 메소드(getter, setter, toString, NoArgsConstructor)등을 Annotation을 사용해 자동으로 작성해주는 라이브러리
	- 반복적인 부분을 주며, 메소드를 한눈에 보이게 만들어 준다.
	- 단점
		- 호불호가 갈리는 라이브러리이기도 하므로 팀 프로젝트에 도입하는 경우 주의
		- 각 API가 어떤식으로 작동하는지 숙지한 채로 사용해야함, 다른 라이브러리와 충돌 위험
- ResponseEntity
	- **RestController**는 별도의 **View를 제공하지 않는 형태로 서비스를 실행**하기 때문에, 때로는 결과데이터가 예외적인 상황에서 문제가 발생할 수 있다.
	- ResponseEntity는 **개발자가 직접 결과 데이터와 HTTP 상태 코드를 직접 제어할 수 있는 클래스**로 개발자는 **404나 500같은 HTTP 상태 코드를 전송하고 싶은 데이터와 함께 전송**할수 있기 때문에 좀더 세밀한 제어가 필요한 경우 사용
	- [HTTP 상태 코드 - HTTP | MDN](https://developer.mozilla.org/ko/docs/Web/HTTP/Status)
- spring boot는 `src/main/resources` 내의 `[application.properties](http://application.properties)` 또는 `application.yml` 파일을 프로퍼티 파일로 자동으로 인식
``` 
//yml
spring:
	profiles:
		active: local
	thymeleaf:
		mode:HTML
		encoding: UTF-8
		cache: false
```
```
//properties
spring.profiles.active=local
spring.thymleaf.mode=HTML
spring.thymleaf.encoding=UTF-8
spring.thymleaf.cache=false
```
더 편한 방식을 따르면 된다.

## VSCode Settings

- Extension → Java Extension, Spring Boot Extension Pack, Jetty for Java, Lombok Annotations Support for VS Code 설치
- F1 누르고 Spring Initializr for Maven 선택하여 새 프로젝트 생성


<details>
<summary> URI 응답 테스느 </summary>

<p>
	
```
<!--구조-->
src
└─── main
     ├─── java.com.example.demo
     │    ├─── DemoApplication.java
     │    ├─── controller
     │    ├─── Message
     └─── resource
          └─── application.properties
```

</p>
<p>
	
```java
package com.example.demo.messageTest.controller;

import ...
	
@RestController
@RequestMapping("/mCtl")
public class mController {

    @GetMapping("/success")
    public ResponseEntity<?> successMeaage(){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("/serverError")
    public ResponseEntity<?> serverErrorMessage(){
        Message message = Message.builder()
            .message1("첫 메시지")
            .message2("message2")
            .build();
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/header")
    public ResponseEntity<?> header() {
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("AUTHCODE","xxxxxxx");
        header.add("TOKEN","xxxxxx");
        return new ResponseEntity<>(header, HttpStatus.ACCEPTED);
    }
}
```

</p>
<p>

```java
package com.example.demo.messageTest.message;

import ...

@Getter
@Setter
public class Message {
    private String message1;
    private String message2;

    @Builder
    public Message(String message1, String message2) {
        this.message1=message1;
        this.message2=message2;
    }
}
```

</p>
</details>
