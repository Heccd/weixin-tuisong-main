package ydzhao.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "oxC-p6FlohkiR3BangFN1PfTZhCU";

    @Scheduled(cron = "0 02 7 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
