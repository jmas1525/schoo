import java.util.Scanner;

class ex_3_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����lA�F");		//�����lA�̓��͂𑣂�
		int A = stdIn.nextInt();			//�����lA���L�[�{�[�h�̓��͂���擾
		
		System.out.print("�����lB�F");		//�����lB�̓��͂𑣂�
		int B = stdIn.nextInt();			//�����lB���L�[�{�[�h�̓��͂���擾
		
		if(A % B == 0)								//A��B�Ŋ������]�肪0���ǂ����H�ŕ���
			System.out.println("B��A�̖񐔂ł��B");
		else
			System.out.println("B��A�̖񐔂ł͂���܂���B");
	}
}