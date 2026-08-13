package R0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R0.z f9356a = R0.D.a();

    public R0.H a(R0.F f6, R0.w wVar, p237x7.l lVar, p237x7.l lVar2) {
        android.graphics.Typeface typefaceB;
        R0.AbstractC1494h abstractC1494hC = f6.c();
        if (abstractC1494hC == null ? true : abstractC1494hC instanceof R0.C1492f) {
            typefaceB = this.f9356a.a(f6.e(), f6.d());
        } else {
            if (!(abstractC1494hC instanceof R0.u)) {
                return null;
            }
            typefaceB = this.f9356a.b((R0.u) f6.c(), f6.e(), f6.d());
        }
        return new R0.H.a(typefaceB, false, 2, null);
    }
}
