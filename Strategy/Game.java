package Strategy;

/**
 * 스트래티지 패턴(Strategy Pattern)
 * 교환 가능한 행동을 캡슐화하고 위임을 통해서 어떤 행동을 사용할지 결정한다.
 */

public class Game {
    public static void main(String[] args) {

        Character character = new Character();
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Bow());
        character.attack();

        character.setWeapon(new Spear());
        character.attack();

        /**
         * 무기를 추가하고 싶을 때는
         * Weapon 을 구현하는 클래스를 새로 생성하면 된다.
         */
    }
}
