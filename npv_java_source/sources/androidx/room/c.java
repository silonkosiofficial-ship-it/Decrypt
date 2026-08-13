package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final androidx.room.c.b f23464o = new androidx.room.c.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f23465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f23466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f23467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String[] f23468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p143o2.D f23469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f23470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f23471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p213v2.b f23472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p237x7.a f23473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p237x7.a f23474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p143o2.h f23475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.content.Intent f23476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.room.d f23477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.lang.Object f23478n;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(!androidx.room.c.this.i().C() || androidx.room.c.this.i().K());
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0443c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String[] f23480a;

        public AbstractC0443c(java.lang.String[] strArr) {
            p247y7.AbstractC7350t.f(strArr, "tables");
            this.f23480a = strArr;
        }

        public final java.lang.String[] a() {
            return this.f23480a;
        }

        public abstract boolean b();

        public abstract void c(java.util.Set set);
    }

    /* synthetic */ class d extends p247y7.C7348q implements p237x7.l {
        d(java.lang.Object obj) {
            super(1, obj, androidx.room.c.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            s((java.util.Set) obj);
            return p087i7.M.f46721a;
        }

        public final void s(java.util.Set set) {
            p247y7.AbstractC7350t.f(set, "p0");
            ((androidx.room.c) this.f57287D).m(set);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        public final void a() {
            p213v2.b bVar = androidx.room.c.this.f23472h;
            if (bVar != null) {
                bVar.g();
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        public final void a() {
            p213v2.b bVar = androidx.room.c.this.f23472h;
            if (bVar != null) {
                bVar.j();
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f23483G;

        g(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f23483G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.D d6 = androidx.room.c.this.f23469e;
                this.f23483G = 1;
                if (d6.u(this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.room.c.g) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.room.c.this.new g(eVar);
        }
    }

    /* synthetic */ class h extends p247y7.C7348q implements p237x7.a {
        h(java.lang.Object obj) {
            super(0, obj, androidx.room.c.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((androidx.room.c) this.f57287D).o();
        }
    }

    static final class i extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f23485G;

        i(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f23485G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                androidx.room.c cVar = androidx.room.c.this;
                this.f23485G = 1;
                if (cVar.w(this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.room.c.i) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.room.c.this.new i(eVar);
        }
    }

    public c(p143o2.n nVar, java.util.Map map, java.util.Map map2, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(nVar, "database");
        p247y7.AbstractC7350t.f(map, "shadowTablesMap");
        p247y7.AbstractC7350t.f(map2, "viewTables");
        p247y7.AbstractC7350t.f(strArr, "tableNames");
        this.f23465a = nVar;
        this.f23466b = map;
        this.f23467c = map2;
        this.f23468d = strArr;
        p143o2.D d6 = new p143o2.D(nVar, map, map2, strArr, nVar.B(), new androidx.room.c.d(this));
        this.f23469e = d6;
        this.f23470f = new java.util.LinkedHashMap();
        this.f23471g = new java.util.concurrent.locks.ReentrantLock();
        this.f23473i = new androidx.room.c.f();
        this.f23474j = new androidx.room.c.e();
        this.f23475k = new p143o2.h(nVar);
        this.f23478n = new java.lang.Object();
        d6.r(new androidx.room.c.a());
    }

    private final boolean e(androidx.room.c.AbstractC0443c abstractC0443c) {
        p087i7.u uVarV = this.f23469e.v(abstractC0443c.a());
        java.lang.String[] strArr = (java.lang.String[]) uVarV.a();
        int[] iArr = (int[]) uVarV.b();
        androidx.room.e eVar = new androidx.room.e(abstractC0443c, iArr, strArr);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23471g;
        reentrantLock.lock();
        try {
            androidx.room.e eVar2 = (androidx.room.e) (this.f23470f.containsKey(abstractC0443c) ? p097j7.S.i(this.f23470f, abstractC0443c) : this.f23470f.put(abstractC0443c, eVar));
            reentrantLock.unlock();
            return eVar2 == null && this.f23469e.l(iArr);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final java.util.List h() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23471g;
        reentrantLock.lock();
        try {
            return p097j7.AbstractC6879v.T0(this.f23470f.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(java.util.Set set) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23471g;
        reentrantLock.lock();
        try {
            java.util.List listT0 = p097j7.AbstractC6879v.T0(this.f23470f.values());
            reentrantLock.unlock();
            java.util.Iterator it = listT0.iterator();
            while (it.hasNext()) {
                ((androidx.room.e) it.next()).c(set);
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        synchronized (this.f23478n) {
            try {
                androidx.room.d dVar = this.f23477m;
                if (dVar != null) {
                    java.util.List listH = h();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listH) {
                        if (!((androidx.room.c.AbstractC0443c) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        dVar.l();
                    }
                }
                this.f23469e.p();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final boolean t(androidx.room.c.AbstractC0443c abstractC0443c) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23471g;
        reentrantLock.lock();
        try {
            androidx.room.e eVar = (androidx.room.e) this.f23470f.remove(abstractC0443c);
            reentrantLock.unlock();
            return eVar != null && this.f23469e.m(eVar.b());
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f(androidx.room.c.AbstractC0443c abstractC0443c) {
        p247y7.AbstractC7350t.f(abstractC0443c, "observer");
        if (!abstractC0443c.b()) {
            throw new java.lang.IllegalStateException("isRemote was false of observer argument".toString());
        }
        e(abstractC0443c);
    }

    public final Z8.InterfaceC1869f g(java.lang.String[] strArr, boolean z6) {
        p247y7.AbstractC7350t.f(strArr, "tables");
        p087i7.u uVarV = this.f23469e.v(strArr);
        java.lang.String[] strArr2 = (java.lang.String[]) uVarV.a();
        Z8.InterfaceC1869f interfaceC1869fJ = this.f23469e.j(strArr2, (int[]) uVarV.b(), z6);
        androidx.room.d dVar = this.f23477m;
        Z8.InterfaceC1869f interfaceC1869fH = dVar != null ? dVar.h(strArr2) : null;
        return interfaceC1869fH != null ? Z8.AbstractC1871h.E(interfaceC1869fJ, interfaceC1869fH) : interfaceC1869fJ;
    }

    public final p143o2.n i() {
        return this.f23465a;
    }

    public final java.lang.String[] j() {
        return this.f23468d;
    }

    public final void k(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(intent, "serviceIntent");
        this.f23476l = intent;
        this.f23477m = new androidx.room.d(context, str, this);
    }

    public final void l(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        this.f23469e.i(bVar);
        synchronized (this.f23478n) {
            try {
                androidx.room.d dVar = this.f23477m;
                if (dVar != null) {
                    android.content.Intent intent = this.f23476l;
                    if (intent == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    dVar.k(intent);
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void n(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "tables");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23471g;
        reentrantLock.lock();
        try {
            java.util.List<androidx.room.e> listT0 = p097j7.AbstractC6879v.T0(this.f23470f.values());
            reentrantLock.unlock();
            for (androidx.room.e eVar : listT0) {
                if (!eVar.a().b()) {
                    eVar.d(set);
                }
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final java.lang.Object p(java.lang.String[] strArr, p127m7.e eVar) {
        return this.f23469e.n(strArr, this.f23473i, this.f23474j, eVar);
    }

    public final void q() {
        this.f23469e.o(this.f23473i, this.f23474j);
    }

    public void r() {
        this.f23469e.o(this.f23473i, this.f23474j);
    }

    public void s(androidx.room.c.AbstractC0443c abstractC0443c) {
        p247y7.AbstractC7350t.f(abstractC0443c, "observer");
        if (t(abstractC0443c)) {
            W8.AbstractC1786h.b(null, new androidx.room.c.g(null), 1, null);
        }
    }

    public final void u(p213v2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "autoCloser");
        this.f23472h = bVar;
        bVar.m(new androidx.room.c.h(this));
    }

    public final void v() {
        androidx.room.d dVar = this.f23477m;
        if (dVar != null) {
            dVar.l();
        }
    }

    public final java.lang.Object w(p127m7.e eVar) {
        java.lang.Object objU;
        return ((!this.f23465a.C() || this.f23465a.K()) && (objU = this.f23469e.u(eVar)) == p137n7.b.g()) ? objU : p087i7.M.f46721a;
    }

    public final void x() {
        W8.AbstractC1786h.b(null, new androidx.room.c.i(null), 1, null);
    }
}
