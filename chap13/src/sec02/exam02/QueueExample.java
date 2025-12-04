package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메시지 저장
		messageQueue.offer(new Message("sendMail", "유재석"));
		messageQueue.offer(new Message("sendSMS", "김재현"));
		messageQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		
		// Queue를 이용한 간단한 메세지 큐를 구현한 예제
		// 먼저 넣은 메세지가 반대쪽으로 먼저 나오기 때문에 넣는 순서대로 메세지가 처리됨
		// FIFO(선입선출)
		
		while(!messageQueue.isEmpty()) {
			// 큐에서 1개의 메세지 꺼냄
			Message msg = messageQueue.poll();
			
			switch (msg.command) {
				case "sendMail" ->{
					System.out.println(msg.to + "님에게 메일을 보냅니다.");
				}
				case "sendSMS" ->{
					System.out.println(msg.to + "님에게 문자를 보냅니다.");
				}
				case "sendKakaotalk" ->{
					System.out.println(msg.to + "님에게 카카오톡을 보냅니다.");
				}
			}
		}
	}
}
