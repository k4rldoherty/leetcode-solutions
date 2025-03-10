def count_of_substrings(word, k):
    win_start = 0
    win_end = 5 + k
    vowels = "aeiou"
    res = 0
    if k == 0:
        for letter in word:
            if letter not in vowels:
                return 0
        return 1
    else:
        while win_end < len(word):
            consonant_count = 0
            vowels_in_subset = set()
            window = word[win_start:win_end]
            for letter in window:
                if letter in vowels:
                    vowels_in_subset.add(letter)
                else:
                    consonant_count+=1
            if len(vowels_in_subset) == 5 and consonant_count == k:
                res+=1
            win_start+=1
            win_end+=1
        return res

def main():
    tests = [["aeioqq", 1, 0], ["aeiou", 0, 1], ["ieaouqqieaouqq", 1, 3], ["iqeaouqi", 2, 3]]
    i = 1
    for t in tests:
        print(f"Running test {i}")
        res = count_of_substrings(t[0],t[1])
        if res != t[2]:
            print(f"Test failed\nInput: {t[0]}\nExpecting {t[2]}\nGot: {res}")
            return
        i+=1
    print("all tests passed, congrats!")

if __name__ == "__main__":
    main()
