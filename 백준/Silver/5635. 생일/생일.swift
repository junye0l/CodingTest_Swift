import Foundation

// 총 인원 수 입력
guard let total = Int(readLine()!), total > 0 else {
    print("잘못된 입력입니다. 양의 정수를 입력하세요.")
    exit(1)
}

var people: [(name: String, dd: Int, mm: Int, yyyy: Int)] = []

for _ in 0..<total {
    // 한 줄의 입력을 받아서 공백으로 나누기
    let input = readLine()!.split(separator: " ")
    
    // 입력값 유효성 검사
    if input.count == 4,
       let name = String(input[0]) as String?,
       let dd = Int(input[1]),
       let mm = Int(input[2]),
       let yyyy = Int(input[3]) {
        people.append((name, dd, mm, yyyy))
    } else {
        print("입력이 잘못되었습니다. 다시 시도하세요.")
        exit(1)
    }
}

// 나이를 계산하기 위한 정렬 기준 정의
people.sort { 
    if $0.yyyy != $1.yyyy {
        return $0.yyyy < $1.yyyy
    } else if $0.mm != $1.mm {
        return $0.mm < $1.mm
    } else {
        return $0.dd < $1.dd
    }
}

// 가장 나이가 많은 사람과 적은 사람 선택
let youngest = people.last! // 리스트의 마지막
let oldest = people.first! // 리스트의 첫 번째

// 결과 출력
print(youngest.name) // 가장 나이가 적은 사람
print(oldest.name)   // 가장 나이가 많은 사람
