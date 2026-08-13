package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static final android.graphics.ColorFilter a(long j6, int i6) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? p141o0.C6978l0.f52242a.a(j6, i6) : new android.graphics.PorterDuffColorFilter(p141o0.A0.k(j6), p141o0.F.c(i6));
    }

    public static final android.graphics.ColorFilter b(p141o0.AbstractC7019z0 abstractC7019z0) {
        return abstractC7019z0.a();
    }
}
