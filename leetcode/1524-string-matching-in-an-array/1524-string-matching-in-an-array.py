class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        ans=set()
        for word in words:
            for otherword in words:
                if(word!=otherword and word in otherword):
                    ans.add(word)

        return list(ans)

            
            






        