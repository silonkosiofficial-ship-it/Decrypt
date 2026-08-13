package p184s3;

/* JADX INFO: loaded from: classes.dex */
final class A1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p184s3.B1 f54122C;

    A1(p184s3.B1 b6) {
        this.f54122C = b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p184s3.B1 b6 = this.f54122C;
        if (b6.f54124C != null) {
            try {
                b6.f54124C.F(1);
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Could not notify onAdFailedToLoad event.", e6);
            }
        }
    }
}
