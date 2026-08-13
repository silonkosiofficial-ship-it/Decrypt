package p132n1;

/* JADX INFO: loaded from: classes.dex */
public class f implements p132n1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p132n1.p f51370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p132n1.d f51371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n1.f.a f51374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p132n1.g f51378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.ArrayList f51380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.ArrayList f51381l;

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE;


        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f51391L = p157p7.b.a(e());
    }

    public f(p132n1.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "mRun");
        this.f51370a = pVar;
        this.f51374e = n1.f.a.UNKNOWN;
        this.f51377h = 1;
        this.f51380k = new java.util.ArrayList();
        this.f51381l = new java.util.ArrayList();
    }

    @Override // p132n1.d
    public void a(p132n1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "node");
        java.util.Iterator it = this.f51381l.iterator();
        while (it.hasNext()) {
            if (!((p132n1.f) it.next()).f51379j) {
                return;
            }
        }
        this.f51373d = true;
        p132n1.d dVar2 = this.f51371b;
        if (dVar2 != null) {
            p247y7.AbstractC7350t.c(dVar2);
            dVar2.a(this);
        }
        if (this.f51372c) {
            this.f51370a.a(this);
            return;
        }
        p132n1.f fVar = null;
        int i6 = 0;
        for (p132n1.f fVar2 : this.f51381l) {
            if (!(fVar2 instanceof p132n1.g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f51379j) {
            p132n1.g gVar = this.f51378i;
            if (gVar != null) {
                p247y7.AbstractC7350t.c(gVar);
                if (!gVar.i()) {
                    return;
                }
                int i10 = this.f51377h;
                p132n1.g gVar2 = this.f51378i;
                p247y7.AbstractC7350t.c(gVar2);
                this.f51375f = i10 * gVar2.j();
            }
            k(fVar.f51376g + this.f51375f);
        }
        p132n1.d dVar3 = this.f51371b;
        if (dVar3 != null) {
            p247y7.AbstractC7350t.c(dVar3);
            dVar3.a(this);
        }
    }

    public final void b(p132n1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "dependency");
        this.f51380k.add(dVar);
        if (this.f51379j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f51381l.clear();
        this.f51380k.clear();
        this.f51379j = false;
        this.f51376g = 0;
        this.f51373d = false;
        this.f51372c = false;
    }

    public final java.util.ArrayList d() {
        return this.f51380k;
    }

    public final int e() {
        return this.f51375f;
    }

    public final p132n1.p f() {
        return this.f51370a;
    }

    public final java.util.ArrayList g() {
        return this.f51381l;
    }

    public final boolean h() {
        return this.f51373d;
    }

    public final boolean i() {
        return this.f51379j;
    }

    public final int j() {
        return this.f51376g;
    }

    public void k(int i6) {
        if (this.f51379j) {
            return;
        }
        this.f51379j = true;
        this.f51376g = i6;
        for (p132n1.d dVar : this.f51380k) {
            p247y7.AbstractC7350t.c(dVar);
            dVar.a(dVar);
        }
    }

    public final void l(boolean z6) {
        this.f51372c = z6;
    }

    public final void m(int i6) {
        this.f51375f = i6;
    }

    public final void n(p132n1.g gVar) {
        this.f51378i = gVar;
    }

    public final void o(int i6) {
        this.f51377h = i6;
    }

    public final void p(n1.f.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<set-?>");
        this.f51374e = aVar;
    }

    public final void q(boolean z6) {
        this.f51373d = z6;
    }

    public final void r(boolean z6) {
        this.f51379j = z6;
    }

    public final void s(p132n1.d dVar) {
        this.f51371b = dVar;
    }

    public final void t(int i6) {
        this.f51376g = i6;
    }

    public java.lang.String toString() {
        p122m1.e eVarN = this.f51370a.n();
        p247y7.AbstractC7350t.c(eVarN);
        return eVarN.q() + ":" + this.f51374e + "(" + (this.f51379j ? java.lang.Integer.valueOf(this.f51376g) : "unresolved") + ") <t=" + this.f51381l.size() + ":d=" + this.f51380k.size() + ">";
    }
}
