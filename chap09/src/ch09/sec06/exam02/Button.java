package ch09.sec06.exam02;

public class Button {
	public static interface ClickLinstener{
		void onClick();
	}
	
	private ClickLinstener clickLinstener;
	
	public void setClickLinstener(ClickLinstener clickLinstener) {
		this.clickLinstener = clickLinstener;
	}
}
