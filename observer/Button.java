package Observer;

public class Button {

    public interface OnClickListener {
        void onClick(String msg);
    }

    private OnClickListener listener;

    public void setOnClickListener(OnClickListener clickListener) {
        this.listener = clickListener;
    }

    public void onClick() {
        // 이벤트 처리
        if (listener != null) {
            listener.onClick("button is clicked.");
        }
    }
}
