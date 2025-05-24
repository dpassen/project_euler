fn is_palindrome(s: &str) -> bool {
    s == s.chars().rev().collect::<String>()
}

fn project_4(min: u32, max: u32) -> Option<u32> {
    (min..=max)
        .flat_map(|x| (min..=max).map(move |y| x * y))
        .filter(|&product| is_palindrome(&product.to_string()))
        .max()
}

fn main() {
    if let Some(result) = project_4(100, 999) {
        println!("{result}");
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(project_4(10, 99), Some(9009));
    }
}
