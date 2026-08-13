package p073h2;

/* JADX INFO: renamed from: h2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6633j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p097j7.C6871m f46169c = new p097j7.C6871m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p073h2.C6645w f46170d = new p073h2.C6645w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p073h2.C6641s f46171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46172f;

    /* JADX INFO: renamed from: h2.j$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46173a;

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
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46173a = iArr;
        }
    }

    private final void c(p073h2.AbstractC6646x.b bVar) {
        this.f46170d.b(bVar.k());
        this.f46171e = bVar.g();
        int i6 = p073h2.C6633j.a.f46173a[bVar.f().ordinal()];
        if (i6 == 1) {
            this.f46167a = bVar.j();
            java.util.Iterator it = E7.j.n(bVar.h().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.f46169c.f(bVar.h().get(((p097j7.O) it).b()));
            }
            return;
        }
        if (i6 == 2) {
            this.f46168b = bVar.i();
        } else {
            if (i6 != 3) {
                return;
            }
            this.f46169c.clear();
            this.f46168b = bVar.i();
            this.f46167a = bVar.j();
        }
        this.f46169c.addAll(bVar.h());
    }

    private final void d(p073h2.AbstractC6646x.c cVar) {
        this.f46170d.b(cVar.d());
        this.f46171e = cVar.c();
    }

    private final void e(p073h2.AbstractC6646x.a aVar) {
        this.f46170d.c(aVar.c(), h2.r.c.f46235b.b());
        int i6 = p073h2.C6633j.a.f46173a[aVar.c().ordinal()];
        int i10 = 0;
        if (i6 == 1) {
            this.f46167a = aVar.g();
            int iF = aVar.f();
            while (i10 < iF) {
                this.f46169c.R();
                i10++;
            }
            return;
        }
        if (i6 != 2) {
            throw new java.lang.IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.f46168b = aVar.g();
        int iF2 = aVar.f();
        while (i10 < iF2) {
            this.f46169c.T();
            i10++;
        }
    }

    public final void a(p073h2.AbstractC6646x abstractC6646x) {
        p247y7.AbstractC7350t.f(abstractC6646x, "event");
        this.f46172f = true;
        if (abstractC6646x instanceof p073h2.AbstractC6646x.b) {
            c((p073h2.AbstractC6646x.b) abstractC6646x);
        } else if (abstractC6646x instanceof p073h2.AbstractC6646x.a) {
            e((p073h2.AbstractC6646x.a) abstractC6646x);
        } else if (abstractC6646x instanceof p073h2.AbstractC6646x.c) {
            d((p073h2.AbstractC6646x.c) abstractC6646x);
        }
    }

    public final java.util.List b() {
        if (!this.f46172f) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p073h2.C6641s c6641sD = this.f46170d.d();
        arrayList.add(this.f46169c.isEmpty() ^ true ? p073h2.AbstractC6646x.b.f46277g.c(p097j7.AbstractC6879v.T0(this.f46169c), this.f46167a, this.f46168b, c6641sD, this.f46171e) : new p073h2.AbstractC6646x.c(c6641sD, this.f46171e));
        return arrayList;
    }
}
