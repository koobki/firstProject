# firstProject

1.수업일정  
===========
  **1일차(9/2) - 준비**  
    - 웹프로그래밍의 이해  
    - 개발 환경 소개 및 구성  
      - IDE, DB engine, JDK, lombok 설정  
      - Spring Framework, Mybatis 소개  
      - 형상관리툴 - git 소개 및 계정 생성  
      - GIT 으로 부터 프로젝트 생성  
  **2일차(9/3) - 기초학습**   
      - Spring Framework 기반의 서비스 소개  
      - SQL 쿼리 실습  
      - 학습과제 실습 / 풀이  
      - GIT 사용법 소개  
  **3일차(9/9) - 프로젝트 시작, 요구사항 정리 및 설계**  
      - 프로젝트 시작 : 무인주문 시스템(kiosk)  
      - 기본 UI, biz 요구사항 소개 및 추가 요건 취합(기능위주)  
      - 화면 정의서 작성 시연  
      - DB 설계 시연 및 DB 생성  
  **4일차(9/10) - 관리화면 개발**  
      - 메뉴 등록 기능 개발  
      - 메뉴 목록 화면 개발  
  **5일차(9/14) 관리화면 개발**  
      - 재고조정 화면 개발  
      - 재고조회 화면 개발  
  **6일차(9/16) front 화면 개발**  
      - 상품 목록화면 개발  
      - 상품 상세 화면 개발  
  **7일차(9/17) front 화면 개발**  
      - 주문확인 처리 화면 개발  
      - 주문내역 조회화면 개발   
      - 개인별 과제 소개  
  **8일차(9/21) 개별과제**  
      - 개인별 과제 수행  
  **9일차(9/23) 개별과제**  
      - 개인별 과제 발표 및 정리  
  **10일차(9/24)**  
      - 예비  




create table mainDb.sy_user
(
    user_no int primary key,
    user_nm varchar(50),
    user_birth_dt datetime
);

select * from mainDb.sy_user;

insert into mainDb.sy_user(user_no, user_nm, user_birth_dt)
values(
    1, '홍길동', date_format('1990-10-12','%Y-%m-%d')
);

commit;
