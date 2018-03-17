package ex.aaronfae.ch3.conditional;

public class LinuxListService implements ListService {

    @Override
    public String showListCommand() {
        return "ls";
    }
}
