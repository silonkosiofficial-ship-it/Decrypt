package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6501y extends com.google.android.gms.measurement.internal.AbstractC6336a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f42707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f42708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42709d;

    public C6501y(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42708c = new p170r.C7026a();
        this.f42707b = new p170r.C7026a();
    }

    private final void A(java.lang.String str, long j6, com.google.android.gms.measurement.internal.C6499x4 c6499x4) {
        if (c6499x4 == null) {
            j().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j6 < 1000) {
            j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j6));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j6);
        com.google.android.gms.measurement.internal.d6.X(c6499x4, bundle, true);
        r().b1("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j6) {
        java.util.Iterator it = this.f42707b.keySet().iterator();
        while (it.hasNext()) {
            this.f42707b.put((java.lang.String) it.next(), java.lang.Long.valueOf(j6));
        }
        if (this.f42707b.isEmpty()) {
            return;
        }
        this.f42709d = j6;
    }

    static /* synthetic */ void C(com.google.android.gms.measurement.internal.C6501y c6501y, java.lang.String str, long j6) {
        c6501y.n();
        Q3.AbstractC1477p.f(str);
        java.lang.Integer num = (java.lang.Integer) c6501y.f42708c.get(str);
        if (num == null) {
            c6501y.j().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        com.google.android.gms.measurement.internal.C6499x4 c6499x4C = c6501y.s().C(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c6501y.f42708c.put(str, java.lang.Integer.valueOf(iIntValue));
            return;
        }
        c6501y.f42708c.remove(str);
        java.lang.Long l6 = (java.lang.Long) c6501y.f42707b.get(str);
        if (l6 == null) {
            c6501y.j().G().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j6 - l6.longValue();
            c6501y.f42707b.remove(str);
            c6501y.A(str, jLongValue, c6499x4C);
        }
        if (c6501y.f42708c.isEmpty()) {
            long j10 = c6501y.f42709d;
            if (j10 == 0) {
                c6501y.j().G().a("First ad exposure time was never set");
            } else {
                c6501y.w(j6 - j10, c6499x4C);
                c6501y.f42709d = 0L;
            }
        }
    }

    private final void w(long j6, com.google.android.gms.measurement.internal.C6499x4 c6499x4) {
        if (c6499x4 == null) {
            j().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j6 < 1000) {
            j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j6));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j6);
        com.google.android.gms.measurement.internal.d6.X(c6499x4, bundle, true);
        r().b1("am", "_xa", bundle);
    }

    static /* synthetic */ void y(com.google.android.gms.measurement.internal.C6501y c6501y, java.lang.String str, long j6) {
        c6501y.n();
        Q3.AbstractC1477p.f(str);
        if (c6501y.f42708c.isEmpty()) {
            c6501y.f42709d = j6;
        }
        java.lang.Integer num = (java.lang.Integer) c6501y.f42708c.get(str);
        if (num != null) {
            c6501y.f42708c.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (c6501y.f42708c.size() >= 100) {
            c6501y.j().L().a("Too many ads visible");
        } else {
            c6501y.f42708c.put(str, 1);
            c6501y.f42707b.put(str, java.lang.Long.valueOf(j6));
        }
    }

    public final void D(java.lang.String str, long j6) {
        if (str == null || str.length() == 0) {
            j().G().a("Ad unit id must be a non-empty string");
        } else {
            l().D(new com.google.android.gms.measurement.internal.RunnableC6509z0(this, str, j6));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }

    public final void v(long j6) {
        com.google.android.gms.measurement.internal.C6499x4 c6499x4C = s().C(false);
        for (java.lang.String str : this.f42707b.keySet()) {
            A(str, j6 - ((java.lang.Long) this.f42707b.get(str)).longValue(), c6499x4C);
        }
        if (!this.f42707b.isEmpty()) {
            w(j6 - this.f42709d, c6499x4C);
        }
        B(j6);
    }

    public final void z(java.lang.String str, long j6) {
        if (str == null || str.length() == 0) {
            j().G().a("Ad unit id must be a non-empty string");
        } else {
            l().D(new com.google.android.gms.measurement.internal.RunnableC6334a(this, str, j6));
        }
    }
}
