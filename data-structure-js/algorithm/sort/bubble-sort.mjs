function BubbleSort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = 0; j < arr.length - i - 1; j++) {
      let current = arr[j];
      let next = arr[j + 1];
      if (current > next) {
        let temp = next;
        arr[j + 1] = current;
        arr[j] = next;
      }
    }
  }
}

let arr = [4, 3, 2, 1];

console.log(arr);

BubbleSort(arr);

console.log(arr);
