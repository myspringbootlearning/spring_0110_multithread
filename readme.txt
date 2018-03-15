@Configuration
public class AppConfigurer implements AsyncConfigurer {

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setMaxPoolSize(100);
		taskExecutor.setCorePoolSize(20);
		taskExecutor.setQueueCapacity(100);
		taskExecutor.initialize();
		return taskExecutor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

自定义创建任务线程池来处理异步的任务
	