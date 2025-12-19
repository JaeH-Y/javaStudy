-- 게시판 DB 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
	no INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	writer VARCHAR(100) NOT NULL,
	content TEXT,
	reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ,
	upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	-- ON UPDATE: 수정할 때 ~을 하겠다
	-- ON UPDATE CURRENT_TIMESTAMP: 수정할 때 수정 시간을 자동 갱신하겠다
	PRIMARY KEY (no)
);

DESC board

-- 추가
INSERT INTO board(title, writer, content)
VALUES
('게시글 제목1', '작성자1', '내용1'),
('게시글 제목2', '작성자2', '내용2'),
('게시글 제목3', '작성자3', '내용3'),
('게시글 제목4', '작성자4', '내용4'),
('게시글 제목5', '작성자5', '내용5'),
('게시글 제목6', '작성자6', '내용6'),
('게시글 제목7', '작성자7', '내용7');

-- 조회
SELECT * FROM BOARD;
SELECT * FROM BOARD WHERE NO = 1;


-- 수정
UPDATE BOARD 
SET 
	TITLE = '게시글 제목1 - 수정됨',
	CONTENT = '나 먼저 감'
-- 	UPD_DATE = NOW()	-- 수정일을 현재 시간으로 수동 갱신
WHERE NO = 1;
-- 수정 후 upd_date 바뀌었는지 확인


-- 삭제
DELETE FROM BOARD WHERE NO = 1;


-- 댓글 테이블
CREATE TABLE comment(
	id INT AUTO_INCREMENT,
	board_no INT NOT NULL,
	commenter VARCHAR(100) NOT NULL,
	comment TEXT NOT NULL,
	reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ,
	PRIMARY KEY (id),
	FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
	-- ON DELETE: 삭제할 때 ~ 하겠다
	-- FOREIGN KEY ~ ON DELETE: 참조하는 행이 삭제될 때 ~ 하겠다
	-- CASCADE: 참조하는 것에도 같은 동작을 한다
	-- FOREIGN KEY ~ ON DELETE CASCADE: 참조하는 행이 삭제될 때 자식도 삭제한다.
	-- 기본: 참조 무결성으로 인해 부모 데이터를 참조하는 데이터가 있다면 부모 데이터는 삭제가 불가능하지만
	-- 자식에게 ON DELETE CASCADE가 제약조건으로 명시돼있는 경우, 부모 삭제 시 자식도 같이 삭제됨
	-- 하지만 기본적으로 한번에 다같이 삭제하는 것은 위험하기 때문에 잘 사용되지는 않는다.
);
















