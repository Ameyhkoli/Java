class RaceTrack{
	public static void main(String[]args){
	Car a=new Car(2010,"Porsche",25.0);
	System.out.println("car's year model="+a.getyear()+"\n make of the car="+a.getmake()+"\n speed of the car="+a.getspeed());
	a.accelerate();
	System.out.println("speed of the car="+a.getspeed());

}
}