package com.sist.io;
/*
 * 
 *     IO : Input / Output
 *          ----- 읽기
 *                  ------ 쓰기
 *     1) 자바에서 IO는 Stream을 사용하고 있다.
 *                   ------ 데이터 이동하는 통로 (FIFO -> Queue)
 *        => IO
 *           = 메모리 입출력
 *           = 파일 입출력
 *           = 네트워크 입출력 
 *        => IO의 특징 : 단방향 통신 => 빨대
 *        
 *     2) 읽기/쓰기 (1byte,2byte) : 클래스이름
 *        = 1byte => ~InputStream , ~OutputStream
 *                   => 한 글자당 1byte씩 읽기/쓰기 -> 한글은 깨진다.
 *                   => 업로드 , 다운로드 
 *        = 2byte => ~Reader , ~Writer (한글)
 *                    => 한글제어
 *          ====================                               ---------------
 *          메모리 (데이터 저장)     ======== 자바 응용 프로그램 =======   모니터 출력
 *          ====================                               ---------------
 *                                 |                       |
 *                             InputStream            OutputStream
 *           356page
 *           ------- 
 *              stream : 데이터가 이동하는 통로 (단방향)
 *                       읽기통로 : 데이터가 저장된 위치로부터 프로그램에서 데이터를 읽어 들이기 위한 연결
 *                                InputStream(바이트 스트림 1byte씩 이동) / Reader(문자스트림 : 2byte)
 *                                                                     -----------------------
 *                                메모리에 있는 데이터
 *                                파일에 있는 데이터
 *                                소켓에 있는 데이터 (네트워크)
 *                       쓰기 통로 : 출력 위치로 프로그램에 전송하는 통로
 *                               OutputStream(바이트 스트림 1byte씩 이동) / Writer(문자스트림 : 2byte)
 *                               
 *      IO 관련 클래스
 *           Object
 *             |
 *          바이트 스트림(1byte)        문자스트림 : 2byte
 *       ----------------------------------------------------
 *       |                                                  |
 *                                                   파일입출력(추천)
 *  -----------------------***업로드 다운로드       ------------------------
 *  |                     |                     |                      |
 *  InputStream      OutputStream             Reader                Writer
 *  |                     |                      |                      |
 *  FileInputStream     FileOutputStream     FileReader             FileWriter
 *  FilterInputStream   FilterOutputStream       |                      |
 *  |                     |                   BufferedReader        BufferedWriter
 *  BufferedInputStream BufferedOutputStream    
 *  ------------------------------------------
 *  ObjectInputStream / ObjectOutputStream
 *  
 *  
 *     *** 모드(mode) -> r , w , a
 *                     read , write , append
 *                     ----   -----   ------
 *                     Reader Writer
 *                     
 *                     => new FileWriter("파일명", true) => append
 *                        new FileWriter("파일명") => create
 *     ---------------------------------------------------------------------------------
 *     
 *     File : 독립 클래스
 *     ==> 1) 파일 
 *         2) 디렉토리 (폴더)
 *         
 *         File 사용 방법
 *          = 생성방법
 *            File file = new File("파일 경로");
 *               파일 정보 읽기
 *            File file = new File("디렉토리정보 경로");
 *               디렉토리 정보 읽기
 *         File의 주요기능 (메소드)
 *          = 파일 정보
 *            ***getName() : 파일명
 *            ***getPath() : 경로명/파일명
 *            getParent() : 경로명
 *            
 *           = 파일특성 : boolean
 *            canRead() : 읽기전용
 *            canWrite() : 쓰기전용
 *            isHidden() : 숨긴파일
 *            
 *           = 파일 여부
 *            ***boolean isFile()
 *            boolean isDirectory()
 *            
 *           = 파일 조작
 *            ***createNewFile() : 파일 만들기
 *            ***mkdir() : 디렉토리 만들기
 *           = 파일 삭제
 *            ***delete() => 한개만 (파일이 있는 디렉토리는 삭제할 수 없다.)
 *                               => 파일을 먼저 삭제후 디렉토리를 삭제해야한다.
 *           = 파일이나 디렉토리의 존재 여부
 *            ***boolean exists()
 *           = 수정 날짜
 *            long lastModified()
 *           = 파일 크기
 *            ***long length()
 *           = 디렉토리의 목록
 *            ***listFiles()
 *           
 *                               
 *     -> raed() , write() , close()
 *        
 *        FileInputStream
 *        ----------------
 *          int read()    , write(byte)
 *          
 *        FileReader
 *          char read();  ,  write(String)     리턴형이 다르다
 *                                
 */

// CheckedException => 반드시 예외처리를 해야 사용이 가능
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class InputOutputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 선언
		File file = new File("/Users/yuhyeonseung/Desktop/sist/javaDev/images.jpeg");
		long size = file.length();
		String res ="";
		if(size/1024==0) {
			res = size+"Bytes";
		}
		else {
			size = size/1024;
			res = size+"KB";
		}
		System.out.println("파일크기 : "+res);
		System.out.println("읽기 전용: "+file.canRead());
		System.out.println("쓰기 전용: "+file.canWrite());
		System.out.println("숨김 파일: "+file.isHidden());
		System.out.println("수정 날짜: "+new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(new Date(file.lastModified())));
//		System.out.println("수정 날짜: "+file.lastModified());
		System.out.println("경로명 : "+file.getParent());
		System.out.println("파일명 : "+file.getName());
		System.out.println("경로명+파일명 : "+file.getPath());
		
	}

}
