const quickSort = (arr, leftIndex, rightIndex) => {
  if (leftIndex <= rightIndex) {
    let pivot = divide(arr, leftIndex, rightIndex);
    quickSort(arr, leftIndex, pivot - 1);
    quickSort(arr, pivot + 1, rightIndex);
  }
};

const divide = (arr, left, right) => {
  let pivot = arr[left];
  let leftIndex = left;
  let rightIndex = right;
  while (leftIndex < rightIndex) {
    while (leftIndex <= right && right && pivot >= arr[leftIndex]) {
      leftIndex++;
    }

    while (rightIndex >= left + 1 && pivot <= arr[rightIndex]) {
      rightIndex--;
    }

    if (leftIndex <= rightIndex) {
      swap(arr, leftIndex, rightIndex);
    }
  }

  swap(arr, left, rightIndex);

  return rightIndex;
};

const swap = (arr, index1, index2) => {
  let temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
};

let arr = [5, 3, 7, 2, 6, 4, 9, 1, 8];

console.log(arr);

quickSort(arr, 0, arr.length - 1);

console.log(arr);

// left가 피벗보다 큰 값을 만날 때까지 이동

// right가 피벗보다 작은 값을 만날 때까지 이동

// Left와 right 둘 다 멈추면 값 교환

// 이 과정 반복

// 서로 지나치면 더 이상 진행 x

// 이때 피벗과 right 인덱스의 값을 교환
