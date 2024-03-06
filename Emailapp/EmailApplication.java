package ProgrammingAssingment201;

import java.util.Scanner;

public class EmailApplication {
	public static void main(String[] args) {
		ListOfEmails Inbox = new ListOfEmails();
		ListOfEmails Archive = new ListOfEmails();
		ListOfEmails Trash = new ListOfEmails();

		Scanner scanner = new Scanner(System.in);
		int option;
		int emailId;
		int id = 1;

		do {
			System.out.println("\n1. Send Email");
			System.out.println("2. Read Email");
			System.out.println("3. Delete Email");
			System.out.println("4. Show All Emails");
			System.out.println("5. Exit\n");
			System.out.print("Enter your option: ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your mail id:" + id);
				System.out.print("Enter the subject: ");
				String subject = scanner.next();
				System.out.println("Enter the message: ");
				scanner.nextLine();
				String message = scanner.nextLine();
				long time = (long) System.currentTimeMillis();
				Email newEmail = new Email(subject, message, time, id);
				Inbox.add(newEmail);
				System.out.println("Email sent successfully!");
				id++;
				break;

			case 2:
				System.out.print("Enter the email id: ");
				emailId = scanner.nextInt();
				Email readEmail = Inbox.read(emailId);
				if (readEmail != null) {
					System.out.println(readEmail);
				} else {
					System.out.println("No such email exists.");
				}
				break;
			case 3:
				System.out.print("Enter the email id: ");
				emailId = scanner.nextInt();
				Email deletedEmail = Inbox.delete(emailId);
				if (deletedEmail != null) {
					Trash.add(deletedEmail);
					System.out.println("Email deleted successfully!");
				} else {
					System.out.println("No such email exists.");
				}
				break;
			case 4:
				System.out.println("Showing all unread emails:");
				Inbox.showAll(false);
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		} while (option != 5);
	}
}