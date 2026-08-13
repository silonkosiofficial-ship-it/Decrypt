package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected p172r1.e f53598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected p172r1.e f53599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected p172r1.e f53600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected p172r1.e f53601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p172r1.e f53602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected p172r1.e f53603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p172r1.e f53604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected java.util.ArrayList f53605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f53606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f53607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f53608k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f53610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f53611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f53612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f53613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f53615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f53616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f53617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f53618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f53619v;

    public c(p172r1.e eVar, int i6, boolean z6) {
        this.f53598a = eVar;
        this.f53613p = i6;
        this.f53614q = z6;
    }

    private void b() {
        int i6 = this.f53613p * 2;
        p172r1.e eVar = this.f53598a;
        this.f53612o = true;
        p172r1.e eVar2 = eVar;
        boolean z6 = false;
        while (!z6) {
            this.f53606i++;
            p172r1.e[] eVarArr = eVar.f53702s0;
            int i10 = this.f53613p;
            p172r1.e eVar3 = null;
            eVarArr[i10] = null;
            eVar.f53700r0[i10] = null;
            if (eVar.O() != 8) {
                this.f53609l++;
                r1.e.b bVarS = eVar.s(this.f53613p);
                r1.e.b bVar = r1.e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f53610m += eVar.A(this.f53613p);
                }
                int iC = this.f53610m + eVar.f53648J[i6].c();
                this.f53610m = iC;
                int i11 = i6 + 1;
                this.f53610m = iC + eVar.f53648J[i11].c();
                int iC2 = this.f53611n + eVar.f53648J[i6].c();
                this.f53611n = iC2;
                this.f53611n = iC2 + eVar.f53648J[i11].c();
                if (this.f53599b == null) {
                    this.f53599b = eVar;
                }
                this.f53601d = eVar;
                r1.e.b[] bVarArr = eVar.f53651M;
                int i12 = this.f53613p;
                if (bVarArr[i12] == bVar) {
                    int i13 = eVar.f53691n[i12];
                    if (i13 == 0 || i13 == 3 || i13 == 2) {
                        this.f53607j++;
                        float f6 = eVar.f53698q0[i12];
                        if (f6 > 0.0f) {
                            this.f53608k += f6;
                        }
                        if (c(eVar, i12)) {
                            if (f6 < 0.0f) {
                                this.f53615r = true;
                            } else {
                                this.f53616s = true;
                            }
                            if (this.f53605h == null) {
                                this.f53605h = new java.util.ArrayList();
                            }
                            this.f53605h.add(eVar);
                        }
                        if (this.f53603f == null) {
                            this.f53603f = eVar;
                        }
                        p172r1.e eVar4 = this.f53604g;
                        if (eVar4 != null) {
                            eVar4.f53700r0[this.f53613p] = eVar;
                        }
                        this.f53604g = eVar;
                    }
                    if (this.f53613p != 0 ? !(eVar.f53689m == 0 && eVar.f53699r == 0 && eVar.f53701s == 0) : !(eVar.f53687l == 0 && eVar.f53693o == 0 && eVar.f53695p == 0)) {
                        this.f53612o = false;
                    }
                    if (eVar.f53655Q != 0.0f) {
                        this.f53612o = false;
                        this.f53618u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f53702s0[this.f53613p] = eVar;
            }
            p172r1.d dVar = eVar.f53648J[i6 + 1].f53623d;
            if (dVar != null) {
                p172r1.e eVar5 = dVar.f53621b;
                p172r1.d dVar2 = eVar5.f53648J[i6].f53623d;
                if (dVar2 != null && dVar2.f53621b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z6 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        p172r1.e eVar6 = this.f53599b;
        if (eVar6 != null) {
            this.f53610m -= eVar6.f53648J[i6].c();
        }
        p172r1.e eVar7 = this.f53601d;
        if (eVar7 != null) {
            this.f53610m -= eVar7.f53648J[i6 + 1].c();
        }
        this.f53600c = eVar;
        if (this.f53613p == 0 && this.f53614q) {
            this.f53602e = eVar;
        } else {
            this.f53602e = this.f53598a;
        }
        this.f53617t = this.f53616s && this.f53615r;
    }

    private static boolean c(p172r1.e eVar, int i6) {
        int i10;
        return eVar.O() != 8 && eVar.f53651M[i6] == r1.e.b.MATCH_CONSTRAINT && ((i10 = eVar.f53691n[i6]) == 0 || i10 == 3);
    }

    public void a() {
        if (!this.f53619v) {
            b();
        }
        this.f53619v = true;
    }
}
