package com.smhrd.view;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class Test {

	public static void main(String[] args) {
		//배열/arraylist안에 춘식, 라이언을 같이 넣을수 있다?
		//배열/arraylist 기본적으로 같은 타입만 넣을수 있음
		
		//춘식(캐릭터 상속받음)> 캐릭터 타입을 바꿀수 있음 (업캐스팅)
		Chunsik cs =new Chunsik();//패키지가 다르면 임폴트 해야댐
		cs.printASCII();
		
		//라이언(캐릭터 상속받음) > 캐릭터 타입으로 바꿀수 있음 (업캐스팅)
		Ryan r= new Ryan();
		r.printASCII();
		//Object[] cr= new Object[2]; <<제일 큰거 오브젝트타입
		Charac[] cr= new Charac[2];
		//업캐스팅은 자동형변환( 따로 지정하지 않아도 됨)
		cr[0]=cs;
		cr[1]=r;
		
		cr[0].printASCII();
//		Chunsik c=(Chunsik)cr[0]; 오브젝트를 쓰면 다운캐스팅 필요 
//		c.printASCII();
		
		
//		추상클래스로는 절대 객체 생성 불가능 > 컴파일 오류
//		new Charac("a",20,20);
	}

}
