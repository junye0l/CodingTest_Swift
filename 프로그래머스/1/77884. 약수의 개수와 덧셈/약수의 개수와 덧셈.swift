import Foundation

func solution(_ left:Int, _ right:Int) -> Int {

    var result: Int = 0 // 총 합
    
    for i in left...right {
        var measure: Int = 0 // 약수의 갯수 초기값
        for j in 1...i{
            if i % j == 0 {
                measure += 1
            }
        }
        
        if measure % 2 == 0 {
            result += i
        }else {
            result -= i
        }
    }
    
    return result
    
}






