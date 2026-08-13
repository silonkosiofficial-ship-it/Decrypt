package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3812gS extends com.google.android.gms.internal.ads.AbstractBinderC2213Bo {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f35610C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f35611D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4690oS f35612E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2992Ww f35613F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.ArrayDeque f35614G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f35615H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3020Xo f35616I;

    public BinderC3812gS(android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C3020Xo c3020Xo, com.google.android.gms.internal.ads.InterfaceC2992Ww interfaceC2992Ww, com.google.android.gms.internal.ads.C4690oS c4690oS, java.util.ArrayDeque arrayDeque, com.google.android.gms.internal.ads.C4360lS c4360lS, com.google.android.gms.internal.ads.T90 t90) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        this.f35610C = context;
        this.f35611D = yk0;
        this.f35616I = c3020Xo;
        this.f35612E = c4690oS;
        this.f35613F = interfaceC2992Ww;
        this.f35614G = arrayDeque;
        this.f35615H = t90;
    }

    private final synchronized void q() {
        int iIntValue = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2496Jg.f28739b.e()).intValue();
        while (this.f35614G.size() >= iIntValue) {
            this.f35614G.removeFirst();
        }
    }

    private final synchronized com.google.android.gms.internal.ads.C3483dS t6(java.lang.String str) {
        java.util.Iterator it = this.f35614G.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C3483dS c3483dS = (com.google.android.gms.internal.ads.C3483dS) it.next();
            if (c3483dS.f34725c.equals(str)) {
                it.remove();
                return c3483dS;
            }
        }
        return null;
    }

    private static P4.d u6(P4.d dVar, com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.C5599wl c5599wl, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390llA = c5599wl.a("AFMA_getAdDictionary", com.google.android.gms.internal.ads.AbstractC5269tl.f39020b, new com.google.android.gms.internal.ads.InterfaceC4610nl() { // from class: com.google.android.gms.internal.ads.XR
            @Override // com.google.android.gms.internal.ads.InterfaceC4610nl
            public final java.lang.Object a(org.json.JSONObject jSONObject) {
                return new com.google.android.gms.internal.ads.C2804Ro(jSONObject);
            }
        });
        com.google.android.gms.internal.ads.P90.d(dVar, e90);
        com.google.android.gms.internal.ads.C3124a90 c3124a90A = c5429v90.b(com.google.android.gms.internal.ads.EnumC4770p90.BUILD_URL, dVar).f(interfaceC4390llA).a();
        com.google.android.gms.internal.ads.P90.c(c3124a90A, q90, e90);
        return c3124a90A;
    }

    private static P4.d v6(final com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.C5429v90 c5429v90, final com.google.android.gms.internal.ads.AbstractC4758p30 abstractC4758p30) {
        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.QR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return abstractC4758p30.b().a(p184s3.C7147y.b().k((android.os.Bundle) obj), c2730Po.f30805O, false);
            }
        };
        return c5429v90.b(com.google.android.gms.internal.ads.EnumC4770p90.GMS_SIGNALS, com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c2730Po.f30793C)).f(interfaceC5268tk0).e(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.RR
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                p214v3.AbstractC7265q0.k("Ad request signals:");
                p214v3.AbstractC7265q0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void w6(com.google.android.gms.internal.ads.C3483dS c3483dS) {
        q();
        this.f35614G.addLast(c3483dS);
    }

    private final void x6(P4.d dVar, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVar, new com.google.android.gms.internal.ads.InterfaceC5268tk0(this) { // from class: com.google.android.gms.internal.ads.YR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) throws java.io.IOException {
                final java.io.InputStream inputStream = (java.io.InputStream) obj;
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.O70
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.io.InputStream inputStream2 = inputStream;
                        try {
                            try {
                                android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    V3.l.b(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } catch (java.lang.Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (java.io.IOException unused) {
                        }
                    }
                });
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(parcelFileDescriptor);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34795a), new com.google.android.gms.internal.ads.C3373cS(this, c2730Po, interfaceC2435Ho), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void A3(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (bundle = c2730Po.f30805O) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.SERVICE_CONNECTED.e(), p174r3.v.c().a());
        }
        x6(q6(c2730Po, android.os.Binder.getCallingUid()), interfaceC2435Ho, c2730Po);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void I2(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Bundle bundle;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (bundle = c2730Po.f30805O) != null) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.SERVICE_CONNECTED.e(), p174r3.v.c().a());
        }
        P4.d dVarP6 = p6(c2730Po, android.os.Binder.getCallingUid());
        x6(dVarP6, interfaceC2435Ho, c2730Po);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26276e.e()).booleanValue()) {
            com.google.android.gms.internal.ads.C4690oS c4690oS = this.f35612E;
            j$.util.Objects.requireNonNull(c4690oS);
            dVarP6.e(new com.google.android.gms.internal.ads.WR(c4690oS), this.f35611D);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void R3(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        x6(r6(str), interfaceC2435Ho, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void j1(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        x6(o6(c2730Po, android.os.Binder.getCallingUid()), interfaceC2435Ho, c2730Po);
    }

    public final P4.d o6(final com.google.android.gms.internal.ads.C2730Po c2730Po, int i6) {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2496Jg.f28738a.e()).booleanValue()) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Split request is disabled."));
        }
        com.google.android.gms.internal.ads.C4108j80 c4108j80 = c2730Po.f30801K;
        if (c4108j80 == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Pool configuration missing from request."));
        }
        if (c4108j80.f36593G == 0 || c4108j80.f36594H == 0) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Caching is disabled."));
        }
        com.google.android.gms.internal.ads.C5599wl c5599wlB = p174r3.v.j().b(this.f35610C, p224w3.a.e(), this.f35615H);
        com.google.android.gms.internal.ads.AbstractC4758p30 abstractC4758p30A = this.f35613F.a(c2730Po, i6);
        com.google.android.gms.internal.ads.C5429v90 c5429v90C = abstractC4758p30A.c();
        final P4.d dVarV6 = v6(c2730Po, c5429v90C, abstractC4758p30A);
        com.google.android.gms.internal.ads.Q90 q90D = abstractC4758p30A.d();
        final com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f35610C, 9);
        final P4.d dVarU6 = u6(dVarV6, c5429v90C, c5599wlB, q90D, e90A);
        return c5429v90C.a(com.google.android.gms.internal.ads.EnumC4770p90.GET_URL_AND_CACHE_KEY, dVarV6, dVarU6).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.VR
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f32496a.s6(dVarU6, dVarV6, c2730Po, e90A);
            }
        }).a();
    }

    public final P4.d p6(final com.google.android.gms.internal.ads.C2730Po c2730Po, int i6) {
        com.google.android.gms.internal.ads.C3483dS c3483dST6;
        java.lang.String str;
        com.google.android.gms.internal.ads.C3343c90 c3343c90A;
        java.util.concurrent.Callable callable;
        com.google.android.gms.internal.ads.C5599wl c5599wlB = p174r3.v.j().b(this.f35610C, p224w3.a.e(), this.f35615H);
        com.google.android.gms.internal.ads.AbstractC4758p30 abstractC4758p30A = this.f35613F.a(c2730Po, i6);
        com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390llA = c5599wlB.a("google.afma.response.normalize", com.google.android.gms.internal.ads.C3702fS.f35344d, com.google.android.gms.internal.ads.AbstractC5269tl.f39021c);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2496Jg.f28738a.e()).booleanValue()) {
            c3483dST6 = t6(c2730Po.f30800J);
            if (c3483dST6 == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                p214v3.AbstractC7265q0.k(str);
            }
        } else {
            java.lang.String str2 = c2730Po.f30802L;
            c3483dST6 = null;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                p214v3.AbstractC7265q0.k(str);
            }
        }
        com.google.android.gms.internal.ads.E90 e90A = c3483dST6 == null ? com.google.android.gms.internal.ads.D90.a(this.f35610C, 9) : c3483dST6.f34726d;
        com.google.android.gms.internal.ads.Q90 q90D = abstractC4758p30A.d();
        q90D.d(c2730Po.f30793C.getStringArrayList("ad_types"));
        com.google.android.gms.internal.ads.C4580nS c4580nS = new com.google.android.gms.internal.ads.C4580nS(c2730Po.f30799I, q90D, e90A);
        com.google.android.gms.internal.ads.C4250kS c4250kS = new com.google.android.gms.internal.ads.C4250kS(this.f35610C, c2730Po.f30794D.f56217C, this.f35616I, i6);
        com.google.android.gms.internal.ads.C5429v90 c5429v90C = abstractC4758p30A.c();
        com.google.android.gms.internal.ads.E90 e90A2 = com.google.android.gms.internal.ads.D90.a(this.f35610C, 11);
        if (c3483dST6 == null) {
            final P4.d dVarV6 = v6(c2730Po, c5429v90C, abstractC4758p30A);
            final P4.d dVarU6 = u6(dVarV6, c5429v90C, c5599wlB, q90D, e90A);
            com.google.android.gms.internal.ads.E90 e90A3 = com.google.android.gms.internal.ads.D90.a(this.f35610C, 10);
            final com.google.android.gms.internal.ads.C3124a90 c3124a90A = c5429v90C.a(com.google.android.gms.internal.ads.EnumC4770p90.HTTP, dVarU6, dVarV6).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.SR
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.google.android.gms.internal.ads.C2730Po c2730Po2;
                    android.os.Bundle bundle;
                    com.google.android.gms.internal.ads.C2804Ro c2804Ro = (com.google.android.gms.internal.ads.C2804Ro) dVarU6.get();
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (bundle = (c2730Po2 = c2730Po).f30805O) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.MN.GET_AD_DICTIONARY_SDKCORE_START.e(), c2804Ro.c());
                        c2730Po2.f30805O.putLong(com.google.android.gms.internal.ads.MN.GET_AD_DICTIONARY_SDKCORE_END.e(), c2804Ro.b());
                    }
                    return new com.google.android.gms.internal.ads.C4470mS((org.json.JSONObject) dVarV6.get(), c2804Ro);
                }
            }).e(c4580nS).e(new com.google.android.gms.internal.ads.L90(e90A3)).e(c4250kS).a();
            com.google.android.gms.internal.ads.P90.a(c3124a90A, q90D, e90A3);
            com.google.android.gms.internal.ads.P90.d(c3124a90A, e90A2);
            c3343c90A = c5429v90C.a(com.google.android.gms.internal.ads.EnumC4770p90.PRE_PROCESS, dVarV6, dVarU6, c3124a90A);
            callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.TR
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    android.os.Bundle bundle;
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (bundle = c2730Po.f30805O) != null) {
                        bundle.putLong(com.google.android.gms.internal.ads.MN.HTTP_RESPONSE_READY.e(), p174r3.v.c().a());
                    }
                    return new com.google.android.gms.internal.ads.C3702fS((com.google.android.gms.internal.ads.C4140jS) c3124a90A.get(), (org.json.JSONObject) dVarV6.get(), (com.google.android.gms.internal.ads.C2804Ro) dVarU6.get());
                }
            };
        } else {
            com.google.android.gms.internal.ads.C4470mS c4470mS = new com.google.android.gms.internal.ads.C4470mS(c3483dST6.f34724b, c3483dST6.f34723a);
            com.google.android.gms.internal.ads.E90 e90A4 = com.google.android.gms.internal.ads.D90.a(this.f35610C, 10);
            final com.google.android.gms.internal.ads.C3124a90 c3124a90A2 = c5429v90C.b(com.google.android.gms.internal.ads.EnumC4770p90.HTTP, com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c4470mS)).e(c4580nS).e(new com.google.android.gms.internal.ads.L90(e90A4)).e(c4250kS).a();
            com.google.android.gms.internal.ads.P90.a(c3124a90A2, q90D, e90A4);
            final P4.d dVarH = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c3483dST6);
            com.google.android.gms.internal.ads.P90.d(c3124a90A2, e90A2);
            c3343c90A = c5429v90C.a(com.google.android.gms.internal.ads.EnumC4770p90.PRE_PROCESS, c3124a90A2, dVarH);
            callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.PR
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.google.android.gms.internal.ads.C4140jS c4140jS = (com.google.android.gms.internal.ads.C4140jS) c3124a90A2.get();
                    P4.d dVar = dVarH;
                    return new com.google.android.gms.internal.ads.C3702fS(c4140jS, ((com.google.android.gms.internal.ads.C3483dS) dVar.get()).f34724b, ((com.google.android.gms.internal.ads.C3483dS) dVar.get()).f34723a);
                }
            };
        }
        com.google.android.gms.internal.ads.C3124a90 c3124a90A3 = c3343c90A.a(callable).f(interfaceC4390llA).a();
        com.google.android.gms.internal.ads.P90.a(c3124a90A3, q90D, e90A2);
        return c3124a90A3;
    }

    public final P4.d q6(final com.google.android.gms.internal.ads.C2730Po c2730Po, int i6) {
        com.google.android.gms.internal.ads.C5599wl c5599wlB = p174r3.v.j().b(this.f35610C, p224w3.a.e(), this.f35615H);
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2680Og.f30547a.e()).booleanValue()) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Signal collection disabled."));
        }
        com.google.android.gms.internal.ads.AbstractC4758p30 abstractC4758p30A = this.f35613F.a(c2730Po, i6);
        final com.google.android.gms.internal.ads.O20 o20A = abstractC4758p30A.a();
        com.google.android.gms.internal.ads.InterfaceC4390ll interfaceC4390llA = c5599wlB.a("google.afma.request.getSignals", com.google.android.gms.internal.ads.AbstractC5269tl.f39020b, com.google.android.gms.internal.ads.AbstractC5269tl.f39021c);
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f35610C, 22);
        com.google.android.gms.internal.ads.C3124a90 c3124a90A = abstractC4758p30A.c().b(com.google.android.gms.internal.ads.EnumC4770p90.GET_SIGNALS, com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c2730Po.f30793C)).e(new com.google.android.gms.internal.ads.L90(e90A)).f(new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.ZR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) throws org.json.JSONException {
                return o20A.a(p184s3.C7147y.b().k((android.os.Bundle) obj), c2730Po.f30805O, false);
            }
        }).b(com.google.android.gms.internal.ads.EnumC4770p90.JS_SIGNALS).f(interfaceC4390llA).a();
        com.google.android.gms.internal.ads.Q90 q90D = abstractC4758p30A.d();
        q90D.d(c2730Po.f30793C.getStringArrayList("ad_types"));
        q90D.f(c2730Po.f30793C.getBundle("extras"));
        com.google.android.gms.internal.ads.P90.b(c3124a90A, q90D, e90A);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26277f.e()).booleanValue()) {
            com.google.android.gms.internal.ads.C4690oS c4690oS = this.f35612E;
            j$.util.Objects.requireNonNull(c4690oS);
            c3124a90A.e(new com.google.android.gms.internal.ads.WR(c4690oS), this.f35611D);
        }
        return c3124a90A;
    }

    public final P4.d r6(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2496Jg.f28738a.e()).booleanValue()) {
            return t6(str) == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("URL to be removed not found for cache key: ".concat(java.lang.String.valueOf(str)))) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C3264bS(this));
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void s2(com.google.android.gms.internal.ads.C5825yo c5825yo, com.google.android.gms.internal.ads.C2472Io c2472Io) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2754Qg.f31029a.e()).booleanValue()) {
            this.f35613F.N();
            java.lang.String str = c5825yo.f40141C;
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.C3154aS(this, c2472Io, c5825yo), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        } else {
            try {
                c2472Io.d2("", c5825yo);
            } catch (android.os.RemoteException e6) {
                p214v3.AbstractC7265q0.l("Service can't call client", e6);
            }
        }
    }

    final /* synthetic */ java.io.InputStream s6(P4.d dVar, P4.d dVar2, com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.E90 e90) {
        java.lang.String strE = ((com.google.android.gms.internal.ads.C2804Ro) dVar.get()).e();
        w6(new com.google.android.gms.internal.ads.C3483dS((com.google.android.gms.internal.ads.C2804Ro) dVar.get(), (org.json.JSONObject) dVar2.get(), c2730Po.f30800J, strE, e90));
        return new java.io.ByteArrayInputStream(strE.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
