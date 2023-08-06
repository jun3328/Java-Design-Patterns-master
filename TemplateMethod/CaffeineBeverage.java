package TemplateMethod;

public abstract class CaffeineBeverage {

    // 상속받은 클래스에서 수정할 수 없도록 final 키워드를 사용.
    final void prepare() {
        boilWater();
        brew();
        pourInCup();

        if (isNeedCondiments()) {

            addCondiments();
        }
    }

    // 공통 요소
    private void boilWater(){
        System.out.println("물을 끓입니다.");
    }

    // 공통 요소
    private void pourInCup(){
        System.out.println("컵에 따라냅니다.");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    /**
     *  후크 (hook)
     *  추상메소드에서 선언되는 메소드
     *  상속 받은 클래스에서는 선택적으로 오버라이드 하여 사용.
     *
     */
    protected boolean isNeedCondiments() {
        return false;
    }
}
