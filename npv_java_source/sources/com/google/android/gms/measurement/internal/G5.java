package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class G5 extends com.google.android.gms.measurement.internal.F5 {
    G5(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
    }

    private final java.lang.String w(java.lang.String str) {
        java.lang.String strR = r().R(str);
        if (android.text.TextUtils.isEmpty(strR)) {
            return (java.lang.String) com.google.android.gms.measurement.internal.G.f41909r.a(null);
        }
        android.net.Uri uri = android.net.Uri.parse((java.lang.String) com.google.android.gms.measurement.internal.G.f41909r.a(null));
        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strR + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
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

    public final com.google.android.gms.measurement.internal.I5 u(java.lang.String str) {
        com.google.android.gms.measurement.internal.C6351c2 c6351c2M0;
        if (com.google.android.gms.internal.measurement.s7.a() && d().t(com.google.android.gms.measurement.internal.G.f41924y0)) {
            i();
            if (com.google.android.gms.measurement.internal.d6.H0(str)) {
                j().K().a("sgtm feature flag enabled.");
                com.google.android.gms.measurement.internal.C6351c2 c6351c2M1 = q().M0(str);
                if (c6351c2M1 == null) {
                    return new com.google.android.gms.measurement.internal.I5(w(str), p085i4.C.GOOGLE_ANALYTICS);
                }
                java.lang.String strM = c6351c2M1.m();
                com.google.android.gms.internal.measurement.U1 u1L = r().L(str);
                if (u1L == null || (c6351c2M0 = q().M0(str)) == null || ((!u1L.X() || u1L.O().k() != 100) && !i().E0(str, c6351c2M0.v()) && (!d().t(com.google.android.gms.measurement.internal.G.f41811A0) ? !(android.text.TextUtils.isEmpty(strM) || strM.hashCode() % 100 >= u1L.O().k()) : !(android.text.TextUtils.isEmpty(strM) || java.lang.Math.abs(strM.hashCode() % 100) >= u1L.O().k())))) {
                    return new com.google.android.gms.measurement.internal.I5(w(str), p085i4.C.GOOGLE_ANALYTICS);
                }
                com.google.android.gms.measurement.internal.I5 i6 = null;
                if (c6351c2M1.C()) {
                    j().K().a("sgtm upload enabled in manifest.");
                    com.google.android.gms.internal.measurement.U1 u1L2 = r().L(c6351c2M1.l());
                    if (u1L2 != null && u1L2.X()) {
                        java.lang.String strI = u1L2.O().I();
                        if (!android.text.TextUtils.isEmpty(strI)) {
                            java.lang.String strH = u1L2.O().H();
                            j().K().c("sgtm configured with upload_url, server_info", strI, android.text.TextUtils.isEmpty(strH) ? "Y" : "N");
                            if (android.text.TextUtils.isEmpty(strH)) {
                                i6 = new com.google.android.gms.measurement.internal.I5(strI, p085i4.C.SGTM);
                            } else {
                                java.util.HashMap map = new java.util.HashMap();
                                map.put("x-sgtm-server-info", strH);
                                if (!android.text.TextUtils.isEmpty(c6351c2M1.v())) {
                                    map.put("x-gtm-server-preview", c6351c2M1.v());
                                }
                                i6 = new com.google.android.gms.measurement.internal.I5(strI, map, p085i4.C.SGTM);
                            }
                        }
                    }
                }
                if (i6 != null) {
                    return i6;
                }
            }
        }
        return new com.google.android.gms.measurement.internal.I5(w(str), p085i4.C.GOOGLE_ANALYTICS);
    }

    public final java.lang.String v(com.google.android.gms.measurement.internal.C6351c2 c6351c2) {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        java.lang.String strQ = c6351c2.q();
        if (android.text.TextUtils.isEmpty(strQ)) {
            strQ = c6351c2.j();
        }
        builder.scheme((java.lang.String) com.google.android.gms.measurement.internal.G.f41877f.a(null)).encodedAuthority((java.lang.String) com.google.android.gms.measurement.internal.G.f41880g.a(null)).path("config/app/" + strQ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }
}
