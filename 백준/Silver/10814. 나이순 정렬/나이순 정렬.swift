import Foundation

var n = Int(readLine()!)!
var people: [(age: Int, id: String)] = []

for i in 0..<n{
    let input = readLine()!.split(separator: " ")
    let age = Int(input[0])!, id = String(input[1])
    people.append((age,id))
}

people.sort{ $0.age < $1.age }
people.forEach{ print($0.age,$0.id) }
