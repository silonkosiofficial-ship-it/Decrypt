package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class y implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f50046C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.z f50047D;

    y(p115l4.z zVar, p115l4.AbstractC6931l abstractC6931l) {
        this.f50047D = zVar;
        this.f50046C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p115l4.AbstractC6931l abstractC6931l = (p115l4.AbstractC6931l) this.f50047D.f50049b.a(this.f50046C);
            if (abstractC6931l == null) {
                this.f50047D.d(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            p115l4.z zVar = this.f50047D;
            java.util.concurrent.Executor executor = p115l4.AbstractC6933n.f50028b;
            abstractC6931l.f(executor, zVar);
            abstractC6931l.d(executor, this.f50047D);
            abstractC6931l.a(executor, this.f50047D);
        } catch (p115l4.C6929j e6) {
            if (e6.getCause() instanceof java.lang.Exception) {
                this.f50047D.f50050c.r((java.lang.Exception) e6.getCause());
            } else {
                this.f50047D.f50050c.r(e6);
            }
        } catch (java.lang.Exception e10) {
            this.f50047D.f50050c.r(e10);
        }
    }
}
