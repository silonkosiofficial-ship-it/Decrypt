package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6053k3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.Object f41005h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile com.google.android.gms.internal.measurement.AbstractC6145v3 f41006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static com.google.android.gms.internal.measurement.C6177z3 f41007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f41008k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C6121s3 f41009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f41010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f41011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f41012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile java.lang.Object f41013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f41015g;

    static {
        new java.util.concurrent.atomic.AtomicReference();
        f41007j = new com.google.android.gms.internal.measurement.C6177z3(new com.google.android.gms.internal.measurement.InterfaceC6169y3() { // from class: com.google.android.gms.internal.measurement.p3
            @Override // com.google.android.gms.internal.measurement.InterfaceC6169y3
            public final boolean a() {
                return com.google.android.gms.internal.measurement.AbstractC6053k3.n();
            }
        });
        f41008k = new java.util.concurrent.atomic.AtomicInteger();
    }

    private AbstractC6053k3(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Object obj, boolean z6) {
        this.f41012d = -1;
        java.lang.String str2 = c6121s3.f41188a;
        if (str2 == null && c6121s3.f41189b == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c6121s3.f41189b != null) {
            throw new java.lang.IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f41009a = c6121s3;
        this.f41010b = str;
        this.f41011c = obj;
        this.f41014f = z6;
        this.f41015g = false;
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6053k3 b(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Boolean bool, boolean z6) {
        return new com.google.android.gms.internal.measurement.C6113r3(c6121s3, str, bool, true);
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6053k3 c(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Double d6, boolean z6) {
        return new com.google.android.gms.internal.measurement.C6106q3(c6121s3, str, d6, true);
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6053k3 d(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Long l6, boolean z6) {
        return new com.google.android.gms.internal.measurement.C6089o3(c6121s3, str, l6, true);
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6053k3 e(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.String str2, boolean z6) {
        return new com.google.android.gms.internal.measurement.C6129t3(c6121s3, str, str2, true);
    }

    private final java.lang.Object g(com.google.android.gms.internal.measurement.AbstractC6145v3 abstractC6145v3) {
        M4.c cVar;
        com.google.android.gms.internal.measurement.C6121s3 c6121s3 = this.f41009a;
        if (!c6121s3.f41192e && ((cVar = c6121s3.f41196i) == null || ((java.lang.Boolean) cVar.apply(abstractC6145v3.a())).booleanValue())) {
            com.google.android.gms.internal.measurement.C5990d3 c5990d3A = com.google.android.gms.internal.measurement.C5990d3.a(abstractC6145v3.a());
            com.google.android.gms.internal.measurement.C6121s3 c6121s4 = this.f41009a;
            java.lang.Object objO = c5990d3A.o(c6121s4.f41192e ? null : i(c6121s4.f41190c));
            if (objO != null) {
                return h(objO);
            }
        }
        return null;
    }

    private final java.lang.String i(java.lang.String str) {
        if (str != null && str.isEmpty()) {
            return this.f41010b;
        }
        return str + this.f41010b;
    }

    private final java.lang.Object j(com.google.android.gms.internal.measurement.AbstractC6145v3 abstractC6145v3) {
        com.google.android.gms.internal.measurement.InterfaceC5981c3 interfaceC5981c3B;
        java.lang.Object objO;
        if (this.f41009a.f41189b == null) {
            interfaceC5981c3B = com.google.android.gms.internal.measurement.C6161x3.b(abstractC6145v3.a(), this.f41009a.f41188a, new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.n3
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.measurement.AbstractC6053k3.m();
                }
            });
        } else if (com.google.android.gms.internal.measurement.AbstractC6044j3.b(abstractC6145v3.a(), this.f41009a.f41189b)) {
            interfaceC5981c3B = this.f41009a.f41195h ? com.google.android.gms.internal.measurement.V2.a(abstractC6145v3.a().getContentResolver(), com.google.android.gms.internal.measurement.AbstractC6062l3.a(com.google.android.gms.internal.measurement.AbstractC6062l3.b(abstractC6145v3.a(), this.f41009a.f41189b.getLastPathSegment())), new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.n3
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.measurement.AbstractC6053k3.m();
                }
            }) : com.google.android.gms.internal.measurement.V2.a(abstractC6145v3.a().getContentResolver(), this.f41009a.f41189b, new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.n3
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.measurement.AbstractC6053k3.m();
                }
            });
        } else {
            interfaceC5981c3B = null;
        }
        if (interfaceC5981c3B == null || (objO = interfaceC5981c3B.o(k())) == null) {
            return null;
        }
        return h(objO);
    }

    public static void l(final android.content.Context context) {
        if (f41006i != null || context == null) {
            return;
        }
        java.lang.Object obj = f41005h;
        synchronized (obj) {
            try {
                if (f41006i == null) {
                    synchronized (obj) {
                        try {
                            com.google.android.gms.internal.measurement.AbstractC6145v3 abstractC6145v3 = f41006i;
                            android.content.Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC6145v3 == null || abstractC6145v3.a() != context) {
                                if (abstractC6145v3 != null) {
                                    com.google.android.gms.internal.measurement.V2.d();
                                    com.google.android.gms.internal.measurement.C6161x3.c();
                                    com.google.android.gms.internal.measurement.C5990d3.b();
                                }
                                f41006i = new com.google.android.gms.internal.measurement.W2(context, M4.l.a(new M4.k() { // from class: com.google.android.gms.internal.measurement.m3
                                    @Override // M4.k
                                    public final java.lang.Object get() {
                                        return com.google.android.gms.internal.measurement.C6026h3.a.a(context);
                                    }
                                }));
                                f41008k.incrementAndGet();
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m() {
        f41008k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final java.lang.Object o() {
        return this.f41011c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    public final java.lang.Object f() {
        java.lang.Object objJ;
        if (!this.f41014f) {
            M4.h.o(f41007j.a(this.f41010b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i6 = f41008k.get();
        if (this.f41012d < i6) {
            synchronized (this) {
                try {
                    if (this.f41012d < i6) {
                        com.google.android.gms.internal.measurement.AbstractC6145v3 abstractC6145v3 = f41006i;
                        M4.g gVarA = M4.g.a();
                        java.lang.String strA = null;
                        if (abstractC6145v3 != null) {
                            gVarA = (M4.g) abstractC6145v3.b().get();
                            if (gVarA.c()) {
                                com.google.android.gms.internal.measurement.InterfaceC6035i3 interfaceC6035i3 = (com.google.android.gms.internal.measurement.InterfaceC6035i3) gVarA.b();
                                com.google.android.gms.internal.measurement.C6121s3 c6121s3 = this.f41009a;
                                strA = interfaceC6035i3.a(c6121s3.f41189b, c6121s3.f41188a, c6121s3.f41191d, this.f41010b);
                            }
                        }
                        M4.h.o(abstractC6145v3 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.f41009a.f41193f) {
                            objJ = g(abstractC6145v3);
                            if (objJ == null && (objJ = j(abstractC6145v3)) == null) {
                                objJ = o();
                            }
                        } else {
                            objJ = j(abstractC6145v3);
                            if (objJ == null && (objJ = g(abstractC6145v3)) == null) {
                                objJ = o();
                            }
                        }
                        if (gVarA.c()) {
                            objJ = strA == null ? o() : h(strA);
                        }
                        this.f41013e = objJ;
                        this.f41012d = i6;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f41013e;
    }

    abstract java.lang.Object h(java.lang.Object obj);

    public final java.lang.String k() {
        return i(this.f41009a.f41191d);
    }
}
