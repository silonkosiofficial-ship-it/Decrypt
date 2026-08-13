package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class l extends p182s1.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p182s1.f f54097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    p182s1.g f54098l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54099a;

        static {
            int[] iArr = new int[s1.m.b.values().length];
            f54099a = iArr;
            try {
                iArr[s1.m.b.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f54099a[s1.m.b.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f54099a[s1.m.b.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public l(p172r1.e eVar) {
        super(eVar);
        p182s1.f fVar = new p182s1.f(this);
        this.f54097k = fVar;
        this.f54098l = null;
        this.f54107h.f54069e = s1.f.a.TOP;
        this.f54108i.f54069e = s1.f.a.BOTTOM;
        fVar.f54069e = s1.f.a.BASELINE;
        this.f54105f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // p182s1.m, p182s1.d
    public void a(p182s1.d dVar) {
        int i6;
        float fT;
        int i10 = s1.l.a.f54099a[this.f54109j.ordinal()];
        if (i10 == 1) {
            p(dVar);
        } else if (i10 == 2) {
            o(dVar);
        } else if (i10 == 3) {
            p172r1.e eVar = this.f54101b;
            n(dVar, eVar.f53641C, eVar.f53643E, 1);
            return;
        }
        p182s1.g gVar = this.f54104e;
        if (gVar.f54067c && !gVar.f54074j && this.f54103d == r1.e.b.MATCH_CONSTRAINT) {
            p172r1.e eVar2 = this.f54101b;
            int i11 = eVar2.f53689m;
            if (i11 == 2) {
                p172r1.e eVarG = eVar2.G();
                if (eVarG != null) {
                    p182s1.g gVar2 = eVarG.f53675f.f54104e;
                    if (gVar2.f54074j) {
                        i6 = (int) ((gVar2.f54071g * this.f54101b.f53703t) + 0.5f);
                        this.f54104e.d(i6);
                    }
                }
            } else if (i11 == 3 && eVar2.f53673e.f54104e.f54074j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    p172r1.e eVar3 = this.f54101b;
                    fT = eVar3.f53673e.f54104e.f54071g / eVar3.t();
                    i6 = (int) (fT + 0.5f);
                } else if (iU == 0) {
                    p172r1.e eVar4 = this.f54101b;
                    fT = eVar4.f53673e.f54104e.f54071g * eVar4.t();
                    i6 = (int) (fT + 0.5f);
                } else if (iU != 1) {
                    i6 = 0;
                } else {
                    p172r1.e eVar5 = this.f54101b;
                    fT = eVar5.f53673e.f54104e.f54071g / eVar5.t();
                    i6 = (int) (fT + 0.5f);
                }
                this.f54104e.d(i6);
            }
        }
        p182s1.f fVar = this.f54107h;
        if (fVar.f54067c) {
            p182s1.f fVar2 = this.f54108i;
            if (fVar2.f54067c) {
                if (fVar.f54074j && fVar2.f54074j && this.f54104e.f54074j) {
                    return;
                }
                if (!this.f54104e.f54074j && this.f54103d == r1.e.b.MATCH_CONSTRAINT) {
                    p172r1.e eVar6 = this.f54101b;
                    if (eVar6.f53687l == 0 && !eVar6.X()) {
                        p182s1.f fVar3 = (p182s1.f) this.f54107h.f54076l.get(0);
                        p182s1.f fVar4 = (p182s1.f) this.f54108i.f54076l.get(0);
                        int i12 = fVar3.f54071g;
                        p182s1.f fVar5 = this.f54107h;
                        int i13 = i12 + fVar5.f54070f;
                        int i14 = fVar4.f54071g + this.f54108i.f54070f;
                        fVar5.d(i13);
                        this.f54108i.d(i14);
                        this.f54104e.d(i14 - i13);
                        return;
                    }
                }
                if (!this.f54104e.f54074j && this.f54103d == r1.e.b.MATCH_CONSTRAINT && this.f54100a == 1 && this.f54107h.f54076l.size() > 0 && this.f54108i.f54076l.size() > 0) {
                    p182s1.f fVar6 = (p182s1.f) this.f54107h.f54076l.get(0);
                    int i15 = (((p182s1.f) this.f54108i.f54076l.get(0)).f54071g + this.f54108i.f54070f) - (fVar6.f54071g + this.f54107h.f54070f);
                    p182s1.g gVar3 = this.f54104e;
                    int i16 = gVar3.f54086m;
                    if (i15 < i16) {
                        gVar3.d(i15);
                    } else {
                        gVar3.d(i16);
                    }
                }
                if (this.f54104e.f54074j && this.f54107h.f54076l.size() > 0 && this.f54108i.f54076l.size() > 0) {
                    p182s1.f fVar7 = (p182s1.f) this.f54107h.f54076l.get(0);
                    p182s1.f fVar8 = (p182s1.f) this.f54108i.f54076l.get(0);
                    int i17 = fVar7.f54071g + this.f54107h.f54070f;
                    int i18 = fVar8.f54071g + this.f54108i.f54070f;
                    float fK = this.f54101b.K();
                    if (fVar7 == fVar8) {
                        i17 = fVar7.f54071g;
                        i18 = fVar8.f54071g;
                        fK = 0.5f;
                    }
                    this.f54107h.d((int) (i17 + 0.5f + (((i18 - i17) - this.f54104e.f54071g) * fK)));
                    this.f54108i.d(this.f54107h.f54071g + this.f54104e.f54071g);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03d5 A[PHI: r0
  0x03d5: PHI (r0v32 s1.j) = (r0v23 s1.j), (r0v47 s1.j) binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.f54101b.S() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.f54097k;
        r1 = r10.f54107h;
        r2 = r10.f54098l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.f54101b.S() != false) goto L110;
     */
    @Override // p182s1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182s1.l.d():void");
    }

    @Override // p182s1.m
    public void e() {
        p182s1.f fVar = this.f54107h;
        if (fVar.f54074j) {
            this.f54101b.G0(fVar.f54071g);
        }
    }

    @Override // p182s1.m
    void f() {
        this.f54102c = null;
        this.f54107h.c();
        this.f54108i.c();
        this.f54097k.c();
        this.f54104e.c();
        this.f54106g = false;
    }

    @Override // p182s1.m
    boolean m() {
        return this.f54103d != r1.e.b.MATCH_CONSTRAINT || this.f54101b.f53689m == 0;
    }

    void q() {
        this.f54106g = false;
        this.f54107h.c();
        this.f54107h.f54074j = false;
        this.f54108i.c();
        this.f54108i.f54074j = false;
        this.f54097k.c();
        this.f54097k.f54074j = false;
        this.f54104e.f54074j = false;
    }

    public java.lang.String toString() {
        return "VerticalRun " + this.f54101b.r();
    }
}
