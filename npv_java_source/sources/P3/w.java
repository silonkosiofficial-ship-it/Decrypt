package P3;

/* JADX INFO: loaded from: classes.dex */
final class w implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p105k4.l f8324C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ P3.y f8325D;

    w(P3.y yVar, p105k4.l lVar) {
        this.f8325D = yVar;
        this.f8324C = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P3.y.T2(this.f8325D, this.f8324C);
    }
}
