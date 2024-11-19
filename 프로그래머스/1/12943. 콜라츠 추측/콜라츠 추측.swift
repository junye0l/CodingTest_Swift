func solution(_ num:Int) -> Int {
    var count: Int = 0
    var numx: Int = num
    // 입력된 수가 짝수라면 2로 나눈다.
    // 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
    // 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    // count가 몇인지 반환하고 500번이 넘어가면 -1을 반환한다.
    
    for _ in 0...500 {
        if numx % 2 == 0 {
            if numx != 1 {
                numx = numx / 2
                count += 1
            }else {
                continue
            }
        }else if numx % 2 != 0 {
            if numx != 1 {
                numx = (numx * 3) + 1
                count += 1
            }
        }
    }
    
    if count > 500 {
        count = -1        
    }
    
    return count
}