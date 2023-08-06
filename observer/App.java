package Observer;

/**
 *  옵저버 패턴은 한 객체의 상태값이 바뀌면 연관된 다른 객체들이 이를 통지받아
 *  자동으로 업데이트 되도록 1:N  관계를 맺는 것
 *
 *  자기상태를 바꾸는 객체를 주체(Subject) , 상태변경을 통지받는 객체를 옵저버(Observer) 라 한다.
 *  주체와 옵저버는 1:N 관계로 하나의 주체가 여러 옵저버를 거느릴 수 있다
 */

public class App {

    public static void main(String[] args) {

        // 새로운 뉴스가 발생(자신의 상태가 변화)하면
        // 구독자(옵저버) 들에게 변화를 통지하는 클래스
        NewsAgency newsAgency = new NewsAgency();

        // NewsAgency 상태 변화를 통지받을 옵저버 클래스
        RadioChannel radioChannel = new RadioChannel();
        TVChannel tvChannel = new TVChannel();

        // newsAgency 에 옵저버를 등록
        newsAgency.register(radioChannel);
        newsAgency.register(tvChannel);

        // newsAgency 에 변경사항을 발생
        newsAgency.addNews("서울지역 초미세먼지 경보 발령");
        newsAgency.addNews("갤럭시 S10 화이트 색상이 인기");

        // radioChannel 은 구독을 해지한 이후에는 상태변화를 통지받지 못함
        newsAgency.unRegister(radioChannel);
        newsAgency.addNews("블록체인 엔지니어 수요 '고공행진'");

        /*
         *  인터페이스를 이용해 상태변경을 콜백으로 처리
         */
        Button button = new Button();
        button.setOnClickListener(System.out::println);
        button.onClick();
        
    }
}
