import Foundation

if let input = readLine(), let number = Int(input) {
    for i in 0...number {
        if let value = readLine()?.split(separator: " "), let x = Int(value[0]), let y = Int(value[1]) {
            print("\(x+y)")
        }
    }
}
