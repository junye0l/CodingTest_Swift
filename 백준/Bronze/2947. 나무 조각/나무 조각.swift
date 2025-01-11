import Foundation

// 입력 받기
var n = readLine()!.split(separator: " ").map { Int($0)! }

while true {
    var swapped = false // 스왑 발생 여부 체크
    
    for i in 0..<n.count - 1 {
        if n[i] > n[i + 1] {
            n.swapAt(i, i + 1) // 두 숫자의 위치를 교환
            swapped = true
            print(n.map { String($0) }.joined(separator: " ")) // 현재 상태 출력
        }
    }
    
    if !swapped { // 더 이상 스왑이 발생하지 않으면 정렬 완료
        break
    }
}
