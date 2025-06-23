import { Node } from "./node.mjs";

class DoubleLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.count = 0;
  }

  printAll() {
    let current = this.head;
    let text = "[";
    while (current) {
      text += current.data;
      current = current.next;
      if (current !== null) {
        text += ", ";
      }
    }
    text += "]";
    console.log(text);
  }

  clear() {
    this.head = null;
    this.count = 0;
  }

  insertAt(index, data) {
    // count보다 index가 큰 경우
    if (index < 0 || index > this.count) {
      throw new Error('Index is out of range');
    }
    let newNode = new Node(data);

    if (index === 0) {
      newNode.next = this.head;
      if (this.head !== null) {
        this.head.prev = newNode;
      }
      this.head = newNode;
    } else if (index === this.count) {
      newNode.next = null;
      newNode.prev = this.tail;
      this.tail.next = newNode;
    } else {
      let current = this.head;
      for (let i = 0; i < index - 1; i++) {
        current = current.next;
      }
      // 삽입될 인덱스의 다음 노드를 새로운 노드의 next로 설정
      newNode.prev = current;
      newNode.next = current.next;
      // 삽입될 인덱스의 이전 노드의 next를 새로운 노드로 설정
      current.next = newNode;
      current.next.prev = newNode;
    }
    if (newNode.next === null) {
      this.tail = newNode;
    }
    this.count++;
  }

  insertLast(data) {
    this.insertAt(this.count, data);
  }

  deleteAt(index) {
    if (index < 0 || index > this.count) {
      throw new Error('Index is out of range');
    }
    let current = this.head;
    if (index === 0) {
      let deletedNode = this.head;
      if (this.head.next === null) {
        this.head = null;
        this.tail = null;
      } else {
        this.head = this.head.next;
        this.head.prev = null;
      }
      this.count--;
      return deletedNode;
    } else if (index === this.count - 1) {
      let deletedNode = this.tail;
      this.tail.prev.next = null;
      this.tail = this.tail.prev;
      this.count--;
      return deletedNode;
    } else {
      // 제거할 인덱스 직전까지 이동
      for (let i = 0; i < index - 1; i++) {
        current = current.next;
      }
      // 제거할 인덱스 직전 노드의 next를 재거할 인덱스 다음 노드로 설정
      let deletedNode = current.next;
      current.next = current.next.next;
      current.next.prev = current;
      this.count--;
      return deletedNode;
    }
  }

  deleteLast() {
    return this.deleteAt(this.count - 1);
  }

  getNodeAt(index) {
    if (index < 0 || index > this.count) {
      throw new Error('Index is out of range');
    }
    let current = this.head;
    for (let i = 0; i < index; i++) {
      current = current.next;
    }
    return current;
  }
}

export { DoubleLinkedList };
