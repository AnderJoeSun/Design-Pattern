package command.command;

import command.Receiver;

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver r) {
        this.receiver = r;
    }

    public void execute() {
        receiver.action();
    }
}
