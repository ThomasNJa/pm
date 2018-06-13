package com.example.web.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleJobs {
	public final static long SECOND = 1;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Scheduled(fixedRate = SECOND * 4)
	public void fixedDelayJob1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		System.out.println("[FixedRateJob Execute]" + sdf.format(new Date()));
	}

	@Scheduled(fixedDelay = SECOND * 2)
	public void fixedDelayJob2() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		System.out.println("[FixedDelayJob Execute]" + sdf.format(new Date()));
	}

	@Scheduled(cron = "0/4 * * * * ?")
	public void cronJob() {
		System.out.println("[CronJob Execute]" + sdf.format(new Date()));
	}
}
