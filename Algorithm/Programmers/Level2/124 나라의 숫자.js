function solution(n) {
  let answer = '';
  let number = [4, 1, 2];
  
  while(n) {
      answer = number[n%3] + answer;
      n = n%3 === 0 ? n/3 -1 : Math.floor(n/3); 
  }
  
  return answer;
}