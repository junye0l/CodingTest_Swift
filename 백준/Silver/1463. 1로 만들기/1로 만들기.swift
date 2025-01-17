let num = Int(readLine()!)!
var numArr = Array(repeating: 0, count: num+1)

for i in 2..<num+1 {
    numArr[i] = numArr[i-1] + 1

    if i % 3 == 0 {
        numArr[i] = min(numArr[i], numArr[i / 3] + 1)
    }
    if i % 2 == 0 {
        numArr[i] = min(numArr[i], numArr[i / 2] + 1)
    }
}
print(numArr[num])