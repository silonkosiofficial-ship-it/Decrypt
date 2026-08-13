package p072h1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p072h1.a.C0527a f45864m = new p072h1.a.C0527a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45865n = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45868c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45871f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45874i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45877l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f45866a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f45867b = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f45869d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f45870e = new float[10];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f45872g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String[] f45873h = new java.lang.String[5];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f45875j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f45876k = new boolean[4];

    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    public static final class C0527a {
        private C0527a() {
        }

        public /* synthetic */ C0527a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final void a(int i6, float f6) {
        int i10 = this.f45871f;
        int[] iArr = this.f45869d;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f45869d = iArrCopyOf;
            float[] fArr = this.f45870e;
            float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, fArr.length * 2);
            p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
            this.f45870e = fArrCopyOf;
        }
        int[] iArr2 = this.f45869d;
        int i11 = this.f45871f;
        iArr2[i11] = i6;
        float[] fArr2 = this.f45870e;
        this.f45871f = i11 + 1;
        fArr2[i11] = f6;
    }

    public final void b(int i6, int i10) {
        int i11 = this.f45868c;
        int[] iArr = this.f45866a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f45866a = iArrCopyOf;
            int[] iArr2 = this.f45867b;
            int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf2, "copyOf(...)");
            this.f45867b = iArrCopyOf2;
        }
        int[] iArr3 = this.f45866a;
        int i12 = this.f45868c;
        iArr3[i12] = i6;
        int[] iArr4 = this.f45867b;
        this.f45868c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i6, java.lang.String str) {
        int i10 = this.f45874i;
        int[] iArr = this.f45872g;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f45872g = iArrCopyOf;
            java.lang.String[] strArr = this.f45873h;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f45873h = (java.lang.String[]) objArrCopyOf;
        }
        int[] iArr2 = this.f45872g;
        int i11 = this.f45874i;
        iArr2[i11] = i6;
        java.lang.String[] strArr2 = this.f45873h;
        this.f45874i = i11 + 1;
        strArr2[i11] = str;
    }

    public java.lang.String toString() {
        return "TypedBundle{mCountInt=" + this.f45868c + ", mCountFloat=" + this.f45871f + ", mCountString=" + this.f45874i + ", mCountBoolean=" + this.f45877l + "}";
    }
}
