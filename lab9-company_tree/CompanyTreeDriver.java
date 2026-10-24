public class CompanyTreeDriver {
    public static void main(String[] args) {
        // 1. Build the Tree
        // Create the root node (e.g., "CEO")
        GeneralTreeNode root = new GeneralTreeNode("CEO");

        // Create department heads (children of root)
        GeneralTreeNode vpSales = new GeneralTreeNode("VP of Sales");
        vpSales.parent = root;
        GeneralTreeNode vpEngineering = new GeneralTreeNode("VP of Engineering");
        vpEngineering.parent = root;
        root.addChild(vpSales);
        root.addChild(vpEngineering);

        // --- TO BE COMPLETED BY STUDENT ---
        // Add more nodes to build the following hierarchy:
        //
        // CEO
        //  |-- VP of Sales
        //  |    |-- Sales Manager (NA)
        //  |    |-- Sales Manager (EU)
        //  |
        //  |-- VP of Engineering
        //       |-- Dev Team Lead
        //       |    |-- Developer 1
        //       |    |-- Developer 2
        //       |
        //       |-- QA Team Lead

        // Example for "VP of Sales" children:
        GeneralTreeNode salesNA = new GeneralTreeNode("Sales Manager (NA)");
        salesNA.parent = vpSales;
        GeneralTreeNode salesEU = new GeneralTreeNode("Sales Manager (EU)");
        salesEU.parent = vpSales;
        vpSales.addChild(salesNA);
        vpSales.addChild(salesEU);

        // ... add children for "VP of Engineering" ...
        GeneralTreeNode Dev = new GeneralTreeNode("Dev Team Lead");
        Dev.parent = vpEngineering;
        GeneralTreeNode QA = new GeneralTreeNode("QA Team Lead");
        QA.parent = vpEngineering;
        vpEngineering.addChild(Dev);
        vpEngineering.addChild(QA);
        GeneralTreeNode Dev1 = new GeneralTreeNode("Developer 1");
        Dev1.parent = Dev;
        GeneralTreeNode Dev2 = new GeneralTreeNode("Developer 2");
        Dev2.parent = Dev;


        Dev.addChild(Dev1);
        Dev.addChild(Dev2);

        // 2. Perform Traversals
        System.out.println("--- Preorder Traversal (Company Hierarchy) ---");
        root.traversePreorder(root);

        System.out.println("\n--- Postorder Traversal (Staff Roll Call) ---");
        root.traversePostorder(root);
    }
}