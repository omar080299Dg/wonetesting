/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir_exo_1;

/**
 *
 * @author Oumar NIANG
 */
public class MyDate { 
    private int month;
    private int day;
    private int year;
    public static final String MONTH[]= {"jan","feb","mar","apr","may","jun","jul","sep","oct","nov","dec"};
    public static final String DAY[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
    public static final int DAYS_IN_MONTH[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeap(int year)
    {
        boolean bool=false;
        if( year%400==0 || (year%100 !=0 && year%4==0))
        {
            bool=true;
        }
        return bool;
    }
      public boolean isValidate(int year,int month,int day)
      {
        boolean bool=false;
        if((year>=1 && year<=199) && (month>=1 && month<=12)&&(day>=1 && day<=31))
        {
            bool=true;
        }
        
        
        return bool;
    }
      
      public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    
    public void setDate(int year, int mounth,int day)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
     public String ToString()
    {
        String str;
        
        str=DAY[this.day]+" "+this.day+" "+MONTH[this.month]+" "+this.year;
        
        
        return str;
    }
      
     
      public MyDate nextDay()
    {
       
        if(isLeap(this.year))
        {
             if((this.month==1 || this.month==3 || this.month==5 || this.month==7 ||this.month==8 || this.month==9 || this.month==12) && this.day==31)
           {
               if(this.month==12 && this.day==31)
               {
                   this.day=1;
                   this.month=1;
                   this.year=this.year+1;
               }
               else
               {
                   this.day=1;
               this.month=this.month+1;
               }
                       
           }
             else if(this.month==2 && this.day==29)
             {
               this.day=1;
               this.month=this.month+1;
             }
        
        else
        {
             this.day=1;
             this.month=this.month+1;
        }
        
        
        
        
        
        return this;
    }
          public MyDate nextMonth()
        {
            if(this.month==31)
            {
                this.month=1;
                this.year=this.year+1;
            }
            else
            {
                this.month=this.month+1;
                
            }
            return this;
            
        }
        public MyDate nextYear()
        {
            this.year=this.year+1;
            System.out.println("the prvious month is"+this.day+" "+this.month+this+" "+this.year);
            return this;
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      public MyDate previoustDay()
    {
       
        if(isLeap(this.year))
        {
             if((this.month==1 || this.month==3 || this.month==5 || this.month==7 ||this.month==8 || this.month==9 || this.month==12) && this.day==31)
           {
               if(this.month==12 && this.day==1)
               {
                   this.day=31;
                   this.month=this.month-1;
                   this.year=this.year-1;
               }
               else
               {
                   this.day=27;
               this.month=this.month-1;
               }
                       
           }
             else if(this.month==2 && this.day==29)
             {
               this.day=28;
               this.month=this.month;
             }
        
        else
        {
             this.day=1;
             this.month=this.month+1;
        }
        
        
        
        
        
        return this;
    }
          public  MyDate previousMonth()
           {
            if(this.month==1)
            {
                this.month=31;
                this.year=this.year+1;
            }
            else
            {
                this.month=this.month-1;
                
            }
            return this;
            
           }
        public MyDate previousYear()
        {
            this.year=this.year-1;
            System.out.println("the prvious month is"+this.day+" "+this.month+this+" "+this.year);
            return this;
            
        }
        
    
    
        
}
        
        
    
    
        

        
                     
             
             
             
                
    


