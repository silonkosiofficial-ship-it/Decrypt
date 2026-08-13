package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f52991o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f52993b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f52997f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    q1.i.a f53001j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52994c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f52995d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52996e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52998g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f52999h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f53000i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    p162q1.b[] f53002k = new p162q1.b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53003l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53004m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    java.util.HashSet f53005n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(q1.i.a aVar, java.lang.String str) {
        this.f53001j = aVar;
    }

    static void b() {
        f52991o++;
    }

    public final void a(p162q1.b bVar) {
        int i6 = 0;
        while (true) {
            int i10 = this.f53003l;
            if (i6 >= i10) {
                p162q1.b[] bVarArr = this.f53002k;
                if (i10 >= bVarArr.length) {
                    this.f53002k = (p162q1.b[]) java.util.Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                p162q1.b[] bVarArr2 = this.f53002k;
                int i11 = this.f53003l;
                bVarArr2[i11] = bVar;
                this.f53003l = i11 + 1;
                return;
            }
            if (this.f53002k[i6] == bVar) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void c(p162q1.b bVar) {
        int i6 = this.f53003l;
        int i10 = 0;
        while (i10 < i6) {
            if (this.f53002k[i10] == bVar) {
                while (i10 < i6 - 1) {
                    p162q1.b[] bVarArr = this.f53002k;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f53003l--;
                return;
            }
            i10++;
        }
    }

    public void d() {
        this.f52993b = null;
        this.f53001j = q1.i.a.UNKNOWN;
        this.f52996e = 0;
        this.f52994c = -1;
        this.f52995d = -1;
        this.f52997f = 0.0f;
        this.f52998g = false;
        int i6 = this.f53003l;
        for (int i10 = 0; i10 < i6; i10++) {
            this.f53002k[i10] = null;
        }
        this.f53003l = 0;
        this.f53004m = 0;
        this.f52992a = false;
        java.util.Arrays.fill(this.f53000i, 0.0f);
    }

    public void e(p162q1.d dVar, float f6) {
        this.f52997f = f6;
        this.f52998g = true;
        int i6 = this.f53003l;
        for (int i10 = 0; i10 < i6; i10++) {
            this.f53002k[i10].B(dVar, this, false);
        }
        this.f53003l = 0;
    }

    public void f(q1.i.a aVar, java.lang.String str) {
        this.f53001j = aVar;
    }

    public final void g(p162q1.b bVar) {
        int i6 = this.f53003l;
        for (int i10 = 0; i10 < i6; i10++) {
            this.f53002k[i10].C(bVar, false);
        }
        this.f53003l = 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        if (this.f52993b != null) {
            sb = new java.lang.StringBuilder();
            sb.append("");
            sb.append(this.f52993b);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("");
            sb.append(this.f52994c);
        }
        return sb.toString();
    }
}
