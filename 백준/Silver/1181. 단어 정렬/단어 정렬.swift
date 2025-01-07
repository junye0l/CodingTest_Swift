import Foundation

var counts: Int = Int(readLine()!)!
var words: [String] = []

for i in 0..<counts {

    words.append(readLine()!)
      
}

words = Array(Set(words))

words.sort{ $0.count == $1.count ? $0 < $1 : $0.count < $1.count}

words.forEach{ print($0) }

