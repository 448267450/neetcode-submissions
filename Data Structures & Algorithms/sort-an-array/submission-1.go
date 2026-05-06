func sortArray(nums []int) []int {
    countingSort(nums)
    return nums
}

func countingSort(nums []int){
    count := make(map[int]int)
    minVal, maxVal := nums[0], nums[0]

    for _, val := range nums{
        count[val]++;
        if val < minVal{
            minVal = val
        }
        if val > maxVal {
            maxVal = val
        }
    }

    index := 0

    for val := minVal; val <= maxVal; val++{
        for count[val] > 0{
            nums[index] = val
            index++
            count[val]--
        }
    }
}
