class Solution{
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null; // Fix for returning null when the list is empty
        }

        HashMap<Node, Node> mp = new HashMap<>(); // Initialize the HashMap
        Node newHead = new Node(head.val); // Create a copy of the head node
        Node oldTemp = head.next;
        Node newTemp = newHead;
        mp.put(head, newHead); // Store the mapping of old to new node

        // Step 1: Copy the list structure (next pointers)
        while (oldTemp != null) {
            Node copyNode = new Node(oldTemp.val); // Create a new node
            mp.put(oldTemp, copyNode); // Map old node to new node
            newTemp.next = copyNode; // Connect the new node to the new list
            newTemp = newTemp.next; // Move the new list pointer
            oldTemp = oldTemp.next; // Move the old list pointer
        }

        // Step 2: Copy the random pointers
        oldTemp = head;
        newTemp = newHead;
        while (oldTemp != null) {
            newTemp.random = oldTemp.random != null ? mp.get(oldTemp.random) : null; // Assign random pointers
            newTemp = newTemp.next; // Move the new list pointer
            oldTemp = oldTemp.next; // Move the old list pointer
        }

        return newHead; // Return the head of the new list
    }
}