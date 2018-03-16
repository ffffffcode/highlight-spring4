package ex.aaronfae.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void executionAsyncTask(int i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executionAsyncTaskPlus(int i) {
        System.out.println("执行异步+1任务：" + (i + 1));
    }
}
