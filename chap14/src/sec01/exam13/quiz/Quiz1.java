package sec01.exam13.quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Quiz1 {
//	Quiz
//	FileReader를 사용하여 
//	"C:/Temp/output.txt" 파일을 읽어와서 콘솔에 표준 출력하세요.
	
//  힌트: 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력 
//       또는 읽은 char 배열을 문자열로 변환 후 출력

	public static void main(String[] args) {

		
		try(Reader rd = new BufferedReader(
				new InputStreamReader(new FileInputStream("C:/Temp/test.txt"), StandardCharsets.UTF_8)
				);){
			StringBuffer buffer = new StringBuffer();
			char[] cArr = new char[100];
			int bufflen;
			while((bufflen = rd.read(cArr)) != -1) {
				for(int i = 0; i < bufflen; i++) {
					buffer.append(cArr[i]);
				}
			}
			System.out.println(buffer);
			System.out.println("bufferSize: " + buffer.length());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try(Writer wr = new FileWriter("C:/Temp/test.txt");){
//			
//			String str = "허균(許筠, 1569~1618) 자는 단보(端甫), 호는 교산(蛟山)·성수(惺). 그의 가문은 대대로 학문에 뛰어난 집안이어서 아버지 엽(曄), 두 형인 성(筬)과 봉(葑),"
//					+ "\n그리고 누이인 난설헌(蘭雪軒) 등이 모두 시문으로 이름을 날렸다. 21세에 생원시에 급제하고 26세에 정시(庭試)에 합격하여 승문원 사관(史官)으로 벼슬길에 오른 후 "
//					+ "\n삼척부사·공주목사 등 관직을 제수받았으나 반대자의 탄핵을 받아 파면되거나 유배를 당했다. 그 후 중국 사신의 일행으로 뽑혀 중국에 가서 문명을 날리는 한편 새로운 문물을 접할 기회를 갖게 되었다."
//					+ "\n한때 당대의 실력자였던 이이첨과 결탁하여 폐모론을 주장하면서 왕의 신임을 받아 예조참의·좌찬성 등을 역임했으나, 국가의 변란을 기도했다는 죄목으로 참수형을 당했다."
//					+ "\n역적으로 형을 당한 까닭에 그의 저작들은 모두 불태워지고 <성수시화(惺詩話)>·<학산초담(鶴山樵談)>·<성소부부고(惺所覆藁)> 등 일부만이 남아 전한다."
//					+ "\n그는 학론(學論)·정론(政論)·유재론(遺才論)·호민론(豪民論)의 논설을 통해 당시 정부와 사회의 모순을 비판하고 개혁방안을 제시했다. 문인으로서 그는 소설작품·한시·문학비평 등에 걸쳐 뛰어난 업적을 남겼다."
//					+ "\n문집에 실려 있는 그의 한시는 많지는 않지만 국내외로부터 품격이 높고 시어가 정교하다는 평을 받는다. 시화(詩話)에 실려 있는 그의 문학비평은 당대에는 물론 현재에도 그 안목을 인정받고 있다."
//					+ "\n그의 작품으로 전하는 <홍길동전>은 그의 비판정신과 개혁사상을 반영하는 것으로서, 적서차별로 인한 신분적 차별을 비판하면서 탐관오리에 대한 징벌, 가난한 서민들에 대한 구제, 새로운 세계의 건설 등을 제안했다."
//					+ "\n허균이 <홍길동전>을 지었다는 기록은 이식(李植)의 <택당집(澤堂集)> 별집(別集) 권15 <산록(散錄)>에 전한다. 이를 근거로 하여 허균을 <홍길동전>의 작자로 여겨왔다."
//					+ "\n그러나 <택당집>의 기록은 이식의 사후에 송시열(宋時烈)이 교정(校正)·편찬(編纂)한 것이어서 그 신빙성이 떨어지며, 허균이 처형될 때의 죄목에 이 작품을 지었다는 내용이 포함되지 않았다는 점에서 "
//					+ "\n<홍길동전>의 작자가 허균이 아닐 것이라는 의문도 계속 제기되고 있다. 하지만 허균은 <엄처사전(嚴處士傳)>·<손곡산인전(蓀谷山人傳)>·<장산인전(張山人傳)>·<남궁선생전(南宮先生傳)>·<장생전(蔣生傳)>과 같은"
//					+ "\n한문소설에서 실존한 방외인(方外人)들을 주인공으로 삼았다. 뛰어난 지략을 갖고 있는 인물이 등용되지 못하는 현실을 비판하거나, 백성들을 수탈하는 지방 수령들을 응징하는 <홍길동전>의 주요한 내용은 "
//					+ "\n허균의 생각이 압축되어 있는 <유재론(遺才論)>·<호민론(豪民論)> 등에 잘 나타나 있다. 따라서 <택당집>의 기록을 부정할 수 있는 실증 자료가 발견되지 않는 한 허균이 <홍길동전>을 지었다는 사실 자체를 부정할 수는 없다.";
//			
//			wr.write(str);
//			wr.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

}
