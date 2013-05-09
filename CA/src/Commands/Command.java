package Commands;

public abstract class Command {
	private int memAddress;

	public abstract void execute();

	public int getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(int memAddress) {
		this.memAddress = memAddress;
	}
}
