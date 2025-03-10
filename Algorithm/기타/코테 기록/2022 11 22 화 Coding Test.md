# 백준

## factorial()
```js
const factorial = (n) => {
  let result = 1;

  // n * (n-1) * (n-2) * ... * 1
  for(let i = n; i >= 1; i--){
    result *= i;
  }

  return result;
}
```

## isPrime()
```js
const isPrime = (n) => {
  if(n === 1) return false;

  for(let i = 2; i <= Math.sqrt(n); i++){
    if(n % i === 0) return false;
  }

  return true;
}
```

## 최대공약수 최소공배수
```js
const G = (n, m) => m === 0 ? n : G(m, n % m)
const L = (n, m) => (n * m) / G(n, m)
```

## 이진탐색
```js
const binarySearch = (list, target, left, right, mid) => {
  mid = Math.floor((left + right) / 2); // 중간값

  if (right < left) {
    return list[mid] == target ? 1 : 0;
  }

  // 중간값보다 타겟이 작으면
  if (list[mid] > target) {
    // 중간값보다 큰 수는 더 이상 범위에 해당하지 않아 right 값은 mid - 1
    right = mid - 1;

  // 중간값보다 타겟이 크면
  } else {
    // 중간값보다 작은 수는 더 이상 범위에 해당하지 않아 left 값은 mid + 1
    left = mid + 1;
  }

  return binarySearch(list, target, left, right, mid);
}
```

https://www.acmicpc.net/submit/1920 해당 문제를 풀며, 시간 초과가 나 찾아본 알고리즘 문제입니다. 해당 문제는 <code>이진 탐색</code>을 이용해 해결했습니다.

이진 탐색은 정렬되어 있는 배열을 필요로 하며, <code>left</code> <code>right</code> <code>mid</code>의 변수가 필요합니다.

<code>left</code>: 왼쪽 끝 인덱스(<code>low</code>, <code>start</code> 등)
<code>right</code>: 오른쪽 끝 인덱스(<code>high</code>, <code>end</code> 등)
<code>mid</code>: left와 right의 탐색 범위

시간 복잡도: O(logN)