package Praktikum;

/**
 *
 * @author FARLAN
 */
public class BinaryTreeArray {

    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // 6. Modifikasi class Binary Tree Main
    void add(int dt) {
        if (data[0] == 0) {
            data[0] = dt;
            return;
        } else {
            int i = 0;
            while (true) {
                if (dt < data[i]) {
                    if (data[i * 2 + 1] == 0) {
                        data[i * 2 + 1] = dt;
                        break;
                    } else {
                        i = i * 2 + 1;
                    }
                } else {
                    if (data[i * 2 + 2] == 0) {
                        data[i * 2 + 2] = dt;
                        break;
                    } else {
                        i = i * 2 + 2;
                    }
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
