const factorial = (n) => {
  if (n === 0 || n === 1) {
    return 1;
  } else {
    return n * factorial(n - 1);
  }
};

/*console.log(factorial(5));

const arr = [1, 2, 3, 4, 5];*/

// array.length - 1 전달

const sumOfArray = (arr, currentIndex) => {
  if (currentIndex < 0 || arr.length === 0) {
    return 0;
  } else {
    return arr[currentIndex] + sumOfArray(arr, currentIndex - 1);
  }
};

const sumOfArray2 = (arr) => {
  if (arr.length === 1) {
    return arr[0];
  } else {
    return sumOfArray2(arr.slice(0, -1)) + arr[arr.length - 1];
  }
};

/*const start = performance.now();
console.log(sumOfArray2(arr));
const end = performance.now();
console.log(`Execution time: ${end - start} ms`);

const start2 = performance.now();
console.log(sumOfArray(arr, arr.length - 1));
const end2 = performance.now();
console.log(`Execution time: ${end2 - start2} ms`);*/

const length = (str) => {
  if (str === "") {
    return 0;
  } else {
    return 1 + length(str.slice(0, -1))
  }
}

/*console.log(length("안녕 안녕")) // 20*/

const exponentiation = (n, m) => {
  if (m === 0) {
    return 1;
  } else {
    return n * exponentiation(n, m - 1);
  }
}

// console.log(exponentiation(2, 10))

const hanoi = (items, start, target, middle) => {
  if (items === 0) {
  } else {
    hanoi(items -1, start, middle, target)
    console.log(`Move disk ${items} from ${start} to ${target}`);
    hanoi(items - 1, middle, target, start);
  }
}

// console.log(hanoi(3, 'A', 'C', 'B'))
