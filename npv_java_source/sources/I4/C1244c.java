package I4;

/* JADX INFO: renamed from: I4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1244c extends O3.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Throwable f5025D;

    C1244c(int i6, java.lang.Throwable th) {
        super(new com.google.android.gms.common.api.Status(i6, java.lang.String.format(java.util.Locale.ROOT, "Integrity API error (%d): %s.", java.lang.Integer.valueOf(i6), J4.a.a(i6))));
        if (i6 == 0) {
            throw new java.lang.IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f5025D = th;
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable getCause() {
        return this.f5025D;
    }
}
