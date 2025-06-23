function mergeSort(arr, leftIdx, rightIdx) {
  if (leftIdx < rightIdx) {
    let midIndex = parseInt((rightIdx + leftIdx) / 2);
    mergeSort(arr, leftIdx, midIndex);
    mergeSort(arr, midIndex + 1, rightIdx);
    merge(arr, leftIdx, midIndex, rightIdx);
  }
}

const merge = (arr, leftIdx, midIndex, rightIdx) => {
  let leftAreaIndex = leftIdx;
  let rightAreaIndex = midIndex + 1;

  let tempArr = [];
  tempArr.length = rightIdx + 1;
  tempArr.fill(0, 0, rightIdx + 1);

  let tempArrIndex = leftIdx;
  while (leftAreaIndex <= midIndex && rightAreaIndex <= rightIdx) {
    if (arr[leftAreaIndex] <= arr[rightAreaIndex]) {
      tempArr[tempArrIndex] = arr[leftAreaIndex++];
    } else {
      tempArr[tempArrIndex] = arr[rightAreaIndex++];
    }
    tempArrIndex++;
  }

  if (leftAreaIndex > midIndex) {
    for (let i = rightAreaIndex; i <= rightIdx; i++) {
      tempArr[tempArrIndex++] = arr[i];
    }
  } else {
    for (let i = leftAreaIndex; i <= midIndex; i++) {
      tempArr[tempArrIndex++] = arr[i];
    }
  }
  for (let i = leftIdx; i <= rightIdx; i++) {
    arr[i] = tempArr[i];
  }
};

let arr = [3, 5, 2, 4, 1, 7, 8, 6];

console.log(arr);

mergeSort(arr, 0, arr.length - 1);

console.log(arr);
