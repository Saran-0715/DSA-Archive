int majorityElement(int* nums, int numsSize) {
    int m=nums[0];
    int c=1;
    for(int i=1;i<numsSize;i++)
    {
        if(nums[i]==m)
        {
            c++;
        }
        else
        {
            c--;
        }
        if(c==0)
        {
            m=nums[i];
            c=1;
        }
    }
    return m;

}