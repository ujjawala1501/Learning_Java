public class forageHeap {
    
}
public class Heap {
    private int branchingFactor;
    private int[] heap;

    public Heap(int branchingFactor) {
        this.branchingFactor = branchingFactor;
        this.heap = new int[10]; // initial capacity
    }

    public void insert(int value) {
        // resize the heap if necessary
        if (heap.length == size()) {
            resize();
        }

        // insert the value at the end of the heap
        heap[size()] = value;

        // bubble up the value to maintain the heap property
        int index = size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / branchingFactor;
            if (heap[parentIndex] >= heap[index]) {
                break;
            }
            swap(parentIndex, index);
            index = parentIndex;
        }
    }

    public int popMax() {
        if (size() == 0) {
            throw new RuntimeException("Heap is empty");
        }

        // swap the root with the last element
        swap(0, size() - 1);

        // remove the last element
        int max = heap[size() - 1];
        heap[size() - 1] = 0; // reset the value
        heap = Arrays.copyOf(heap, size() - 1);

        // bubble down the root to maintain the heap property
        int index = 0;
        while (true) {
            int largest = index;
            for (int i = 1; i <= branchingFactor; i++) {
                int childIndex = branchingFactor * index + i;
                if (childIndex < size() && heap[childIndex] > heap[largest]) {
                    largest = childIndex;
                }
            }
            if (largest == index) {
                break;
            }
            swap(largest, index);
            index = largest;
        }

        return max;
    }

    private void resize() {
        heap = Arrays.copyOf(heap, heap.length * 2);
    }

    private void swap(int i, int j) {
        int temp = heap[i];
       