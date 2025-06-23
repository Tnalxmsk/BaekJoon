import { LinkedList } from "./linked-list.mjs";

// First In Last Out
// 선입 후출
class Stack {
  constructor() {
    this.list = new LinkedList();
  }

  // 모든 데이터 출력
  printAll() {
    this.list.printAll();
  }

  // 데이터 삽입
  push(data) {
    this.list.insertAt(0, data);
  }

  // 데이터 삭제
  pop() {
    try {
      return this.list.deleteAt(0);
    } catch (e) {
      return null;
    }
  }

  peek() {
    return this.list.getNodeAt(0);
  }

  isEmpty() {
    return this.list.count === 0;
  }
}

export { Stack };
