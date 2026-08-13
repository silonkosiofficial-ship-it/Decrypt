package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f53366a = new java.lang.Object();

    public static final java.lang.Object c(p170r.Z z6, int i6) {
        java.lang.Object obj;
        p247y7.AbstractC7350t.f(z6, "<this>");
        int iA = p180s.a.a(z6.f53351D, z6.f53353F, i6);
        if (iA < 0 || (obj = z6.f53352E[iA]) == f53366a) {
            return null;
        }
        return obj;
    }

    public static final java.lang.Object d(p170r.Z z6, int i6, java.lang.Object obj) {
        java.lang.Object obj2;
        p247y7.AbstractC7350t.f(z6, "<this>");
        int iA = p180s.a.a(z6.f53351D, z6.f53353F, i6);
        return (iA < 0 || (obj2 = z6.f53352E[iA]) == f53366a) ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p170r.Z z6) {
        int i6 = z6.f53353F;
        int[] iArr = z6.f53351D;
        java.lang.Object[] objArr = z6.f53352E;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            java.lang.Object obj = objArr[i11];
            if (obj != f53366a) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        z6.f53350C = false;
        z6.f53353F = i10;
    }
}
