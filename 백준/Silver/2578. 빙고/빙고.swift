// 빙고판과 체크된 숫자들을 저장할 배열
var board = [[Int]]()
var checked = [[Bool]](repeating: [Bool](repeating: false, count: 5), count: 5)

// 빙고 개수를 세는 함수
func countBingo() -> Int {
    var bingo = 0
    
    // 가로, 세로 확인
    for i in 0..<5 {
        if checked[i].filter({ $0 }).count == 5 { bingo += 1 }
        if (0..<5).filter({ checked[$0][i] }).count == 5 { bingo += 1 }
    }
    
    // 대각선 확인
    if (0..<5).filter({ checked[$0][$0] }).count == 5 { bingo += 1 }
    if (0..<5).filter({ checked[$0][4-$0] }).count == 5 { bingo += 1 }
    
    return bingo
}

// 숫자를 체크하는 함수
func mark(_ number: Int) {
    for i in 0..<5 {
        for j in 0..<5 where board[i][j] == number {
            checked[i][j] = true
            return
        }
    }
}

// 빙고판 입력
for _ in 0..<5 {
    board.append(readLine()!.split(separator: " ").map { Int($0)! })
}

// 부를 숫자들 입력
var numbers: [Int] = []
for _ in 0..<5 {
    numbers += readLine()!.split(separator: " ").map { Int($0)! }
}

// 숫자를 하나씩 부르면서 빙고 확인
for i in 0..<numbers.count {
    mark(numbers[i])
    if countBingo() >= 3 {
        print(i + 1)
        break
    }
}