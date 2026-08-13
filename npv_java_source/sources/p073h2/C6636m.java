package p073h2;

/* JADX INFO: renamed from: h2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6636m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.C6636m.b f46211a = new p073h2.C6636m.b();

    /* JADX INFO: renamed from: h2.m$a */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p073h2.Z f46212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Z8.x f46213b = Z8.E.b(1, 0, Y8.EnumC1863d.DROP_OLDEST, 2, null);

        public a() {
        }

        public final Z8.InterfaceC1869f a() {
            return this.f46213b;
        }

        public final p073h2.Z b() {
            return this.f46212a;
        }

        public final void c(p073h2.Z z6) {
            this.f46212a = z6;
            if (z6 != null) {
                this.f46213b.n(z6);
            }
        }
    }

    /* JADX INFO: renamed from: h2.m$b */
    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.C6636m.a f46215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p073h2.C6636m.a f46216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h2.Z.a f46217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.concurrent.locks.ReentrantLock f46218d = new java.util.concurrent.locks.ReentrantLock();

        public b() {
            this.f46215a = p073h2.C6636m.this.new a();
            this.f46216b = p073h2.C6636m.this.new a();
        }

        public final Z8.InterfaceC1869f a() {
            return this.f46216b.a();
        }

        public final h2.Z.a b() {
            return this.f46217c;
        }

        public final Z8.InterfaceC1869f c() {
            return this.f46215a.a();
        }

        public final void d(h2.Z.a aVar, p237x7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "block");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.f46218d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.f46217c = aVar;
                }
                pVar.u(this.f46215a, this.f46216b);
                p087i7.M m6 = p087i7.M.f46721a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: h2.m$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46220a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f46220a = iArr;
        }
    }

    /* JADX INFO: renamed from: h2.m$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p073h2.EnumC6642t f46221D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p073h2.Z f46222E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p073h2.EnumC6642t enumC6642t, p073h2.Z z6) {
            super(2);
            this.f46221D = enumC6642t;
            this.f46222E = z6;
        }

        public final void a(p073h2.C6636m.a aVar, p073h2.C6636m.a aVar2) {
            p247y7.AbstractC7350t.f(aVar, "prependHint");
            p247y7.AbstractC7350t.f(aVar2, "appendHint");
            if (this.f46221D == p073h2.EnumC6642t.PREPEND) {
                aVar.c(this.f46222E);
            } else {
                aVar2.c(this.f46222E);
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((p073h2.C6636m.a) obj, (p073h2.C6636m.a) obj2);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: h2.m$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p073h2.Z f46223D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p073h2.Z z6) {
            super(2);
            this.f46223D = z6;
        }

        public final void a(p073h2.C6636m.a aVar, p073h2.C6636m.a aVar2) {
            p247y7.AbstractC7350t.f(aVar, "prependHint");
            p247y7.AbstractC7350t.f(aVar2, "appendHint");
            if (p073h2.AbstractC6637n.a(this.f46223D, aVar.b(), p073h2.EnumC6642t.PREPEND)) {
                aVar.c(this.f46223D);
            }
            if (p073h2.AbstractC6637n.a(this.f46223D, aVar2.b(), p073h2.EnumC6642t.APPEND)) {
                aVar2.c(this.f46223D);
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((p073h2.C6636m.a) obj, (p073h2.C6636m.a) obj2);
            return p087i7.M.f46721a;
        }
    }

    public final void a(p073h2.EnumC6642t enumC6642t, p073h2.Z z6) {
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        p247y7.AbstractC7350t.f(z6, "viewportHint");
        if (enumC6642t == p073h2.EnumC6642t.PREPEND || enumC6642t == p073h2.EnumC6642t.APPEND) {
            this.f46211a.d(null, new p073h2.C6636m.d(enumC6642t, z6));
            return;
        }
        throw new java.lang.IllegalArgumentException(("invalid load type for reset: " + enumC6642t).toString());
    }

    public final h2.Z.a b() {
        return this.f46211a.b();
    }

    public final Z8.InterfaceC1869f c(p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        int i6 = p073h2.C6636m.c.f46220a[enumC6642t.ordinal()];
        if (i6 == 1) {
            return this.f46211a.c();
        }
        if (i6 == 2) {
            return this.f46211a.a();
        }
        throw new java.lang.IllegalArgumentException("invalid load type for hints");
    }

    public final void d(p073h2.Z z6) {
        p247y7.AbstractC7350t.f(z6, "viewportHint");
        this.f46211a.d(z6 instanceof h2.Z.a ? (h2.Z.a) z6 : null, new p073h2.C6636m.e(z6));
    }
}
