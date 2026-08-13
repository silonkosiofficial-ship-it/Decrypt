package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p172r1.e f53621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.d.b f53622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p172r1.d f53623d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    p162q1.i f53626g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashSet f53620a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53624e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f53625f = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53627a;

        static {
            int[] iArr = new int[r1.d.b.values().length];
            f53627a = iArr;
            try {
                iArr[r1.d.b.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f53627a[r1.d.b.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f53627a[r1.d.b.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f53627a[r1.d.b.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f53627a[r1.d.b.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f53627a[r1.d.b.BASELINE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f53627a[r1.d.b.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f53627a[r1.d.b.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f53627a[r1.d.b.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
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
        CENTER_Y
    }

    public d(p172r1.e eVar, r1.d.b bVar) {
        this.f53621b = eVar;
        this.f53622c = bVar;
    }

    public boolean a(p172r1.d dVar, int i6) {
        return b(dVar, i6, -1, false);
    }

    public boolean b(p172r1.d dVar, int i6, int i10, boolean z6) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z6 && !k(dVar)) {
            return false;
        }
        this.f53623d = dVar;
        if (dVar.f53620a == null) {
            dVar.f53620a = new java.util.HashSet();
        }
        this.f53623d.f53620a.add(this);
        if (i6 > 0) {
            this.f53624e = i6;
        } else {
            this.f53624e = 0;
        }
        this.f53625f = i10;
        return true;
    }

    public int c() {
        p172r1.d dVar;
        if (this.f53621b.O() == 8) {
            return 0;
        }
        return (this.f53625f <= -1 || (dVar = this.f53623d) == null || dVar.f53621b.O() != 8) ? this.f53624e : this.f53625f;
    }

    public final p172r1.d d() {
        switch (r1.d.a.f53627a[this.f53622c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f53621b.f53642D;
            case 3:
                return this.f53621b.f53640B;
            case 4:
                return this.f53621b.f53643E;
            case 5:
                return this.f53621b.f53641C;
            default:
                throw new java.lang.AssertionError(this.f53622c.name());
        }
    }

    public p172r1.e e() {
        return this.f53621b;
    }

    public p162q1.i f() {
        return this.f53626g;
    }

    public p172r1.d g() {
        return this.f53623d;
    }

    public r1.d.b h() {
        return this.f53622c;
    }

    public boolean i() {
        java.util.HashSet hashSet = this.f53620a;
        if (hashSet == null) {
            return false;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((p172r1.d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f53623d != null;
    }

    public boolean k(p172r1.d dVar) {
        if (dVar == null) {
            return false;
        }
        r1.d.b bVarH = dVar.h();
        r1.d.b bVar = this.f53622c;
        if (bVarH == bVar) {
            return bVar != r1.d.b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (r1.d.a.f53627a[bVar.ordinal()]) {
            case 1:
                return (bVarH == r1.d.b.BASELINE || bVarH == r1.d.b.CENTER_X || bVarH == r1.d.b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z6 = bVarH == r1.d.b.LEFT || bVarH == r1.d.b.RIGHT;
                if (dVar.e() instanceof p172r1.h) {
                    return z6 || bVarH == r1.d.b.CENTER_X;
                }
                return z6;
            case 4:
            case 5:
                boolean z10 = bVarH == r1.d.b.TOP || bVarH == r1.d.b.BOTTOM;
                if (dVar.e() instanceof p172r1.h) {
                    return z10 || bVarH == r1.d.b.CENTER_Y;
                }
                return z10;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new java.lang.AssertionError(this.f53622c.name());
        }
    }

    public void l() {
        java.util.HashSet hashSet;
        p172r1.d dVar = this.f53623d;
        if (dVar != null && (hashSet = dVar.f53620a) != null) {
            hashSet.remove(this);
        }
        this.f53623d = null;
        this.f53624e = 0;
        this.f53625f = -1;
    }

    public void m(p162q1.c cVar) {
        p162q1.i iVar = this.f53626g;
        if (iVar == null) {
            this.f53626g = new p162q1.i(q1.i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i6) {
        if (j()) {
            this.f53625f = i6;
        }
    }

    public java.lang.String toString() {
        return this.f53621b.r() + ":" + this.f53622c.toString();
    }
}
