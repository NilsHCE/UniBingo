
public class Queue {
	node head;
	node tail = head;

	public static void main(String[] args) {
		Queue sack = new Queue();
		sack.fillqueue(sack);
		for (int i = sack.length() - 1; i >= 0; i--) {
			System.out.print("Länge: " + sack.length() + "|  ");
			System.out.println("i:" + i + " : " + sack.getNode(i));
		}
	}

	public static void create(Queue storage) {
		fillqueue(storage);
//		int y = 4;
//		int length = storage.length();
//		System.out.println("The queue has the length of " + length + ".");
//		String onspot = storage.getNode(y);
//		if (onspot != null) {
//			System.out.println("On position " + y + " is the condition: " + onspot + ".");
//		}
	}

	private void removeNode(int y) {
		if (head == null) {
			return;
		}
		// Entferne den ersten Knoten (Index 0)
		if (y == 0) {
			head = head.getNext();
			return;
		}

		node pointer = head;
		node prev = null;

		for (int i = 0; i < y; i++) {
			if (pointer.getNext() == null) {
				System.out.println("y out of reach");
				return;
			}
			prev = pointer;
			pointer = pointer.getNext();
		}
		// Entferne den Knoten an der Position y
		if (prev != null) {
			prev.setNext(pointer.getNext());
		}
	}

	protected String getNode(int y) { // Gets node at position y in queue
		node pointer = head;
		if (head == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		for (int i = 0; i < y; i++) {
			if (pointer.getNext() == null) {
				System.out.println("Number out of storage length.");
				return null;
			}
			pointer = pointer.getNext();
		}
		this.removeNode(y);
		return pointer.getCondition();
	}

	protected String onlygetNode(int y) { // Gets node at position y in queue
		node pointer = head;
		if (head == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		for (int i = 0; i < y; i++) {
			if (pointer.getNext() == null) {
				System.out.println("Number out of storage length.");
				return null;
			}
			pointer = pointer.getNext();
		}
		return pointer.getCondition();
	}

	protected static void fillqueue(Queue storage) {
		storage.addNote("Laslzo kommt zu spät");
		storage.addNote("Prof geht Folie zurück");
		storage.addNote("Tutor keinen Bock");
		storage.addNote("Technische Probleme");
		storage.addNote("Mikrofon zu leise");
		storage.addNote("Mensa Arsch = Döner Time");
		storage.addNote("Jake Classic in Mensa");
		storage.addNote("Einer nicht da");
		storage.addNote("Prof redet 15min über triviale Folie");
		storage.addNote("Prof zu spät");
		storage.addNote("Das eine Mädchen stellt Frage");
		storage.addNote("Keiner meldet sich bei Frage in die Runde");
		storage.addNote("Die Frage nochmal lauter wiederholen");
		storage.addNote("jemand spielt CoC");
		storage.addNote("jemand im anderen Universum");
		storage.addNote("Klausur wird erwähnt");
		storage.addNote("Laslzo lässt berliner raushängen");
		storage.addNote("GLP Getroffen");
		storage.addNote("Prof öffnet Tür zu Privatleben");
		storage.addNote("Prof aufm weg zur Gala");
		storage.addNote("Mikro viel zu laut");
		storage.addNote("dies überlasse ich ihnen zum selbststudium");
		storage.addNote("Prof überspringt Banger Folie");
		storage.addNote("Platzhalter 1");
		storage.addNote("Platzhalter 2");
		storage.addNote("Platzhalter 3");;
//		storage.addNote("1. Laszlo kommt zu spät");
//		storage.addNote("2. Prof geht Folie zurück");
//		storage.addNote("3. Tutor keinen Bock");
//		storage.addNote("4. Technische Probleme");
//		storage.addNote("5. Mikrofon zu leise");
//		storage.addNote("6. Mensa Arsch");
//		storage.addNote("7. Chicken leer");
//		storage.addNote("8. Einer nicht da");
//		storage.addNote("9. Prof redet 15min über triviale Folie");
//		storage.addNote("10. Prof zu spät");
//		storage.addNote("11. Das eine Mädchen stellt Frage");
//		storage.addNote("12. Keiner meldet sich bei Frage in die Runde");
//		storage.addNote("13. Die Frage nochmal lauter wiederholen");
//		storage.addNote("14. FEHLT NOCH");
//		storage.addNote("15. Fehlt auch noch");
//		storage.addNote("16. FEHLT auch 3.0");

	}

	protected int length() {
		int counter = 0;
		if (head == null) {
			return 0;
		} else {
			node pointer = head;
			while (pointer != null) {
				pointer = pointer.getNext();
				counter++;
			}
		}
		return counter;
	}

	protected void addNote(String con) {
		node newNode = new node(con);
		node pointer = head;
		if (head == null) {
			head = newNode;
			return;
		} else {
			while (pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(newNode);
			return;
		}
	}
}
