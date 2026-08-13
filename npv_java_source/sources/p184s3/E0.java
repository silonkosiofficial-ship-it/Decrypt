package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f54127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.D0 f54128b;

    public E0(p184s3.D0 d6) {
        java.lang.String strD;
        this.f54128b = d6;
        try {
            strD = d6.d();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            strD = null;
        }
        this.f54127a = strD;
    }

    public final java.lang.String toString() {
        return this.f54127a;
    }
}
