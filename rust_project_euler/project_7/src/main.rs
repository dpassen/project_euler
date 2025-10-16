fn is_prime(n: u32) -> bool {
    let upper = n.isqrt();
    !(2..=upper).any(|x| n.is_multiple_of(x))
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
