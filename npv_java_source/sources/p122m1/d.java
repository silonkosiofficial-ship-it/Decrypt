package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m1.d.a f50256j = new m1.d.a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50257k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashSet f50258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p122m1.e f50261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m1.d.b f50262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p122m1.d f50263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p042e1.i f50266i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;


        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f50277M = p157p7.b.a(e());

        public static p157p7.a g() {
            return f50277M;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50278a;

        static {
            int[] iArr = new int[m1.d.b.values().length];
            try {
                iArr[m1.d.b.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[m1.d.b.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[m1.d.b.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[m1.d.b.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[m1.d.b.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[m1.d.b.BASELINE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[m1.d.b.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[m1.d.b.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[m1.d.b.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            f50278a = iArr;
        }
    }

    public d(p122m1.e eVar, m1.d.b bVar) {
        p247y7.AbstractC7350t.f(eVar, "owner");
        p247y7.AbstractC7350t.f(bVar, "type");
        this.f50265h = Integer.MIN_VALUE;
        this.f50261d = eVar;
        this.f50262e = bVar;
    }

    public final void A(int i6) {
        this.f50264g = i6;
    }

    public final void B(p042e1.i iVar) {
        this.f50266i = iVar;
    }

    public final boolean a(p122m1.d dVar, int i6) {
        return b(dVar, i6, Integer.MIN_VALUE, false);
    }

    public final boolean b(p122m1.d dVar, int i6, int i10, boolean z6) {
        if (dVar == null) {
            v();
            return true;
        }
        if (!z6 && !u(dVar)) {
            return false;
        }
        this.f50263f = dVar;
        p247y7.AbstractC7350t.c(dVar);
        if (dVar.f50258a == null) {
            p122m1.d dVar2 = this.f50263f;
            p247y7.AbstractC7350t.c(dVar2);
            dVar2.f50258a = new java.util.HashSet();
        }
        p122m1.d dVar3 = this.f50263f;
        p247y7.AbstractC7350t.c(dVar3);
        if (dVar3.f50258a != null) {
            p122m1.d dVar4 = this.f50263f;
            p247y7.AbstractC7350t.c(dVar4);
            java.util.HashSet hashSet = dVar4.f50258a;
            p247y7.AbstractC7350t.c(hashSet);
            hashSet.add(this);
        }
        this.f50264g = i6;
        this.f50265h = i10;
        return true;
    }

    public final void c(int i6, java.util.ArrayList arrayList, p132n1.o oVar) {
        java.util.HashSet<p122m1.d> hashSet = this.f50258a;
        if (hashSet != null) {
            p247y7.AbstractC7350t.c(hashSet);
            for (p122m1.d dVar : hashSet) {
                n1.i.a aVar = p132n1.i.f51397a;
                p122m1.e eVar = dVar.f50261d;
                p247y7.AbstractC7350t.c(arrayList);
                aVar.a(eVar, i6, arrayList, oVar);
            }
        }
    }

    public final java.util.HashSet d() {
        return this.f50258a;
    }

    public final int e() {
        if (this.f50260c) {
            return this.f50259b;
        }
        return 0;
    }

    public final int f() {
        return this.f50264g;
    }

    public final p122m1.e g() {
        return this.f50261d;
    }

    public final p042e1.i h() {
        return this.f50266i;
    }

    public final p122m1.d i() {
        return this.f50263f;
    }

    public final m1.d.b j() {
        return this.f50262e;
    }

    public final int k() {
        p122m1.d dVar;
        if (this.f50261d.A0() == 8) {
            return 0;
        }
        if (this.f50265h != Integer.MIN_VALUE && (dVar = this.f50263f) != null) {
            p247y7.AbstractC7350t.c(dVar);
            if (dVar.f50261d.A0() == 8) {
                return this.f50265h;
            }
        }
        return this.f50264g;
    }

    public final p122m1.d l() {
        switch (m1.d.c.f50278a[this.f50262e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f50261d.b0();
            case 3:
                return this.f50261d.L();
            case 4:
                return this.f50261d.G();
            case 5:
                return this.f50261d.c0();
            default:
                throw new p087i7.s();
        }
    }

    public final p122m1.e m() {
        return this.f50261d;
    }

    public final p042e1.i n() {
        return this.f50266i;
    }

    public final p122m1.d o() {
        return this.f50263f;
    }

    public final m1.d.b p() {
        return this.f50262e;
    }

    public final boolean q() {
        java.util.HashSet hashSet = this.f50258a;
        if (hashSet == null) {
            return false;
        }
        p247y7.AbstractC7350t.c(hashSet);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p122m1.d dVarL = ((p122m1.d) it.next()).l();
            p247y7.AbstractC7350t.c(dVarL);
            if (dVarL.t()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        java.util.HashSet hashSet = this.f50258a;
        if (hashSet == null) {
            return false;
        }
        p247y7.AbstractC7350t.c(hashSet);
        return hashSet.size() > 0;
    }

    public final boolean s() {
        return this.f50260c;
    }

    public final boolean t() {
        return this.f50263f != null;
    }

    public java.lang.String toString() {
        return this.f50261d.q() + ":" + this.f50262e;
    }

    public final boolean u(p122m1.d dVar) {
        if (dVar == null) {
            return false;
        }
        m1.d.b bVarP = dVar.p();
        m1.d.b bVar = this.f50262e;
        if (bVarP == bVar) {
            return bVar != m1.d.b.BASELINE || (dVar.m().v() && m().v());
        }
        switch (m1.d.c.f50278a[bVar.ordinal()]) {
            case 1:
                return (bVarP == m1.d.b.BASELINE || bVarP == m1.d.b.CENTER_X || bVarP == m1.d.b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z6 = bVarP == m1.d.b.LEFT || bVarP == m1.d.b.RIGHT;
                if (dVar.m() instanceof p122m1.h) {
                    return z6 || bVarP == m1.d.b.CENTER_X;
                }
                return z6;
            case 4:
            case 5:
                boolean z10 = bVarP == m1.d.b.TOP || bVarP == m1.d.b.BOTTOM;
                if (dVar.m() instanceof p122m1.h) {
                    return z10 || bVarP == m1.d.b.CENTER_Y;
                }
                return z10;
            case 6:
                return (bVarP == m1.d.b.LEFT || bVarP == m1.d.b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new p087i7.s();
        }
    }

    public final void v() {
        p122m1.d dVar = this.f50263f;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            if (dVar.f50258a != null) {
                p122m1.d dVar2 = this.f50263f;
                p247y7.AbstractC7350t.c(dVar2);
                java.util.HashSet hashSet = dVar2.f50258a;
                p247y7.AbstractC7350t.c(hashSet);
                hashSet.remove(this);
                p122m1.d dVar3 = this.f50263f;
                p247y7.AbstractC7350t.c(dVar3);
                java.util.HashSet hashSet2 = dVar3.f50258a;
                p247y7.AbstractC7350t.c(hashSet2);
                if (hashSet2.size() == 0) {
                    p122m1.d dVar4 = this.f50263f;
                    p247y7.AbstractC7350t.c(dVar4);
                    dVar4.f50258a = null;
                }
            }
        }
        this.f50258a = null;
        this.f50263f = null;
        this.f50264g = 0;
        this.f50265h = Integer.MIN_VALUE;
        this.f50260c = false;
        this.f50259b = 0;
    }

    public final void w() {
        this.f50260c = false;
        this.f50259b = 0;
    }

    public final void x(p042e1.c cVar) {
        p042e1.i iVar = this.f50266i;
        if (iVar == null) {
            this.f50266i = new p042e1.i(e1.i.b.UNRESTRICTED, null);
        } else {
            p247y7.AbstractC7350t.c(iVar);
            iVar.C();
        }
    }

    public final void y(int i6) {
        this.f50259b = i6;
        this.f50260c = true;
    }

    public final void z(int i6) {
        if (t()) {
            this.f50265h = i6;
        }
    }
}
