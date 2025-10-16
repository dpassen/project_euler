fn problem_1(n: u32) -> u32 {
    (1..n)
        .filter(|&x| x.is_multiple_of(3) || x.is_multiple_of(5))
        .sum()
}

fn main() {
    let result = problem_1(1_000);
    println!("{result}");
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(problem_1(10), 23);
    }
}
