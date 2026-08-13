package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f23487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.c f23488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f23489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.N f23490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f23491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.room.b f23493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Z8.x f23494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.room.d.c f23495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.room.a f23496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.content.ServiceConnection f23497k;

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f23498C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f23499D;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static final class C0444a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f23500C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.lang.String[] f23501D;

            /* JADX INFO: renamed from: androidx.room.d$a$a$a, reason: collision with other inner class name */
            public static final class C0445a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f23502F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f23503G;

                public C0445a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f23502F = obj;
                    this.f23503G |= Integer.MIN_VALUE;
                    return androidx.room.d.a.C0444a.this.a(null, this);
                }
            }

            public C0444a(Z8.InterfaceC1870g interfaceC1870g, java.lang.String[] strArr) {
                this.f23500C = interfaceC1870g;
                this.f23501D = strArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                androidx.room.d.a.C0444a.C0445a c0445a;
                if (eVar instanceof androidx.room.d.a.C0444a.C0445a) {
                    c0445a = (androidx.room.d.a.C0444a.C0445a) eVar;
                    int i6 = c0445a.f23503G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0445a.f23503G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0445a = new androidx.room.d.a.C0444a.C0445a(eVar);
                    }
                } else {
                    c0445a = new androidx.room.d.a.C0444a.C0445a(eVar);
                }
                java.lang.Object obj2 = c0445a.f23502F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0445a.f23503G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f23500C;
                    java.util.Set set = (java.util.Set) obj;
                    java.util.Set setB = p097j7.Z.b();
                    for (java.lang.String str : this.f23501D) {
                        java.util.Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (S8.r.K(str, (java.lang.String) it.next(), true)) {
                                setB.add(str);
                            }
                        }
                    }
                    java.util.Set setA = p097j7.Z.a(setB);
                    if (setA.isEmpty()) {
                        setA = null;
                    }
                    if (setA != null) {
                        c0445a.f23503G = 1;
                        if (interfaceC1870g.a(setA, c0445a) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj2);
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f, java.lang.String[] strArr) {
            this.f23498C = interfaceC1869f;
            this.f23499D = strArr;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f23498C.b(new androidx.room.d.a.C0444a(interfaceC1870g, this.f23499D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static final class b extends androidx.room.a.AbstractBinderC0440a {

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f23506G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f23507H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.lang.String[] f23508I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ androidx.room.d f23509J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.String[] strArr, androidx.room.d dVar, p127m7.e eVar) {
                super(2, eVar);
                this.f23508I = strArr;
                this.f23509J = dVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.util.Set set;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f23507H;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    java.lang.String[] strArr = this.f23508I;
                    java.util.Set setG = p097j7.Z.g(java.util.Arrays.copyOf(strArr, strArr.length));
                    Z8.x xVar = this.f23509J.f23494h;
                    this.f23506G = setG;
                    this.f23507H = 1;
                    if (xVar.a(setG, this) == objG) {
                        return objG;
                    }
                    set = setG;
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (java.util.Set) this.f23506G;
                    p087i7.x.b(obj);
                }
                this.f23509J.i().n(set);
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((androidx.room.d.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.room.d.b.a(this.f23508I, this.f23509J, eVar);
            }
        }

        b() {
        }

        @Override // androidx.room.a
        public void x1(java.lang.String[] strArr) {
            p247y7.AbstractC7350t.f(strArr, "tables");
            W8.AbstractC1788i.d(androidx.room.d.this.f23490d, null, null, new androidx.room.d.b.a(strArr, androidx.room.d.this, null), 3, null);
        }
    }

    public static final class c extends androidx.room.c.AbstractC0443c {
        c(java.lang.String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0443c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0443c
        public void c(java.util.Set set) {
            p247y7.AbstractC7350t.f(set, "tables");
            if (androidx.room.d.this.f23491e.get()) {
                return;
            }
            try {
                androidx.room.b bVar = androidx.room.d.this.f23493g;
                if (bVar != null) {
                    bVar.G5(androidx.room.d.this.f23492f, (java.lang.String[]) set.toArray(new java.lang.String[0]));
                }
            } catch (android.os.RemoteException e6) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public static final class ServiceConnectionC0446d implements android.content.ServiceConnection {
        ServiceConnectionC0446d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            p247y7.AbstractC7350t.f(componentName, "name");
            p247y7.AbstractC7350t.f(iBinder, "service");
            androidx.room.d.this.f23493g = androidx.room.b.a.q0(iBinder);
            androidx.room.d.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            p247y7.AbstractC7350t.f(componentName, "name");
            androidx.room.d.this.f23493g = null;
        }
    }

    public d(android.content.Context context, java.lang.String str, androidx.room.c cVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(cVar, "invalidationTracker");
        this.f23487a = str;
        this.f23488b = cVar;
        this.f23489c = context.getApplicationContext();
        this.f23490d = cVar.i().q();
        this.f23491e = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f23494h = Z8.E.a(0, 0, Y8.EnumC1863d.SUSPEND);
        this.f23495i = new androidx.room.d.c(cVar.j());
        this.f23496j = new androidx.room.d.b();
        this.f23497k = new androidx.room.d.ServiceConnectionC0446d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        try {
            androidx.room.b bVar = this.f23493g;
            if (bVar != null) {
                this.f23492f = bVar.g2(this.f23496j, this.f23487a);
            }
        } catch (android.os.RemoteException e6) {
        }
    }

    public final Z8.InterfaceC1869f h(java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(strArr, "resolvedTableNames");
        return new androidx.room.d.a(this.f23494h, strArr);
    }

    public final androidx.room.c i() {
        return this.f23488b;
    }

    public final void k(android.content.Intent intent) {
        p247y7.AbstractC7350t.f(intent, "serviceIntent");
        if (this.f23491e.compareAndSet(true, false)) {
            this.f23489c.bindService(intent, this.f23497k, 1);
            this.f23488b.f(this.f23495i);
        }
    }

    public final void l() {
        if (this.f23491e.compareAndSet(false, true)) {
            this.f23488b.s(this.f23495i);
            try {
                androidx.room.b bVar = this.f23493g;
                if (bVar != null) {
                    bVar.Y5(this.f23496j, this.f23492f);
                }
            } catch (android.os.RemoteException e6) {
            }
            this.f23489c.unbindService(this.f23497k);
        }
    }
}
