import Foundation

if let input = readLine(), let number = Int(input) {
    if number % 4 == 0 && (number % 100 != 0 || number % 400 == 0) {
        print("1")
    }else {
        print("0")
    }
}

