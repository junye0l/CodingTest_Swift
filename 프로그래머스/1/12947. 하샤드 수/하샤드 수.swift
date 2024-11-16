func solution(_ x:Int) -> Bool {
    var y: Int = 0
    for i in String(x) {
        y += Int(String(i))!
    }
    return x % y == 0 ? true : false
}