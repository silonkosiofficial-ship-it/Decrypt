package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6485v4 extends com.google.android.gms.measurement.internal.E5 {
    public C6485v4(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
    }

    private static java.lang.String c(java.lang.String str, java.lang.String str2) {
        throw new java.lang.SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    public final byte[] y(com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        com.google.android.gms.measurement.internal.a6 a6Var;
        long j6;
        com.google.android.gms.measurement.internal.A a6;
        n();
        this.f42679a.Q();
        Q3.AbstractC1477p.l(e6);
        Q3.AbstractC1477p.f(str);
        if (!d().F(str, com.google.android.gms.measurement.internal.G.f41899m0)) {
            j().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(e6.f41772C) && !"_iapx".equals(e6.f41772C)) {
            j().F().c("Generating a payload for this event is not available. package_name, event_name", str, e6.f41772C);
            return null;
        }
        com.google.android.gms.internal.measurement.C6097p2.a aVarK = com.google.android.gms.internal.measurement.C6097p2.K();
        q().c1();
        try {
            com.google.android.gms.measurement.internal.C6351c2 c6351c2M0 = q().M0(str);
            if (c6351c2M0 == null) {
                j().F().b("Log and bundle not available. package_name", str);
                byte[] bArr = new byte[0];
                q().i1();
                return bArr;
            }
            if (!c6351c2M0.A()) {
                j().F().b("Log and bundle disabled. package_name", str);
                byte[] bArr2 = new byte[0];
                q().i1();
                return bArr2;
            }
            com.google.android.gms.internal.measurement.C6105q2.a aVarZ0 = com.google.android.gms.internal.measurement.C6105q2.u2().A0(1).Z0("android");
            if (!android.text.TextUtils.isEmpty(c6351c2M0.l())) {
                aVarZ0.W(c6351c2M0.l());
            }
            if (!android.text.TextUtils.isEmpty(c6351c2M0.n())) {
                aVarZ0.k0((java.lang.String) Q3.AbstractC1477p.l(c6351c2M0.n()));
            }
            if (!android.text.TextUtils.isEmpty(c6351c2M0.o())) {
                aVarZ0.q0((java.lang.String) Q3.AbstractC1477p.l(c6351c2M0.o()));
            }
            if (c6351c2M0.U() != -2147483648L) {
                aVarZ0.n0((int) c6351c2M0.U());
            }
            aVarZ0.t0(c6351c2M0.z0()).i0(c6351c2M0.v0());
            java.lang.String strQ = c6351c2M0.q();
            java.lang.String strJ = c6351c2M0.j();
            if (!android.text.TextUtils.isEmpty(strQ)) {
                aVarZ0.T0(strQ);
            } else if (!android.text.TextUtils.isEmpty(strJ)) {
                aVarZ0.J(strJ);
            }
            aVarZ0.J0(c6351c2M0.J0());
            com.google.android.gms.measurement.internal.A3 a3U = this.f41809b.U(str);
            aVarZ0.a0(c6351c2M0.t0());
            if (this.f42679a.p() && d().N(aVarZ0.g1()) && a3U.y() && !android.text.TextUtils.isEmpty(null)) {
                aVarZ0.K0(null);
            }
            aVarZ0.y0(a3U.w());
            if (a3U.y() && c6351c2M0.z()) {
                android.util.Pair pairZ = s().z(c6351c2M0.l(), a3U);
                if (c6351c2M0.z() && pairZ != null && !android.text.TextUtils.isEmpty((java.lang.CharSequence) pairZ.first)) {
                    try {
                        aVarZ0.b1(c((java.lang.String) pairZ.first, java.lang.Long.toString(e6.f41775F)));
                        java.lang.Object obj = pairZ.second;
                        if (obj != null) {
                            aVarZ0.d0(((java.lang.Boolean) obj).booleanValue());
                        }
                    } catch (java.lang.SecurityException e10) {
                        j().F().b("Resettable device id encryption failed", e10.getMessage());
                        byte[] bArr3 = new byte[0];
                        q().i1();
                        return bArr3;
                    }
                }
            }
            e().p();
            com.google.android.gms.internal.measurement.C6105q2.a aVarG0 = aVarZ0.G0(android.os.Build.MODEL);
            e().p();
            aVarG0.X0(android.os.Build.VERSION.RELEASE).I0((int) e().u()).f1(e().v());
            try {
                if (a3U.z() && c6351c2M0.m() != null) {
                    aVarZ0.c0(c((java.lang.String) Q3.AbstractC1477p.l(c6351c2M0.m()), java.lang.Long.toString(e6.f41775F)));
                }
                if (!android.text.TextUtils.isEmpty(c6351c2M0.p())) {
                    aVarZ0.R0((java.lang.String) Q3.AbstractC1477p.l(c6351c2M0.p()));
                }
                java.lang.String strL = c6351c2M0.l();
                java.util.List listY0 = q().Y0(strL);
                java.util.Iterator it = listY0.iterator();
                do {
                    if (!it.hasNext()) {
                        a6Var = null;
                        break;
                    }
                    a6Var = (com.google.android.gms.measurement.internal.a6) it.next();
                } while (!"_lte".equals(a6Var.f42262c));
                if (a6Var == null || a6Var.f42264e == null) {
                    com.google.android.gms.measurement.internal.a6 a6Var2 = new com.google.android.gms.measurement.internal.a6(strL, "auto", "_lte", b().a(), 0L);
                    listY0.add(a6Var2);
                    q().i0(a6Var2);
                }
                com.google.android.gms.internal.measurement.C6136u2[] c6136u2Arr = new com.google.android.gms.internal.measurement.C6136u2[listY0.size()];
                for (int i6 = 0; i6 < listY0.size(); i6++) {
                    com.google.android.gms.internal.measurement.C6136u2.a aVarA = com.google.android.gms.internal.measurement.C6136u2.R().y(((com.google.android.gms.measurement.internal.a6) listY0.get(i6)).f42262c).A(((com.google.android.gms.measurement.internal.a6) listY0.get(i6)).f42263d);
                    o().V(aVarA, ((com.google.android.gms.measurement.internal.a6) listY0.get(i6)).f42264e);
                    c6136u2Arr[i6] = (com.google.android.gms.internal.measurement.C6136u2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarA.q());
                }
                aVarZ0.p0(java.util.Arrays.asList(c6136u2Arr));
                this.f41809b.x(c6351c2M0, aVarZ0);
                if (com.google.android.gms.internal.measurement.S6.a() && d().t(com.google.android.gms.measurement.internal.G.f41853V0)) {
                    this.f41809b.a0(c6351c2M0, aVarZ0);
                }
                com.google.android.gms.measurement.internal.C6455r2 c6455r2B = com.google.android.gms.measurement.internal.C6455r2.b(e6);
                i().N(c6455r2B.f42610d, q().K0(str));
                i().W(c6455r2B, d().v(str));
                android.os.Bundle bundle = c6455r2B.f42610d;
                bundle.putLong("_c", 1L);
                j().F().a("Marking in-app purchase as real-time");
                bundle.putLong("_r", 1L);
                bundle.putString("_o", e6.f41774E);
                if (i().E0(aVarZ0.g1(), c6351c2M0.v())) {
                    i().O(bundle, "_dbg", 1L);
                    i().O(bundle, "_r", 1L);
                }
                com.google.android.gms.measurement.internal.A aL0 = q().L0(str, e6.f41772C);
                if (aL0 == null) {
                    a6 = new com.google.android.gms.measurement.internal.A(str, e6.f41772C, 0L, 0L, e6.f41775F, 0L, null, null, null, null);
                    j6 = 0;
                } else {
                    j6 = aL0.f41694f;
                    a6 = aL0.a(e6.f41775F);
                }
                q().U(a6);
                com.google.android.gms.measurement.internal.B b6 = new com.google.android.gms.measurement.internal.B(this.f42679a, e6.f41774E, str, e6.f41772C, e6.f41775F, j6, bundle);
                com.google.android.gms.internal.measurement.C6061l2.a aVarZ = com.google.android.gms.internal.measurement.C6061l2.R().G(b6.f41725d).E(b6.f41723b).z(b6.f41726e);
                for (java.lang.String str2 : b6.f41727f) {
                    com.google.android.gms.internal.measurement.C6079n2.a aVarA2 = com.google.android.gms.internal.measurement.C6079n2.T().A(str2);
                    java.lang.Object objD = b6.f41727f.D(str2);
                    if (objD != null) {
                        o().U(aVarA2, objD);
                        aVarZ.A(aVarA2);
                    }
                }
                aVarZ0.E(aVarZ).F(com.google.android.gms.internal.measurement.C6112r2.F().v(com.google.android.gms.internal.measurement.C6070m2.F().v(a6.f41691c).w(e6.f41772C)));
                aVarZ0.I(p().z(c6351c2M0.l(), java.util.Collections.emptyList(), aVarZ0.M(), java.lang.Long.valueOf(aVarZ.I()), java.lang.Long.valueOf(aVarZ.I())));
                if (aVarZ.M()) {
                    aVarZ0.F0(aVarZ.I()).o0(aVarZ.I());
                }
                long jD0 = c6351c2M0.D0();
                if (jD0 != 0) {
                    aVarZ0.x0(jD0);
                }
                long jH0 = c6351c2M0.H0();
                if (jH0 != 0) {
                    aVarZ0.B0(jH0);
                } else if (jD0 != 0) {
                    aVarZ0.B0(jD0);
                }
                java.lang.String strU = c6351c2M0.u();
                if (com.google.android.gms.internal.measurement.C6075m7.a() && d().F(str, com.google.android.gms.measurement.internal.G.f41922x0) && strU != null) {
                    aVarZ0.d1(strU);
                }
                c6351c2M0.y();
                aVarZ0.s0((int) c6351c2M0.F0()).Q0(106000L).M0(b().a()).l0(true);
                this.f41809b.E(aVarZ0.g1(), aVarZ0);
                aVarK.w(aVarZ0);
                c6351c2M0.C0(aVarZ0.r0());
                c6351c2M0.y0(aVarZ0.m0());
                q().V(c6351c2M0, false, false);
                q().k1();
                q().i1();
                try {
                    return o().h0(((com.google.android.gms.internal.measurement.C6097p2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarK.q())).j());
                } catch (java.io.IOException e11) {
                    j().G().c("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e11);
                    return 0;
                }
            } catch (java.lang.SecurityException e12) {
                j().F().b("app instance id encryption failed", e12.getMessage());
                byte[] bArr4 = new byte[0];
                q().i1();
                return bArr4;
            }
        } catch (java.lang.Throwable th) {
            q().i1();
            throw th;
        }
    }
}
