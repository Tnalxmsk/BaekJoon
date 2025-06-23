import { DoubleLinkedList } from "./double-linked-list.mjs";

class Queue {
  constructor() {
    this.list = new DoubleLinkedList();
  }

  enqueue(value) {
    this.list.insertAt(0, value);
  }

  dequeue() {
    try {
      return this.list.deleteLast();
    } catch (error) {
      return null;
    }
  }

  front() {
    return this.list.tail;
  }

  isEmpty() {
    return this.list.count === 0;
  }
}

export { Queue };
