package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3341c80 implements com.google.android.gms.internal.ads.InterfaceC3232b80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f34452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4108j80 f34453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3560e80 f34454c = new com.google.android.gms.internal.ads.C3560e80();

    public C3341c80(com.google.android.gms.internal.ads.C4108j80 c4108j80) {
        this.f34452a = new j$.util.concurrent.ConcurrentHashMap(c4108j80.f36594H);
        this.f34453b = c4108j80;
    }

    private final void f() {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4108j80> creator = com.google.android.gms.internal.ads.C4108j80.CREATOR;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.h6)).booleanValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f34453b.f36592F);
            sb.append(" PoolCollection");
            sb.append(this.f34454c.b());
            int i6 = 0;
            for (java.util.Map.Entry entry : this.f34452a.entrySet()) {
                i6++;
                sb.append(i6);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((com.google.android.gms.internal.ads.InterfaceC4438m80) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i10 = 0; i10 < ((com.google.android.gms.internal.ads.C3122a80) entry.getValue()).b(); i10++) {
                    sb.append("[O]");
                }
                for (int iB = ((com.google.android.gms.internal.ads.C3122a80) entry.getValue()).b(); iB < this.f34453b.f36594H; iB++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((com.google.android.gms.internal.ads.C3122a80) entry.getValue()).g());
                sb.append("\n");
            }
            while (i6 < this.f34453b.f36593G) {
                i6++;
                sb.append(i6);
                sb.append(".\n");
            }
            p224w3.p.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3232b80
    public final com.google.android.gms.internal.ads.C4108j80 a() {
        return this.f34453b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3232b80
    public final synchronized boolean b(com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m80) {
        com.google.android.gms.internal.ads.C3122a80 c3122a80 = (com.google.android.gms.internal.ads.C3122a80) this.f34452a.get(interfaceC4438m80);
        if (c3122a80 == null) {
            return true;
        }
        return c3122a80.b() < this.f34453b.f36594H;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3232b80
    public final synchronized com.google.android.gms.internal.ads.C4328l80 c(com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m80) {
        com.google.android.gms.internal.ads.C4328l80 c4328l80E;
        try {
            com.google.android.gms.internal.ads.C3122a80 c3122a80 = (com.google.android.gms.internal.ads.C3122a80) this.f34452a.get(interfaceC4438m80);
            if (c3122a80 != null) {
                c4328l80E = c3122a80.e();
                if (c4328l80E == null) {
                    this.f34454c.e();
                }
                com.google.android.gms.internal.ads.C5867z80 c5867z80F = c3122a80.f();
                if (c4328l80E != null) {
                    com.google.android.gms.internal.ads.C4376le c4376leD0 = com.google.android.gms.internal.ads.C5145se.d0();
                    com.google.android.gms.internal.ads.C4156je c4156jeH0 = com.google.android.gms.internal.ads.C4266ke.h0();
                    c4156jeH0.z(com.google.android.gms.internal.ads.EnumC4486me.IN_MEMORY);
                    com.google.android.gms.internal.ads.C4706oe c4706oeD0 = com.google.android.gms.internal.ads.C4816pe.d0();
                    c4706oeD0.z(c5867z80F.f40228C);
                    c4706oeD0.A(c5867z80F.f40229D);
                    c4156jeH0.A(c4706oeD0);
                    c4376leD0.z(c4156jeH0);
                    c4328l80E.f37093a.b().c().a0((com.google.android.gms.internal.ads.C5145se) c4376leD0.u());
                }
                f();
            } else {
                this.f34454c.f();
                f();
                c4328l80E = null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c4328l80E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3232b80
    public final com.google.android.gms.internal.ads.InterfaceC4438m80 d(p184s3.X1 x6, java.lang.String str, p184s3.i2 i2Var) {
        return new com.google.android.gms.internal.ads.C4548n80(x6, str, new com.google.android.gms.internal.ads.C2840So(this.f34453b.f36590D).a().f31997j, this.f34453b.f36596J, i2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3232b80
    public final synchronized boolean e(com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m80, com.google.android.gms.internal.ads.C4328l80 c4328l80) {
        boolean zH;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap;
        try {
            com.google.android.gms.internal.ads.C3122a80 c3122a80 = (com.google.android.gms.internal.ads.C3122a80) this.f34452a.get(interfaceC4438m80);
            c4328l80.f37096d = p174r3.v.c().a();
            if (c3122a80 == null) {
                com.google.android.gms.internal.ads.C4108j80 c4108j80 = this.f34453b;
                com.google.android.gms.internal.ads.C3122a80 c3122a81 = new com.google.android.gms.internal.ads.C3122a80(c4108j80.f36594H, c4108j80.f36595I * 1000);
                if (this.f34452a.size() == this.f34453b.f36593G) {
                    int i6 = this.f34453b.f36601O;
                    int i10 = i6 - 1;
                    com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m81 = null;
                    if (i6 == 0) {
                        throw null;
                    }
                    long jC = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (java.util.Map.Entry entry : this.f34452a.entrySet()) {
                            if (((com.google.android.gms.internal.ads.C3122a80) entry.getValue()).c() < jC) {
                                jC = ((com.google.android.gms.internal.ads.C3122a80) entry.getValue()).c();
                                interfaceC4438m81 = (com.google.android.gms.internal.ads.InterfaceC4438m80) entry.getKey();
                            }
                        }
                        if (interfaceC4438m81 != null) {
                            concurrentHashMap = this.f34452a;
                            concurrentHashMap.remove(interfaceC4438m81);
                        }
                    } else if (i10 == 1) {
                        for (java.util.Map.Entry entry2 : this.f34452a.entrySet()) {
                            if (((com.google.android.gms.internal.ads.C3122a80) entry2.getValue()).d() < jC) {
                                jC = ((com.google.android.gms.internal.ads.C3122a80) entry2.getValue()).d();
                                interfaceC4438m81 = (com.google.android.gms.internal.ads.InterfaceC4438m80) entry2.getKey();
                            }
                        }
                        if (interfaceC4438m81 != null) {
                            concurrentHashMap = this.f34452a;
                            concurrentHashMap.remove(interfaceC4438m81);
                        }
                    } else if (i10 == 2) {
                        int iA = Integer.MAX_VALUE;
                        for (java.util.Map.Entry entry3 : this.f34452a.entrySet()) {
                            if (((com.google.android.gms.internal.ads.C3122a80) entry3.getValue()).a() < iA) {
                                iA = ((com.google.android.gms.internal.ads.C3122a80) entry3.getValue()).a();
                                interfaceC4438m81 = (com.google.android.gms.internal.ads.InterfaceC4438m80) entry3.getKey();
                            }
                        }
                        if (interfaceC4438m81 != null) {
                            concurrentHashMap = this.f34452a;
                            concurrentHashMap.remove(interfaceC4438m81);
                        }
                    }
                    this.f34454c.g();
                }
                this.f34452a.put(interfaceC4438m80, c3122a81);
                this.f34454c.d();
                c3122a80 = c3122a81;
            }
            zH = c3122a80.h(c4328l80);
            this.f34454c.c();
            com.google.android.gms.internal.ads.C3451d80 c3451d80A = this.f34454c.a();
            com.google.android.gms.internal.ads.C5867z80 c5867z80F = c3122a80.f();
            com.google.android.gms.internal.ads.C4376le c4376leD0 = com.google.android.gms.internal.ads.C5145se.d0();
            com.google.android.gms.internal.ads.C4156je c4156jeH0 = com.google.android.gms.internal.ads.C4266ke.h0();
            c4156jeH0.z(com.google.android.gms.internal.ads.EnumC4486me.IN_MEMORY);
            com.google.android.gms.internal.ads.C4926qe c4926qeH0 = com.google.android.gms.internal.ads.C5035re.h0();
            c4926qeH0.z(c3451d80A.f34652C);
            c4926qeH0.A(c3451d80A.f34653D);
            c4926qeH0.B(c5867z80F.f40229D);
            c4156jeH0.C(c4926qeH0);
            c4376leD0.z(c4156jeH0);
            c4328l80.f37093a.b().c().S((com.google.android.gms.internal.ads.C5145se) c4376leD0.u());
            f();
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zH;
    }
}
