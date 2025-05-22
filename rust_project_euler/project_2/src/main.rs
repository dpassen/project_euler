struct Fibonacci {
    current: u32,
    next: u32,
}

impl Iterator for Fibonacci {
    type Item = u32;

    fn next(&mut self) -> Option<Self::Item> {
        let current = self.current;

        self.current = self.next;
        self.next = current + self.next;

        Some(current)
    }
}

fn fibonacci() -> Fibonacci {
    Fibonacci {
        current: 0,
        next: 1,
    }
}

fn main() {
    let result: u32 = fibonacci()
        .take_while(|&x| x <= 4_000_000)
        .filter(|&x| x % 2 == 0)
        .sum();
    println!("{result}");
}
