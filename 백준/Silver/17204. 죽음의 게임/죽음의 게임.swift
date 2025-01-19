// 입력 처리
let firstLine = readLine()!.split(separator: " ").map { Int($0)! }
let N = firstLine[0] // 참여자 수
let K = firstLine[1] // 보성이의 번호

// 각 사람이 지목하는 사람의 번호 저장
var targets: [Int] = []
for _ in 0..<N {
    targets.append(Int(readLine()!)!)
}

// 현재 위치에서 시작하여 K에 도달하는지 확인
func findK() -> Int {
    var visited = Array(repeating: false, count: N) // 방문 체크 배열
    var current = 0 // 시작 위치 (영기 = 0번)
    var count = 0 // 이동 횟수
    
    visited[current] = true
    
    while true {
        let next = targets[current] // 다음 지목된 사람
        count += 1
        
        if next == K { // 보성이를 찾은 경우
            return count
        }
        
        if visited[next] { // 사이클이 발생한 경우
            return -1
        }
        
        visited[next] = true
        current = next
    }
}

// 결과 출력
print(findK())