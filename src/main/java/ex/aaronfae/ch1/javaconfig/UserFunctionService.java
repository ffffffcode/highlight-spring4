package ex.aaronfae.ch1.javaconfig;

public class UserFunctionService {

    final private FunctionService functionService;

    public UserFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
