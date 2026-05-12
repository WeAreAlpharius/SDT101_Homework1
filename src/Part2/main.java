package Part2;

public class main {

    static void main() {

        //Part2.3
        BinaryTree<Integer> tree = new BinaryTree<>(50,
                new BinaryTree<>(17,
                        new BinaryTree<>(12,
                                new BinaryTree<>(9),
                                new BinaryTree<>(14)
                        ),
                        new BinaryTree<>(23,
                                new BinaryTree<>(19),
                                new BinaryTree<>()
                        )
                ),
                new BinaryTree<>(72,
                        new BinaryTree<>(54,
                                new BinaryTree<>(67),
                                new BinaryTree<>()
                        ),
                        new BinaryTree<>(76)
                )
        );

        //Part 2.4
        tree.inorderTraverse();
        tree.postorderTraverse();
        tree.preorderTraverse();

        //Part 2.5
        for (int i : tree){
            IO.print(i + " ");
        }
        IO.println();

        //Part 2.6
        IO.println(tree.getSize());

    }
}
