package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p073h2.K f45981a = new p073h2.K();

    private K() {
    }

    public final boolean a(int i6) {
        return android.util.Log.isLoggable("Paging", i6);
    }

    public final void b(int i6, java.lang.String str, java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(str, "message");
        if (i6 == 2 || i6 == 3) {
            return;
        }
        throw new java.lang.IllegalArgumentException("debug level " + i6 + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
