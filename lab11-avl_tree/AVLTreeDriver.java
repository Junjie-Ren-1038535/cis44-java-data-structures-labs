public class AVLTreeDriver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // TODO: Insert test values
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        // now looks like this
        //    20
        // 10    30

        // so insert 15 and 12 to be likr
        tree.insert(15);
        tree.insert(12);
        //     20
        // 10      30
        //     15
        //   12

        // unbalanced and should be
        //        20
        //   12        30
        // 10    15
        //

        // add 22  and 25 so its the same on the right
        tree.insert(22);
        tree.insert(25);
        //          20                            20
        //   12            30     to        12         25
        // 10    15     22               10    15    22    30
        //                 25


        // add 9 , 8 for the right rotation  and 31 and 32 for the left rotation
        tree.insert(9);
        tree.insert(8);
        tree.insert(31);
        tree.insert(32);


        //             20
        //        12        25
        //      10  15    22    30
        //    9
        //   8

        //to  below and rhs is the same idea

        //             20
        //        12        25
        //      9  15    22    31
        //    8   10         30    32
        // TODO: Add more insertions to test all 4 rotation cases

        // TODO: Print traversals
        System.out.print("Inorder: ");
        tree.inorder();
        // expected order : 8,9,10,12,15,20,22,25,30,31,32

        System.out.print("Preorder: ");
        tree.preorder();
        // expected order: 20,12,9,8,10,15,25,22,31,30,32

        System.out.print("Postorder: ");
        tree.postorder();
        // expected order : 8,10,9,15,12,22,30,32,31,25,20
        // TODO: Add expected results as comments for verification
    }
}