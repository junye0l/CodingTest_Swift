import Foundation

func solution(_ absolutes:[Int], _ signs:[Bool]) -> Int {
    var result: Int = 0
    
    for i in 0..<signs.count {
        result += signs[i] == true ? absolutes[i] : -absolutes[i]
    }
    
    return result
}

