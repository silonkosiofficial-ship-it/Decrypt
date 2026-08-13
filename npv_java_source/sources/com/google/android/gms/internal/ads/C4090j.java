package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4090j implements com.google.android.gms.internal.ads.InterfaceC4624ns {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final java.util.concurrent.Executor f36516o = new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.MK0
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3433d f36518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4530n f36519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5189t f36520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2612Mj f36521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f36522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.L f36523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4447mD f36524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArraySet f36525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4200k f36526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5666xI f36527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.util.Pair f36528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36530n;

    /* synthetic */ C4090j(com.google.android.gms.internal.ads.OK0 ok0, com.google.android.gms.internal.ads.AbstractC3982i abstractC3982i) {
        android.content.Context context = ok0.f30482a;
        this.f36517a = context;
        com.google.android.gms.internal.ads.C3433d c3433d = new com.google.android.gms.internal.ads.C3433d(this, context);
        this.f36518b = c3433d;
        com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD = ok0.f30487f;
        this.f36524h = interfaceC4447mD;
        com.google.android.gms.internal.ads.C4530n c4530n = ok0.f30483b;
        this.f36519c = c4530n;
        c4530n.k(interfaceC4447mD);
        com.google.android.gms.internal.ads.C5189t c5189t = new com.google.android.gms.internal.ads.C5189t(new com.google.android.gms.internal.ads.PK0(this, null), c4530n);
        this.f36520d = c5189t;
        com.google.android.gms.internal.ads.InterfaceC2612Mj interfaceC2612Mj = ok0.f30485d;
        com.google.android.gms.internal.ads.LC.b(interfaceC2612Mj);
        this.f36521e = interfaceC2612Mj;
        this.f36522f = ok0.f30486e;
        this.f36523g = new com.google.android.gms.internal.ads.C5561wK0(c4530n, c5189t);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        this.f36525i = copyOnWriteArraySet;
        this.f36530n = 0;
        new com.google.android.gms.internal.ads.C4682oK0().H();
        copyOnWriteArraySet.add(c3433d);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2622Mr c(com.google.android.gms.internal.ads.C4090j c4090j, com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.K {
        com.google.android.gms.internal.ads.LC.f(c4090j.f36530n == 0);
        com.google.android.gms.internal.ads.PA0 pa0V = v(d6.f26550C);
        if (pa0V.f30664c == 7 && com.google.android.gms.internal.ads.EW.f27061a < 34) {
            com.google.android.gms.internal.ads.Oz0 oz0C = pa0V.c();
            oz0C.d(6);
            pa0V = oz0C.g();
        }
        com.google.android.gms.internal.ads.PA0 pa0 = pa0V;
        com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD = c4090j.f36524h;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.LC.b(looperMyLooper);
        final com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xID = interfaceC4447mD.d(looperMyLooper, null);
        c4090j.f36527k = interfaceC5666xID;
        try {
            com.google.android.gms.internal.ads.InterfaceC2612Mj interfaceC2612Mj = c4090j.f36521e;
            android.content.Context context = c4090j.f36517a;
            com.google.android.gms.internal.ads.InterfaceC5105sC0 interfaceC5105sC0 = com.google.android.gms.internal.ads.InterfaceC5105sC0.f38701a;
            j$.util.Objects.requireNonNull(interfaceC5666xID);
            interfaceC2612Mj.a(context, pa0, interfaceC5105sC0, c4090j, new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.NK0
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    interfaceC5666xID.n(runnable);
                }
            }, com.google.android.gms.internal.ads.AbstractC3398ci0.O(), 0L);
            android.util.Pair pair = c4090j.f36528l;
            if (pair == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.UR ur = (com.google.android.gms.internal.ads.UR) pair.second;
            ur.b();
            ur.a();
            throw null;
        } catch (com.google.android.gms.internal.ads.C2437Hq e6) {
            throw new com.google.android.gms.internal.ads.K(e6, d6);
        }
    }

    static /* bridge */ /* synthetic */ void l(final com.google.android.gms.internal.ads.C4090j c4090j, boolean z6) {
        if (c4090j.f36530n == 1) {
            c4090j.f36529m++;
            c4090j.f36523g.H0(z6);
            com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xI = c4090j.f36527k;
            com.google.android.gms.internal.ads.LC.b(interfaceC5666xI);
            interfaceC5666xI.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.LK0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29472C.q();
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean t(com.google.android.gms.internal.ads.C4090j c4090j, long j6) {
        return c4090j.f36529m == 0 && c4090j.f36520d.d(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.PA0 v(com.google.android.gms.internal.ads.PA0 pa0) {
        return (pa0 == null || !pa0.f()) ? com.google.android.gms.internal.ads.PA0.f30661h : pa0;
    }

    public final com.google.android.gms.internal.ads.L h() {
        return this.f36518b;
    }

    public final void p() {
        com.google.android.gms.internal.ads.UR ur = com.google.android.gms.internal.ads.UR.f32204c;
        ur.b();
        ur.a();
        this.f36528l = null;
    }

    final /* synthetic */ void q() {
        this.f36529m--;
    }

    public final void r() {
        if (this.f36530n == 2) {
            return;
        }
        com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xI = this.f36527k;
        if (interfaceC5666xI != null) {
            interfaceC5666xI.d(null);
        }
        this.f36528l = null;
        this.f36530n = 2;
    }

    public final void s(android.view.Surface surface, com.google.android.gms.internal.ads.UR ur) {
        android.util.Pair pair = this.f36528l;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((com.google.android.gms.internal.ads.UR) this.f36528l.second).equals(ur)) {
            return;
        }
        this.f36528l = android.util.Pair.create(surface, ur);
        ur.b();
        ur.a();
    }
}
