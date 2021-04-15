# splitting a word from another word to return the newly splitted word

def split(word1, word2):  # splitting the original word1
    result = word1 - word2
    return result


def main():
    print(split('carwash', 'wash'))
    print(split('strawberry', 'berry'))
    print(split('hotdog', 'dog'))
    print(split('hamburger', 'burger'))


if __name__ == '__main__':
    main()
