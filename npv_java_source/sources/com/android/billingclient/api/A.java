package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class A implements com.android.billingclient.api.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.C6240j4 f24481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.android.billingclient.api.B f24482c;

    A(android.content.Context context, com.google.android.gms.internal.play_billing.C6240j4 c6240j4) {
        this.f24482c = new com.android.billingclient.api.B(context);
        this.f24481b = c6240j4;
    }

    @Override // com.android.billingclient.api.y
    public final void a(com.google.android.gms.internal.play_billing.C6186a4 c6186a4) {
        try {
            com.google.android.gms.internal.play_billing.y4 y4VarI = com.google.android.gms.internal.play_billing.A4.I();
            y4VarI.u(this.f24481b);
            y4VarI.t(c6186a4);
            this.f24482c.a((com.google.android.gms.internal.play_billing.A4) y4VarI.l());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void b(com.google.android.gms.internal.play_billing.K4 k6) {
        if (k6 == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.y4 y4VarI = com.google.android.gms.internal.play_billing.A4.I();
            y4VarI.u(this.f24481b);
            y4VarI.w(k6);
            this.f24482c.a((com.google.android.gms.internal.play_billing.A4) y4VarI.l());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void c(com.google.android.gms.internal.play_billing.G4 g6) {
        try {
            com.android.billingclient.api.B b6 = this.f24482c;
            com.google.android.gms.internal.play_billing.y4 y4VarI = com.google.android.gms.internal.play_billing.A4.I();
            y4VarI.u(this.f24481b);
            y4VarI.v(g6);
            b6.a((com.google.android.gms.internal.play_billing.A4) y4VarI.l());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void d(com.google.android.gms.internal.play_billing.N3 n6) {
        if (n6 == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.y4 y4VarI = com.google.android.gms.internal.play_billing.A4.I();
            y4VarI.u(this.f24481b);
            y4VarI.q(n6);
            this.f24482c.a((com.google.android.gms.internal.play_billing.A4) y4VarI.l());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void e(com.google.android.gms.internal.play_billing.N3 n6, int i6) {
        try {
            com.google.android.gms.internal.play_billing.C6228h4 c6228h4 = (com.google.android.gms.internal.play_billing.C6228h4) this.f24481b.n();
            c6228h4.q(i6);
            this.f24481b = (com.google.android.gms.internal.play_billing.C6240j4) c6228h4.l();
            d(n6);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void f(com.google.android.gms.internal.play_billing.S3 s6, int i6) {
        try {
            com.google.android.gms.internal.play_billing.C6228h4 c6228h4 = (com.google.android.gms.internal.play_billing.C6228h4) this.f24481b.n();
            c6228h4.q(i6);
            this.f24481b = (com.google.android.gms.internal.play_billing.C6240j4) c6228h4.l();
            g(s6);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.y
    public final void g(com.google.android.gms.internal.play_billing.S3 s6) {
        if (s6 == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.y4 y4VarI = com.google.android.gms.internal.play_billing.A4.I();
            y4VarI.u(this.f24481b);
            y4VarI.r(s6);
            this.f24482c.a((com.google.android.gms.internal.play_billing.A4) y4VarI.l());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to log.", th);
        }
    }
}
