package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f9260a = p247y7.AbstractC7350t.b(android.os.Build.DEVICE, "layoutlib");

    /* JADX INFO: Access modifiers changed from: private */
    public static final R.j c(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            if (childAt instanceof R.j) {
                return (R.j) childAt;
            }
        }
        R.j jVar = new R.j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final F0.InterfaceC0924j d(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar) {
        return f9260a ? new R.c(jVar, z6, f6, b6, aVar, null) : new R.b(jVar, z6, f6, b6, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.ViewGroup e(android.view.View view) {
        java.lang.Object obj = view;
        while (!(obj instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = ((android.view.View) obj).getParent();
            if (!(parent instanceof android.view.View)) {
                throw new java.lang.IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (android.view.ViewGroup) obj;
    }
}
