
class LRUCache {
   HashMap<Integer,Node>map;
   Node head=new Node(0,0);
   Node tail=new Node(0,0);
   int capacity;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
          int ans= map.get(key).val;
           Node n=map.get(key);
           remove(n);
          insert(n);
          return ans;
        }
        else{
          return -1;
        }
        
    }
    
    public void put(int key, int value) {
        Node node=new Node(key,value);
        if(map.containsKey(key)){
          remove(map.get(key));
        }
        else if(map.size()>=capacity){
          remove(tail.prev);
          //map.remove()
        }
        insert(node);
    }
    void insert(Node node){
      map.put(node.key,node);
      Node cur=head.next;
      node.prev=head;
      node.next=cur;
      cur.prev=node;
      head.next=node;
    }
    void remove(Node node){
      map.remove(node.key,node);
      node.next.prev=node.prev;
      node.prev.next=node.next;
    }
    class Node{
      int key;
      int val;
      Node prev,next;
      Node (int key, int val){
        this.key=key;
        this.val=val;
      }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */