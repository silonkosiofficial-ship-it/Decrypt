package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class h extends p162q1.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p162q1.i[] f52982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p162q1.i[] f52983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    q1.h.b f52985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    p162q1.c f52986l;

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p162q1.i iVar, p162q1.i iVar2) {
            return iVar.f52994c - iVar2.f52994c;
        }
    }

    class b implements java.lang.Comparable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        p162q1.i f52988C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        p162q1.h f52989D;

        public b(p162q1.h hVar) {
            this.f52989D = hVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object obj) {
            return this.f52988C.f52994c - ((p162q1.i) obj).f52994c;
        }

        public boolean e(p162q1.i iVar, float f6) {
            boolean z6 = true;
            if (!this.f52988C.f52992a) {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f10 = iVar.f53000i[i6];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f6;
                        if (java.lang.Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        this.f52988C.f53000i[i6] = f11;
                    } else {
                        this.f52988C.f53000i[i6] = 0.0f;
                    }
                }
                return true;
            }
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f52988C.f53000i;
                float f12 = fArr[i10] + (iVar.f53000i[i10] * f6);
                fArr[i10] = f12;
                if (java.lang.Math.abs(f12) < 1.0E-4f) {
                    this.f52988C.f53000i[i10] = 0.0f;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                p162q1.h.this.G(this.f52988C);
            }
            return false;
        }

        public void g(p162q1.i iVar) {
            this.f52988C = iVar;
        }

        public final boolean i() {
            for (int i6 = 8; i6 >= 0; i6--) {
                float f6 = this.f52988C.f53000i[i6];
                if (f6 > 0.0f) {
                    return false;
                }
                if (f6 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean m(p162q1.i iVar) {
            for (int i6 = 8; i6 >= 0; i6--) {
                float f6 = iVar.f53000i[i6];
                float f10 = this.f52988C.f53000i[i6];
                if (f10 != f6) {
                    if (f10 < f6) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void n() {
            java.util.Arrays.fill(this.f52988C.f53000i, 0.0f);
        }

        public java.lang.String toString() {
            java.lang.String str = "[ ";
            if (this.f52988C != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    str = str + this.f52988C.f53000i[i6] + " ";
                }
            }
            return str + "] " + this.f52988C;
        }
    }

    public h(p162q1.c cVar) {
        super(cVar);
        this.f52981g = 128;
        this.f52982h = new p162q1.i[128];
        this.f52983i = new p162q1.i[128];
        this.f52984j = 0;
        this.f52985k = new q1.h.b(this);
        this.f52986l = cVar;
    }

    private final void F(p162q1.i iVar) {
        int i6;
        int i10 = this.f52984j + 1;
        p162q1.i[] iVarArr = this.f52982h;
        if (i10 > iVarArr.length) {
            p162q1.i[] iVarArr2 = (p162q1.i[]) java.util.Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f52982h = iVarArr2;
            this.f52983i = (p162q1.i[]) java.util.Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        p162q1.i[] iVarArr3 = this.f52982h;
        int i11 = this.f52984j;
        iVarArr3[i11] = iVar;
        int i12 = i11 + 1;
        this.f52984j = i12;
        if (i12 > 1 && iVarArr3[i11].f52994c > iVar.f52994c) {
            int i13 = 0;
            while (true) {
                i6 = this.f52984j;
                if (i13 >= i6) {
                    break;
                }
                this.f52983i[i13] = this.f52982h[i13];
                i13++;
            }
            java.util.Arrays.sort(this.f52983i, 0, i6, new q1.h.a());
            for (int i14 = 0; i14 < this.f52984j; i14++) {
                this.f52982h[i14] = this.f52983i[i14];
            }
        }
        iVar.f52992a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(p162q1.i iVar) {
        int i6 = 0;
        while (i6 < this.f52984j) {
            if (this.f52982h[i6] == iVar) {
                while (true) {
                    int i10 = this.f52984j;
                    if (i6 >= i10 - 1) {
                        this.f52984j = i10 - 1;
                        iVar.f52992a = false;
                        return;
                    } else {
                        p162q1.i[] iVarArr = this.f52982h;
                        int i11 = i6 + 1;
                        iVarArr[i6] = iVarArr[i11];
                        i6 = i11;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // p162q1.b
    public void C(p162q1.b bVar, boolean z6) {
        p162q1.i iVar = bVar.f52948a;
        if (iVar == null) {
            return;
        }
        q1.b.a aVar = bVar.f52952e;
        int iA = aVar.a();
        for (int i6 = 0; i6 < iA; i6++) {
            p162q1.i iVarB = aVar.b(i6);
            float fD = aVar.d(i6);
            this.f52985k.g(iVarB);
            if (this.f52985k.e(iVar, fD)) {
                F(iVarB);
            }
            this.f52949b += bVar.f52949b * fD;
        }
        G(iVar);
    }

    @Override // p162q1.b, q1.d.a
    public void a(p162q1.i iVar) {
        this.f52985k.g(iVar);
        this.f52985k.n();
        iVar.f53000i[iVar.f52996e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // p162q1.b, q1.d.a
    public p162q1.i b(p162q1.d dVar, boolean[] zArr) {
        int i6 = -1;
        for (int i10 = 0; i10 < this.f52984j; i10++) {
            p162q1.i iVar = this.f52982h[i10];
            if (!zArr[iVar.f52994c]) {
                this.f52985k.g(iVar);
                q1.h.b bVar = this.f52985k;
                if (i6 == -1) {
                    if (bVar.i()) {
                        i6 = i10;
                    }
                } else if (bVar.m(this.f52982h[i6])) {
                    i6 = i10;
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f52982h[i6];
    }

    @Override // p162q1.b, q1.d.a
    public void clear() {
        this.f52984j = 0;
        this.f52949b = 0.0f;
    }

    @Override // p162q1.b
    public java.lang.String toString() {
        java.lang.String str = " goal -> (" + this.f52949b + ") : ";
        for (int i6 = 0; i6 < this.f52984j; i6++) {
            this.f52985k.g(this.f52982h[i6]);
            str = str + this.f52985k + " ";
        }
        return str;
    }
}
