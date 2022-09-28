package BehavioralDesigns.Command;

public interface Command {
    void execute();
    // Could add an undo or redo commands.
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.openFile();
    }

    public void undo() {
        // restore previous state.
        // myMemberVariable = previousState;
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

    public void undo() {
        // restore previous state.
        // myMemberVariable = previousState;
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

    public void undo() {
        // restore previous state.
        // myMemberVariable = previousState;
    }
}