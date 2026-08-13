package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UC0 implements com.google.android.gms.internal.ads.ZD0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f32166h = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.RC0
        @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
        public final java.lang.Object a() {
            return com.google.android.gms.internal.ads.UC0.n();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.Random f32167i = new java.util.Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.YD0 f32171d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f32173f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2764Ql f32168a = new com.google.android.gms.internal.ads.C2764Ql();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4830pl f32169b = new com.google.android.gms.internal.ads.C4830pl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f32170c = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC4942qm f32172e = com.google.android.gms.internal.ads.AbstractC4942qm.f38311a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32174g = -1;

    public UC0(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long l() {
        com.google.android.gms.internal.ads.SC0 sc0 = (com.google.android.gms.internal.ads.SC0) this.f32170c.get(this.f32173f);
        return (sc0 == null || sc0.f31644c == -1) ? this.f32174g + 1 : sc0.f31644c;
    }

    private final com.google.android.gms.internal.ads.SC0 m(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        long j6 = Long.MAX_VALUE;
        com.google.android.gms.internal.ads.SC0 sc0 = null;
        for (com.google.android.gms.internal.ads.SC0 sc1 : this.f32170c.values()) {
            sc1.g(i6, lh0);
            if (sc1.j(i6, lh0)) {
                long j10 = sc1.f31644c;
                if (j10 == -1 || j10 < j6) {
                    sc0 = sc1;
                    j6 = j10;
                } else if (j10 == j6) {
                    int i10 = com.google.android.gms.internal.ads.EW.f27061a;
                    if (sc0.f31645d != null && sc1.f31645d != null) {
                        sc0 = sc1;
                    }
                }
            }
        }
        if (sc0 != null) {
            return sc0;
        }
        java.lang.String strN = n();
        com.google.android.gms.internal.ads.SC0 sc2 = new com.google.android.gms.internal.ads.SC0(this, strN, i6, lh0);
        this.f32170c.put(strN, sc2);
        return sc2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String n() {
        byte[] bArr = new byte[12];
        f32167i.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    private final void o(com.google.android.gms.internal.ads.SC0 sc0) {
        if (sc0.f31644c != -1) {
            this.f32174g = sc0.f31644c;
        }
        this.f32173f = null;
    }

    private final void p(com.google.android.gms.internal.ads.LB0 lb0) {
        if (lb0.f29431b.o()) {
            java.lang.String str = this.f32173f;
            if (str != null) {
                com.google.android.gms.internal.ads.SC0 sc0 = (com.google.android.gms.internal.ads.SC0) this.f32170c.get(str);
                sc0.getClass();
                o(sc0);
                return;
            }
            return;
        }
        com.google.android.gms.internal.ads.SC0 sc1 = (com.google.android.gms.internal.ads.SC0) this.f32170c.get(this.f32173f);
        com.google.android.gms.internal.ads.SC0 sc0M = m(lb0.f29432c, lb0.f29433d);
        this.f32173f = sc0M.f31642a;
        a(lb0);
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if (lh0 == null || !lh0.b()) {
            return;
        }
        if (sc1 != null) {
            if (sc1.f31644c == lh0.f29457d && sc1.f31645d != null && sc1.f31645d.f29455b == lb0.f29433d.f29455b && sc1.f31645d.f29456c == lb0.f29433d.f29456c) {
                return;
            }
        }
        com.google.android.gms.internal.ads.LH0 lh1 = lb0.f29433d;
        java.lang.String unused = m(lb0.f29432c, new com.google.android.gms.internal.ads.LH0(lh1.f29454a, lh1.f29457d)).f31642a;
        java.lang.String unused2 = sc0M.f31642a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized void a(com.google.android.gms.internal.ads.LB0 lb0) {
        com.google.android.gms.internal.ads.SC0 sc0M;
        com.google.android.gms.internal.ads.LH0 lh0;
        com.google.android.gms.internal.ads.SC0 sc0M2;
        com.google.android.gms.internal.ads.SC0 sc0;
        try {
            if (this.f32171d == null) {
                throw null;
            }
            if (!lb0.f29431b.o()) {
                com.google.android.gms.internal.ads.LH0 lh1 = lb0.f29433d;
                if (lh1 == null) {
                    sc0M = m(lb0.f29432c, lb0.f29433d);
                    if (this.f32173f == null) {
                        this.f32173f = sc0M.f31642a;
                    }
                    lh0 = lb0.f29433d;
                    if (lh0 != null) {
                        sc0M2 = m(lb0.f29432c, new com.google.android.gms.internal.ads.LH0(lh0.f29454a, lh0.f29457d, lh0.f29455b));
                        if (!sc0M2.f31646e) {
                            sc0M2.f31646e = true;
                            lb0.f29431b.n(lb0.f29433d.f29454a, this.f32169b);
                            this.f32169b.g(lb0.f29433d.f29455b);
                            java.lang.Math.max(0L, com.google.android.gms.internal.ads.EW.N(0L) + com.google.android.gms.internal.ads.EW.N(0L));
                            java.lang.String unused = sc0M2.f31642a;
                        }
                    }
                    if (!sc0M.f31646e) {
                        sc0M.f31646e = true;
                        java.lang.String unused2 = sc0M.f31642a;
                    }
                    if (sc0M.f31642a.equals(this.f32173f)) {
                        sc0M.f31647f = true;
                        this.f32171d.i(lb0, sc0M.f31642a);
                    }
                } else if (lh1.f29457d >= l() && ((sc0 = (com.google.android.gms.internal.ads.SC0) this.f32170c.get(this.f32173f)) == null || sc0.f31644c != -1 || sc0.f31643b == lb0.f29432c)) {
                    sc0M = m(lb0.f29432c, lb0.f29433d);
                    if (this.f32173f == null) {
                        this.f32173f = sc0M.f31642a;
                    }
                    lh0 = lb0.f29433d;
                    if (lh0 != null && lh0.b()) {
                        sc0M2 = m(lb0.f29432c, new com.google.android.gms.internal.ads.LH0(lh0.f29454a, lh0.f29457d, lh0.f29455b));
                        if (!sc0M2.f31646e) {
                            sc0M2.f31646e = true;
                            lb0.f29431b.n(lb0.f29433d.f29454a, this.f32169b);
                            this.f32169b.g(lb0.f29433d.f29455b);
                            java.lang.Math.max(0L, com.google.android.gms.internal.ads.EW.N(0L) + com.google.android.gms.internal.ads.EW.N(0L));
                            java.lang.String unused3 = sc0M2.f31642a;
                        }
                    }
                    if (!sc0M.f31646e) {
                        sc0M.f31646e = true;
                        java.lang.String unused4 = sc0M.f31642a;
                    }
                    if (sc0M.f31642a.equals(this.f32173f) && !sc0M.f31647f) {
                        sc0M.f31647f = true;
                        this.f32171d.i(lb0, sc0M.f31642a);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized void b(com.google.android.gms.internal.ads.LB0 lb0) {
        try {
            if (this.f32171d == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm = this.f32172e;
            this.f32172e = lb0.f29431b;
            java.util.Iterator it = this.f32170c.values().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.SC0 sc0 = (com.google.android.gms.internal.ads.SC0) it.next();
                if (!sc0.l(abstractC4942qm, this.f32172e) || sc0.k(lb0)) {
                    it.remove();
                    if (sc0.f31646e) {
                        if (sc0.f31642a.equals(this.f32173f)) {
                            o(sc0);
                        }
                        this.f32171d.f(lb0, sc0.f31642a, false);
                    }
                }
            }
            p(lb0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized java.lang.String c(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0) {
        return m(abstractC4942qm.n(lh0.f29454a, this.f32169b).f38060c, lh0).f31642a;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized java.lang.String d() {
        return this.f32173f;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized void e(com.google.android.gms.internal.ads.LB0 lb0, int i6) {
        try {
            if (this.f32171d == null) {
                throw null;
            }
            java.util.Iterator it = this.f32170c.values().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.SC0 sc0 = (com.google.android.gms.internal.ads.SC0) it.next();
                if (sc0.k(lb0)) {
                    it.remove();
                    if (sc0.f31646e) {
                        boolean zEquals = sc0.f31642a.equals(this.f32173f);
                        boolean z6 = false;
                        if (i6 == 0 && zEquals && sc0.f31647f) {
                            z6 = true;
                        }
                        if (zEquals) {
                            o(sc0);
                        }
                        this.f32171d.f(lb0, sc0.f31642a, z6);
                    }
                }
            }
            p(lb0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final synchronized void f(com.google.android.gms.internal.ads.LB0 lb0) {
        com.google.android.gms.internal.ads.YD0 yd0;
        try {
            java.lang.String str = this.f32173f;
            if (str != null) {
                com.google.android.gms.internal.ads.SC0 sc0 = (com.google.android.gms.internal.ads.SC0) this.f32170c.get(str);
                if (sc0 == null) {
                    throw null;
                }
                o(sc0);
            }
            java.util.Iterator it = this.f32170c.values().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.SC0 sc1 = (com.google.android.gms.internal.ads.SC0) it.next();
                it.remove();
                if (sc1.f31646e && (yd0 = this.f32171d) != null) {
                    yd0.f(lb0, sc1.f31642a, false);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void g(com.google.android.gms.internal.ads.YD0 yd0) {
        this.f32171d = yd0;
    }
}
