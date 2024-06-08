package percobaan1;
public class BinaryTree12 {
    Node12 root;
    int totalLeaf;

    public BinaryTree12() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node12(data);
        } else {
            Node12 current = root;

            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node12(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node12(data);
                    }
                } else {
                    break;
                }
            }
        }
    }

    // Menambahkan data dengan metode rekursif
    void addRecursiveWay(Node12 startingNode, int data) {
        if (isEmpty()) {
            root = new Node12(data);
        } else {
            if (data < startingNode.data) {
                if (startingNode.left != null) {
                    // current = current.left;
                    addRecursiveWay(startingNode.left, data);
                } else {
                    startingNode.left = new Node12(data);
                }
            } else if (data > startingNode.data) {
                if (startingNode.right != null) {
                    // startingNode = startingNode.right;
                    addRecursiveWay(startingNode.right, data);
                } else {
                    startingNode.right = new Node12(data);
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node12 current = root;
        while (current == null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    int[] findSmallestAndLargestData() {
        int smallestData = root.data;
        int largestData = root.data;
        Node12 temp = root;
        while (temp != null) {
            if (temp.data < smallestData) {
                smallestData = temp.data;
            }
            temp = temp.left;
        }

        temp = root;
        while (temp != null) {
            if (temp.data > largestData) {
                largestData = temp.data;
            }
            temp = temp.right;
        }

        int[] result = {smallestData, largestData};
        return result;
    }

    void traversePreOrder(Node12 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node12 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node12 getSuccessor(Node12 del) {
        Node12 successor = del.right;
        Node12 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node12 parent = root;
        Node12 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node12 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    // Menggunakan metode rekursif untuk penghapusan seluruh data
    // Ini dilakukan agar data-data yang ada di percobaan tidak ikut tercampur
    public void deleteAll() {
        deleteAllNodes(root);
        root = null;
    }

    private void deleteAllNodes(Node12 node) {
        if (node == null) {
            return;
        }

        deleteAllNodes(node.left);
        deleteAllNodes(node.right);

        node.left = null;
        node.right = null;
    }

    public void showLeaf() {
        System.out.print("Leaf tree: ");
        startSearchLeaf(root);
    }

    private  void startSearchLeaf(Node12 current) {
        if (current != null) {
            if (current.left == null && current.right == null) {
                System.out.print(current.data + "  ");
            } else {
                startSearchLeaf(current.left);
                startSearchLeaf(current.right);
            }
        } 
    }

    public void countLeaf() {
        totalLeaf = 0; // Mereset total leaf
        System.out.print("\nTotal leaf : ");
        startCountLeaf(root);
        System.out.println(totalLeaf);
    }

    private void startCountLeaf(Node12 current) {
        if (current != null) {
            if (current.left == null && current.right == null) {
                totalLeaf++;
            } else {
                startCountLeaf(current.left);
                startCountLeaf(current.right);
            }
        } 
    }
}
