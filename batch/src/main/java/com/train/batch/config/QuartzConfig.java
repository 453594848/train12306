/*
package com.train.batch.config;

 import com.train.batch.job.TestJob;
 import org.quartz.*;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;

 @Configuration
 public class QuartzConfig {

*/
/*
*
      * 声明一个任务
      * @return

*//*


     @Bean
     public JobDetail jobDetail() {
         return JobBuilder.newJob(TestJob.class)
                 .withIdentity("DailyTrainJob", "test")
                 .storeDurably()
                 .build();
     }
*/
/*

*
      * 声明一个触发器，什么时候触发这个任务
      * @return

*//*


     @Bean
     public Trigger trigger() {
         return TriggerBuilder.newTrigger()
                 .forJob(jobDetail())
                 .withIdentity("trigger", "trigger")
                 .startNow()
                 .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
                 .build();
     }
 }
*/
