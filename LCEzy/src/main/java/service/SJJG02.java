package 工作室作业;

public class SJJG02{
public static void main(String[] args) {
	//创建一个根节点，数据为0
	Node root=new Node();
	root.data=0;
	//创建一个子节点，数值为1，并且是根节点的左节点
	Node son1=new Node();
	son1.data=1;
	root.left=son1;
	//创建另一个子节点，数值为2，并且是根节点的右节点
	Node son2=new Node();
	son2.data=2;
	root.right=son2;
	//创建一个孙节点，数值为3，并且是第二个子节点的左节点
	Node grandson1=new Node();
	grandson1.data=3;
	son2.left=grandson1;
	//创建另一个孙节点，数值为4，并且是第二个子节点的右节点
	Node grandson2=new Node();
	grandson2.data=4;
	son2.right=grandson2;
	
	/*以上建造了一棵二叉树*/
	
	System.out.print("前序遍历：");
	front(root);	//调用前序遍历方法
	System.out.println();
	
	System.out.print("中序遍历：");
	middle(root);	//调用中序遍历方法
	System.out.println();
	
	System.out.print("后序遍历：");
	back(root);		//调用后序遍历方法
	System.out.println();
 }

//定义前序遍历方法（根左右）
public static void front(Node root){ 
	if(root==null){		//如果节点为空，方法结束
		return;
	}
	System.out.print(root.data);	//先打印根节点
	front(root.left);				//把左节点当成参数，继续调用front方法
	front(root.right);				//把右节点当成参数，继续调用front方法
}

//定义中序遍历方法（左根右）
public static void middle(Node root){
	if(root==null){		//如果节点为空，方法结束
		return;
	}
	middle(root.left);				//把左节点当成参数，继续调用middle方法
	System.out.print(root.data);	//再打印根节点
	middle(root.right);				//把右节点当成参数，继续调用middle方法
}

//定义后序遍历方法（左右根）
public static void back(Node root){
	if(root==null){		//如果节点为空，方法结束
		return;
	}
	back(root.left);				//把左节点当成参数，继续调用back方法
	back(root.right);				//把右节点当成参数，继续调用back方法
	System.out.print(root.data);	//最后打印根节点
}

}

//创建一个节点类，属性有：数值，左节点
class Node{
	int data=0;			//数据值默认为0
	Node left=null;		//坐节点默认为null
	Node right=null;	//右节点默认为null
}




