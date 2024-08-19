class LRUCache {
    class Node{
    int ke;
    int val;
    Node next;
    Node prev;
    public Node(int key,int value){
        ke=key;
        val=value;
    }
}
    HashMap<Integer,Node> map=new HashMap<>();
    int cap;
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            deleteNode(temp);
            insertNode(temp);
            return temp.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            temp.val=value;
            deleteNode(temp);
            insertNode(temp);
        }
        else{
            if(map.size()==cap){
                Node temp=tail.prev;
                map.remove(temp.ke);
                deleteNode(temp);
            }
            Node nn=new Node(key,value);
            map.put(key,nn);
            insertNode(nn);
        }
    }
    public  void deleteNode(Node nn){      
        Node back=nn.prev;
        Node next=nn.next;
        back.next=next;
        next.prev=back;
    }

    public  void insertNode(Node nn){
        nn.prev=head;
        nn.next=head.next;
        head.next.prev=nn;
        head.next=nn;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */