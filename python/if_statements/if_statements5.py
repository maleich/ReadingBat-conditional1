# @desc Even or odd?

def odd_even(n):  # give your function a name and parameter(s)
    if n < 100:
        return n % 2 == 0
    else:
        return n % 2 != 0


def main():
    print(odd_even(5))
    print(odd_even(10))
    print(odd_even(100))
    print(odd_even(1001))


if __name__ == '__main__':
    main()
