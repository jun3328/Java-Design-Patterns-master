package Strategy;

public class Character {

    // 인터페이스를 사용하여 접근점을 만듦
    private Weapon weapon;

    // 인터페이스를 구현하는 클래스와 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 델리게이트 (구체적인 기능은 Weapon 을 구현하는 클래스에게 위임)
    public void attack() {
        if (weapon == null) {
            System.out.println("맨손을 사용하여 공격합니다.");
        } else {
            weapon.attack();
        }
    }
}
