// Lab03v100.java
// Student 100-point version of the Lab03 assignment.


public class Lab03v100
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 100 Point Version\n");
      long milliseconds = 10000123;
      long start = milliseconds;
      long hours = milliseconds/3600000;
      milliseconds = milliseconds%3600000;
      long minutes = milliseconds/60000;
      milliseconds = milliseconds%60000;
      long seconds = milliseconds/1000;
      milliseconds = milliseconds%1000;
      
      System.out.println("Starting milli-seconds:" + start);
      System.out.println("Hours:                        "                  + hours);
      System.out.println("Minutes:                     "                 + minutes);
      System.out.println("Seconds:                     "                 + seconds);
      System.out.println("Mili Seconds:               "            + milliseconds);
      
      
      
    }
}

