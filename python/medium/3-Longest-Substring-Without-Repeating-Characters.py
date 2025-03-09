
def length_of_longest_substring(s):
    max_count = 1
    if len(s) < 2:
        return len(s)

    for i in range(0, len(s) - 1):
        j = i+1
        if s[j] == s[i]:
            continue
        substr = [s[i]]
        while j < len(s) and s[j] not in substr:
            substr.append(s[j])
            j+=1
        if len(substr) > max_count:
            max_count = len(substr)
    return max_count



def main():
    tests = [["abcabcbb", 3], ["bbbb", 1], ["pwwkew", 3]]
    for i in range(0, len(tests)):
        res = length_of_longest_substring(tests[i][0])
        if res != tests[i][1]:
            print(f"Test Failed.\nInput: {tests[i][0]}\nExpected: {tests[i][1]}. Actual: {res}")
            return
    print("All tests passsed, congrats!")

if __name__ == "__main__":
    main()
