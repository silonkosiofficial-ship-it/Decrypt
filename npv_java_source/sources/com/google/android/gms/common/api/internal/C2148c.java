package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2148c implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24886R = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final com.google.android.gms.common.api.Status f24887S = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final java.lang.Object f24888T = new java.lang.Object();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static com.google.android.gms.common.api.internal.C2148c f24889U;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Q3.C1480t f24892E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Q3.InterfaceC1482v f24893F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.content.Context f24894G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final N3.C1394g f24895H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Q3.G f24896I;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.os.Handler f24903P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private volatile boolean f24904Q;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f24890C = 10000;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f24891D = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f24897J = new java.util.concurrent.atomic.AtomicInteger(1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f24898K = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.Map f24899L = new j$.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.gms.common.api.internal.h f24900M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.util.Set f24901N = new p170r.C7027b();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.util.Set f24902O = new p170r.C7027b();

    private C2148c(android.content.Context context, android.os.Looper looper, N3.C1394g c1394g) {
        this.f24904Q = true;
        this.f24894G = context;
        p035d4.h hVar = new p035d4.h(looper, this);
        this.f24903P = hVar;
        this.f24895H = c1394g;
        this.f24896I = new Q3.G(c1394g);
        if (V3.j.a(context)) {
            this.f24904Q = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f24888T) {
            try {
                com.google.android.gms.common.api.internal.C2148c c2148c = f24889U;
                if (c2148c != null) {
                    c2148c.f24898K.incrementAndGet();
                    android.os.Handler handler = c2148c.f24903P;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status g(P3.C1446b c1446b, N3.C1389b c1389b) {
        return new com.google.android.gms.common.api.Status(c1389b, "API: " + c1446b.b() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(c1389b));
    }

    private final com.google.android.gms.common.api.internal.n h(O3.e eVar) {
        java.util.Map map = this.f24899L;
        P3.C1446b c1446bI = eVar.i();
        com.google.android.gms.common.api.internal.n nVar = (com.google.android.gms.common.api.internal.n) map.get(c1446bI);
        if (nVar == null) {
            nVar = new com.google.android.gms.common.api.internal.n(this, eVar);
            this.f24899L.put(c1446bI, nVar);
        }
        if (nVar.a()) {
            this.f24902O.add(c1446bI);
        }
        nVar.B();
        return nVar;
    }

    private final Q3.InterfaceC1482v i() {
        if (this.f24893F == null) {
            this.f24893F = Q3.AbstractC1481u.a(this.f24894G);
        }
        return this.f24893F;
    }

    private final void j() {
        Q3.C1480t c1480t = this.f24892E;
        if (c1480t != null) {
            if (c1480t.e() > 0 || e()) {
                i().b(c1480t);
            }
            this.f24892E = null;
        }
    }

    private final void k(p115l4.C6932m c6932m, int i6, O3.e eVar) {
        com.google.android.gms.common.api.internal.r rVarB;
        if (i6 == 0 || (rVarB = com.google.android.gms.common.api.internal.r.b(this, i6, eVar.i())) == null) {
            return;
        }
        p115l4.AbstractC6931l abstractC6931lA = c6932m.a();
        final android.os.Handler handler = this.f24903P;
        handler.getClass();
        abstractC6931lA.b(new java.util.concurrent.Executor() { // from class: P3.o
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, rVarB);
    }

    public static com.google.android.gms.common.api.internal.C2148c u(android.content.Context context) {
        com.google.android.gms.common.api.internal.C2148c c2148c;
        synchronized (f24888T) {
            try {
                if (f24889U == null) {
                    f24889U = new com.google.android.gms.common.api.internal.C2148c(context.getApplicationContext(), Q3.AbstractC1469h.b().getLooper(), N3.C1394g.m());
                }
                c2148c = f24889U;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2148c;
    }

    public final void A(O3.e eVar, int i6, com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b) {
        this.f24903P.sendMessage(this.f24903P.obtainMessage(4, new P3.u(new com.google.android.gms.common.api.internal.v(i6, abstractC2147b), this.f24898K.get(), eVar)));
    }

    public final void B(O3.e eVar, int i6, com.google.android.gms.common.api.internal.AbstractC2149d abstractC2149d, p115l4.C6932m c6932m, P3.k kVar) {
        k(c6932m, abstractC2149d.d(), eVar);
        this.f24903P.sendMessage(this.f24903P.obtainMessage(4, new P3.u(new com.google.android.gms.common.api.internal.w(i6, abstractC2149d, c6932m, kVar), this.f24898K.get(), eVar)));
    }

    final void C(Q3.C1474m c1474m, int i6, long j6, int i10) {
        this.f24903P.sendMessage(this.f24903P.obtainMessage(18, new com.google.android.gms.common.api.internal.s(c1474m, i6, j6, i10)));
    }

    public final void D(N3.C1389b c1389b, int i6) {
        if (f(c1389b, i6)) {
            return;
        }
        android.os.Handler handler = this.f24903P;
        handler.sendMessage(handler.obtainMessage(5, i6, 0, c1389b));
    }

    public final void E() {
        android.os.Handler handler = this.f24903P;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(O3.e eVar) {
        android.os.Handler handler = this.f24903P;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(com.google.android.gms.common.api.internal.h hVar) {
        synchronized (f24888T) {
            try {
                if (this.f24900M != hVar) {
                    this.f24900M = hVar;
                    this.f24901N.clear();
                }
                this.f24901N.addAll(hVar.t());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final void c(com.google.android.gms.common.api.internal.h hVar) {
        synchronized (f24888T) {
            try {
                if (this.f24900M == hVar) {
                    this.f24900M = null;
                    this.f24901N.clear();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final boolean e() {
        if (this.f24891D) {
            return false;
        }
        Q3.r rVarA = Q3.C1478q.b().a();
        if (rVarA != null && !rVarA.s()) {
            return false;
        }
        int iA = this.f24896I.a(this.f24894G, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean f(N3.C1389b c1389b, int i6) {
        return this.f24895H.w(this.f24894G, c1389b, i6);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fd  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01bf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01fd, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i6 = message.what;
        com.google.android.gms.common.api.internal.n nVar = null;
        switch (i6) {
            case 1:
                this.f24890C = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f24903P.removeMessages(12);
                for (P3.C1446b c1446b : this.f24899L.keySet()) {
                    android.os.Handler handler = this.f24903P;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1446b), this.f24890C);
                }
                return true;
            case 2:
                androidx.appcompat.app.D.a(message.obj);
                throw null;
            case 3:
                for (com.google.android.gms.common.api.internal.n nVar2 : this.f24899L.values()) {
                    nVar2.A();
                    nVar2.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                P3.u uVar = (P3.u) message.obj;
                com.google.android.gms.common.api.internal.n nVarH = (com.google.android.gms.common.api.internal.n) this.f24899L.get(uVar.f8322c.i());
                if (nVarH == null) {
                    nVarH = h(uVar.f8322c);
                }
                if (!nVarH.a() || this.f24898K.get() == uVar.f8321b) {
                    nVarH.C(uVar.f8320a);
                } else {
                    uVar.f8320a.a(f24886R);
                    nVarH.H();
                }
                return true;
            case 5:
                int i10 = message.arg1;
                N3.C1389b c1389b = (N3.C1389b) message.obj;
                for (com.google.android.gms.common.api.internal.n nVar3 : this.f24899L.values()) {
                    if (nVar3.p() == i10) {
                        nVar = nVar3;
                        if (nVar != null) {
                            java.lang.String str = "Could not find API instance " + i10 + " while trying to fail enqueued calls.";
                            new java.lang.Exception();
                        } else if (c1389b.e() == 13) {
                            nVar.e(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + this.f24895H.e(c1389b.e()) + ": " + c1389b.f()));
                        } else {
                            nVar.e(g(nVar.f24928E, c1389b));
                        }
                        return true;
                    }
                }
                if (nVar != null) {
                    java.lang.String str2 = "Could not find API instance " + i10 + " while trying to fail enqueued calls.";
                    new java.lang.Exception();
                } else if (c1389b.e() == 13) {
                    nVar.e(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + this.f24895H.e(c1389b.e()) + ": " + c1389b.f()));
                } else {
                    nVar.e(g(nVar.f24928E, c1389b));
                }
                return true;
            case 6:
                if (this.f24894G.getApplicationContext() instanceof android.app.Application) {
                    com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.c((android.app.Application) this.f24894G.getApplicationContext());
                    com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().a(new com.google.android.gms.common.api.internal.i(this));
                    if (!com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().e(true)) {
                        this.f24890C = 300000L;
                    }
                }
                return true;
            case 7:
                h((O3.e) message.obj);
                return true;
            case 9:
                if (this.f24899L.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.n) this.f24899L.get(message.obj)).G();
                }
                return true;
            case 10:
                java.util.Iterator it = this.f24902O.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.common.api.internal.n nVar4 = (com.google.android.gms.common.api.internal.n) this.f24899L.remove((P3.C1446b) it.next());
                    if (nVar4 != null) {
                        nVar4.H();
                    }
                }
                this.f24902O.clear();
                return true;
            case 11:
                if (this.f24899L.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.n) this.f24899L.get(message.obj)).I();
                }
                return true;
            case 12:
                if (this.f24899L.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.n) this.f24899L.get(message.obj)).b();
                }
                return true;
            case 14:
                androidx.appcompat.app.D.a(message.obj);
                throw null;
            case 15:
                com.google.android.gms.common.api.internal.o oVar = (com.google.android.gms.common.api.internal.o) message.obj;
                if (this.f24899L.containsKey(oVar.f24939a)) {
                    com.google.android.gms.common.api.internal.n.y((com.google.android.gms.common.api.internal.n) this.f24899L.get(oVar.f24939a), oVar);
                }
                return true;
            case 16:
                com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) message.obj;
                if (this.f24899L.containsKey(oVar2.f24939a)) {
                    com.google.android.gms.common.api.internal.n.z((com.google.android.gms.common.api.internal.n) this.f24899L.get(oVar2.f24939a), oVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                com.google.android.gms.common.api.internal.s sVar = (com.google.android.gms.common.api.internal.s) message.obj;
                if (sVar.f24956c == 0) {
                    i().b(new Q3.C1480t(sVar.f24955b, java.util.Arrays.asList(sVar.f24954a)));
                } else {
                    Q3.C1480t c1480t = this.f24892E;
                    if (c1480t != null) {
                        java.util.List listF = c1480t.f();
                        if (c1480t.e() != sVar.f24955b || (listF != null && listF.size() >= sVar.f24957d)) {
                            this.f24903P.removeMessages(17);
                            j();
                        } else {
                            this.f24892E.s(sVar.f24954a);
                        }
                    }
                    if (this.f24892E == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(sVar.f24954a);
                        this.f24892E = new Q3.C1480t(sVar.f24955b, arrayList);
                        android.os.Handler handler2 = this.f24903P;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), sVar.f24956c);
                    }
                }
                return true;
            case 19:
                this.f24891D = false;
                return true;
            default:
                java.lang.String str3 = "Unknown message id: " + i6;
                return false;
        }
    }

    public final int l() {
        return this.f24897J.getAndIncrement();
    }

    final com.google.android.gms.common.api.internal.n t(P3.C1446b c1446b) {
        return (com.google.android.gms.common.api.internal.n) this.f24899L.get(c1446b);
    }
}
