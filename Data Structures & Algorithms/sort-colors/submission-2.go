func sortColors(nums []int) {
    count := make([]int, 3)
    for _, num := range nums{
        count[num]++
    }

    idx := 0
    for i := 0; i < 3; i++ {
        for count[i] > 0 {
            count[i]--
            nums[idx] = i
            idx++
        }
    }
}
