class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = defaultdict(list)
        for s in strs:
            sortedstr=''.join(sorted(s))
            res[sortedstr].append(s)

        return list(res.values())
