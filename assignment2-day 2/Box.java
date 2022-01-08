class Box 
{
  //state : DATA : non static data members : mem allocated in heap : after instance creation --instance variables
  //tight encapsulation : data hiding : private
   private double width,depth,height;
   private String color;
   //parameterized ctor to init complete state of the Box
   Box(double w,double d,double height)
   {
	   width=w;
	   depth=d;
	   this.height=height;
   }
   //add another overloaded  ctor to init state of a cube
   Box(double side)
   {
	   //implicity keyowrd : this
	//   width=depth=height=side;
	 this(side,side,side);
	   
   }
   //add another ctor : to init state =-1
   Box()
   {
	    //width=depth=height=-1;
		this(-1);
		
   }
   Box(double width,double depth,double height,String color)
   {
		this.width=width;
		this.depth=depth;
		this.height=height;
		this.color=color; 
   }
   String getColor()
   {
	   
		return this.color;
   }
   
   
   boolean isEqual(Box newbox)
   {
	   if(this.width==newbox.width && this.depth==newbox.depth && this.height==newbox.height)
		   return true;
	   else
		   return false;
	 
   }
   Box createNewBox(double w,double d,double h)
   {
	  Box temp=new Box(width+w,depth+d,height+h);
	  return temp;
   }
   //Actions : 1. To return Box details in String form (dimensions of Box)
  String getBoxDetails()
   {//adding this keyowrd here : optional , only added for understanding purpose.
	   return "Box dims "+this.width+" "+this.depth+" "+this.height;
   } 
   //2. To return computed volume of the box.
   double getComputedVolume()
   {
	   //this keyword is optional .
	   return width*depth*height;
   }
}