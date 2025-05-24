fn problem_1(n: i32) -> i32 {
    (1..n).filter(|x| x % 3 == 0 || x % 5 == 0).sum()
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
