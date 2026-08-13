package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2816Sa extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C5359ub f31711k = new com.google.android.gms.internal.ads.C5359ub();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4767p8 f31712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.content.Context f31713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5098s9 f31714j;

    public C2816Sa(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, android.content.Context context, com.google.android.gms.internal.ads.C3779g8 c3779g8, com.google.android.gms.internal.ads.C4767p8 c4767p8, com.google.android.gms.internal.ads.C5098s9 c5098s9) {
        super(c2262Da, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c5316u8, i6, 27);
        this.f31713i = context;
        this.f31712h = c4767p8;
        this.f31714j = c5098s9;
    }

    private final com.google.android.gms.internal.ads.C4329l9 d() {
        java.lang.String str;
        int iIntValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25352N2)).booleanValue() ? ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25407S2)).intValue() : this.f31712h.b0();
        com.google.android.gms.internal.ads.C4329l9 c4329l9 = new com.google.android.gms.internal.ads.C4329l9((java.lang.String) this.f38978e.invoke(null, this.f31713i, java.lang.Boolean.FALSE, ""));
        com.google.android.gms.internal.ads.C5098s9 c5098s9 = this.f31714j;
        if (c5098s9 == null || c5098s9.a() == null) {
            str = "E";
        } else {
            try {
                str = (java.lang.String) c5098s9.a().get(iIntValue, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
                str = "E";
            }
        }
        c4329l9.f37097b = str;
        return c4329l9;
    }

    private final java.lang.String e() {
        try {
            if (this.f38974a.l() != null) {
                this.f38974a.l().get();
            }
            com.google.android.gms.internal.ads.Q8 q8C = this.f38974a.c();
            if (q8C == null || !q8C.L0()) {
                return null;
            }
            return q8C.a1();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        int i6;
        com.google.android.gms.internal.ads.C4329l9 c4329l9D;
        com.google.android.gms.internal.ads.C4329l9 c4329l9;
        java.util.concurrent.atomic.AtomicReference atomicReferenceA = f31711k.a(this.f31713i.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                com.google.android.gms.internal.ads.C4329l9 c4329l10 = (com.google.android.gms.internal.ads.C4329l9) atomicReferenceA.get();
                if (c4329l10 == null || com.google.android.gms.internal.ads.AbstractC2373Ga.d(c4329l10.f37097b) || c4329l10.f37097b.equals("E") || c4329l10.f37097b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (com.google.android.gms.internal.ads.AbstractC2373Ga.d(null)) {
                        com.google.android.gms.internal.ads.AbstractC2373Ga.d(null);
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    if (this.f31714j != null) {
                        c4329l9D = d();
                    } else {
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(i6 == 3 && !this.f31712h.e0());
                        java.lang.Boolean bool = (java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25221B2);
                        java.lang.String strC = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25211A2)).booleanValue() ? c() : null;
                        if (bool.booleanValue() && this.f38974a.p() && com.google.android.gms.internal.ads.AbstractC2373Ga.d(strC)) {
                            strC = e();
                        }
                        com.google.android.gms.internal.ads.C4329l9 c4329l11 = new com.google.android.gms.internal.ads.C4329l9((java.lang.String) this.f38978e.invoke(null, this.f31713i, boolValueOf, strC));
                        if (com.google.android.gms.internal.ads.AbstractC2373Ga.d(c4329l11.f37097b) || c4329l11.f37097b.equals("E")) {
                            int i10 = i6 - 1;
                            if (i10 == 3) {
                                java.lang.String strE = e();
                                if (!com.google.android.gms.internal.ads.AbstractC2373Ga.d(strE)) {
                                    c4329l11.f37097b = strE;
                                }
                            } else if (i10 == 4) {
                                throw null;
                            }
                        }
                        c4329l9D = c4329l11;
                    }
                    atomicReferenceA.set(c4329l9D);
                }
                c4329l9 = (com.google.android.gms.internal.ads.C4329l9) atomicReferenceA.get();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f38977d) {
            if (c4329l9 != null) {
                try {
                    this.f38977d.I0(c4329l9.f37097b);
                    this.f38977d.Z(c4329l9.f37098c);
                    this.f38977d.b0(c4329l9.f37099d);
                    this.f38977d.t0(c4329l9.f37100e);
                    this.f38977d.H0(c4329l9.f37101f);
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected final java.lang.String c() {
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            byte[] bArrF = com.google.android.gms.internal.ads.AbstractC2373Ga.f((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25231C2));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrF)));
            if (!android.os.Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(com.google.android.gms.internal.ads.AbstractC2373Ga.f((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25242D2)))));
            }
            android.content.Context context = this.f31713i;
            java.lang.String packageName = context.getPackageName();
            this.f38974a.k();
            if (android.os.Build.VERSION.SDK_INT <= 30 && !android.os.Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final com.google.android.gms.internal.ads.C4062il0 c4062il0D = com.google.android.gms.internal.ads.C4062il0.D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new android.content.pm.PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.vb
                public final void onChecksumsReady(java.util.List list) {
                    com.google.android.gms.internal.ads.C4062il0 c4062il0 = c4062il0D;
                    if (list == null) {
                        c4062il0.f(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            android.content.pm.ApkChecksum apkChecksumA = com.google.android.gms.internal.ads.AbstractC4549n9.a(list.get(i6));
                            if (apkChecksumA.getType() == 8) {
                                c4062il0.f(com.google.android.gms.internal.ads.AbstractC2373Ga.b(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        c4062il0.f(null);
                    } catch (java.lang.Throwable unused) {
                        c4062il0.f(null);
                    }
                }
            });
            return (java.lang.String) c4062il0D.get();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.InterruptedException | java.lang.NoClassDefFoundError | java.security.cert.CertificateEncodingException | java.security.cert.CertificateException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }
}
