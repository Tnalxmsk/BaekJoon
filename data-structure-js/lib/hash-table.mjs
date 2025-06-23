import { DoubleLinkedList } from "./double-linked-list.mjs";

class HashData {
  constructor(key, value) {
    this.key = key;
    this.value = value;
  }
}

class HashTable {
  constructor() {
    this.table = [];
    for (let i = 0; i < 10; i++) {
      this.table[i] = new DoubleLinkedList();
    }
  }

  hash(number) {
    return number % 10;
  }

  set(key, value) {
    let index = this.hash(key);
    let data = new HashData(key, value);
    this.table[index].insertAt(0, data);
  }

  get(key) {
    let index = this.hash(key);
    let current = this.table[index].head;
    while (current !== null) {
      if (current.data.key === key) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  remove(key) {
    let index = this.hash(key);
    let current = this.table[index].head;
    let deletedIndex = 0;
    while (current !== null) {
      if (current.data.key === key) {
        return this.table[index].deleteAt(deletedIndex);
      }
      current = current.next;
      deletedIndex++;
    }
    return null;
  }
}

export { HashTable };
