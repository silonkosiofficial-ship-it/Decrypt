package p005a4;

/* JADX INFO: loaded from: classes3.dex */
final class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p005a4.l f17045C;

    /* synthetic */ j(p005a4.l lVar, p005a4.i iVar) {
        this.f17045C = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB = this.f17045C.b();
        if (jB == -1 || V3.i.d().a() <= jB) {
            return;
        }
        p005a4.l.f(this.f17045C.f17047a);
    }
}
