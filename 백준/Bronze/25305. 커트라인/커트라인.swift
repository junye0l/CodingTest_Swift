import Foundation

let input = readLine()!.split(separator: " ").map{Int ($0)!}

let n = input[0], p = input[1]

let numbers = readLine()!.split(separator: " ").map { Int($0)!}.sorted(by : >)


print(numbers[p-1])

