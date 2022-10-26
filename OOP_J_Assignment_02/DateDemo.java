
public class DateDemo {
    int day;
    int month;
    int year;

    DateDemo() {
        day = 01;
        month = 01;
        year = 1970;

    }

    DateDemo(int day) {

        this.day = day;
        this.month = 1;
        this.year = 1970;

    }

    DateDemo(int day, int month) {

        this.day = day;
        this.month = month;
        this.year = 1970;
        System.out.println(day + " " + month + " " + year);

    }

    DateDemo(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }

    void day() {
        System.out.println(day + "/" + month + "/" + year);
    }

    void getPreviousDay() {
        if(day>1){
			System.out.println((day-1)+"/"+month+"/"+year);
			return;
		}
		if(month>1){ 											
			if(month==3){										
				if((year%4==0 && year% 100!=0) || (year%400==0)){
					System.out.println(29+"/"+(month-1)+"/"+year);
					return;
				}
				System.out.println(28+"/"+(month-1)+"/"+year);
				return;
			}				
			if((month==5 || month==7 || month==10 || month==12)){
				System.out.println(30+"/"+(month-1)+"/"+year);
				return;
			}else{
				System.out.println(31+"/"+(month-1)+"/"+year);//if month is other than above mention then last month last date will be 31
				return;
			}
		}
        System.out.println(31+"/"+12+"/"+(year-1));

    }
       void  getNextDay()
        {
            if(day<28){//if day is less than 28 will print +1 day
                System.out.println((day+1)+"/"+month+"/"+year);
                return;
            }
            if(month<12 && day<31){//if Month is not Dec and day is Not 31
                if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10)){//For month in which have 31 days
                    System.out.println((day+1)+"/"+(month)+"/"+year);
                    return;
                }else if(month==2){// Special Month Feb have deferent properties handeled using this block
                    if((day==28)&&((year%4==0 && year% 100!=0) || (year%400==0))){//check wether the year is leap or not if yes then Enter inside block
                        System.out.println(29+"/"+(month)+"/"+year);
                        return;
                    }else if(day==28 || day==29){//if Year is not leaf and month is Feb
                        System.out.println(1+"/"+(month+1)+"/"+year);
                        return;
                    }
                }else if((day<30) && (month==4 || month==6 || month==9 || month ==11)){//if 30 day in month
                    System.out.println((day+1)+"/"+(month)+"/"+year);
                        return;
                }else if((day==30) && (month==4 || month==6 || month==9 || month ==11)){
                    System.out.println(1+"/"+(month+1)+"/"+year);
                    return;
                }
            }
            if(day==31 && month!=12){
                System.out.println(01+"/"+(month+1)+"/"+year);
                return;
            }
        }
		

    

    public static void main(String args[]) {
        DateDemo d0=new DateDemo();
		d0.getPreviousDay();
		d0.getNextDay();
		d0.day();
		System.out.println("=============================================");

        }

    }

