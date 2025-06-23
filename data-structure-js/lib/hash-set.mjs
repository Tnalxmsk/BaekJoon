import { HashTable } from "./hash-table.mjs";

class HashSet {
  constructor() {
    this.hashTbale = new HashTable();
  }

  add(data) {
    if (this.hashTbale.get(data) === null) {
      this.hashTbale.set(data, -1);
    }
  }

  isContain(data) {
    return this.hashTbale.get(data) !== null;
  }

  remove(data) {
    this.hashTbale.remove(data);
  }

  clear() {
    for (let i = 0; i < this.hashTbale.table.length; i++) {
      this.hashTbale.table[i].clear();
    }
  }

  isEmpty() {
    let empty = true;
    for (let i = 0; i < this.hashTbale.table.length; i++) {
      if (this.hashTbale.table[i].count > 0) {
        empty = false;
        break;
      }
    }
    return empty;
  }

  printAll() {
    for (let i = 0; i < this.hashTbale.table.length; i++) {
      let current = this.hashTbale.table[i].head;
      while (current) {
        console.log(current.data.key)
        current = current.next;
      }
    }
  }
}

export { HashSet };
