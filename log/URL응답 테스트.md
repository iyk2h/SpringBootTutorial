- /success

```javascript
    @GetMapping("/success")
    public ResponseEntity<?> successMeaage(){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
```

### http://127.0.0.1:8080/mCtl/success 

![image-20210710131417107](/Users/youngkyoonim/SpringBootTutorial/images/image-20210710131417107.png)

ResponseEntity의 <>는 받는 자료형을 설정한다.

<?>에서 ?는 어떠한 자료형이던 다 받는다는 의미로 보안상 좋지는 않다.

return 에서 HttpStatus.OK는 http상태 200번 코드를 뜻한다. 자세한 코드표는 이 [링크](https://developer.mozilla.org/ko/docs/Web/HTTP/Status)를 참고하자.



- /serverError

	```javascript
	@GetMapping("/serverError")
	    public ResponseEntity<?> serverErrorMessage(){
	        Message message = Message.builder()
	            .message1("첫 메시지")
	            .message2("message2")
	            .build();
	        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	```
	

### http://127.0.0.1:8080/mCtl/serverError

![image-20210710132342777](/Users/youngkyoonim/SpringBootTutorial/images/image-20210710132342777.png)

메세지 전송은 json 형태로 전송된다. 






```javascript
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



``` javascript
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

