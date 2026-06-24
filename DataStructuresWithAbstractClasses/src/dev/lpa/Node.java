package dev.lpa;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {

        if ((value instanceof String) && (item.getValue() instanceof String)) {
            int selfLength = ((String) value).length();
            int inputLength = ((String) item.getValue()).length();
            if (selfLength > inputLength) {
                return 1;
            } else if (selfLength < inputLength) {
                return -1;
            }
            return 0;
        } else {
            return -1;
        }
    }
}
