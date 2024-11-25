func solution(_ phone_number: String) -> String {
    let realCount = phone_number.count - 4
    let stars = String(repeating: "*", count: realCount)
    let lastFour = phone_number.suffix(4)
    
    return stars + lastFour
}
