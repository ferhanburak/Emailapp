package ProgrammingAssingment201;

import java.util.LinkedList;

public class ListOfEmails {
	private LinkedList<Email> emails;

	public ListOfEmails() {
		emails = new LinkedList<>();
	}

	public void add(Email E) {
		emails.add(E);
	}

	public Email read(int id) {
		for (Email email : emails) {
			if (email.getId() == id) {
				email.setRead(true);
				return email;
			}
		}
		return null;
	}

	public Email delete(int id) {
		for (Email email : emails) {
			if (email.getId() == id) {
				emails.remove(email);
				return email;
			}
		}
		return null;
	}

	public void showAll(boolean flag) {
		for (Email email : emails) {
			if (flag || !email.isRead()) {
				System.out.println(email);
			}
		}
	}
}