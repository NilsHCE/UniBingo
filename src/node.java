
public class node {
	String condition;
	node next;

	public node(String condition) {
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}

}
