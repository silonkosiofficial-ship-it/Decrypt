package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class C implements p073h2.N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h2.C.a f45898e = new h2.C.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p073h2.C f45899f = new p073h2.C(p073h2.AbstractC6646x.b.f46277g.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f45900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45903d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p073h2.C a(p073h2.AbstractC6646x.b bVar) {
            if (bVar != null) {
                return new p073h2.C(bVar);
            }
            p073h2.C c6 = p073h2.C.f45899f;
            p247y7.AbstractC7350t.d(c6, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return c6;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45904a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f45904a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(p073h2.AbstractC6646x.b bVar) {
        this(bVar.h(), bVar.j(), bVar.i());
        p247y7.AbstractC7350t.f(bVar, "insertEvent");
    }

    public C(java.util.List list, int i6, int i10) {
        p247y7.AbstractC7350t.f(list, "pages");
        this.f45900a = p097j7.AbstractC6879v.W0(list);
        this.f45901b = j(list);
        this.f45902c = i6;
        this.f45903d = i10;
    }

    private final void g(int i6) {
        if (i6 < 0 || i6 >= a()) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i6 + ", Size: " + a());
        }
    }

    private final p073h2.G h(p073h2.AbstractC6646x.a aVar) {
        int i6 = i(new E7.i(aVar.e(), aVar.d()));
        this.f45901b = b() - i6;
        if (aVar.c() == p073h2.EnumC6642t.PREPEND) {
            int iC = c();
            this.f45902c = aVar.g();
            return new h2.G.c(i6, c(), iC);
        }
        int iD = d();
        this.f45903d = aVar.g();
        return new h2.G.b(c() + b(), i6, aVar.g(), iD);
    }

    private final int i(E7.i iVar) {
        java.util.Iterator it = this.f45900a.iterator();
        int size = 0;
        while (it.hasNext()) {
            p073h2.W w6 = (p073h2.W) it.next();
            for (int i6 : w6.e()) {
                if (iVar.D(i6)) {
                    size += w6.b().size();
                    it.remove();
                    break;
                }
            }
        }
        return size;
    }

    private final int j(java.util.List list) {
        java.util.Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((p073h2.W) it.next()).b().size();
        }
        return size;
    }

    private final int m() {
        java.lang.Integer numD0 = p097j7.AbstractC6872n.D0(((p073h2.W) p097j7.AbstractC6879v.i0(this.f45900a)).e());
        p247y7.AbstractC7350t.c(numD0);
        return numD0.intValue();
    }

    private final int n() {
        java.lang.Integer numC0 = p097j7.AbstractC6872n.C0(((p073h2.W) p097j7.AbstractC6879v.t0(this.f45900a)).e());
        p247y7.AbstractC7350t.c(numC0);
        return numC0.intValue();
    }

    private final p073h2.G p(p073h2.AbstractC6646x.b bVar) {
        int iJ = j(bVar.h());
        int i6 = h2.C.b.f45904a[bVar.f().ordinal()];
        if (i6 == 1) {
            throw new java.lang.IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i6 == 2) {
            int iC = c();
            this.f45900a.addAll(0, bVar.h());
            this.f45901b = b() + iJ;
            this.f45902c = bVar.j();
            java.util.List listH = bVar.h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listH.iterator();
            while (it.hasNext()) {
                p097j7.AbstractC6879v.C(arrayList, ((p073h2.W) it.next()).b());
            }
            return new h2.G.d(arrayList, c(), iC);
        }
        if (i6 != 3) {
            throw new p087i7.s();
        }
        int iD = d();
        int iB = b();
        java.util.List list = this.f45900a;
        list.addAll(list.size(), bVar.h());
        this.f45901b = b() + iJ;
        this.f45903d = bVar.i();
        int iC2 = c() + iB;
        java.util.List listH2 = bVar.h();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = listH2.iterator();
        while (it2.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList2, ((p073h2.W) it2.next()).b());
        }
        return new h2.G.a(iC2, arrayList2, d(), iD);
    }

    @Override // p073h2.N
    public int a() {
        return c() + b() + d();
    }

    @Override // p073h2.N
    public int b() {
        return this.f45901b;
    }

    @Override // p073h2.N
    public int c() {
        return this.f45902c;
    }

    @Override // p073h2.N
    public int d() {
        return this.f45903d;
    }

    public final h2.Z.a f(int i6) {
        int i10 = 0;
        int iC = i6 - c();
        while (iC >= ((p073h2.W) this.f45900a.get(i10)).b().size() && i10 < p097j7.AbstractC6879v.o(this.f45900a)) {
            iC -= ((p073h2.W) this.f45900a.get(i10)).b().size();
            i10++;
        }
        return ((p073h2.W) this.f45900a.get(i10)).f(iC, i6 - c(), ((a() - i6) - d()) - 1, m(), n());
    }

    public final java.lang.Object k(int i6) {
        g(i6);
        int iC = i6 - c();
        if (iC < 0 || iC >= b()) {
            return null;
        }
        return l(iC);
    }

    public java.lang.Object l(int i6) {
        int size = this.f45900a.size();
        int i10 = 0;
        while (i10 < size) {
            int size2 = ((p073h2.W) this.f45900a.get(i10)).b().size();
            if (size2 > i6) {
                break;
            }
            i6 -= size2;
            i10++;
        }
        return ((p073h2.W) this.f45900a.get(i10)).b().get(i6);
    }

    public final h2.Z.b o() {
        int iB = b() / 2;
        return new h2.Z.b(iB, iB, m(), n());
    }

    public final p073h2.G q(p073h2.AbstractC6646x abstractC6646x) {
        p247y7.AbstractC7350t.f(abstractC6646x, "pageEvent");
        if (abstractC6646x instanceof p073h2.AbstractC6646x.b) {
            return p((p073h2.AbstractC6646x.b) abstractC6646x);
        }
        if (abstractC6646x instanceof p073h2.AbstractC6646x.a) {
            return h((p073h2.AbstractC6646x.a) abstractC6646x);
        }
        throw new java.lang.IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final p073h2.C6640q r() {
        int iC = c();
        int iD = d();
        java.util.List list = this.f45900a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, ((p073h2.W) it.next()).b());
        }
        return new p073h2.C6640q(iC, iD, arrayList);
    }

    public java.lang.String toString() {
        int iB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList(iB);
        for (int i6 = 0; i6 < iB; i6++) {
            arrayList.add(l(i6));
        }
        return "[(" + c() + " placeholders), " + p097j7.AbstractC6879v.r0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + d() + " placeholders)]";
    }
}
