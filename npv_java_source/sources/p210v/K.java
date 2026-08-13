package p210v;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K0.v f55608a = new K0.v("MagnifierPositionInRoot", null, 2, null);

    public static final boolean a(float f6, float f10) {
        return (java.lang.Float.isNaN(f6) && java.lang.Float.isNaN(f10)) || f6 == f10;
    }

    public static final K0.v b() {
        return f55608a;
    }

    public static final boolean c(int i6) {
        return i6 >= 28;
    }

    public static /* synthetic */ boolean d(int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = android.os.Build.VERSION.SDK_INT;
        }
        return c(i6);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p210v.W w6) {
        if (d(0, 1, null)) {
            return dVar.b(new androidx.compose.foundation.MagnifierElement(lVar, lVar2, lVar3, f6, z6, j6, f10, f11, z10, w6 == null ? p210v.W.f55641a.a() : w6, null));
        }
        return dVar;
    }
}
