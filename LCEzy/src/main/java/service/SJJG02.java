package ��������ҵ;

public class SJJG02{
public static void main(String[] args) {
	//����һ�����ڵ㣬����Ϊ0
	Node root=new Node();
	root.data=0;
	//����һ���ӽڵ㣬��ֵΪ1�������Ǹ��ڵ����ڵ�
	Node son1=new Node();
	son1.data=1;
	root.left=son1;
	//������һ���ӽڵ㣬��ֵΪ2�������Ǹ��ڵ���ҽڵ�
	Node son2=new Node();
	son2.data=2;
	root.right=son2;
	//����һ����ڵ㣬��ֵΪ3�������ǵڶ����ӽڵ����ڵ�
	Node grandson1=new Node();
	grandson1.data=3;
	son2.left=grandson1;
	//������һ����ڵ㣬��ֵΪ4�������ǵڶ����ӽڵ���ҽڵ�
	Node grandson2=new Node();
	grandson2.data=4;
	son2.right=grandson2;
	
	/*���Ͻ�����һ�ö�����*/
	
	System.out.print("ǰ�������");
	front(root);	//����ǰ���������
	System.out.println();
	
	System.out.print("���������");
	middle(root);	//���������������
	System.out.println();
	
	System.out.print("���������");
	back(root);		//���ú����������
	System.out.println();
 }

//����ǰ����������������ң�
public static void front(Node root){ 
	if(root==null){		//����ڵ�Ϊ�գ���������
		return;
	}
	System.out.print(root.data);	//�ȴ�ӡ���ڵ�
	front(root.left);				//����ڵ㵱�ɲ�������������front����
	front(root.right);				//���ҽڵ㵱�ɲ�������������front����
}

//���������������������ң�
public static void middle(Node root){
	if(root==null){		//����ڵ�Ϊ�գ���������
		return;
	}
	middle(root.left);				//����ڵ㵱�ɲ�������������middle����
	System.out.print(root.data);	//�ٴ�ӡ���ڵ�
	middle(root.right);				//���ҽڵ㵱�ɲ�������������middle����
}

//�������������������Ҹ���
public static void back(Node root){
	if(root==null){		//����ڵ�Ϊ�գ���������
		return;
	}
	back(root.left);				//����ڵ㵱�ɲ�������������back����
	back(root.right);				//���ҽڵ㵱�ɲ�������������back����
	System.out.print(root.data);	//����ӡ���ڵ�
}

}

//����һ���ڵ��࣬�����У���ֵ����ڵ�
class Node{
	int data=0;			//����ֵĬ��Ϊ0
	Node left=null;		//���ڵ�Ĭ��Ϊnull
	Node right=null;	//�ҽڵ�Ĭ��Ϊnull
}




