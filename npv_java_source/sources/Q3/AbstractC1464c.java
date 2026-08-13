package Q3;

/* JADX INFO: renamed from: Q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1464c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f8886A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile Q3.h0 f8887B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected java.util.concurrent.atomic.AtomicInteger f8888C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile java.lang.String f8894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Q3.s0 f8895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.content.Context f8896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.os.Looper f8897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q3.AbstractC1469h f8898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final N3.C1395h f8899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final android.os.Handler f8900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.Object f8901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.lang.Object f8902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Q3.InterfaceC1473l f8903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Q3.AbstractC1464c.InterfaceC0206c f8904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.os.IInterface f8905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final java.util.ArrayList f8906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Q3.e0 f8907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Q3.AbstractC1464c.a f8909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Q3.AbstractC1464c.b f8910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f8911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final java.lang.String f8912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile java.lang.String f8913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private N3.C1389b f8914z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final N3.C1391d[] f8885E = new N3.C1391d[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final java.lang.String[] f8884D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: Q3.c$a */
    public interface a {
        void L0(android.os.Bundle bundle);

        void y0(int i6);
    }

    /* JADX INFO: renamed from: Q3.c$b */
    public interface b {
        void q0(N3.C1389b c1389b);
    }

    /* JADX INFO: renamed from: Q3.c$c, reason: collision with other inner class name */
    public interface InterfaceC0206c {
        void a(N3.C1389b c1389b);
    }

    /* JADX INFO: renamed from: Q3.c$d */
    protected class d implements Q3.AbstractC1464c.InterfaceC0206c {
        public d() {
        }

        @Override // Q3.AbstractC1464c.InterfaceC0206c
        public final void a(N3.C1389b c1389b) {
            if (c1389b.C()) {
                Q3.AbstractC1464c abstractC1464c = Q3.AbstractC1464c.this;
                abstractC1464c.i(null, abstractC1464c.C());
            } else if (Q3.AbstractC1464c.this.f8910v != null) {
                Q3.AbstractC1464c.this.f8910v.q0(c1389b);
            }
        }
    }

    /* JADX INFO: renamed from: Q3.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC1464c(android.content.Context context, android.os.Looper looper, int i6, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar, java.lang.String str) {
        Q3.AbstractC1469h abstractC1469hA = Q3.AbstractC1469h.a(context);
        N3.C1395h c1395hF = N3.C1395h.f();
        Q3.AbstractC1477p.l(aVar);
        Q3.AbstractC1477p.l(bVar);
        this(context, looper, abstractC1469hA, c1395hF, i6, aVar, bVar, str);
    }

    protected AbstractC1464c(android.content.Context context, android.os.Looper looper, Q3.AbstractC1469h abstractC1469h, N3.C1395h c1395h, int i6, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar, java.lang.String str) {
        this.f8894f = null;
        this.f8901m = new java.lang.Object();
        this.f8902n = new java.lang.Object();
        this.f8906r = new java.util.ArrayList();
        this.f8908t = 1;
        this.f8914z = null;
        this.f8886A = false;
        this.f8887B = null;
        this.f8888C = new java.util.concurrent.atomic.AtomicInteger(0);
        Q3.AbstractC1477p.m(context, "Context must not be null");
        this.f8896h = context;
        Q3.AbstractC1477p.m(looper, "Looper must not be null");
        this.f8897i = looper;
        Q3.AbstractC1477p.m(abstractC1469h, "Supervisor must not be null");
        this.f8898j = abstractC1469h;
        Q3.AbstractC1477p.m(c1395h, "API availability must not be null");
        this.f8899k = c1395h;
        this.f8900l = new Q3.b0(this, looper);
        this.f8911w = i6;
        this.f8909u = aVar;
        this.f8910v = bVar;
        this.f8912x = str;
    }

    static /* bridge */ /* synthetic */ void c0(Q3.AbstractC1464c abstractC1464c, Q3.h0 h0Var) {
        abstractC1464c.f8887B = h0Var;
        if (abstractC1464c.S()) {
            Q3.C1466e c1466e = h0Var.f8974F;
            Q3.C1478q.b().c(c1466e == null ? null : c1466e.D());
        }
    }

    static /* bridge */ /* synthetic */ void d0(Q3.AbstractC1464c abstractC1464c, int i6) {
        int i10;
        int i11;
        synchronized (abstractC1464c.f8901m) {
            i10 = abstractC1464c.f8908t;
        }
        if (i10 == 3) {
            abstractC1464c.f8886A = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        android.os.Handler handler = abstractC1464c.f8900l;
        handler.sendMessage(handler.obtainMessage(i11, abstractC1464c.f8888C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(Q3.AbstractC1464c abstractC1464c, int i6, int i10, android.os.IInterface iInterface) {
        synchronized (abstractC1464c.f8901m) {
            try {
                if (abstractC1464c.f8908t != i6) {
                    return false;
                }
                abstractC1464c.i0(i10, iInterface);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(Q3.AbstractC1464c abstractC1464c) {
        if (abstractC1464c.f8886A || android.text.TextUtils.isEmpty(abstractC1464c.E()) || android.text.TextUtils.isEmpty(abstractC1464c.B())) {
            return false;
        }
        try {
            java.lang.Class.forName(abstractC1464c.E());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i6, android.os.IInterface iInterface) {
        Q3.s0 s0Var;
        Q3.AbstractC1477p.a((i6 == 4) == (iInterface != null));
        synchronized (this.f8901m) {
            try {
                this.f8908t = i6;
                this.f8905q = iInterface;
                if (i6 == 1) {
                    Q3.e0 e0Var = this.f8907s;
                    if (e0Var != null) {
                        Q3.AbstractC1469h abstractC1469h = this.f8898j;
                        java.lang.String strB = this.f8895g.b();
                        Q3.AbstractC1477p.l(strB);
                        abstractC1469h.d(strB, this.f8895g.a(), 4225, e0Var, X(), this.f8895g.c());
                        this.f8907s = null;
                    }
                } else if (i6 == 2 || i6 == 3) {
                    Q3.e0 e0Var2 = this.f8907s;
                    if (e0Var2 != null && (s0Var = this.f8895g) != null) {
                        java.lang.String str = "Calling connect() while still connected, missing disconnect() for " + s0Var.b() + " on " + s0Var.a();
                        Q3.AbstractC1469h abstractC1469h2 = this.f8898j;
                        java.lang.String strB2 = this.f8895g.b();
                        Q3.AbstractC1477p.l(strB2);
                        abstractC1469h2.d(strB2, this.f8895g.a(), 4225, e0Var2, X(), this.f8895g.c());
                        this.f8888C.incrementAndGet();
                    }
                    Q3.e0 e0Var3 = new Q3.e0(this, this.f8888C.get());
                    this.f8907s = e0Var3;
                    Q3.s0 s0Var2 = (this.f8908t != 3 || B() == null) ? new Q3.s0(G(), F(), false, 4225, I()) : new Q3.s0(y().getPackageName(), B(), true, 4225, false);
                    this.f8895g = s0Var2;
                    if (s0Var2.c() && l() < 17895000) {
                        throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.f8895g.b())));
                    }
                    Q3.AbstractC1469h abstractC1469h3 = this.f8898j;
                    java.lang.String strB3 = this.f8895g.b();
                    Q3.AbstractC1477p.l(strB3);
                    if (!abstractC1469h3.e(new Q3.l0(strB3, this.f8895g.a(), 4225, this.f8895g.c()), e0Var3, X(), w())) {
                        java.lang.String str2 = "unable to connect to service: " + this.f8895g.b() + " on " + this.f8895g.a();
                        e0(16, null, this.f8888C.get());
                    }
                } else if (i6 == 4) {
                    Q3.AbstractC1477p.l(iInterface);
                    K(iInterface);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    protected android.os.Bundle A() {
        return new android.os.Bundle();
    }

    protected java.lang.String B() {
        return null;
    }

    protected java.util.Set C() {
        return java.util.Collections.emptySet();
    }

    public final android.os.IInterface D() {
        android.os.IInterface iInterface;
        synchronized (this.f8901m) {
            try {
                if (this.f8908t == 5) {
                    throw new android.os.DeadObjectException();
                }
                r();
                iInterface = this.f8905q;
                Q3.AbstractC1477p.m(iInterface, "Client is connected but service is null");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract java.lang.String E();

    protected abstract java.lang.String F();

    protected java.lang.String G() {
        return "com.google.android.gms";
    }

    public Q3.C1466e H() {
        Q3.h0 h0Var = this.f8887B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8974F;
    }

    protected boolean I() {
        return l() >= 211700000;
    }

    public boolean J() {
        return this.f8887B != null;
    }

    protected void K(android.os.IInterface iInterface) {
        this.f8891c = java.lang.System.currentTimeMillis();
    }

    protected void L(N3.C1389b c1389b) {
        this.f8892d = c1389b.e();
        this.f8893e = java.lang.System.currentTimeMillis();
    }

    protected void M(int i6) {
        this.f8889a = i6;
        this.f8890b = java.lang.System.currentTimeMillis();
    }

    protected void N(int i6, android.os.IBinder iBinder, android.os.Bundle bundle, int i10) {
        this.f8900l.sendMessage(this.f8900l.obtainMessage(1, i10, -1, new Q3.f0(this, i6, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(java.lang.String str) {
        this.f8913y = str;
    }

    public void Q(int i6) {
        this.f8900l.sendMessage(this.f8900l.obtainMessage(6, this.f8888C.get(), i6));
    }

    protected void R(Q3.AbstractC1464c.InterfaceC0206c interfaceC0206c, int i6, android.app.PendingIntent pendingIntent) {
        Q3.AbstractC1477p.m(interfaceC0206c, "Connection progress callbacks cannot be null.");
        this.f8904p = interfaceC0206c;
        this.f8900l.sendMessage(this.f8900l.obtainMessage(3, this.f8888C.get(), i6, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final java.lang.String X() {
        java.lang.String str = this.f8912x;
        return str == null ? this.f8896h.getClass().getName() : str;
    }

    public void c(Q3.AbstractC1464c.InterfaceC0206c interfaceC0206c) {
        Q3.AbstractC1477p.m(interfaceC0206c, "Connection progress callbacks cannot be null.");
        this.f8904p = interfaceC0206c;
        i0(2, null);
    }

    public void d(java.lang.String str) {
        this.f8894f = str;
        h();
    }

    public boolean e() {
        boolean z6;
        synchronized (this.f8901m) {
            int i6 = this.f8908t;
            z6 = true;
            if (i6 != 2 && i6 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    protected final void e0(int i6, android.os.Bundle bundle, int i10) {
        this.f8900l.sendMessage(this.f8900l.obtainMessage(7, i10, -1, new Q3.g0(this, i6, null)));
    }

    public java.lang.String f() {
        Q3.s0 s0Var;
        if (!j() || (s0Var = this.f8895g) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return s0Var.a();
    }

    public void g(Q3.AbstractC1464c.e eVar) {
        eVar.a();
    }

    public void h() {
        this.f8888C.incrementAndGet();
        synchronized (this.f8906r) {
            try {
                int size = this.f8906r.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((Q3.c0) this.f8906r.get(i6)).d();
                }
                this.f8906r.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8902n) {
            this.f8903o = null;
        }
        i0(1, null);
    }

    public void i(Q3.InterfaceC1471j interfaceC1471j, java.util.Set set) {
        android.os.Bundle bundleA = A();
        java.lang.String str = this.f8913y;
        int i6 = N3.C1395h.f7660a;
        com.google.android.gms.common.api.Scope[] scopeArr = Q3.C1467f.f8944Q;
        android.os.Bundle bundle = new android.os.Bundle();
        int i10 = this.f8911w;
        N3.C1391d[] c1391dArr = Q3.C1467f.f8945R;
        Q3.C1467f c1467f = new Q3.C1467f(6, i10, i6, null, null, scopeArr, bundle, null, c1391dArr, c1391dArr, true, 0, false, str);
        c1467f.f8949F = this.f8896h.getPackageName();
        c1467f.f8952I = bundleA;
        if (set != null) {
            c1467f.f8951H = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (o()) {
            android.accounts.Account accountU = u();
            if (accountU == null) {
                accountU = new android.accounts.Account("<<default account>>", "com.google");
            }
            c1467f.f8953J = accountU;
            if (interfaceC1471j != null) {
                c1467f.f8950G = interfaceC1471j.asBinder();
            }
        } else if (O()) {
            c1467f.f8953J = u();
        }
        c1467f.f8954K = f8885E;
        c1467f.f8955L = v();
        if (S()) {
            c1467f.f8958O = true;
        }
        try {
            synchronized (this.f8902n) {
                try {
                    Q3.InterfaceC1473l interfaceC1473l = this.f8903o;
                    if (interfaceC1473l != null) {
                        interfaceC1473l.k4(new Q3.d0(this, this.f8888C.get()), c1467f);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (android.os.DeadObjectException e6) {
            Q(3);
        } catch (android.os.RemoteException e10) {
            N(8, null, null, this.f8888C.get());
        } catch (java.lang.SecurityException e11) {
            throw e11;
        } catch (java.lang.RuntimeException e12) {
            N(8, null, null, this.f8888C.get());
        }
    }

    public boolean j() {
        boolean z6;
        synchronized (this.f8901m) {
            z6 = this.f8908t == 4;
        }
        return z6;
    }

    public boolean k() {
        return true;
    }

    public int l() {
        return N3.C1395h.f7660a;
    }

    public final N3.C1391d[] m() {
        Q3.h0 h0Var = this.f8887B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8972D;
    }

    public java.lang.String n() {
        return this.f8894f;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int iH = this.f8899k.h(this.f8896h, l());
        if (iH == 0) {
            c(new Q3.AbstractC1464c.d());
        } else {
            i0(1, null);
            R(new Q3.AbstractC1464c.d(), iH, null);
        }
    }

    protected final void r() {
        if (!j()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract android.os.IInterface s(android.os.IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public android.accounts.Account u() {
        return null;
    }

    public N3.C1391d[] v() {
        return f8885E;
    }

    protected java.util.concurrent.Executor w() {
        return null;
    }

    public android.os.Bundle x() {
        return null;
    }

    public final android.content.Context y() {
        return this.f8896h;
    }

    public int z() {
        return this.f8911w;
    }
}
