package cmm03.flow;

public class No08_NumberMatchVO {
	int player, com, count;

	public int game(int com, int player) {
		int result;
		if (getPlayer() == getCom()) {
			System.out.println(getPlayer() + "���� !!");
			result = 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + getCom() + "�Դϴ�.");
			result = 0;
		}
		return result;
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if (player < 1 || player > 5) {
			System.out.println("1 ���� 5������ ������ �Է��ؾ� �մϴ�.");
		} else {
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int) ((Math.random() * 5) + 1);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
