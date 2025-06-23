const insertionSort = (arr) => {
  // 0번째 인덱스 정렬되어 있다고 가정하고 그 앞인 1번부터 시작
  for (let i = 1; i < arr.length; i++) {
    // 비교를 시작할 값
    let currentValue = arr[i];
    let j;

    // i의 뒤부터 감소하면서 비교
    for (j = i - 1; j >= 0; j--) {
      // 비교할 값이 j번째 값보다 작다면
      if (currentValue < arr[j]) {
        // j 다음 값을 j값으로 덮어 씌움
        arr[j + 1] = arr[j];
        // 만약 j번째 값이 더 작다면 탈출
      } else {
        break;
      }
    }
    // j의 다음 위치에 비교를 수행했던 값을 덮어 씌움
    arr[j + 1] = currentValue;
  }
};

let arr = [4, 1, 5, 3, 6, 2];

console.log(arr);

insertionSort(arr);

console.log(arr);
