import { LinkedList } from "./lib/linked-list.mjs";
import { Stack } from "./lib/stack.mjs";
import { Queue } from "./lib/queue.mjs";
import { Deque } from "./lib/deque.mjs";
import { HashTable } from "./lib/hash-table.mjs";
import { HashSet } from "./lib/hash-set.mjs";

let hashSet = new HashSet();

hashSet.add(1);
hashSet.add(2);
hashSet.printAll()
hashSet.add(3);
hashSet.add(3);
hashSet.printAll()
hashSet.remove(1);
hashSet.printAll()

console.log(hashSet.isContain(1));
console.log(hashSet.isContain(2));
console.log(hashSet.isEmpty());
hashSet.clear();
console.log(hashSet.isEmpty());

/*let hashTable = new HashTable();
hashTable.set(1, "이윤재");
hashTable.set(4, "최진철");
hashTable.set(20, "홍명보");
hashTable.set(6, "유상결")
hashTable.set(6, "유상ehd")
hashTable.set(21, "이유유유윤");

console.log(hashTable.get(1));
console.log(hashTable.get(4));
console.log(hashTable.get(20));
console.log(hashTable.get(6));

console.log(hashTable.remove(1));
console.log(hashTable.get(1));
console.log(hashTable.get(21));*/



/*const deque = new Deque();

deque.addFirst(1);
deque.addFirst(2);
deque.addFirst(3);
deque.printAll();

deque.addLast(4)
deque.printAll();

deque.removeFirst();
deque.printAll();

deque.removeLast()
deque.printAll();*/

/*
const queue = new Queue();

queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

console.log("front")
console.log(queue.front().data);

console.log("dequeue")
console.log(queue.dequeue().data);
console.log("dequeue")
console.log(queue.dequeue().data);

console.log("isEmpty")
console.log(queue.isEmpty());

console.log("dequeue")
console.log(queue.dequeue().data);

console.log("isEmpty")
console.log(queue.isEmpty());
*/


/*const stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.printAll()

console.log(stack.peek().data)

stack.pop();
stack.printAll();
stack.pop();
stack.printAll()

console.log(stack.isEmpty())
stack.pop();
stack.pop();
console.log(stack.isEmpty())*/

// LinkedList test
/*const list = new LinkedList();

list.insertAt(0, 1);
list.insertAt(1, 2);
list.insertAt(2, 3);
list.insertAt(2, 4);

list.printAll();

list.clear();
list.printAll();

list.insertLast(0);
list.insertLast(1);
list.insertLast(2);
list.printAll();

console.log(list.deleteAt(2).data);

list.printAll();

list.clear();
list.insertLast(0);
list.insertLast(1);
list.insertLast(2);

list.deleteLast();
list.printAll();

list.clear();
list.insertLast(0);
list.insertLast(1);
list.insertLast(2);
console.log(list.getNodeAt(0));
console.log(list.getNodeAt(1));
console.log(list.getNodeAt(2));*/
