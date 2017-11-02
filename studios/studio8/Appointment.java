package studio8;

import java.util.LinkedList;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}


	public static void main(String[] args) {
		
		Date d1 = new Date(12, 8, 1738, false);
		Time t1 = new Time(10, 19, false);
		Time t2 = new Time(22, 19, false);
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d1, t2);
		
		LinkedList <Appointment> Cal = new LinkedList<Appointment>();
		Cal.add(a1);
		Cal.add(a2);
		System.out.println(Cal);
		
	}

}
