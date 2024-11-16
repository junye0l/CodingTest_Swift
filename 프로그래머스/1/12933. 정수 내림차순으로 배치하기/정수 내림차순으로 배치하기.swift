func solution(_ n:Int64) -> Int64 {
    
    var x = String(String(n).sorted(by: >))
    return Int64(x)!
    
}