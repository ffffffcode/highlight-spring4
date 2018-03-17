package ex.aaronfae.ch3.conditional;

public class WindowsListService implements ListService {

    @Override
    public String showListCommand() {
        return "dir";
    }
}
