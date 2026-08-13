package p182s1;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements p182s1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p172r1.e f54101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p182s1.k f54102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected r1.e.b f54103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p182s1.g f54104e = new p182s1.g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54105f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f54106g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p182s1.f f54107h = new p182s1.f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p182s1.f f54108i = new p182s1.f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected s1.m.b f54109j = s1.m.b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54110a;

        static {
            int[] iArr = new int[r1.d.b.values().length];
            f54110a = iArr;
            try {
                iArr[r1.d.b.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f54110a[r1.d.b.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f54110a[r1.d.b.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f54110a[r1.d.b.BASELINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f54110a[r1.d.b.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(p172r1.e eVar) {
        this.f54101b = eVar;
    }

    private void l(int i6, int i10) {
        p182s1.g gVar;
        int iG;
        int i11 = this.f54100a;
        if (i11 == 0) {
            gVar = this.f54104e;
            iG = g(i10, i6);
        } else if (i11 == 1) {
            int iG2 = g(this.f54104e.f54086m, i6);
            gVar = this.f54104e;
            iG = java.lang.Math.min(iG2, i10);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                p172r1.e eVar = this.f54101b;
                p182s1.m mVar = eVar.f53673e;
                r1.e.b bVar = mVar.f54103d;
                r1.e.b bVar2 = r1.e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f54100a == 3) {
                    p182s1.l lVar = eVar.f53675f;
                    if (lVar.f54103d == bVar2 && lVar.f54100a == 3) {
                        return;
                    }
                }
                if (i6 == 0) {
                    mVar = eVar.f53675f;
                }
                if (mVar.f54104e.f54074j) {
                    float fT = eVar.t();
                    this.f54104e.d(i6 == 1 ? (int) ((mVar.f54104e.f54071g / fT) + 0.5f) : (int) ((fT * mVar.f54104e.f54071g) + 0.5f));
                    return;
                }
                return;
            }
            p172r1.e eVarG = this.f54101b.G();
            if (eVarG == null) {
                return;
            }
            p182s1.g gVar2 = (i6 == 0 ? eVarG.f53673e : eVarG.f53675f).f54104e;
            if (!gVar2.f54074j) {
                return;
            }
            p172r1.e eVar2 = this.f54101b;
            i10 = (int) ((gVar2.f54071g * (i6 == 0 ? eVar2.f53697q : eVar2.f53703t)) + 0.5f);
            gVar = this.f54104e;
            iG = g(i10, i6);
        }
        gVar.d(iG);
    }

    @Override // p182s1.d
    public abstract void a(p182s1.d dVar);

    protected final void b(p182s1.f fVar, p182s1.f fVar2, int i6) {
        fVar.f54076l.add(fVar2);
        fVar.f54070f = i6;
        fVar2.f54075k.add(fVar);
    }

    protected final void c(p182s1.f fVar, p182s1.f fVar2, int i6, p182s1.g gVar) {
        fVar.f54076l.add(fVar2);
        fVar.f54076l.add(this.f54104e);
        fVar.f54072h = i6;
        fVar.f54073i = gVar;
        fVar2.f54075k.add(fVar);
        gVar.f54075k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i6, int i10) {
        int iMax;
        if (i10 == 0) {
            p172r1.e eVar = this.f54101b;
            int i11 = eVar.f53695p;
            iMax = java.lang.Math.max(eVar.f53693o, i6);
            if (i11 > 0) {
                iMax = java.lang.Math.min(i11, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        } else {
            p172r1.e eVar2 = this.f54101b;
            int i12 = eVar2.f53701s;
            iMax = java.lang.Math.max(eVar2.f53699r, i6);
            if (i12 > 0) {
                iMax = java.lang.Math.min(i12, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        }
        return iMax;
    }

    protected final p182s1.f h(p172r1.d dVar) {
        p182s1.m mVar;
        p182s1.m mVar2;
        p172r1.d dVar2 = dVar.f53623d;
        if (dVar2 == null) {
            return null;
        }
        p172r1.e eVar = dVar2.f53621b;
        int i6 = s1.m.a.f54110a[dVar2.f53622c.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                mVar2 = eVar.f53673e;
            } else if (i6 == 3) {
                mVar = eVar.f53675f;
            } else {
                if (i6 == 4) {
                    return eVar.f53675f.f54097k;
                }
                if (i6 != 5) {
                    return null;
                }
                mVar2 = eVar.f53675f;
            }
            return mVar2.f54108i;
        }
        mVar = eVar.f53673e;
        return mVar.f54107h;
    }

    protected final p182s1.f i(p172r1.d dVar, int i6) {
        p172r1.d dVar2 = dVar.f53623d;
        if (dVar2 == null) {
            return null;
        }
        p172r1.e eVar = dVar2.f53621b;
        p182s1.m mVar = i6 == 0 ? eVar.f53673e : eVar.f53675f;
        int i10 = s1.m.a.f54110a[dVar2.f53622c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f54108i;
        }
        return mVar.f54107h;
    }

    public long j() {
        p182s1.g gVar = this.f54104e;
        if (gVar.f54074j) {
            return gVar.f54071g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f54106g;
    }

    abstract boolean m();

    protected void n(p182s1.d dVar, p172r1.d dVar2, p172r1.d dVar3, int i6) {
        p182s1.f fVar;
        p182s1.f fVarH = h(dVar2);
        p182s1.f fVarH2 = h(dVar3);
        if (fVarH.f54074j && fVarH2.f54074j) {
            int iC = fVarH.f54071g + dVar2.c();
            int iC2 = fVarH2.f54071g - dVar3.c();
            int i10 = iC2 - iC;
            if (!this.f54104e.f54074j && this.f54103d == r1.e.b.MATCH_CONSTRAINT) {
                l(i6, i10);
            }
            p182s1.g gVar = this.f54104e;
            if (gVar.f54074j) {
                if (gVar.f54071g == i10) {
                    this.f54107h.d(iC);
                    fVar = this.f54108i;
                } else {
                    p172r1.e eVar = this.f54101b;
                    float fW = i6 == 0 ? eVar.w() : eVar.K();
                    if (fVarH == fVarH2) {
                        iC = fVarH.f54071g;
                        iC2 = fVarH2.f54071g;
                        fW = 0.5f;
                    }
                    this.f54107h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f54104e.f54071g) * fW)));
                    fVar = this.f54108i;
                    iC2 = this.f54107h.f54071g + this.f54104e.f54071g;
                }
                fVar.d(iC2);
            }
        }
    }

    protected void o(p182s1.d dVar) {
    }

    protected void p(p182s1.d dVar) {
    }
}
