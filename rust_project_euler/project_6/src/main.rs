fn sum_of_squares(min: u32, max: u32) -> u32 {
    (min..=max).map(|x| x.pow(2)).sum()
}

fn square_of_sums(min: u32, max: u32) -> u32 {
    (min..=max).sum::<u32>().pow(2)
}

fn project_6(min: u32, max: u32) -> u32 {
    sum_of_squares(min, max).abs_diff(square_of_sums(min, max))
}

fn main() {
    let result = project_6(1, 100);
    println!("{result}");
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(project_6(1, 10), 2640);
    }
}
