struct Fibonacci {
    current: u32,
    next: u32,
}

impl Iterator for Fibonacci {
    type Item = u32;

    fn next(&mut self) -> Option<Self::Item> {
        let current = self.current;

        self.current = self.next;
        self.next += current;

        Some(current)
    }
}

fn fibonacci() -> Fibonacci {
    Fibonacci {
        current: 0,
        next: 1,
    }
}

fn problem_2(n: u32) -> u32 {
    fibonacci()
        .take_while(|&x| x < n)
        .filter(|&x| x % 2 == 0)
        .sum()
}

fn main() {
    let result = problem_2(4_000_000);
    println!("{result}");
}
