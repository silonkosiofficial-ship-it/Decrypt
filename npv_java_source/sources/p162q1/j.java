package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class j implements q1.b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f53012n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53013a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53014b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53015c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f53016d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f53017e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f53018f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f53019g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f53020h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f53021i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f53022j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f53023k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p162q1.b f53024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final p162q1.c f53025m;

    j(p162q1.b bVar, p162q1.c cVar) {
        this.f53024l = bVar;
        this.f53025m = cVar;
        clear();
    }

    private void l(p162q1.i iVar, int i6) {
        int[] iArr;
        int i10 = iVar.f52994c % this.f53015c;
        int[] iArr2 = this.f53016d;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            iArr2[i10] = i6;
        } else {
            while (true) {
                iArr = this.f53017e;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            iArr[i11] = i6;
        }
        this.f53017e[i6] = -1;
    }

    private void m(int i6, p162q1.i iVar, float f6) {
        this.f53018f[i6] = iVar.f52994c;
        this.f53019g[i6] = f6;
        this.f53020h[i6] = -1;
        this.f53021i[i6] = -1;
        iVar.a(this.f53024l);
        iVar.f53004m++;
        this.f53022j++;
    }

    private int n() {
        for (int i6 = 0; i6 < this.f53014b; i6++) {
            if (this.f53018f[i6] == -1) {
                return i6;
            }
        }
        return -1;
    }

    private void o() {
        int i6 = this.f53014b * 2;
        this.f53018f = java.util.Arrays.copyOf(this.f53018f, i6);
        this.f53019g = java.util.Arrays.copyOf(this.f53019g, i6);
        this.f53020h = java.util.Arrays.copyOf(this.f53020h, i6);
        this.f53021i = java.util.Arrays.copyOf(this.f53021i, i6);
        this.f53017e = java.util.Arrays.copyOf(this.f53017e, i6);
        for (int i10 = this.f53014b; i10 < i6; i10++) {
            this.f53018f[i10] = -1;
            this.f53017e[i10] = -1;
        }
        this.f53014b = i6;
    }

    private void q(int i6, p162q1.i iVar, float f6) {
        int iN = n();
        m(iN, iVar, f6);
        if (i6 != -1) {
            this.f53020h[iN] = i6;
            int[] iArr = this.f53021i;
            iArr[iN] = iArr[i6];
            iArr[i6] = iN;
        } else {
            this.f53020h[iN] = -1;
            if (this.f53022j > 0) {
                this.f53021i[iN] = this.f53023k;
                this.f53023k = iN;
            } else {
                this.f53021i[iN] = -1;
            }
        }
        int i10 = this.f53021i[iN];
        if (i10 != -1) {
            this.f53020h[i10] = iN;
        }
        l(iVar, iN);
    }

    private void r(p162q1.i iVar) {
        int[] iArr;
        int i6;
        int i10 = iVar.f52994c;
        int i11 = i10 % this.f53015c;
        int[] iArr2 = this.f53016d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f53018f[i12] == i10) {
            int[] iArr3 = this.f53017e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f53017e;
            i6 = iArr[i12];
            if (i6 == -1 || this.f53018f[i6] == i10) {
                break;
            } else {
                i12 = i6;
            }
        }
        if (i6 == -1 || this.f53018f[i6] != i10) {
            return;
        }
        iArr[i12] = iArr[i6];
        iArr[i6] = -1;
    }

    @Override // q1.b.a
    public int a() {
        return this.f53022j;
    }

    @Override // q1.b.a
    public p162q1.i b(int i6) {
        int i10 = this.f53022j;
        if (i10 == 0) {
            return null;
        }
        int i11 = this.f53023k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i6 && i11 != -1) {
                return this.f53025m.f52957d[this.f53018f[i11]];
            }
            i11 = this.f53021i[i11];
            if (i11 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q1.b.a
    public void c() {
        int i6 = this.f53022j;
        int i10 = this.f53023k;
        for (int i11 = 0; i11 < i6; i11++) {
            float[] fArr = this.f53019g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f53021i[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // q1.b.a
    public void clear() {
        int i6 = this.f53022j;
        for (int i10 = 0; i10 < i6; i10++) {
            p162q1.i iVarB = b(i10);
            if (iVarB != null) {
                iVarB.c(this.f53024l);
            }
        }
        for (int i11 = 0; i11 < this.f53014b; i11++) {
            this.f53018f[i11] = -1;
            this.f53017e[i11] = -1;
        }
        for (int i12 = 0; i12 < this.f53015c; i12++) {
            this.f53016d[i12] = -1;
        }
        this.f53022j = 0;
        this.f53023k = -1;
    }

    @Override // q1.b.a
    public float d(int i6) {
        int i10 = this.f53022j;
        int i11 = this.f53023k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i6) {
                return this.f53019g[i11];
            }
            i11 = this.f53021i[i11];
            if (i11 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q1.b.a
    public void e(float f6) {
        int i6 = this.f53022j;
        int i10 = this.f53023k;
        for (int i11 = 0; i11 < i6; i11++) {
            float[] fArr = this.f53019g;
            fArr[i10] = fArr[i10] / f6;
            i10 = this.f53021i[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // q1.b.a
    public boolean f(p162q1.i iVar) {
        return p(iVar) != -1;
    }

    @Override // q1.b.a
    public float g(p162q1.i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f53019g[iP];
        }
        return 0.0f;
    }

    @Override // q1.b.a
    public void h(p162q1.i iVar, float f6, boolean z6) {
        float f10 = f53012n;
        if (f6 <= (-f10) || f6 >= f10) {
            int iP = p(iVar);
            if (iP == -1) {
                j(iVar, f6);
                return;
            }
            float[] fArr = this.f53019g;
            float f11 = fArr[iP] + f6;
            fArr[iP] = f11;
            float f12 = f53012n;
            if (f11 <= (-f12) || f11 >= f12) {
                return;
            }
            fArr[iP] = 0.0f;
            i(iVar, z6);
        }
    }

    @Override // q1.b.a
    public float i(p162q1.i iVar, boolean z6) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f6 = this.f53019g[iP];
        if (this.f53023k == iP) {
            this.f53023k = this.f53021i[iP];
        }
        this.f53018f[iP] = -1;
        int[] iArr = this.f53020h;
        int i6 = iArr[iP];
        if (i6 != -1) {
            int[] iArr2 = this.f53021i;
            iArr2[i6] = iArr2[iP];
        }
        int i10 = this.f53021i[iP];
        if (i10 != -1) {
            iArr[i10] = iArr[iP];
        }
        this.f53022j--;
        iVar.f53004m--;
        if (z6) {
            iVar.c(this.f53024l);
        }
        return f6;
    }

    @Override // q1.b.a
    public void j(p162q1.i iVar, float f6) {
        float f10 = f53012n;
        if (f6 > (-f10) && f6 < f10) {
            i(iVar, true);
            return;
        }
        if (this.f53022j == 0) {
            m(0, iVar, f6);
            l(iVar, 0);
            this.f53023k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f53019g[iP] = f6;
            return;
        }
        if (this.f53022j + 1 >= this.f53014b) {
            o();
        }
        int i6 = this.f53022j;
        int i10 = this.f53023k;
        int i11 = -1;
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = this.f53018f[i10];
            int i14 = iVar.f52994c;
            if (i13 == i14) {
                this.f53019g[i10] = f6;
                return;
            }
            if (i13 < i14) {
                i11 = i10;
            }
            i10 = this.f53021i[i10];
            if (i10 == -1) {
                break;
            }
        }
        q(i11, iVar, f6);
    }

    @Override // q1.b.a
    public float k(p162q1.b bVar, boolean z6) {
        float fG = g(bVar.f52948a);
        i(bVar.f52948a, z6);
        p162q1.j jVar = (p162q1.j) bVar.f52952e;
        int iA = jVar.a();
        int i6 = 0;
        int i10 = 0;
        while (i6 < iA) {
            int i11 = jVar.f53018f[i10];
            if (i11 != -1) {
                h(this.f53025m.f52957d[i11], jVar.f53019g[i10] * fG, z6);
                i6++;
            }
            i10++;
        }
        return fG;
    }

    public int p(p162q1.i iVar) {
        if (this.f53022j == 0) {
            return -1;
        }
        int i6 = iVar.f52994c;
        int i10 = this.f53016d[i6 % this.f53015c];
        if (i10 == -1) {
            return -1;
        }
        if (this.f53018f[i10] == i6) {
            return i10;
        }
        do {
            i10 = this.f53017e[i10];
            if (i10 == -1) {
                break;
            }
        } while (this.f53018f[i10] != i6);
        if (i10 != -1 && this.f53018f[i10] == i6) {
            return i10;
        }
        return -1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str = hashCode() + " { ";
        int i6 = this.f53022j;
        for (int i10 = 0; i10 < i6; i10++) {
            p162q1.i iVarB = b(i10);
            if (iVarB != null) {
                java.lang.String str2 = str + iVarB + " = " + d(i10) + " ";
                int iP = p(iVarB);
                java.lang.String str3 = str2 + "[p: ";
                if (this.f53020h[iP] != -1) {
                    sb = new java.lang.StringBuilder();
                    sb.append(str3);
                    sb.append(this.f53025m.f52957d[this.f53018f[this.f53020h[iP]]]);
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                java.lang.String str4 = sb.toString() + ", n: ";
                str = (this.f53021i[iP] != -1 ? str4 + this.f53025m.f52957d[this.f53018f[this.f53021i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
