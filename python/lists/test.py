# @desc Predict the returned result
# by Bruno '24

def function_name(x, y):
    new_list = 0
    for char in range(0, x):
        new_list += y
    return new_list


def main():
    print(function_name(5, 3))
    print(function_name(10, 4))
    print(function_name(15, 2))
    print(function_name(20, 1))


if __name__ == '__main__':
    main()
