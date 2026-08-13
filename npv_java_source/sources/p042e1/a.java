package p042e1;

/* JADX INFO: loaded from: classes.dex */
public class a implements e1.b.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p042e1.a.C0495a f44521m = new p042e1.a.C0495a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f44522n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p042e1.b f44524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p042e1.c f44525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p042e1.i f44527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f44528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f44529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f44530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f44534l;

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class C0495a {
        private C0495a() {
        }

        public /* synthetic */ C0495a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(p042e1.b bVar, p042e1.c cVar) {
        p247y7.AbstractC7350t.f(bVar, "arrayRow");
        p247y7.AbstractC7350t.f(cVar, "cache");
        this.f44524b = bVar;
        this.f44525c = cVar;
        this.f44526d = 8;
        this.f44528f = new int[8];
        this.f44529g = new int[8];
        this.f44530h = new float[8];
        this.f44531i = -1;
        this.f44532j = -1;
        this.f44534l = 0.001f;
    }

    @Override // e1.b.a
    public int a() {
        return this.f44523a;
    }

    @Override // e1.b.a
    public p042e1.i b(int i6) {
        int i10 = this.f44531i;
        for (int i11 = 0; i10 != -1 && i11 < this.f44523a; i11++) {
            if (i11 == i6) {
                p042e1.c cVar = this.f44525c;
                p247y7.AbstractC7350t.c(cVar);
                return cVar.b()[this.f44528f[i10]];
            }
            i10 = this.f44529g[i10];
        }
        return null;
    }

    @Override // e1.b.a
    public void c() {
        int i6 = this.f44531i;
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            float[] fArr = this.f44530h;
            fArr[i6] = fArr[i6] * (-1);
            i6 = this.f44529g[i6];
        }
    }

    @Override // e1.b.a
    public void clear() {
        int i6 = this.f44531i;
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            p042e1.c cVar = this.f44525c;
            p247y7.AbstractC7350t.c(cVar);
            p042e1.i iVar = cVar.b()[this.f44528f[i6]];
            if (iVar != null) {
                p042e1.b bVar = this.f44524b;
                p247y7.AbstractC7350t.c(bVar);
                iVar.B(bVar);
            }
            i6 = this.f44529g[i6];
        }
        this.f44531i = -1;
        this.f44532j = -1;
        this.f44533k = false;
        this.f44523a = 0;
    }

    @Override // e1.b.a
    public float d(int i6) {
        int i10 = this.f44531i;
        for (int i11 = 0; i10 != -1 && i11 < this.f44523a; i11++) {
            if (i11 == i6) {
                return this.f44530h[i10];
            }
            i10 = this.f44529g[i10];
        }
        return 0.0f;
    }

    @Override // e1.b.a
    public void e(float f6) {
        int i6 = this.f44531i;
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            float[] fArr = this.f44530h;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f44529g[i6];
        }
    }

    @Override // e1.b.a
    public boolean f(p042e1.i iVar) {
        int i6 = this.f44531i;
        if (i6 == -1) {
            return false;
        }
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            int i11 = this.f44528f[i6];
            p247y7.AbstractC7350t.c(iVar);
            if (i11 == iVar.o()) {
                return true;
            }
            i6 = this.f44529g[i6];
        }
        return false;
    }

    @Override // e1.b.a
    public float g(p042e1.i iVar) {
        int i6 = this.f44531i;
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            int i11 = this.f44528f[i6];
            p247y7.AbstractC7350t.c(iVar);
            if (i11 == iVar.o()) {
                return this.f44530h[i6];
            }
            i6 = this.f44529g[i6];
        }
        return 0.0f;
    }

    @Override // e1.b.a
    public void h(p042e1.i iVar, float f6, boolean z6) {
        float f10 = this.f44534l;
        if (f6 <= (-f10) || f6 >= f10) {
            int i6 = this.f44531i;
            if (i6 == -1) {
                this.f44531i = 0;
                this.f44530h[0] = f6;
                int[] iArr = this.f44528f;
                p247y7.AbstractC7350t.c(iVar);
                iArr[0] = iVar.o();
                this.f44529g[this.f44531i] = -1;
                iVar.M(iVar.z() + 1);
                p042e1.b bVar = this.f44524b;
                p247y7.AbstractC7350t.c(bVar);
                iVar.i(bVar);
                this.f44523a++;
                if (this.f44533k) {
                    return;
                }
                int i10 = this.f44532j + 1;
                this.f44532j = i10;
                int[] iArr2 = this.f44528f;
                if (i10 >= iArr2.length) {
                    this.f44533k = true;
                    this.f44532j = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i6 != -1 && i12 < this.f44523a; i12++) {
                int i13 = this.f44528f[i6];
                p247y7.AbstractC7350t.c(iVar);
                if (i13 == iVar.o()) {
                    float[] fArr = this.f44530h;
                    float f11 = fArr[i6] + f6;
                    float f12 = this.f44534l;
                    if (f11 > (-f12) && f11 < f12) {
                        f11 = 0.0f;
                    }
                    fArr[i6] = f11;
                    if (f11 == 0.0f) {
                        if (i6 == this.f44531i) {
                            this.f44531i = this.f44529g[i6];
                        } else {
                            int[] iArr3 = this.f44529g;
                            iArr3[i11] = iArr3[i6];
                        }
                        if (z6) {
                            p042e1.b bVar2 = this.f44524b;
                            p247y7.AbstractC7350t.c(bVar2);
                            iVar.B(bVar2);
                        }
                        if (this.f44533k) {
                            this.f44532j = i6;
                        }
                        iVar.M(iVar.z() - 1);
                        this.f44523a--;
                        return;
                    }
                    return;
                }
                if (this.f44528f[i6] < iVar.o()) {
                    i11 = i6;
                }
                i6 = this.f44529g[i6];
            }
            int length = this.f44532j;
            int length2 = length + 1;
            if (this.f44533k) {
                int[] iArr4 = this.f44528f;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
                length2 = length;
            }
            int[] iArr5 = this.f44528f;
            if (length2 >= iArr5.length && this.f44523a < iArr5.length) {
                int length3 = iArr5.length;
                for (int i14 = 0; i14 < length3; i14++) {
                    if (this.f44528f[i14] == -1) {
                        length2 = i14;
                        break;
                    }
                }
            }
            int[] iArr6 = this.f44528f;
            if (length2 >= iArr6.length) {
                length2 = iArr6.length;
                int i15 = this.f44526d * 2;
                this.f44526d = i15;
                this.f44533k = false;
                this.f44532j = length2 - 1;
                float[] fArrCopyOf = java.util.Arrays.copyOf(this.f44530h, i15);
                p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
                this.f44530h = fArrCopyOf;
                int[] iArrCopyOf = java.util.Arrays.copyOf(this.f44528f, this.f44526d);
                p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
                this.f44528f = iArrCopyOf;
                int[] iArrCopyOf2 = java.util.Arrays.copyOf(this.f44529g, this.f44526d);
                p247y7.AbstractC7350t.e(iArrCopyOf2, "copyOf(...)");
                this.f44529g = iArrCopyOf2;
            }
            int[] iArr7 = this.f44528f;
            p247y7.AbstractC7350t.c(iVar);
            iArr7[length2] = iVar.o();
            this.f44530h[length2] = f6;
            int[] iArr8 = this.f44529g;
            if (i11 != -1) {
                iArr8[length2] = iArr8[i11];
                iArr8[i11] = length2;
            } else {
                iArr8[length2] = this.f44531i;
                this.f44531i = length2;
            }
            iVar.M(iVar.z() + 1);
            p042e1.b bVar3 = this.f44524b;
            p247y7.AbstractC7350t.c(bVar3);
            iVar.i(bVar3);
            this.f44523a++;
            if (!this.f44533k) {
                this.f44532j++;
            }
            int i16 = this.f44532j;
            int[] iArr9 = this.f44528f;
            if (i16 >= iArr9.length) {
                this.f44533k = true;
                this.f44532j = iArr9.length - 1;
            }
        }
    }

    @Override // e1.b.a
    public void i(p042e1.i iVar, float f6) {
        if (f6 == 0.0f) {
            k(iVar, true);
            return;
        }
        int i6 = this.f44531i;
        if (i6 == -1) {
            this.f44531i = 0;
            this.f44530h[0] = f6;
            int[] iArr = this.f44528f;
            p247y7.AbstractC7350t.c(iVar);
            iArr[0] = iVar.o();
            this.f44529g[this.f44531i] = -1;
            iVar.M(iVar.z() + 1);
            p042e1.b bVar = this.f44524b;
            p247y7.AbstractC7350t.c(bVar);
            iVar.i(bVar);
            this.f44523a++;
            if (this.f44533k) {
                return;
            }
            int i10 = this.f44532j + 1;
            this.f44532j = i10;
            int[] iArr2 = this.f44528f;
            if (i10 >= iArr2.length) {
                this.f44533k = true;
                this.f44532j = iArr2.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i6 != -1 && i12 < this.f44523a; i12++) {
            int i13 = this.f44528f[i6];
            p247y7.AbstractC7350t.c(iVar);
            if (i13 == iVar.o()) {
                this.f44530h[i6] = f6;
                return;
            }
            if (this.f44528f[i6] < iVar.o()) {
                i11 = i6;
            }
            i6 = this.f44529g[i6];
        }
        int length = this.f44532j;
        int length2 = length + 1;
        if (this.f44533k) {
            int[] iArr3 = this.f44528f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
            length2 = length;
        }
        int[] iArr4 = this.f44528f;
        if (length2 >= iArr4.length && this.f44523a < iArr4.length) {
            int length3 = iArr4.length;
            for (int i14 = 0; i14 < length3; i14++) {
                if (this.f44528f[i14] == -1) {
                    length2 = i14;
                    break;
                }
            }
        }
        int[] iArr5 = this.f44528f;
        if (length2 >= iArr5.length) {
            length2 = iArr5.length;
            int i15 = this.f44526d * 2;
            this.f44526d = i15;
            this.f44533k = false;
            this.f44532j = length2 - 1;
            float[] fArrCopyOf = java.util.Arrays.copyOf(this.f44530h, i15);
            p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
            this.f44530h = fArrCopyOf;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f44528f, this.f44526d);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f44528f = iArrCopyOf;
            int[] iArrCopyOf2 = java.util.Arrays.copyOf(this.f44529g, this.f44526d);
            p247y7.AbstractC7350t.e(iArrCopyOf2, "copyOf(...)");
            this.f44529g = iArrCopyOf2;
        }
        int[] iArr6 = this.f44528f;
        p247y7.AbstractC7350t.c(iVar);
        iArr6[length2] = iVar.o();
        this.f44530h[length2] = f6;
        int[] iArr7 = this.f44529g;
        if (i11 != -1) {
            iArr7[length2] = iArr7[i11];
            iArr7[i11] = length2;
        } else {
            iArr7[length2] = this.f44531i;
            this.f44531i = length2;
        }
        iVar.M(iVar.z() + 1);
        p042e1.b bVar2 = this.f44524b;
        p247y7.AbstractC7350t.c(bVar2);
        iVar.i(bVar2);
        int i16 = this.f44523a + 1;
        this.f44523a = i16;
        if (!this.f44533k) {
            this.f44532j++;
        }
        int[] iArr8 = this.f44528f;
        if (i16 >= iArr8.length) {
            this.f44533k = true;
        }
        if (this.f44532j >= iArr8.length) {
            this.f44533k = true;
            this.f44532j = iArr8.length - 1;
        }
    }

    @Override // e1.b.a
    public float j(p042e1.b bVar, boolean z6) {
        p247y7.AbstractC7350t.c(bVar);
        float fG = g(bVar.u());
        k(bVar.u(), z6);
        e1.b.a aVarV = bVar.v();
        p247y7.AbstractC7350t.c(aVarV);
        int iA = aVarV.a();
        for (int i6 = 0; i6 < iA; i6++) {
            p042e1.i iVarB = aVarV.b(i6);
            h(iVarB, aVarV.g(iVarB) * fG, z6);
        }
        return fG;
    }

    @Override // e1.b.a
    public float k(p042e1.i iVar, boolean z6) {
        if (p247y7.AbstractC7350t.b(this.f44527e, iVar)) {
            this.f44527e = null;
        }
        int i6 = this.f44531i;
        if (i6 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i6 != -1 && i10 < this.f44523a) {
            int i12 = this.f44528f[i6];
            p247y7.AbstractC7350t.c(iVar);
            if (i12 == iVar.o()) {
                if (i6 == this.f44531i) {
                    this.f44531i = this.f44529g[i6];
                } else {
                    int[] iArr = this.f44529g;
                    iArr[i11] = iArr[i6];
                }
                if (z6) {
                    p042e1.b bVar = this.f44524b;
                    p247y7.AbstractC7350t.c(bVar);
                    iVar.B(bVar);
                }
                iVar.M(iVar.z() - 1);
                this.f44523a--;
                this.f44528f[i6] = -1;
                if (this.f44533k) {
                    this.f44532j = i6;
                }
                return this.f44530h[i6];
            }
            i10++;
            i11 = i6;
            i6 = this.f44529g[i6];
        }
        return 0.0f;
    }

    public java.lang.String toString() {
        int i6 = this.f44531i;
        java.lang.String str = "";
        for (int i10 = 0; i6 != -1 && i10 < this.f44523a; i10++) {
            java.lang.String str2 = (str + " -> ") + this.f44530h[i6] + " : ";
            p042e1.c cVar = this.f44525c;
            p247y7.AbstractC7350t.c(cVar);
            str = str2 + cVar.b()[this.f44528f[i6]];
            i6 = this.f44529g[i6];
        }
        return str;
    }
}
