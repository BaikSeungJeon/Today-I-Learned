// https://www.acmicpc.net/problem/20920

package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class 영단어_암기는_어려워_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            // m 길이 이상의 단어만 암기
            if (str.length() >= m) {
                // map에 담기, value ++ 없으면 새로 추가
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        // map의 key를 list<String> 형태로 생성
        List<String> words = new ArrayList<>(map.keySet());

        // 정렬
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 1. 자주 등장하는 단어 순서대로 정렬
                // Integer.compare -1, 0, 1 반환
                // 즉 0이 아니라면(두 단어 빈도 수가 다르면) 순서를 바꿈
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }

                // 단어 빈도수가 같으면
                // 2. 길이가 긴 단어 먼저 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                // 3. 사전 순서로 정렬
                // o1이 o2보다 앞 순서일 시: -1 반환
                // o1이 o2보다 이후 순서일 시: 1 반환
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String str: words) {
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}