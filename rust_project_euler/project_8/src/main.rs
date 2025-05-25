use std::fs;

fn product_of_digits(chars: &[char]) -> u64 {
    chars
        .iter()
        .map(|c| c.to_digit(10).expect("Only numeric input is supported") as u64)
        .product()
}

fn project_8(file_path: &str, size: usize) -> Option<u64> {
    let chars: Vec<_> = fs::read_to_string(file_path)
        .expect("Requires a data file")
        .trim_end()
        .chars()
        .collect();
    chars[..].windows(size).map(product_of_digits).max()
}

fn main() {
    if let Some(result) = project_8("../../data_files/8.txt", 13) {
        println!("{result}");
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_example() {
        assert_eq!(project_8("../../data_files/8.txt", 4), Some(5832));
    }
}
