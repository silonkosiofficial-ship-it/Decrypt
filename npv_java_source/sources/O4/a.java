package O4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends O4.b {
    public static int a(int i6, int i10, int i11) {
        M4.h.f(i10 <= i11, "min (%s) must be less than or equal to max (%s)", i10, i11);
        return java.lang.Math.min(java.lang.Math.max(i6, i10), i11);
    }
}
