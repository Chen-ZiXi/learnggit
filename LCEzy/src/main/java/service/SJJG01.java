package ��������ҵ;

public class SJJG01 {
    private long[] a;//����һ������
    private int size;//ջ����Ĵ�С
    private int top;//ջ��
    
    //����������ʼ������ĳ��ȣ�����
    public SJJG01(int maxSize) {
        this.size = maxSize;
        this.a = new long[size];
        this.top = -1;//��ʾ��ջ
    }

    //������ջ
    public void push(long number){
    	a[++top] = number;
    	/*�൱��
    	 * top++;
    	 * a[top]=number;
    	 * */
    }

    //���ջ��������
    public void output(){
        System.out.println(a[top]);
    }

    //����ջ���������ݣ���ɾ��ջ������
    public long pop(){
        return a[top--];
        /*�൱��
    	 * return a[top];
    	 * top--
    	 * */
    }


    //��ʾջ�е��������֣��Ӷ����ף�
    public void display(){
        System.out.print("[");
        for (int i = top; i >=0 ; i--) {
            System.out.print(a[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    
    
//main���������г���    
public static void main(String[] args) {
	System.out.println("��1��2��3��˳�����ջa1");
	
	SJJG01 a1 = new SJJG01(3); 	//����һ��ջ,��a1
    a1.push(1); 				//��1�Ž�ջ��
    a1.push(2); 				//��2�Ž�ջ��
    a1.push(3); 				//��3�Ž�ջ��
    System.out.print("ջa1�е����֣�");
    a1.display(); 				//��ʾջa1�����е�����
    
    SJJG01 a2 = new SJJG01(3);	//����һ��ջ,��a2
    a2.push(a1.pop());  		//��ջa1���������ó�������ջa2
    a2.push(a1.pop());  		//�ٰ�ջa1���������ó�������ջa2
    a2.push(a1.pop());  		//�ٰ�ջa1���������ó�������ջa2
    System.out.print("ջa2�е����֣�");
    a2.display();       		//��ʾջa2�����е�����
    System.out.println("�ó�ջa2�е���");
    a2.output();				//���ջ2����������
    a2.pop();					//ɾ��ջ2����������
    a2.output();				//���ջ2����������
    a2.pop();					//ɾ��ջ2����������
    a2.output();				//���ջ2����������
    a2.pop();					//ɾ��ջ2����������
 }
}

