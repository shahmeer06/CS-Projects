//Shahmeer Khan, CS Fund BC, Fall Quarter

public class Date {

	private int year;
	private int month;
	private int day;
	
	static String Months[] = {"", "January", "Febuary", "March", "April",
			"May", "June", "July", "August", "September", "October",
			"November", "December"
	};
	
	static int Days[] = {
			
			0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
			
	};
	
	public Date() {
		
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		
	}
	
	public Date(int year, int month, int day) {
		
		setDate(year, month, day);
		
		
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
	
	public String toString() {
		
		String res = "";
		
		if(year<10) {
			
			res = "0" + year;
			
		} else {
			res = "" + year;
		}
		
		if(month<10) {
			
			res += "/0" + month;
			
		} else {
			
			res+="/" + month;
			
		}
		
		if(day<10) {
			
			res+="/0" + day;
			
		} else {
			res+="/" + day;
		}
		
		return res;
	}
	
	private int getDaysInMonth(int year, int month) {
		
		if(isLeapYearHelp(year)) {
			
			if(month == 2) {
				
				return 29;
				
			}
			
			
		}
		
		return Days[month];
		
	}
	
	
	private boolean isDateValid(int year, int month, int days) {
		
		if(month<=0 || month > 12) {
			
			return false;
			
		} else if(days>getDaysInMonth(year, month) || days<=0){
			
			return false;
			
		} else {
			return true;
		}
		
		
	}
	
	public void nextDay(){
		
		this.day+=1;
		if(isDateValid(year, month, day) == false) {
			this.day = 1;
			this.month+=1;
			if(isDateValid(year, month, day) == false) {
				
				this.month = 1;
				this.year+=1;
				
			}
			
		}
		
	}
	
	public void prevDay() {
		
		this.day-=1;
	
		
		if(isDateValid(year, month, day) == false) {
			
			this.month-=1;
			this.day = getDaysInMonth(year, month);
		
			

		
		if(month<=0) {
			
			this.month = 12;
			this.year -=1;
			this.day = getDaysInMonth(year, month);
		}
			
			
		
		
			
		}		
			
			
			
		}
		
		
	
	
	public void addDays(int days) {
		
		if(days>0) {
			
			for(int i = 0; i<days; i++) {
				
				nextDay();
				
			}
			
		} else {
			
			for(int i = days; i<0; i++) {
				
				prevDay();
				
			}
			
			
		}
		
		
		
		
	}
	
	public void addWeeks(int weeks) {
		
		addDays(weeks*7);
		
		
	}
	
	
	public void setDate(int year, int month, int day) {
		
		if(isDateValid(year, month, day) == false){
			
			throw new IllegalArgumentException();
			
		}
		this.year = year;
		this.day = day;
		this.month = month;
		
	}
	
	public String longDate() {
		
		return Months[month] + " " + day + "," + year;
		
	}
	

	
	public boolean isLeapYearHelp(int year) {
		
		if(year%4 == 0) {
			
			if(year%100==0 && year%400 != 0) {
				
				return false;
				
			} else {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public boolean isLeapYear() {
		
		return isLeapYearHelp(year);
		
		
	}
	
	public int daysTo(Date other) {
//result = num of days		
		int temp_year = this.year;
		int temp_month = this.month;
		int temp_day = this.day;
		int result = 0;
		
		

		if(other.year < this.year || (other.year == this.year && (other.month < this.month)) ||
				(other.month == this.month && other.day < this.day)) 
		{
			
			
			while(other.day != this.day || other.month != this.month || other.year != this.year) 
			{
				
				prevDay();
				result-=1;
			}
			
			
		}
		else
		{
			
			while(other.day != this.day || other.month != this.month || other.year != this.year) 
			{
				
				nextDay();
				result+=1;
			}
		}
		
		
		
		this.year = temp_year;
		this.month = temp_month;
		this.day = temp_day;
		return result;
		
	}
	
	public static int daysTo(Date current, Date other){
	      
	      
     
	     
	      return current.daysTo(other);
	     
	   }
	
	
	
	
	
	
	
	
	
	
	
}
