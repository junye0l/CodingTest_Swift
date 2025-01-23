import Foundation

// 결혼식에 초대할 친구 수를 계산하는 함수
func solution() {
    // 상근이의 동기 수를 입력받음 (총 학생 수)
    let n = Int(readLine()!)!
    
    // 친구 관계 리스트의 길이 입력 (친구 관계의 총 개수)
    let m = Int(readLine()!)!
    
    // 친구 관계를 저장할 그래프 생성
    var graph = [Int: [Int]]()
    for i in 1...n {
        graph[i] = []
    }
    
    // 친구 관계 입력 받기
    for _ in 1...m {
        let input = readLine()!.split(separator: " ").map { Int($0)! }
        let a = input[0]
        let b = input[1]
        
        // 서로의 친구 목록에 상대방 추가 (양방향 관계)
        graph[a]?.append(b)
        graph[b]?.append(a)
    }
    
    // 초대 받은 사람을 표시할 방문 배열 생성
    var visited = Array(repeating: false, count: n + 1)
    visited[1] = true  // 상근이(1번)는 이미 방문(초대) 상태로 표시
    
    // 상근이의 직접적인 친구들
    var invitedCount = 0
    
    // 상근이의 직접적인 친구들 초대
    for friend in graph[1] ?? [] {
        if !visited[friend] {
            visited[friend] = true
            invitedCount += 1
        }
    }
    
    // 친구의 친구들 초대
    for friend in graph[1] ?? [] {
        for friendOfFriend in graph[friend] ?? [] {
            if !visited[friendOfFriend] {
                visited[friendOfFriend] = true
                invitedCount += 1
            }
        }
    }
    
    // 최종 초대된 친구 수 출력
    print(invitedCount)
}

// 프로그램 실행
solution()