function selectionSort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let min = arr[i];
    let index = i;
    for (let j = i; j < arr.length; j++) {
      let next = arr[j + 1];
      if (min > next) {
        min = next;
        index = j + 1;
      }
    }
    let temp = arr[i];
    arr[i] = min;
    arr[index] = temp;
  }
}

let arr = [4, 3, 2, 1];

console.log(arr);

selectionSort(arr);

console.log(arr);
