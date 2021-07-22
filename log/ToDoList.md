### 추가 작업 List

예외처리,

- update, insert, 등등 기본 column 외의 값을 넣을때
- update null 예외처리 (library 찾아볼것)
- mock server 만들어서 전송 및 응답 ? ai mock server, hosts mock server
- 추가 학습
	- CORS 학습 및 샘플 구현
	- Cache-Control 학습
	- SameSite Cookie 학습
	- Rewrite Module 학습

- https://hannut91.github.io/blogs/infra/cors
- service query 부분
	@Modifying
	@Transactional
	- 사용 이유
		[Spring Data JPA @Modifying (1) - clearAutomatically](https://devhyogeon.tistory.com/4)
		[@Transactional 이란? 사용이유](https://crosstheline.tistory.com/96)

- 영속,비영속,준영속
	[JPA 엔티티의 생명주기 (Entity LifeCycle) - Heee's Development Blog](https://gmlwjd9405.github.io/2019/08/08/jpa-entity-lifecycle.html)