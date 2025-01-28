import Foundation

// 테스트 케이스 개수 입력
if let T = Int(readLine()!) {
    for _ in 0..<T {
        // 각 테스트 케이스 입력 (R과 S)
        if let input = readLine()?.split(separator: " ").map({ String($0) }) {
            if let R = Int(input[0]) {
                let S = input[1]
                var P = ""

                // 문자열 S의 각 문자를 R번 반복
                for char in S {
                    P += String(repeating: char, count: R)
                }

                // 결과 출력
                print(P)
            }
        }
    }
}
