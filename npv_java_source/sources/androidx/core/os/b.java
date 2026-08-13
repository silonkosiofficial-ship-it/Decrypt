package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.core.os.b f21586a = new androidx.core.os.b();

    private b() {
    }

    public static final void a(android.os.Bundle bundle, java.lang.String str, android.util.Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(android.os.Bundle bundle, java.lang.String str, android.util.SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
