import Foundation

var numberArray: [Int] = []
var maxnumber: Int = 0
var indexnumber: Int = 0

for _ in 1...9 {
    var numbers: Int = Int(readLine()!)!
    numberArray.append(numbers)
}

maxnumber = numberArray.max()!
indexnumber = numberArray.firstIndex(of: maxnumber)!

print("\(maxnumber)")
print("\(indexnumber+1)")

