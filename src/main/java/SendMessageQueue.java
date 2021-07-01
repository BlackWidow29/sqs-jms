import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class SendMessageQueue {
    public static void main(String[] args) {
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
//
//        try {
//            CreateQueueResult createQueueResult = sqs.createQueue(QUEUE_NAME);
//        } catch (AmazonSQSException e) {
//            if (!e.getErrorCode().equals("QueueAlreadyExits")) {
//                throw e;
//            }
//        }
//
//        String getQueueUrl = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl();
//
//        System.out.println("QUEUE URL" + getQueueUrl);

        SendMessageRequest sendMessageRequest = new SendMessageRequest()
                .withQueueUrl("http://localhost:4566/000000000000/queue")
                .withMessageBody("teste")
                .withDelaySeconds(5);
        sqs.sendMessage(sendMessageRequest);
        log.info("ENVIANDO MENSAGEM");

    }
}
