import Foundation

if let input = readLine()?.split(separator: " ").map({ String($0) }),
   let x = Int(input[0]),
   let y = Int(input[1]) {
    
    print("\(x*y)")
}