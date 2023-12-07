
def minim(a):
    a = input().split()
    arr = list(map(int, a))
    print(min(arr))
minim(a)



def prog2():
    a = input().lower()
    b = input()
    if a == "int":
        print(int(b)*2)
    elif a == "real":
        print(f'{(float(b)*1.5):.2f}')
    elif a == "string":
        print(f'${b}$')
    else:
        print("Введите int real или string")


def multi():
    x = int(input())
    y = int(input())
    z = int(input())
    if x == 0 or y == 0 or z == 0:
        print('cola ZERO')
    elif (x > 0 and y > 0 and z > 0) or ((x < 0 and y < 0) or (y < 0 and z < 0) or (x < 0 and z < 0)):
        print('positive')
    else:
        print("negative")


def center():
    x1 = float(input())
    y1 = float(input())
    x2 = float(input())
    y2 = float(input())
    first = abs(x1) + abs(y1)
    second = abs(x2) + abs(y2)
    if second < first:
        print(f'({round(x2)},{round(y2)})')
    else:
        print(f'({round(x1)},{round(y1)})')


TASK 5


def chars_between(char1, char2):
    start = ord(char1)
    end = ord(char2)

    if start > end:
        char1, char2 = char2, char1
        start, end = end, start

    result = [chr(i) for i in range(start + 1, end)]

    return ' '.join(result)

char1 = input("Введите первый символ: ")
char2 = input("Введите второй символ: ")

result = chars_between(char1, char2)
print(result)
