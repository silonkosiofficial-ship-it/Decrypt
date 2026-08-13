package p184s3;

/* JADX INFO: renamed from: s3.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC7143w1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p184s3.BinderC7146x1 f54343C;

    RunnableC7143w1(p184s3.BinderC7146x1 binderC7146x1) {
        this.f54343C = binderC7146x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p184s3.BinderC7152z1 binderC7152z1 = this.f54343C.f54345C;
        if (binderC7152z1.f54355C != null) {
            try {
                binderC7152z1.f54355C.F(1);
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Could not notify onAdFailedToLoad event.", e6);
            }
        }
    }
}
