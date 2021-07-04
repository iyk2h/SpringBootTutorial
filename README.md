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
