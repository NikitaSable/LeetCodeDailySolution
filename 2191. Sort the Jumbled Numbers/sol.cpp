class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        pairs = []

        for i,n in enumerate(nums):
            n = str(n)
            map_n = 0
            for c in n:
                map_n *= 10
                map_n += mapping[int(c)]

            pairs.append((map_n, i))

        pairs.sort()

        return [nums[i[1]] for i in pairs]
              
