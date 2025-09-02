package Data_Structure.Practice;
class stack{
    int [] arr;
    int top_of_stack;

    public stack(int size){
        arr = new int[size];
        top_of_stack=-1;
        System.out.println("the Stack is created with the size of " + size);
    }
    public boolean isempty(){
        if(top_of_stack==-1){
            System.out.println("The Stack is Empty");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(top_of_stack==arr.length-1){
            System.out.println("stack is full");
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int value){
        if(top_of_stack==arr.length-1){
            System.out.println("The stack is full");
            return;
        }
        else{
            arr[top_of_stack+1]=value;
            System.out.println("The "+value + " is inserted");
            top_of_stack++;
        }
    }
    public int pop(){
        if(top_of_stack==-1){
            System.out.println("the stack is totally empty");
            return -1;
        }
        else{
            int topStack = arr[top_of_stack];
           top_of_stack--;
            return topStack;
        }
    }

}




public class stack_practice {
    public static void main(String[] args) {
        stack obj = new stack(5);
        obj.isempty();
        obj.isFull();
        obj.push(5);
        obj.push(0);
        obj.push(57);
        obj.push(90);
        obj.push(32);
        obj.push(15);
        obj.isFull();
        System.out.println(obj.pop());







    }
}
