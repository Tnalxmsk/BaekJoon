import { Node } from "./node.mjs";

class LinkedList {
  constructor() {
    this.head = null;
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
      this.head = newNode;
    } else {
      let current = this.head;
      for (let i = 0; i < index - 1; i++) {
        current = current.next;
      }
      // 삽입될 인덱스 다음 노드를 새로운 노드의 next로 설정
      newNode.next = current.next;
      // 삽입될 인덱스 이전 노드의 next를 새로운 노드로 설정
      current.next = newNode;
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
      this.head = current.next;
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
      current.next = null;
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

export { LinkedList };
