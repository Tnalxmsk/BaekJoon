import { DoubleLinkedList } from "./double-linked-list.mjs"

class Deque {
  constructor() {
    this.list = new DoubleLinkedList();
  }

  printAll() {
    this.list.printAll();
  }

  addFirst(data) {
    this.list.insertAt(0, data);
  }

  removeFirst() {
    this.list.deleteAt(0);
  }

  addLast(data) {
    this.list.insertAt(this.list.count, data);
  }

  removeLast() {
    this.list.deleteLast();
  }

  isEmpty() {
    return this.list.count === 0;
  }
}

export { Deque };
