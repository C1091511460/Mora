package test;
import java.io.*;

public class paper 
{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int point=0;
		boolean end=false;
		while(!end) {
			String before = "";
			int computer = (int)(Math.random() *3)+1;
			int gm=gamer();
			String[] computerOp=new String[3];
			computerOp[0]="�ŤM";
			computerOp[1]="���Y";
			computerOp[2]="��";
			System.out.println("�q���X:"+computerOp[computer-1]);
			int whoWin=intwhoWin(computer, gm);
			switch(whoWin) {
			case(0):
				System.out.println("ERROR");
				break;
			case(1):
				break;
			case(2):
				point--;
				before = "-";
				break;
			case(3):
				point++;
				before = "+";
				break;
			}
			output(point, whoWin);
			if(point==4||point==-4) {
				end=true;
			}
		}
	}
	public static int gamer()throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�z�n�X����(1:�ŤM�A2:���Y�A3:��)");
		String bk= bf.readLine();
		return Integer.parseInt(bk);
	}
	public static int intwhoWin(int computer, int gamers) {
		int bk=0;
		switch (gamers){
			case(1):
				if(computer==1) {
					return 1; //����
				}
				else if(computer==2) {
					return 2; //�q����
				}
				else {
					return 3;//���a��
				}
			case(2):
				if(computer==1) {
					return 3;
				}
				else if(computer==2) {
					return 1;
				}
				else {
					return 2;
				}
			case(3):
				if(computer==1) {
					return 2; 
				}
				else if(computer==2) {
					return 3; 
				}
				else {
					return 1; 
				}
		}
		return bk;
	}
	public static void output(int point,int whoWin) {
		String str1="";
		String str2="|-3 |-2 |-1 | 0 | 1 | 2 | 3 |";
		String str3="";
		switch(point) {
		case(0):
			str1="              f";
			break;
		case(1):
			str1="                  f";
			break;
		case(2):
			str1="                      f";
			break;
		case(3):
			str1="                          f";
			break;
		case(-1):
			str1="          f";
			break;
		case(-2):
			str1="      f";
			break;
		case(-3):
			str1="  f";
			break;
		default:
			str1="";
			str2="";
			break;
		}
		switch(whoWin) {
		case 1:
			str3="����";
			break;
		case 2:
			str3="�q��Ĺ";
			break;
		case 3:
			str3="���aĹ";
			break;
		}
		System.out.println(str1+"\n"+str2+"\n"+str3);
	}
}
