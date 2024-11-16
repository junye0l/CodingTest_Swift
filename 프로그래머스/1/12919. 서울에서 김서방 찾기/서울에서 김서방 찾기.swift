func solution(_ seoul:[String]) -> String {
    var result: String = ""
    if let index = seoul.firstIndex(of: "Kim"){ // 첫 번째 인덱스 번호를 반환
        result = "김서방은 \(index)에 있다"
    }
    return result
}