func majorityElement(nums []int) int {
    n := len(nums)

    for{
        candidate := nums[rand.Intn(n)]
        count := 0
        for _, num := range nums{
            if num == candidate{
                count++
            }
        }
        if count > n/2{
            return candidate
        }
    }
}
