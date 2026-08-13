package p141o0;

/* JADX INFO: renamed from: o0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6954d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p141o0.C6954d0 f52192a = new p141o0.C6954d0();

    private C6954d0() {
    }

    public static final p151p0.c a(android.graphics.Bitmap bitmap) {
        p151p0.c cVarB;
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = p141o0.J.b(colorSpace)) == null) ? p151p0.g.f52623a.w() : cVarB;
    }

    public static final android.graphics.Bitmap b(int i6, int i10, int i11, boolean z6, p151p0.c cVar) {
        return android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i6, i10, p141o0.Q.d(i11), z6, p141o0.J.a(cVar));
    }
}
