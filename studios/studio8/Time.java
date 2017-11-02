package studio8;

public class Time {
	
	private final int hour;
	private final int minute;
	private boolean twelve;
	
	public Time(int hour, int minute, boolean twelve) {
		this.twelve=twelve;
		if (this.twelve ) {
			this.hour = hour - 12;
			this.minute = minute;
		}
		else {
			this.hour = hour;
			this.minute = minute;
		}
	}

	public boolean isEarlierThan(Time other) {
		if (this.hour < other.hour) {
			return true;
		}
		else if (this.hour <= other.hour && this.minute < other.minute) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]";
	}
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Time t1 = new Time(23, 23, true);
		System.out.println(t1);
		Time t2 = new Time(8, 23, false);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		t1.isEarlierThan(t2);
	}

}
