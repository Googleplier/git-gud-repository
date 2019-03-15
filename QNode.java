class QNode{
   private int price; // name of int
   private String doto; // name of string
   private  QNode next;
   private boolean highprio;
 
	// constructor when adding normal prio for any circumstances
 public QNode(String n, int p){ 
      price = p;   
      doto  = n;
	 next = null;
	highprio = false;
 }
 //for inserting
 public QNode(String n, int p, QNode nx){ 
      price = p;   
      doto  = n;
	 next = nx;
	highprio = false;
 }
 // ditto but for higher prio
  public QNode(String n, int p, QNode nx, boolean x){ 
      price = p;   
      doto  = n;
	 next = null;
	highprio = x;
  }
	// get price
   public int getPrice(){
	   return price;
   }
   public String getName(){
	return doto;
   }
   public void setName(String n){
	   doto = n;
   }
   public void setPrice(int p){
	   price = p;
   }
   public QNode getnext(){
	   return next;
   }
   public void setNext(QNode nx){
	   next = nx;
   }
   public boolean getprio(){
	   return highprio;
   }
   
   }
	   
 
	  
	  
	  


