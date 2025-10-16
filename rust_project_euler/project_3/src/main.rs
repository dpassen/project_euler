use std::collections::HashSet;

fn factors(n: u64) -> HashSet<u64> {
    let upper = n.isqrt();
    (1..=upper)
        .filter(|x| n.is_multiple_of(*x))
        .flat_map(|x| [x, n / x])
        .collect()
}

fn is_prime(n: u64) -> bool {
    let upper = n.isqrt();
    !(2..=upper).any(|x| !n.is_multiple_of(x))
}

fn problem_3(n: u64) -> Option<u64> {
    factors(n).into_iter().filter(|&x| is_prime(x)).max()
}

fn main() {
    if let Some(result) = problem_3(600_851_475_143) {
        println!("{result}");
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(problem_3(13_195), Some(29));
    }
}
