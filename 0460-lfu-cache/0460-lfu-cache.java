import java.util.*;

class Node {
    int key;
    int value;
    int freq;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.freq = 1;
        this.prev = null;
        this.next = null;
    }
}

class DLL {
    Node head;
    Node tail;

    public DLL() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    public void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }
}

class LFUCache {
    Map<Integer, Node> keyMap;
    Map<Integer, DLL> freqMap;
    int capacity;
    int size;
    int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.minFreq = 0;
        this.keyMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) {
            return -1;
        }
        Node node = keyMap.get(key);
        updateNode(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateNode(node);
        } else {
            if (size == capacity) {
                DLL minFreqList = freqMap.get(minFreq);
                keyMap.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                size--;
            }
            Node newNode = new Node(key, value);
            keyMap.put(key, newNode);
            minFreq = 1;
            DLL list = freqMap.getOrDefault(1, new DLL());
            list.addNode(newNode);
            freqMap.put(1, list);
            size++;
        }
    }

    private void updateNode(Node node) {
        int freq = node.freq;
        DLL list = freqMap.get(freq);
        list.removeNode(node);
        if (freq == minFreq && list.isEmpty()) {
            minFreq++;
        }
        node.freq++;
        DLL newList = freqMap.getOrDefault(node.freq, new DLL());
        newList.addNode(node);
        freqMap.put(node.freq, newList);
    }
}
