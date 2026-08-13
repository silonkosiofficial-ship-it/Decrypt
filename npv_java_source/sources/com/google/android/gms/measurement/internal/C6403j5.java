package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6403j5 extends com.google.android.gms.measurement.internal.E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f42457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.A2 f42463j;

    C6403j5(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
        this.f42457d = new java.util.HashMap();
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H = h();
        j$.util.Objects.requireNonNull(c6511z2H);
        this.f42458e = new com.google.android.gms.measurement.internal.A2(c6511z2H, "last_delete_stale", 0L);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H2 = h();
        j$.util.Objects.requireNonNull(c6511z2H2);
        this.f42459f = new com.google.android.gms.measurement.internal.A2(c6511z2H2, "last_delete_stale_batch", 0L);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H3 = h();
        j$.util.Objects.requireNonNull(c6511z2H3);
        this.f42460g = new com.google.android.gms.measurement.internal.A2(c6511z2H3, "backoff", 0L);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H4 = h();
        j$.util.Objects.requireNonNull(c6511z2H4);
        this.f42461h = new com.google.android.gms.measurement.internal.A2(c6511z2H4, "last_upload", 0L);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H5 = h();
        j$.util.Objects.requireNonNull(c6511z2H5);
        this.f42462i = new com.google.android.gms.measurement.internal.A2(c6511z2H5, "last_upload_attempt", 0L);
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H6 = h();
        j$.util.Objects.requireNonNull(c6511z2H6);
        this.f42463j = new com.google.android.gms.measurement.internal.A2(c6511z2H6, "midnight_offset", 0L);
    }

    private final android.util.Pair y(java.lang.String str) {
        com.google.android.gms.measurement.internal.C6396i5 c6396i5;
        p144o3.a.C0676a c0676aA;
        n();
        long jC = b().c();
        com.google.android.gms.measurement.internal.C6396i5 c6396i6 = (com.google.android.gms.measurement.internal.C6396i5) this.f42457d.get(str);
        if (c6396i6 != null && jC < c6396i6.f42437c) {
            return new android.util.Pair(c6396i6.f42435a, java.lang.Boolean.valueOf(c6396i6.f42436b));
        }
        p144o3.a.d(true);
        long jC2 = d().C(str) + jC;
        try {
            try {
                c0676aA = p144o3.a.a(a());
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                if (c6396i6 != null && jC < c6396i6.f42437c + d().A(str, com.google.android.gms.measurement.internal.G.f41868c)) {
                    return new android.util.Pair(c6396i6.f42435a, java.lang.Boolean.valueOf(c6396i6.f42436b));
                }
                c0676aA = null;
            }
            if (c0676aA == null) {
                return new android.util.Pair("00000000-0000-0000-0000-000000000000", java.lang.Boolean.FALSE);
            }
            java.lang.String strA = c0676aA.a();
            c6396i5 = strA != null ? new com.google.android.gms.measurement.internal.C6396i5(strA, c0676aA.b(), jC2) : new com.google.android.gms.measurement.internal.C6396i5("", c0676aA.b(), jC2);
            this.f42457d.put(str, c6396i5);
            p144o3.a.d(false);
            return new android.util.Pair(c6396i5.f42435a, java.lang.Boolean.valueOf(c6396i5.f42436b));
        } catch (java.lang.Exception e6) {
            j().F().b("Unable to get advertising id", e6);
            c6396i5 = new com.google.android.gms.measurement.internal.C6396i5("", false, jC2);
        }
    }

    final java.lang.String A(java.lang.String str, boolean z6) {
        n();
        java.lang.String str2 = z6 ? (java.lang.String) y(str).first : "00000000-0000-0000-0000-000000000000";
        java.security.MessageDigest messageDigestV0 = com.google.android.gms.measurement.internal.d6.V0();
        if (messageDigestV0 == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigestV0.digest(str2.getBytes())));
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

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.Z5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.h6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6404k q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.I2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6403j5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.G5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    final android.util.Pair z(java.lang.String str, com.google.android.gms.measurement.internal.A3 a6) {
        return a6.y() ? y(str) : new android.util.Pair("", java.lang.Boolean.FALSE);
    }
}
