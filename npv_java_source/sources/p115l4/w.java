package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class w implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f50041C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.x f50042D;

    w(p115l4.x xVar, p115l4.AbstractC6931l abstractC6931l) {
        this.f50042D = xVar;
        this.f50041C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f50041C.m()) {
            this.f50042D.f50045c.t();
            return;
        }
        try {
            this.f50042D.f50045c.s(this.f50042D.f50044b.a(this.f50041C));
        } catch (p115l4.C6929j e6) {
            if (e6.getCause() instanceof java.lang.Exception) {
                this.f50042D.f50045c.r((java.lang.Exception) e6.getCause());
            } else {
                this.f50042D.f50045c.r(e6);
            }
        } catch (java.lang.Exception e10) {
            this.f50042D.f50045c.r(e10);
        }
    }
}
