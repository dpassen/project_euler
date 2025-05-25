fn gcd(a: i64, b: i64) -> i64 {
    if b == 0 { a } else { gcd(b, a % b) }
}

fn lcm(a: i64, b: i64) -> i64 {
    (a * b).abs() / gcd(a, b)
}

fn project_5(min: i64, max: i64) -> Option<i64> {
    (min..=max).reduce(lcm)
}

fn main() {
    if let Some(result) = project_5(1, 20) {
        println!("{result}");
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(project_5(1, 10), Some(2520));
    }
}
