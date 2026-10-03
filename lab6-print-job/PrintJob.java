
// You will need a functioning Queue implementation (like LinkedQueue) for this to work.
// interface Queue { ... }
// class LinkedQueue implements Queue { ... }

/**
 * Represents a single document to be printed.
 */
public class PrintJob {
    private String documentName;
    private int pageCount;

    // TODO: Implement the constructor
    public PrintJob(String documentName, int pageCount) {
        // Your code here
        this.documentName = documentName;
        this.pageCount = pageCount;
    }

    // TODO: Implement the toString method to return a descriptive string
    // e.g., "PrintJob[Document: report.docx, Pages: 15]"
    @Override
    public String toString() {
        return "PrintJob[Document: " + this.documentName + ", Pages: " + pageCount + "]"; // Placeholder
    }
}

