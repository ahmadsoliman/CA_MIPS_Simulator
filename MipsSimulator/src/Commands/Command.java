package Commands;

public abstract class Command {
	int commandCategory;
	int commandType;
	public abstract void execute();
}
