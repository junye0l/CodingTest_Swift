import Foundation

let number = Int(readLine()!)!
var people: [(weight: Int, height: Int)] = []

// 사람들의 키와 몸무게 정보 입력받기
for _ in 0..<number {
    let input = readLine()!.split(separator: " ").map { Int($0)! }
    let weight = input[0], height = input[1]
    people.append((weight, height))
}

// 각 사람의 등수 계산
var ranks: [Int] = []
for i in 0..<number {
    var rank = 1
    for j in 0..<number {
        // 자신보다 덩치가 큰 사람을 만나면 등수 증가
        if people[i].weight < people[j].weight && people[i].height < people[j].height {
            rank += 1
        }
    }
    ranks.append(rank)
}

// 최종 출력 (공백으로 구분된 등수들)
print(ranks.map { String($0) }.joined(separator: " "))