package p073h2;

/* JADX INFO: renamed from: h2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6641s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p073h2.C6641s.a f46238f = new p073h2.C6641s.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p073h2.C6641s f46239g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.r f46240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.r f46241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.r f46242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f46243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f46244e;

    /* JADX INFO: renamed from: h2.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p073h2.C6641s a() {
            return p073h2.C6641s.f46239g;
        }
    }

    /* JADX INFO: renamed from: h2.s$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46245a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46245a = iArr;
        }
    }

    static {
        h2.r.c.a aVar = h2.r.c.f46235b;
        f46239g = new p073h2.C6641s(aVar.b(), aVar.b(), aVar.b());
    }

    public C6641s(p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3) {
        p247y7.AbstractC7350t.f(rVar, "refresh");
        p247y7.AbstractC7350t.f(rVar2, "prepend");
        p247y7.AbstractC7350t.f(rVar3, "append");
        this.f46240a = rVar;
        this.f46241b = rVar2;
        this.f46242c = rVar3;
        this.f46243d = (rVar instanceof h2.r.a) || (rVar3 instanceof h2.r.a) || (rVar2 instanceof h2.r.a);
        this.f46244e = (rVar instanceof h2.r.c) && (rVar3 instanceof h2.r.c) && (rVar2 instanceof h2.r.c);
    }

    public static /* synthetic */ p073h2.C6641s c(p073h2.C6641s c6641s, p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            rVar = c6641s.f46240a;
        }
        if ((i6 & 2) != 0) {
            rVar2 = c6641s.f46241b;
        }
        if ((i6 & 4) != 0) {
            rVar3 = c6641s.f46242c;
        }
        return c6641s.b(rVar, rVar2, rVar3);
    }

    public final p073h2.C6641s b(p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3) {
        p247y7.AbstractC7350t.f(rVar, "refresh");
        p247y7.AbstractC7350t.f(rVar2, "prepend");
        p247y7.AbstractC7350t.f(rVar3, "append");
        return new p073h2.C6641s(rVar, rVar2, rVar3);
    }

    public final p073h2.r d() {
        return this.f46242c;
    }

    public final p073h2.r e() {
        return this.f46241b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p073h2.C6641s)) {
            return false;
        }
        p073h2.C6641s c6641s = (p073h2.C6641s) obj;
        return p247y7.AbstractC7350t.b(this.f46240a, c6641s.f46240a) && p247y7.AbstractC7350t.b(this.f46241b, c6641s.f46241b) && p247y7.AbstractC7350t.b(this.f46242c, c6641s.f46242c);
    }

    public final p073h2.r f() {
        return this.f46240a;
    }

    public final boolean g() {
        return this.f46243d;
    }

    public final boolean h() {
        return this.f46244e;
    }

    public int hashCode() {
        return (((this.f46240a.hashCode() * 31) + this.f46241b.hashCode()) * 31) + this.f46242c.hashCode();
    }

    public final p073h2.C6641s i(p073h2.EnumC6642t enumC6642t, p073h2.r rVar) {
        int i6;
        java.lang.Object obj;
        p073h2.r rVar2;
        p073h2.r rVar3;
        p073h2.r rVar4;
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        p247y7.AbstractC7350t.f(rVar, "newState");
        int i10 = p073h2.C6641s.b.f46245a[enumC6642t.ordinal()];
        if (i10 == 1) {
            i6 = 3;
            obj = null;
            rVar2 = null;
            rVar3 = null;
            rVar4 = rVar;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    return c(this, rVar, null, null, 6, null);
                }
                throw new p087i7.s();
            }
            i6 = 5;
            obj = null;
            rVar2 = null;
            rVar4 = null;
            rVar3 = rVar;
        }
        return c(this, rVar2, rVar3, rVar4, i6, obj);
    }

    public java.lang.String toString() {
        return "LoadStates(refresh=" + this.f46240a + ", prepend=" + this.f46241b + ", append=" + this.f46242c + ')';
    }
}
