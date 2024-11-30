import Foundation

func solution(_ a:[Int], _ b:[Int]) -> Int {
    return zip(a,b).map(*).reduce(0,+)
    // zip 함수로 a,b 배열을 합친후 map 함수를 이용해 a($0) * b($0) 의 결과값으로 하는 새 배열을 만든 후
    // reduce 함수를 통해 배열의 모든 요소들의 합을 출력한다.
}