def merge_sort(array, start, end):
    if start < end:
        middle = (start + end - 1) // 2
        merge_sort(array, start, middle)
        merge_sort(array, middle + 1, end)
        merge(array, start, middle, end)


def merge(array, start, middle, end):
    first_size = middle - start + 1
    second_size = end - middle
    first_array = list(range(first_size))
    second_array = list(range(second_size))
    for i in range(first_size):
        first_array[i] = array[start + i]
    for i in range(second_size):
        second_array[i] = array[middle + 1 + i]

    i = j = 0
    k = start
    while i < first_size and j < second_size:
        if first_array[i] <= second_array[j]:
            array[k] = first_array[i]
            i += 1
        else:
            array[k] = second_array[j]
            j += 1
        k += 1

    while i < first_size:
        array[k] = first_array[i]
        i += 1
        k += 1

    while j < second_size:
        array[k] = second_array[j]
        j += 1
        k += 1
