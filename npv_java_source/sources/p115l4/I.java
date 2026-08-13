package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class I implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.AbstractC6931l f50007C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p115l4.J f50008D;

    I(p115l4.J j6, p115l4.AbstractC6931l abstractC6931l) {
        this.f50008D = j6;
        this.f50007C = abstractC6931l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p115l4.AbstractC6931l abstractC6931lA = this.f50008D.f50010b.a(this.f50007C.l());
            if (abstractC6931lA == null) {
                this.f50008D.d(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            p115l4.J j6 = this.f50008D;
            java.util.concurrent.Executor executor = p115l4.AbstractC6933n.f50028b;
            abstractC6931lA.f(executor, j6);
            abstractC6931lA.d(executor, this.f50008D);
            abstractC6931lA.a(executor, this.f50008D);
        } catch (java.util.concurrent.CancellationException unused) {
            this.f50008D.b();
        } catch (p115l4.C6929j e6) {
            if (e6.getCause() instanceof java.lang.Exception) {
                this.f50008D.d((java.lang.Exception) e6.getCause());
            } else {
                this.f50008D.d(e6);
            }
        } catch (java.lang.Exception e10) {
            this.f50008D.d(e10);
        }
    }
}
