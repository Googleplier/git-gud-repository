public class QueueL {
private QNode head;
private QNode tail;
private QNode temp;
private QNode tamp;

public QueueL(){
	head  = tail = null;
}
public boolean isEmpty(){
	return(head==null);
}
public void add(String n, int p)
{
	temp = new QNode(n, p);
	if(isEmpty()){
		head=tail=temp;}
	else{
		tail.setNext(temp);
		tail=tail.getnext();
	}
}
public void addHead(QNode AddThis)
{
	temp = AddThis;
	temp.setNext(head);
	head=temp;
}
public void dequeue(){
	temp=head;
	head=head.getnext();
	temp=null;
}

public void display(){
	temp = head;
	while(temp!=null){
		System.out.println(""+temp.getName()+"   \n "+ temp.getPrice());
		temp = temp.getnext();
	}
}
 /**
	 *determines whether queue list has prio in it 
	 *@return x boolean
	 */
public boolean containsPrio(){ 
	boolean x = false; 
	for(temp=head; temp!=null; temp=temp.getnext()){
	
		if(temp.getprio()==true){
			x = true;
			break;
			}
		}
	 return x;
	 }
	 /**
	 *returns prio transaction
	 *@param name of client
	 *@param price of the transaction
	 */
public void addprio(String n, int p){
	if(!containsPrio()){
	temp = new QNode(n,p,head,true);
	addHead(temp);
	}
	else{
		QNode curr = head;
		while(curr.getnext().getprio()){
			curr = curr.getnext();
		}
		 temp = new QNode(n,p,null,true);
		 temp.setNext(curr.getnext()); //pointer
		 curr.setNext(temp);
	}
}
public boolean search(String n){
	boolean a = false;
	for(temp=head; temp!=null; temp=temp.getnext()){
		if(n.equalsIgnoreCase(temp.getName())) a=true;
	}
		return a;
	}
}

	


