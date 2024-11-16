func solution(_ arr: [Int], _ divisor: Int) -> [Int] {
    var arr2: [Int] = []
    
    for num in arr {
        if num % divisor == 0 {
            arr2.append(num) // 나누어 떨어지는 숫자를 배열에 추가
        }
    }
    
    // 나누어 떨어지는 숫자가 없으면( 빈 배열인지 확인 ) [-1] 반환
    if arr2.isEmpty { //
        return [-1]
    }
    
    // 결과 배열을 오름차순으로 정렬하여 반환
    return arr2.sorted()
}
