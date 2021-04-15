# this project can help you to know if your number is odd or even and it only works with number that is under 100

def oddEven(n):  # give your function a name and parameter(s)
    if n < 100:
        return n % 2 == 0
    else:
        return n % 2 != 0


def main():
    print(oddEven(5))
    print(oddEven(10))
    print(oddEven(100))
    print(oddEven(1001))


if __name__ == '__main__':
    main()
