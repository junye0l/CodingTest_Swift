import Foundation


while let value = readLine()?.split(separator: " "), let x = Int(value[0]), let y = Int(value[1]) {
        if x == 0 && y == 0 {
            break
        }else {
            print("\(x+y)")
        }
    }


