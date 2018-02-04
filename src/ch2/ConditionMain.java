package ch2;

public class ConditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileMock mock = new FileMock(100, 10);
		Buffer buffer = new Buffer(20);
		ProducerCondition producer = new ProducerCondition(mock, buffer);
		Thread threadProducer = new Thread(producer, "Producer");

		ConsumerCondition consumers[] = new ConsumerCondition[3];
		Thread threadConsumers[] = new Thread[3];
		for (int i = 0; i < 3; i++) {
			consumers[i] = new ConsumerCondition(buffer);
			threadConsumers[i] = new Thread(consumers[i], "Consumer " + i);
		}

		threadProducer.start();
		for (int i = 0; i < 3; i++) {
			threadConsumers[i].start();
		}
	}

}
