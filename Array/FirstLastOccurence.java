class FirstLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            findFirstOccurrence(nums, target),
            findLastOccurrence(nums, target)
        };
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                firstIndex = mid;
            }
        }

        return firstIndex;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                lastIndex = mid;
            }
        }

        return lastIndex;
    }
}