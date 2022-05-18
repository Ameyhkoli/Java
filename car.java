public class Car{

private	int year;
private	String make;
private	double speed;

Car(int year,String make,double speed){
	this.year=year;
	this.make=make;
	this.speed=speed;}
public int getyear(){
	return year;}
public String getmake(){
	return make;}
public double getspeed(){
	return speed;}


void accelerate	(){
speed=speed+1;
}

}