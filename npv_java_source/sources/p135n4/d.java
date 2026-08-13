package p135n4;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.Y f51496a = new p170r.Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p170r.Y f51497b = new p170r.Y();

    private static void a(p135n4.d dVar, android.animation.Animator animator) {
        if (animator instanceof android.animation.ObjectAnimator) {
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            dVar.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            dVar.f(objectAnimator.getPropertyName(), p135n4.e.a(objectAnimator));
        } else {
            throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static p135n4.d b(android.content.Context context, android.content.res.TypedArray typedArray, int i6) {
        int resourceId;
        if (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static p135n4.d c(android.content.Context context, int i6) {
        try {
            android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i6);
            if (animatorLoadAnimator instanceof android.animation.AnimatorSet) {
                return d(((android.animation.AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (java.lang.Exception e6) {
            java.lang.String str = "Can't load animation resource ID #0x" + java.lang.Integer.toHexString(i6);
            return null;
        }
    }

    private static p135n4.d d(java.util.List list) {
        p135n4.d dVar = new p135n4.d();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a(dVar, (android.animation.Animator) list.get(i6));
        }
        return dVar;
    }

    public void e(java.lang.String str, android.animation.PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f51497b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p135n4.d) {
            return this.f51496a.equals(((p135n4.d) obj).f51496a);
        }
        return false;
    }

    public void f(java.lang.String str, p135n4.e eVar) {
        this.f51496a.put(str, eVar);
    }

    public int hashCode() {
        return this.f51496a.hashCode();
    }

    public java.lang.String toString() {
        return '\n' + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.f51496a + "}\n";
    }
}
