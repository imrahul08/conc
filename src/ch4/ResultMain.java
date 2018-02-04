package ch4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultMain {

	public static void main(String[] args) {
		ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
		List<TaskM> taskList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			TaskM task = new TaskM("Task" + i);
			taskList.add(task);
		}
		List<Future<Result>> resultList = null;
		try {
			resultList = executor.invokeAll(taskList);
			System.out.println("print it");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		System.out.println("Main: Printing the results");
		for (int i = 0; i < resultList.size(); i++) {
			Future<Result> future = resultList.get(i);
			try {
				Result result = future.get();
				System.out.println(result.getName() + ": " + result.getValue());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
