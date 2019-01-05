
public class Conditionals {

  public static boolean isOdd (int n) {
    if (n % 2 != 0) {
      return true;
    }
    return false;
  }

  public static boolean isMultipleOfThree (int n) {
    if (n % 3 != 0) {
      return false;
    }
    return true;
  }

  public static boolean isOddAndIsMultipleOfThree (int n) {
    if ((n % 2 != 0) && (n % 3 == 0)) {
      return true;
    }
    return false;
  }

  public static String fizzMultipleOfThree (int n) {
    if(n % 3 == 0) {
      return "Fizz";
    }
    return "not fizz";
  }

  public static boolean cigarParty(int cigars, boolean isWeekend) {
    return cigars >= 40 && (cigars <= 60 || isWeekend);
  }

  public static int caughtSpeeding(int speed, boolean isBirthday) {
    int birthday = isBirthday ? 5 : 0;
    if(speed <= 60 + birthday) {
      return 0;
    }
    else if (speed > 60 + birthday && speed <= 80 + birthday) {
      return 1;
    }
    else {
      return 2;
    }
  }

  public static String alarmClock(int day, boolean vacation) {
    if(day == 0 || day == 6) {
      return vacation ? "off" : "10:00";
    }
    return vacation ? "10:00" : "7:00";
  }

  public static int greenTicket(int a, int b, int c){
    if (a == b && b == c) {
      return 20;
    } else if (a == b || a == c || b == c) {
      return 10;
    } else {
      return 0;
    }
  }

  public static int blackjack(int a, int b) {
    if(a>21 && b>21) {
      return 0;
    } else if(a>21) {
      return b;
    } else  if(b > 21) {
      return a;
    } else if((21-a)<=(21-b)) {
      return a;
    } else if((21-a)>=(21-b)) {
      return b;
    }
    return 0;
  }

  public static boolean evenlySpaced(int a, int b, int c) {
    int ab = Math.abs(a - b);
    int bc = Math.abs(b - c);
    int ac = Math.abs(a - c);
    if ((ab == bc && ac == ab + bc) || (ab == ac && bc == ab + ac) || (bc == ac && ab == ac + bc)) {
      return true;
    }
    return false;
  }


  public static void main (String args[]) {


  }
}
