package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4866q20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C4975r20 f38146k = new com.google.android.gms.internal.ads.C4975r20(new org.json.JSONArray().toString(), new android.os.Bundle());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f38147l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f38148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f38149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4805pX f38150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.Context f38151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f38152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4365lX f38153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f38154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5016rP f38155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final java.lang.String f38157j;

    C4866q20(com.google.android.gms.internal.ads.Yk0 yk0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.String str, com.google.android.gms.internal.ads.C4805pX c4805pX, android.content.Context context, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C4365lX c4365lX, com.google.android.gms.internal.ads.SM sm, com.google.android.gms.internal.ads.C5016rP c5016rP, int i6) {
        this.f38148a = yk0;
        this.f38149b = scheduledExecutorService;
        this.f38157j = str;
        this.f38150c = c4805pX;
        this.f38151d = context;
        this.f38152e = c4546n70;
        this.f38153f = c4365lX;
        this.f38154g = sm;
        this.f38155h = c5016rP;
        this.f38156i = i6;
    }

    public static /* synthetic */ P4.d c(com.google.android.gms.internal.ads.C4866q20 c4866q20) {
        java.util.Map mapA;
        java.lang.String lowerCase = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Na)).booleanValue() ? c4866q20.f38152e.f37513f.toLowerCase(java.util.Locale.ROOT) : c4866q20.f38152e.f37513f;
        final android.os.Bundle bundleA = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25329L1)).booleanValue() ? c4866q20.f38155h.a() : new android.os.Bundle();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25428U1)).booleanValue()) {
            mapA = c4866q20.f38150c.a(c4866q20.f38157j, lowerCase);
        } else {
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.AbstractC3727fi0) c4866q20.f38150c.b(c4866q20.f38157j, lowerCase)).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                arrayList.add(c4866q20.g(str, (java.util.List) entry.getValue(), c4866q20.f(str), true, true));
            }
            mapA = c4866q20.f38150c.c();
        }
        c4866q20.i(arrayList, mapA);
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.b(arrayList).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i6 = com.google.android.gms.internal.ads.C4866q20.f38147l;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (P4.d dVar : arrayList) {
                    if (((org.json.JSONObject) dVar.get()) != null) {
                        jSONArray.put(dVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new com.google.android.gms.internal.ads.C4975r20(jSONArray.toString(), bundleA);
            }
        }, c4866q20.f38148a);
    }

    private final android.os.Bundle f(java.lang.String str) {
        android.os.Bundle bundle = this.f38152e.f37511d.f54164O;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.AbstractC2283Dk0 g(final java.lang.String str, final java.util.List list, final android.os.Bundle bundle, final boolean z6, final boolean z10) {
        com.google.android.gms.internal.ads.AbstractC2283Dk0 abstractC2283Dk0D = com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC2652Nk0.k(new com.google.android.gms.internal.ads.InterfaceC5158sk0() { // from class: com.google.android.gms.internal.ads.n20
            @Override // com.google.android.gms.internal.ads.InterfaceC5158sk0
            public final P4.d a() {
                return this.f37483a.d(str, list, bundle, z6, z10);
            }
        }, this.f38148a));
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25285H1)).booleanValue()) {
            abstractC2283Dk0D = (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(abstractC2283Dk0D, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25210A1)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f38149b);
        }
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e(abstractC2283Dk0D, java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.o20
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.String str2 = str;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                p224w3.p.d("Error calling adapter: ".concat(java.lang.String.valueOf(str2)));
                boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sc)).booleanValue();
                java.lang.String strConcat = "rtbSignal.fetchRtbJsonInfo-".concat(java.lang.String.valueOf(str2));
                if (zBooleanValue) {
                    p174r3.v.s().w(th, strConcat);
                    return null;
                }
                p174r3.v.s().x(th, strConcat);
                return null;
            }
        }, this.f38148a);
    }

    private final void h(com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.BinderC5134sX binderC5134sX) {
        interfaceC2874Tm.q1(X3.b.c2(this.f38151d), this.f38157j, bundle, (android.os.Bundle) list.get(0), this.f38152e.f37512e, binderC5134sX);
    }

    private final void i(java.util.List list, java.util.Map map) {
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C5244tX c5244tX = (com.google.android.gms.internal.ads.C5244tX) ((java.util.Map.Entry) it.next()).getValue();
            java.lang.String str = c5244tX.f38960a;
            list.add(g(str, java.util.Collections.singletonList(c5244tX.f38964e), f(str), c5244tX.f38961b, c5244tX.f38962c));
        }
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        if (this.f38156i == 2) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(f38146k);
        }
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = this.f38152e;
        if (c4546n70.f37525r) {
            if (!java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25351N1)).split(",")).contains(B3.AbstractC0797c.b(B3.AbstractC0797c.c(c4546n70.f37511d)))) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(f38146k);
            }
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.k(new com.google.android.gms.internal.ads.InterfaceC5158sk0() { // from class: com.google.android.gms.internal.ads.k20
            @Override // com.google.android.gms.internal.ads.InterfaceC5158sk0
            public final P4.d a() {
                return com.google.android.gms.internal.ads.C4866q20.c(this.f36886a);
            }
        }, this.f38148a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ P4.d d(java.lang.String str, final java.util.List list, final android.os.Bundle bundle, boolean z6, boolean z10) {
        com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874TmB;
        final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        if (z10) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25340M1)).booleanValue()) {
                try {
                    interfaceC2874TmB = this.f38154g.b(str);
                } catch (android.os.RemoteException e6) {
                    p214v3.AbstractC7265q0.l("Couldn't create RTB adapter : ", e6);
                    interfaceC2874TmB = null;
                }
            } else {
                this.f38153f.b(str);
                interfaceC2874TmB = this.f38153f.a(str);
            }
        } else {
            interfaceC2874TmB = this.f38154g.b(str);
        }
        if (interfaceC2874TmB == null) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25230C1)).booleanValue()) {
                throw null;
            }
            com.google.android.gms.internal.ads.BinderC5134sX.o6(str, c4512mr);
        } else {
            final com.google.android.gms.internal.ads.BinderC5134sX binderC5134sX = new com.google.android.gms.internal.ads.BinderC5134sX(str, interfaceC2874TmB, c4512mr, p174r3.v.c().c());
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25285H1)).booleanValue()) {
                this.f38149b.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.p20
                    @Override // java.lang.Runnable
                    public final void run() {
                        binderC5134sX.c();
                    }
                }, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25210A1)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (z6) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25362O1)).booleanValue()) {
                    final com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm = interfaceC2874TmB;
                    this.f38148a.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.m20
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37269C.e(interfaceC2874Tm, bundle, list, binderC5134sX, c4512mr);
                        }
                    });
                } else {
                    h(interfaceC2874TmB, bundle, list, binderC5134sX);
                }
            } else {
                binderC5134sX.f();
            }
        }
        return c4512mr;
    }

    final /* synthetic */ void e(com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.BinderC5134sX binderC5134sX, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        try {
            h(interfaceC2874Tm, bundle, list, binderC5134sX);
        } catch (android.os.RemoteException e6) {
            c4512mr.d(e6);
        }
    }
}
