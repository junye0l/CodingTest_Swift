func solution(_ s: String) -> String {
    var result: String = ""
    let length = s.count
    let middleIndex = length / 2

    if length % 2 != 0 {
        // 홀수 길이 문자열 처리: 중간 문자 1개 가져오기
        let index = s.index(s.startIndex, offsetBy: middleIndex)
        result.append(s[index])
    } else {
        // 짝수 길이 문자열 처리: 중간 문자 2개 가져오기
        let firstIndex = s.index(s.startIndex, offsetBy: middleIndex - 1)
        let secondIndex = s.index(s.startIndex, offsetBy: middleIndex)
        result.append(s[firstIndex])
        result.append(s[secondIndex])
    }

    return result
}
