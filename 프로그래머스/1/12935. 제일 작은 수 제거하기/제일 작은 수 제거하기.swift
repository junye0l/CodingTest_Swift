func solution(_ arr:[Int]) -> [Int] {
    var result: [Int] = arr
    guard let minvalue = arr.min() else { return [-1] }
    if result.isEmpty {
        result = [-1]
    }else {
        result = arr.filter{ $0 != minvalue}
    }
    return result
}