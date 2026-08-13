package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1.o.a f51415g = new n1.o.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51416h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f51417i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f51422e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList f51418a = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51423f = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference f51424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f51430g;

        public b(p122m1.e eVar, p042e1.d dVar, int i6) {
            p247y7.AbstractC7350t.f(eVar, "widget");
            p247y7.AbstractC7350t.f(dVar, "system");
            this.f51430g = i6;
            this.f51424a = new java.lang.ref.WeakReference(eVar);
            this.f51425b = dVar.B(eVar.L());
            this.f51426c = dVar.B(eVar.c0());
            this.f51427d = dVar.B(eVar.b0());
            this.f51428e = dVar.B(eVar.G());
            this.f51429f = dVar.B(eVar.F());
        }
    }

    public o(int i6) {
        this.f51421d = i6;
        int i10 = f51417i;
        f51417i = i10 + 1;
        this.f51419b = i10;
    }

    private final java.lang.String e() {
        int i6 = this.f51421d;
        if (i6 == 0) {
            return "Horizontal";
        }
        if (i6 != 1) {
            return i6 != 2 ? "Unknown" : "Both";
        }
        return "Vertical";
    }

    private final int j(p042e1.d dVar, java.util.ArrayList arrayList, int i6) {
        int iB;
        p122m1.d dVarG;
        p122m1.f fVar = (p122m1.f) ((p122m1.e) arrayList.get(0)).o0();
        dVar.H();
        p247y7.AbstractC7350t.c(fVar);
        fVar.d(dVar, false);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            java.lang.Object obj = arrayList.get(i10);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            ((p122m1.e) obj).d(dVar, false);
        }
        if (i6 == 0 && fVar.x2() > 0) {
            p122m1.b.f50231a.b(fVar, dVar, arrayList, 0);
        }
        if (i6 == 1 && fVar.D2() > 0) {
            p122m1.b.f50231a.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.D();
        } catch (java.lang.Exception e6) {
            java.lang.System.out.println((java.lang.Object) (e6 + "\n" + S8.r.R(S8.r.R(S8.r.R(p087i7.AbstractC6661g.b(e6), "[", "   at ", false, 4, null), ",", "\n   at", false, 4, null), "]", "", false, 4, null)));
        }
        this.f51422e = new java.util.ArrayList();
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            java.lang.Object obj2 = arrayList.get(i11);
            p247y7.AbstractC7350t.e(obj2, "get(...)");
            n1.o.b bVar = new n1.o.b((p122m1.e) obj2, dVar, i6);
            java.util.ArrayList arrayList2 = this.f51422e;
            p247y7.AbstractC7350t.c(arrayList2);
            arrayList2.add(bVar);
        }
        if (i6 == 0) {
            iB = dVar.B(fVar.L());
            dVarG = fVar.b0();
        } else {
            iB = dVar.B(fVar.c0());
            dVarG = fVar.G();
        }
        int iB2 = dVar.B(dVarG);
        dVar.H();
        return iB2 - iB;
    }

    public final boolean a(p122m1.e eVar) {
        if (p097j7.AbstractC6879v.Z(this.f51418a, eVar)) {
            return false;
        }
        java.util.ArrayList arrayList = this.f51418a;
        p247y7.AbstractC7350t.c(eVar);
        arrayList.add(eVar);
        return true;
    }

    public final void b(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "dependencyLists");
        int size = this.f51418a.size();
        if (this.f51423f != -1 && size > 0) {
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                java.lang.Object obj = arrayList.get(i6);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                p132n1.o oVar = (p132n1.o) obj;
                if (this.f51423f == oVar.f51419b) {
                    g(this.f51421d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c() {
        return this.f51419b;
    }

    public final int d() {
        return this.f51421d;
    }

    public final int f(p042e1.d dVar, int i6) {
        p247y7.AbstractC7350t.f(dVar, "system");
        if (this.f51418a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f51418a, i6);
    }

    public final void g(int i6, p132n1.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "widgetGroup");
        for (java.lang.Object obj : this.f51418a) {
            p247y7.AbstractC7350t.e(obj, "next(...)");
            p122m1.e eVar = (p122m1.e) obj;
            oVar.a(eVar);
            int iC = oVar.c();
            if (i6 == 0) {
                eVar.s1(iC);
            } else {
                eVar.Q1(iC);
            }
        }
        this.f51423f = oVar.f51419b;
    }

    public final void h(boolean z6) {
        this.f51420c = z6;
    }

    public final void i(int i6) {
        this.f51421d = i6;
    }

    public java.lang.String toString() {
        java.lang.String str = e() + " [" + this.f51419b + "] <";
        java.util.Iterator it = this.f51418a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((p122m1.e) it.next()).q();
        }
        return str + " >";
    }
}
