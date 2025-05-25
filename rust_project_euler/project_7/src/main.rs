fn is_prime(n: u32) -> bool {
    let upper = n.isqrt();
    (2..=upper).all(|x| n % x != 0)
}

fn project_7(n: usize) -> Option<u32> {
    (1..).filter(|&x| is_prime(x)).nth(n)
}

fn main() {
    if let Some(result) = project_7(10_001) {
        println!("{result}");
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(project_7(6), Some(13));
    }
}
