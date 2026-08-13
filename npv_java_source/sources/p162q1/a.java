package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class a implements q1.b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f52936l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p162q1.b f52938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p162q1.c f52939c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f52937a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52940d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p162q1.i f52941e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f52942f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f52943g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f52944h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52945i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52946j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52947k = false;

    a(p162q1.b bVar, p162q1.c cVar) {
        this.f52938b = bVar;
        this.f52939c = cVar;
    }

    @Override // q1.b.a
    public int a() {
        return this.f52937a;
    }

    @Override // q1.b.a
    public p162q1.i b(int i6) {
        int i10 = this.f52945i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52937a; i11++) {
            if (i11 == i6) {
                return this.f52939c.f52957d[this.f52942f[i10]];
            }
            i10 = this.f52943g[i10];
        }
        return null;
    }

    @Override // q1.b.a
    public void c() {
        int i6 = this.f52945i;
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            float[] fArr = this.f52944h;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f52943g[i6];
        }
    }

    @Override // q1.b.a
    public final void clear() {
        int i6 = this.f52945i;
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            p162q1.i iVar = this.f52939c.f52957d[this.f52942f[i6]];
            if (iVar != null) {
                iVar.c(this.f52938b);
            }
            i6 = this.f52943g[i6];
        }
        this.f52945i = -1;
        this.f52946j = -1;
        this.f52947k = false;
        this.f52937a = 0;
    }

    @Override // q1.b.a
    public float d(int i6) {
        int i10 = this.f52945i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52937a; i11++) {
            if (i11 == i6) {
                return this.f52944h[i10];
            }
            i10 = this.f52943g[i10];
        }
        return 0.0f;
    }

    @Override // q1.b.a
    public void e(float f6) {
        int i6 = this.f52945i;
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            float[] fArr = this.f52944h;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f52943g[i6];
        }
    }

    @Override // q1.b.a
    public boolean f(p162q1.i iVar) {
        int i6 = this.f52945i;
        if (i6 == -1) {
            return false;
        }
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            if (this.f52942f[i6] == iVar.f52994c) {
                return true;
            }
            i6 = this.f52943g[i6];
        }
        return false;
    }

    @Override // q1.b.a
    public final float g(p162q1.i iVar) {
        int i6 = this.f52945i;
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            if (this.f52942f[i6] == iVar.f52994c) {
                return this.f52944h[i6];
            }
            i6 = this.f52943g[i6];
        }
        return 0.0f;
    }

    @Override // q1.b.a
    public void h(p162q1.i iVar, float f6, boolean z6) {
        float f10 = f52936l;
        if (f6 <= (-f10) || f6 >= f10) {
            int i6 = this.f52945i;
            if (i6 == -1) {
                this.f52945i = 0;
                this.f52944h[0] = f6;
                this.f52942f[0] = iVar.f52994c;
                this.f52943g[0] = -1;
                iVar.f53004m++;
                iVar.a(this.f52938b);
                this.f52937a++;
                if (this.f52947k) {
                    return;
                }
                int i10 = this.f52946j + 1;
                this.f52946j = i10;
                int[] iArr = this.f52942f;
                if (i10 >= iArr.length) {
                    this.f52947k = true;
                    this.f52946j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i6 != -1 && i12 < this.f52937a; i12++) {
                int i13 = this.f52942f[i6];
                int i14 = iVar.f52994c;
                if (i13 == i14) {
                    float[] fArr = this.f52944h;
                    float f11 = fArr[i6] + f6;
                    float f12 = f52936l;
                    if (f11 > (-f12) && f11 < f12) {
                        f11 = 0.0f;
                    }
                    fArr[i6] = f11;
                    if (f11 == 0.0f) {
                        if (i6 == this.f52945i) {
                            this.f52945i = this.f52943g[i6];
                        } else {
                            int[] iArr2 = this.f52943g;
                            iArr2[i11] = iArr2[i6];
                        }
                        if (z6) {
                            iVar.c(this.f52938b);
                        }
                        if (this.f52947k) {
                            this.f52946j = i6;
                        }
                        iVar.f53004m--;
                        this.f52937a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i6;
                }
                i6 = this.f52943g[i6];
            }
            int length = this.f52946j;
            int i15 = length + 1;
            if (this.f52947k) {
                int[] iArr3 = this.f52942f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f52942f;
            if (length >= iArr4.length && this.f52937a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f52942f;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f52942f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f52940d * 2;
                this.f52940d = i17;
                this.f52947k = false;
                this.f52946j = length - 1;
                this.f52944h = java.util.Arrays.copyOf(this.f52944h, i17);
                this.f52942f = java.util.Arrays.copyOf(this.f52942f, this.f52940d);
                this.f52943g = java.util.Arrays.copyOf(this.f52943g, this.f52940d);
            }
            this.f52942f[length] = iVar.f52994c;
            this.f52944h[length] = f6;
            int[] iArr7 = this.f52943g;
            if (i11 != -1) {
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                iArr7[length] = this.f52945i;
                this.f52945i = length;
            }
            iVar.f53004m++;
            iVar.a(this.f52938b);
            this.f52937a++;
            if (!this.f52947k) {
                this.f52946j++;
            }
            int i18 = this.f52946j;
            int[] iArr8 = this.f52942f;
            if (i18 >= iArr8.length) {
                this.f52947k = true;
                this.f52946j = iArr8.length - 1;
            }
        }
    }

    @Override // q1.b.a
    public final float i(p162q1.i iVar, boolean z6) {
        if (this.f52941e == iVar) {
            this.f52941e = null;
        }
        int i6 = this.f52945i;
        if (i6 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i6 != -1 && i10 < this.f52937a) {
            if (this.f52942f[i6] == iVar.f52994c) {
                if (i6 == this.f52945i) {
                    this.f52945i = this.f52943g[i6];
                } else {
                    int[] iArr = this.f52943g;
                    iArr[i11] = iArr[i6];
                }
                if (z6) {
                    iVar.c(this.f52938b);
                }
                iVar.f53004m--;
                this.f52937a--;
                this.f52942f[i6] = -1;
                if (this.f52947k) {
                    this.f52946j = i6;
                }
                return this.f52944h[i6];
            }
            i10++;
            i11 = i6;
            i6 = this.f52943g[i6];
        }
        return 0.0f;
    }

    @Override // q1.b.a
    public final void j(p162q1.i iVar, float f6) {
        if (f6 == 0.0f) {
            i(iVar, true);
            return;
        }
        int i6 = this.f52945i;
        if (i6 == -1) {
            this.f52945i = 0;
            this.f52944h[0] = f6;
            this.f52942f[0] = iVar.f52994c;
            this.f52943g[0] = -1;
            iVar.f53004m++;
            iVar.a(this.f52938b);
            this.f52937a++;
            if (this.f52947k) {
                return;
            }
            int i10 = this.f52946j + 1;
            this.f52946j = i10;
            int[] iArr = this.f52942f;
            if (i10 >= iArr.length) {
                this.f52947k = true;
                this.f52946j = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i6 != -1 && i12 < this.f52937a; i12++) {
            int i13 = this.f52942f[i6];
            int i14 = iVar.f52994c;
            if (i13 == i14) {
                this.f52944h[i6] = f6;
                return;
            }
            if (i13 < i14) {
                i11 = i6;
            }
            i6 = this.f52943g[i6];
        }
        int length = this.f52946j;
        int i15 = length + 1;
        if (this.f52947k) {
            int[] iArr2 = this.f52942f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f52942f;
        if (length >= iArr3.length && this.f52937a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f52942f;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f52942f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f52940d * 2;
            this.f52940d = i17;
            this.f52947k = false;
            this.f52946j = length - 1;
            this.f52944h = java.util.Arrays.copyOf(this.f52944h, i17);
            this.f52942f = java.util.Arrays.copyOf(this.f52942f, this.f52940d);
            this.f52943g = java.util.Arrays.copyOf(this.f52943g, this.f52940d);
        }
        this.f52942f[length] = iVar.f52994c;
        this.f52944h[length] = f6;
        int[] iArr6 = this.f52943g;
        if (i11 != -1) {
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            iArr6[length] = this.f52945i;
            this.f52945i = length;
        }
        iVar.f53004m++;
        iVar.a(this.f52938b);
        int i18 = this.f52937a + 1;
        this.f52937a = i18;
        if (!this.f52947k) {
            this.f52946j++;
        }
        int[] iArr7 = this.f52942f;
        if (i18 >= iArr7.length) {
            this.f52947k = true;
        }
        if (this.f52946j >= iArr7.length) {
            this.f52947k = true;
            this.f52946j = iArr7.length - 1;
        }
    }

    @Override // q1.b.a
    public float k(p162q1.b bVar, boolean z6) {
        float fG = g(bVar.f52948a);
        i(bVar.f52948a, z6);
        q1.b.a aVar = bVar.f52952e;
        int iA = aVar.a();
        for (int i6 = 0; i6 < iA; i6++) {
            p162q1.i iVarB = aVar.b(i6);
            h(iVarB, aVar.g(iVarB) * fG, z6);
        }
        return fG;
    }

    public java.lang.String toString() {
        int i6 = this.f52945i;
        java.lang.String str = "";
        for (int i10 = 0; i6 != -1 && i10 < this.f52937a; i10++) {
            str = ((str + " -> ") + this.f52944h[i6] + " : ") + this.f52939c.f52957d[this.f52942f[i6]];
            i6 = this.f52943g[i6];
        }
        return str;
    }
}
