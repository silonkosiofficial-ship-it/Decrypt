package Q3;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends p045e4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Q3.AbstractC1464c abstractC1464c, android.os.Looper looper) {
        super(looper);
        this.f8883b = abstractC1464c;
    }

    private static final void a(android.os.Message message) {
        Q3.c0 c0Var = (Q3.c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(android.os.Message message) {
        int i6 = message.what;
        return i6 == 2 || i6 == 1 || i6 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.f8883b.f8888C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i6 = message.what;
        if ((i6 == 1 || i6 == 7 || ((i6 == 4 && !this.f8883b.t()) || message.what == 5)) && !this.f8883b.e()) {
            a(message);
            return;
        }
        int i10 = message.what;
        if (i10 == 4) {
            this.f8883b.f8914z = new N3.C1389b(message.arg2);
            if (Q3.AbstractC1464c.h0(this.f8883b)) {
                Q3.AbstractC1464c abstractC1464c = this.f8883b;
                if (!abstractC1464c.f8886A) {
                    abstractC1464c.i0(3, null);
                    return;
                }
            }
            Q3.AbstractC1464c abstractC1464c2 = this.f8883b;
            N3.C1389b c1389b = abstractC1464c2.f8914z != null ? abstractC1464c2.f8914z : new N3.C1389b(8);
            this.f8883b.f8904p.a(c1389b);
            this.f8883b.L(c1389b);
            return;
        }
        if (i10 == 5) {
            Q3.AbstractC1464c abstractC1464c3 = this.f8883b;
            N3.C1389b c1389b2 = abstractC1464c3.f8914z != null ? abstractC1464c3.f8914z : new N3.C1389b(8);
            this.f8883b.f8904p.a(c1389b2);
            this.f8883b.L(c1389b2);
            return;
        }
        if (i10 == 3) {
            java.lang.Object obj = message.obj;
            N3.C1389b c1389b3 = new N3.C1389b(message.arg2, obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) obj : null);
            this.f8883b.f8904p.a(c1389b3);
            this.f8883b.L(c1389b3);
            return;
        }
        if (i10 == 6) {
            this.f8883b.i0(5, null);
            Q3.AbstractC1464c abstractC1464c4 = this.f8883b;
            if (abstractC1464c4.f8909u != null) {
                abstractC1464c4.f8909u.y0(message.arg2);
            }
            this.f8883b.M(message.arg2);
            Q3.AbstractC1464c.g0(this.f8883b, 5, 1, null);
            return;
        }
        if (i10 == 2 && !this.f8883b.j()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((Q3.c0) message.obj).c();
            return;
        }
        java.lang.String str = "Don't know how to handle message: " + message.what;
        new java.lang.Exception();
    }
}
