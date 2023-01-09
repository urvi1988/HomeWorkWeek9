public class Rectangle {
    //13. Pool Area
    //The Swimming Company has asked you to write an application that calculatesthe volume of cuboid
    //shaped pools.

    private double width;
    private double length;

    public Rectangle(double width,double length){
        if((width<0)&&(length<0)){
            this.width=0;
            this.length=0;
        } else if ((width<0)&&(length>0)){
            this.width=0;
            this.length=length;
        } else if ((width>0)&&(length<0)){
            this.width=width;
            this.length=0;
        }else{
            this.width=width;
            this.length=length;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return (width * length);
    }
}

