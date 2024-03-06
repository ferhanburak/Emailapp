package ProgrammingAssingment201;

public class Email {
	private String subject;
	private int id;
	private String message;
	private long time;
	private boolean isRead;

	public Email(String subject, String message, long time, int id) {
		this.id = id;
		this.subject = subject;
		this.message = message;
		this.time = time;
		this.isRead = false;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean read) {
		isRead = read;
	}

	@Override
	public String toString() {
		return "Email id: " + id + ", Subject: " + subject + ", Message: " + message + ", Time: " + time;
	}
}