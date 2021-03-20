import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate1True() {
        int[] nums = {1,2,3,1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void containsDuplicate2False() {
        int[] nums = {1,2,3,4};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void containsDuplicate3True() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void containsDuplicate4False() {
        int[] nums = {-1,1,-141,3,-3,4,31,27,-4,2};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }
}
