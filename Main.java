public class Ultimad{
  public static void main(String[] args){
    int time = 0;
    int rem = time;
    int year = year(time);
    rem = time - ((year-1)*(365*24*60));
    int day = day(rem);
    rem = rem - ((day-1)*(24*60));
    int hour = hour(rem);
    rem = rem - (hour*(60));
    int min = rem;
    int tram = tram(time);
    int felu = felu(time);
    print(time,hour,min,day,year,tram,felu);
  }
  public static int year(int x){
    return (1+(x/(365*24*60)));
  }
  public static int day(int x){
    return (1+(x/(24*60)));
  }
  public static int hour(int x){
    return (x/60);
  }
  public static int tram(int x){
    return (1+(x/(24*60)))%9;
  }
  public static int felu(int x){
    return (1+(x/(24*60)))%14;
  }
  public static void print(int time, int hour, int min, int day, int year, int tram, int felu){
    System.out.println("worldTime = "+time);
    System.out.printf("It is "+hour+":%02d on day "+day+" of the year "+year,min);
    System.out.print("\nTrammel is in day "+tram+" of its 9 day phase.\nFelucca is in day "+felu+" of its 14 day phase.");
  }
}
/* 

Results: 

worldTime = 168260271
It is 9:51 on day 48 of the year 321
Trammel is in day 1 of its 9 day phase.
Felucca is in day 4 of its 14 day phase.

worldTime = 27364375
It is 0:55 on day 24 of the year 53
Trammel is in day 5 of its 9 day phase.
Felucca is in day 6 of its 14 day phase.

worldTime = 67294091
It is 0:11 on day 13 of the year 129
Trammel is in day 5 of its 9 day phase.
Felucca is in day 1 of its 14 day phase.

*/
