public class Ultimad{
  public static final int worldTime = 0;
  public static final int mpy = 525600;
  public static final int mpd = 1440;
  public static final int mph = 60;
  public static void main(String[] args){
    System.out.printf("worldTime = "+worldTime+"\nIt is "+hour()+":%02d on day "+day()+" of the year "+year()+".\nTrammel is in day "+tram()+" of its 9 day phase.\nFelucca is in day "+felu()+" of its 14 day phase.",min());
  }
  public static int year(){
    return 1+worldTime/mpy;
  }
  public static int day(){
    return 1+worldTime%mpy/mpd;
  }
  public static int hour(){
    return worldTime%mpy%mpd/mph;
  }
  public static int min(){
    return worldTime%mpy%mpd%mph;
  }
   public static int tram(){
    return (1+worldTime/mpd)%9;
  }
  public static int felu(){
    return (1+worldTime/mpd)%14;
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
