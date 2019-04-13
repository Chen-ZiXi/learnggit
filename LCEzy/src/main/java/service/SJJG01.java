package 工作室作业;

public class SJJG01 {
    private long[] a;//定义一个数组
    private int size;//栈数组的大小
    private int top;//栈顶
    
    //构造器，初始化数组的长度，顶部
    public SJJG01(int maxSize) {
        this.size = maxSize;
        this.a = new long[size];
        this.top = -1;//表示空栈
    }

    //数据入栈
    public void push(long number){
    	a[++top] = number;
    	/*相当于
    	 * top++;
    	 * a[top]=number;
    	 * */
    }

    //输出栈顶的数据
    public void output(){
        System.out.println(a[top]);
    }

    //返回栈顶数据数据，并删除栈顶数据
    public long pop(){
        return a[top--];
        /*相当于
    	 * return a[top];
    	 * top--
    	 * */
    }


    //显示栈中的所有数字（从顶到底）
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
    
    
//main方法，运行程序    
public static void main(String[] args) {
	System.out.println("把1，2，3按顺序放入栈a1");
	
	SJJG01 a1 = new SJJG01(3); 	//创建一个栈,叫a1
    a1.push(1); 				//把1放进栈里
    a1.push(2); 				//把2放进栈里
    a1.push(3); 				//把3放进栈里
    System.out.print("栈a1中的数字：");
    a1.display(); 				//显示栈a1中所有的数字
    
    SJJG01 a2 = new SJJG01(3);	//创建一个栈,叫a2
    a2.push(a1.pop());  		//把栈a1顶部的数拿出来放入栈a2
    a2.push(a1.pop());  		//再把栈a1顶部的数拿出来放入栈a2
    a2.push(a1.pop());  		//再把栈a1顶部的数拿出来放入栈a2
    System.out.print("栈a2中的数字：");
    a2.display();       		//显示栈a2中所有的数字
    System.out.println("拿出栈a2中的数");
    a2.output();				//输出栈2顶部的数字
    a2.pop();					//删除栈2顶部的数字
    a2.output();				//输出栈2顶部的数字
    a2.pop();					//删除栈2顶部的数字
    a2.output();				//输出栈2顶部的数字
    a2.pop();					//删除栈2顶部的数字
 }
}

