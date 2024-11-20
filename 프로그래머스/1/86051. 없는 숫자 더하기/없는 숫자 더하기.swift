import Foundation

func solution(_ numbers:[Int]) -> Int {
    // 0부터 0까지 합이 45
    // 입력 배열의 합을 45에 빼주면 없는 요소들의 합이 나올 것 같음.
    var result: Int = 0
    result = 45 - numbers.reduce(0,+)
    return result
}