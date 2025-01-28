import Foundation

// 첫 번째 입력: N과 X
if let firstInput = readLine()?.split(separator: " "),
   let N = Int(firstInput[0]),
   let X = Int(firstInput[1]) {
    
    // 두 번째 입력: 수열 A
    if let secondInput = readLine()?.split(separator: " ") {
        let A = secondInput.compactMap { Int($0) } // 문자열 배열을 Int 배열로 변환
        
        // 결과를 저장할 배열
        var result: [Int] = []
        
        // A의 요소 중 X보다 작은 값만 추가
        for number in A {
            if number < X {
                result.append(number)
            }
        }
        
        // 결과 출력
        print(result.map { String($0) }.joined(separator: " "))
    }
}
