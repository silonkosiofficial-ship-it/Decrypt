package p135n4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void a(android.animation.AnimatorSet animatorSet, java.util.List list) {
        int size = list.size();
        long jMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i6);
            jMax = java.lang.Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
