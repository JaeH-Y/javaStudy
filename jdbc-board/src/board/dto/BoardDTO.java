package board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 게시글 정보
 * board 테이블과 일치시켜주는 것이 좋음
 * 					Table		Java
 * - 게시글 번호(자동)	no			no
 * - 제목			title		title
 * - 작성자			writer		writer
 * - 내용			content		content
 * - 등록일(자동)		reg_date	regDate
 * - 수정일(자동)		upd_date	updDate
 * 
 * DB에서 레코드를 가져오면 DTO 객체에 잘 매핑해서 담을 예정(DB에 넣을 때도 마찬가지)
 * 컬렉션에 담으면 게시글 목록이 됨
*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BoardDTO {

	private int no;
	@NonNull 
	private String title;
	@NonNull 
	private String writer;
	@NonNull 
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime updDate;
	
	
	
	
	
	
	
}
