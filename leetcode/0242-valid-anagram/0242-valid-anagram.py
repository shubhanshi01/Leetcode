class Solution(object):
    def isAnagram(self, s, t):
        s_new=sorted(s)
        t_new=sorted(t)
        if(s_new==t_new):
            return True
        return False
        