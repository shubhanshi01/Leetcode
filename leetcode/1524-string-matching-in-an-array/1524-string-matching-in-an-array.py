class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        def kmp(txt,pat):
            lps=[0]*len(pat)
            prevLps,i=0,1

            while i<len(pat):
                if(pat[i]==pat[prevLps]):
                    lps[i]=prevLps+1
                    prevLps+=1
                    i+=1

                elif prevLps==0:
                    lps[i]=0
                    i+=1
                else:
                    prevLps=lps[prevLps-1]
            i=j=0
            while i<len(txt):
                if txt[i]==pat[j]:
                    i+=1
                    j+=1
                else:
                    if j==0:
                        i+=1
                    else:
                        j=lps[j-1]
                if j==len(pat):
                    return i-len(pat)
            return -1

        res=[]

        words.sort(key=len)

        for i in range(len(words)):
             for j in range(i+1,len(words)):
                if kmp(words[j],words[i])!=-1:
                    res.append(words[i])
                    break
        return res

            
            






        