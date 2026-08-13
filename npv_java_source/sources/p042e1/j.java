package p042e1;

/* JADX INFO: loaded from: classes.dex */
public class j implements e1.b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e1.j.a f44620n = new e1.j.a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f44621o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f44622p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f44626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f44627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f44628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f44629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f44630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f44631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p042e1.b f44634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p042e1.c f44635m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public j(p042e1.b bVar, p042e1.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "cache");
        this.f44623a = -1;
        this.f44624b = 16;
        this.f44625c = 16;
        this.f44626d = new int[16];
        this.f44627e = new int[16];
        this.f44628f = new int[16];
        this.f44629g = new float[16];
        this.f44630h = new int[16];
        this.f44631i = new int[16];
        this.f44633k = -1;
        this.f44634l = bVar;
        this.f44635m = cVar;
        clear();
    }

    private final void l(p042e1.i iVar, int i6) {
        int[] iArr;
        int iO = iVar.o() % this.f44625c;
        int[] iArr2 = this.f44626d;
        int i10 = iArr2[iO];
        if (i10 == this.f44623a) {
            iArr2[iO] = i6;
        } else {
            while (true) {
                iArr = this.f44627e;
                int i11 = iArr[i10];
                if (i11 == this.f44623a) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i6;
        }
        this.f44627e[i6] = this.f44623a;
    }

    private final void m(int i6, p042e1.i iVar, float f6) {
        this.f44628f[i6] = iVar.o();
        this.f44629g[i6] = f6;
        int[] iArr = this.f44630h;
        int i10 = this.f44623a;
        iArr[i6] = i10;
        this.f44631i[i6] = i10;
        iVar.i(this.f44634l);
        iVar.M(iVar.z() + 1);
        this.f44632j++;
    }

    private final int n() {
        int i6 = this.f44624b;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f44628f[i10] == this.f44623a) {
                return i10;
            }
        }
        return -1;
    }

    private final void o() {
        int i6 = this.f44624b * 2;
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.f44628f, i6);
        p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
        this.f44628f = iArrCopyOf;
        float[] fArrCopyOf = java.util.Arrays.copyOf(this.f44629g, i6);
        p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
        this.f44629g = fArrCopyOf;
        int[] iArrCopyOf2 = java.util.Arrays.copyOf(this.f44630h, i6);
        p247y7.AbstractC7350t.e(iArrCopyOf2, "copyOf(...)");
        this.f44630h = iArrCopyOf2;
        int[] iArrCopyOf3 = java.util.Arrays.copyOf(this.f44631i, i6);
        p247y7.AbstractC7350t.e(iArrCopyOf3, "copyOf(...)");
        this.f44631i = iArrCopyOf3;
        int[] iArrCopyOf4 = java.util.Arrays.copyOf(this.f44627e, i6);
        p247y7.AbstractC7350t.e(iArrCopyOf4, "copyOf(...)");
        this.f44627e = iArrCopyOf4;
        for (int i10 = this.f44624b; i10 < i6; i10++) {
            int[] iArr = this.f44628f;
            int i11 = this.f44623a;
            iArr[i10] = i11;
            this.f44627e[i10] = i11;
        }
        this.f44624b = i6;
    }

    private final void q(int i6, p042e1.i iVar, float f6) {
        int iN = n();
        m(iN, iVar, f6);
        int i10 = this.f44623a;
        if (i6 != i10) {
            this.f44630h[iN] = i6;
            int[] iArr = this.f44631i;
            iArr[iN] = iArr[i6];
            iArr[i6] = iN;
        } else {
            this.f44630h[iN] = i10;
            if (this.f44632j > 0) {
                this.f44631i[iN] = this.f44633k;
                this.f44633k = iN;
            } else {
                this.f44631i[iN] = i10;
            }
        }
        int i11 = this.f44631i[iN];
        if (i11 != i10) {
            this.f44630h[i11] = iN;
        }
        l(iVar, iN);
    }

    private final void r(p042e1.i iVar) {
        int[] iArr;
        int i6;
        int i10;
        int iO = iVar.o() % this.f44625c;
        int i11 = this.f44626d[iO];
        if (i11 == this.f44623a) {
            return;
        }
        int iO2 = iVar.o();
        if (this.f44628f[i11] == iO2) {
            int[] iArr2 = this.f44626d;
            int[] iArr3 = this.f44627e;
            iArr2[iO] = iArr3[i11];
            iArr3[i11] = this.f44623a;
            return;
        }
        while (true) {
            iArr = this.f44627e;
            i6 = iArr[i11];
            i10 = this.f44623a;
            if (i6 == i10 || this.f44628f[i6] == iO2) {
                break;
            } else {
                i11 = i6;
            }
        }
        if (i6 == i10 || this.f44628f[i6] != iO2) {
            return;
        }
        iArr[i11] = iArr[i6];
        iArr[i6] = i10;
    }

    @Override // e1.b.a
    public int a() {
        return this.f44632j;
    }

    @Override // e1.b.a
    public p042e1.i b(int i6) {
        int i10 = this.f44632j;
        if (i10 == 0) {
            return null;
        }
        int i11 = this.f44633k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i6 && i11 != this.f44623a) {
                return this.f44635m.b()[this.f44628f[i11]];
            }
            i11 = this.f44631i[i11];
            if (i11 == this.f44623a) {
                break;
            }
        }
        return null;
    }

    @Override // e1.b.a
    public void c() {
        int i6 = this.f44632j;
        int i10 = this.f44633k;
        for (int i11 = 0; i11 < i6; i11++) {
            float[] fArr = this.f44629g;
            fArr[i10] = fArr[i10] * (-1);
            i10 = this.f44631i[i10];
            if (i10 == this.f44623a) {
                return;
            }
        }
    }

    @Override // e1.b.a
    public final void clear() {
        int i6 = this.f44632j;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.i iVarB = b(i10);
            p247y7.AbstractC7350t.c(iVarB);
            iVarB.B(this.f44634l);
        }
        int i11 = this.f44624b;
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = this.f44628f;
            int i13 = this.f44623a;
            iArr[i12] = i13;
            this.f44627e[i12] = i13;
        }
        int i14 = this.f44625c;
        for (int i15 = 0; i15 < i14; i15++) {
            this.f44626d[i15] = this.f44623a;
        }
        this.f44632j = 0;
        this.f44633k = -1;
    }

    @Override // e1.b.a
    public float d(int i6) {
        int i10 = this.f44632j;
        int i11 = this.f44633k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i6) {
                return this.f44629g[i11];
            }
            i11 = this.f44631i[i11];
            if (i11 == this.f44623a) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // e1.b.a
    public void e(float f6) {
        int i6 = this.f44632j;
        int i10 = this.f44633k;
        for (int i11 = 0; i11 < i6; i11++) {
            float[] fArr = this.f44629g;
            fArr[i10] = fArr[i10] / f6;
            i10 = this.f44631i[i10];
            if (i10 == this.f44623a) {
                return;
            }
        }
    }

    @Override // e1.b.a
    public boolean f(p042e1.i iVar) {
        return p(iVar) != this.f44623a;
    }

    @Override // e1.b.a
    public float g(p042e1.i iVar) {
        int iP = p(iVar);
        if (iP != this.f44623a) {
            return this.f44629g[iP];
        }
        return 0.0f;
    }

    @Override // e1.b.a
    public void h(p042e1.i iVar, float f6, boolean z6) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int iP = p(iVar);
            if (iP == this.f44623a) {
                i(iVar, f6);
                return;
            }
            float[] fArr = this.f44629g;
            float f10 = fArr[iP] + f6;
            fArr[iP] = f10;
            if (f10 <= -0.001f || f10 >= 0.001f) {
                return;
            }
            fArr[iP] = 0.0f;
            k(iVar, z6);
        }
    }

    @Override // e1.b.a
    public void i(p042e1.i iVar, float f6) {
        if (f6 > -0.001f && f6 < 0.001f) {
            k(iVar, true);
            return;
        }
        if (this.f44632j == 0) {
            p247y7.AbstractC7350t.c(iVar);
            m(0, iVar, f6);
            l(iVar, 0);
            this.f44633k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != this.f44623a) {
            this.f44629g[iP] = f6;
            return;
        }
        if (this.f44632j + 1 >= this.f44624b) {
            o();
        }
        int i6 = this.f44632j;
        int i10 = this.f44633k;
        int i11 = -1;
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = this.f44628f[i10];
            p247y7.AbstractC7350t.c(iVar);
            if (i13 == iVar.o()) {
                this.f44629g[i10] = f6;
                return;
            }
            if (this.f44628f[i10] < iVar.o()) {
                i11 = i10;
            }
            i10 = this.f44631i[i10];
            if (i10 == this.f44623a) {
                break;
            }
        }
        p247y7.AbstractC7350t.c(iVar);
        q(i11, iVar, f6);
    }

    @Override // e1.b.a
    public float j(p042e1.b bVar, boolean z6) {
        p247y7.AbstractC7350t.c(bVar);
        float fG = g(bVar.u());
        k(bVar.u(), z6);
        p042e1.j jVar = (p042e1.j) bVar.v();
        p247y7.AbstractC7350t.c(jVar);
        int iA = jVar.a();
        int i6 = 0;
        int i10 = 0;
        while (i6 < iA) {
            if (jVar.f44628f[i10] != this.f44623a) {
                float f6 = jVar.f44629g[i10];
                p042e1.i iVar = this.f44635m.b()[jVar.f44628f[i10]];
                p247y7.AbstractC7350t.c(iVar);
                h(iVar, f6 * fG, z6);
                i6++;
            }
            i10++;
        }
        return fG;
    }

    @Override // e1.b.a
    public float k(p042e1.i iVar, boolean z6) {
        int iP = p(iVar);
        if (iP == this.f44623a) {
            return 0.0f;
        }
        p247y7.AbstractC7350t.c(iVar);
        r(iVar);
        float f6 = this.f44629g[iP];
        if (this.f44633k == iP) {
            this.f44633k = this.f44631i[iP];
        }
        int[] iArr = this.f44628f;
        int i6 = this.f44623a;
        iArr[iP] = i6;
        int[] iArr2 = this.f44630h;
        int i10 = iArr2[iP];
        if (i10 != i6) {
            int[] iArr3 = this.f44631i;
            iArr3[i10] = iArr3[iP];
        }
        int i11 = this.f44631i[iP];
        if (i11 != i6) {
            iArr2[i11] = iArr2[iP];
        }
        this.f44632j--;
        iVar.M(iVar.z() - 1);
        if (z6) {
            iVar.B(this.f44634l);
        }
        return f6;
    }

    public int p(p042e1.i iVar) {
        int i6;
        if (this.f44632j == 0 || iVar == null) {
            return this.f44623a;
        }
        int iO = iVar.o();
        int i10 = this.f44626d[iO % this.f44625c];
        int i11 = this.f44623a;
        if (i10 == i11) {
            return i11;
        }
        if (this.f44628f[i10] == iO) {
            return i10;
        }
        do {
            i10 = this.f44627e[i10];
            i6 = this.f44623a;
            if (i10 == i6) {
                break;
            }
        } while (this.f44628f[i10] != iO);
        return (i10 != i6 && this.f44628f[i10] == iO) ? i10 : i6;
    }

    public java.lang.String toString() {
        java.lang.String str = hashCode() + " { ";
        int i6 = this.f44632j;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.i iVarB = b(i10);
            if (iVarB != null) {
                java.lang.String str2 = str + iVarB + " = " + d(i10) + " ";
                int iP = p(iVarB);
                java.lang.String str3 = str2 + "[p: ";
                java.lang.String str4 = (this.f44630h[iP] != this.f44623a ? str3 + this.f44635m.b()[this.f44628f[this.f44630h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f44631i[iP] != this.f44623a ? str4 + this.f44635m.b()[this.f44628f[this.f44631i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
