package pdream.demo.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dongjianzhu
 * @date 2020年1月2日
 */
@Component
@Slf4j
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 每隔 n 秒执行一次
     */
//    @Scheduled(fixedRate = 3000)
//    public void fixedRate() throws InterruptedException {
//        log.info("Current Thread : {}", Thread.currentThread().getName());
//        log.info("Fixed Rate Task : The time is now {}", dateFormat.format(new Date()));
//        Thread.sleep(5000);
//    }

    /**
     * 固定延迟执行。距离上一次调用成功后 3 秒才执行。
     * ps：本例中相当于每隔8秒执行一次
     */
    @Scheduled(fixedDelay = 3000)
    public void fixedDelay() throws InterruptedException {
        log.info("Current Thread : {}", Thread.currentThread().getName());
        log.info("Fixed Delay Task : The time is now {}", dateFormat.format(new Date()));
        Thread.sleep(5000);
    }

    /**
     * initialDelay:初始延迟。任务的第一次执行将延迟5秒，然后将以5秒的固定间隔执行。
     */
    @Scheduled(initialDelay = 5000, fixedRate = 5000)
    public void initialDelay() {
        log.info("Fixed Rate Task with Initial Delay : The time is now {}", dateFormat.format(new Date()));
    }

    /**
     * cron：使用Cron表达式。　每分钟的1，2秒运行
     */
    @Scheduled(cron = "1-2 * * * * ? ")
    public void cronExpression() {
        log.info("Cron Expression: The time is now {}", dateFormat.format(new Date()));
    }

}
