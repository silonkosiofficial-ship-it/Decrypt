package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object[] f57674a = new java.lang.Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f57675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57676c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z9.J.a f57677a = new z9.J.a();

        private a() {
        }
    }

    public J() {
        int[] iArr = new int[8];
        for (int i6 = 0; i6 < 8; i6++) {
            iArr[i6] = -1;
        }
        this.f57675b = iArr;
        this.f57676c = -1;
    }

    private final void e() {
        int i6 = this.f57676c * 2;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f57674a, i6);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        this.f57674a = objArrCopyOf;
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.f57675b, i6);
        p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
        this.f57675b = iArrCopyOf;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("$");
        int i6 = this.f57676c + 1;
        for (int i10 = 0; i10 < i6; i10++) {
            java.lang.Object obj = this.f57674a[i10];
            if (obj instanceof p219v9.f) {
                p219v9.f fVar = (p219v9.f) obj;
                if (!p247y7.AbstractC7350t.b(fVar.j(), v9.n.b.f56059a)) {
                    int i11 = this.f57675b[i10];
                    if (i11 >= 0) {
                        sb.append(".");
                        sb.append(fVar.f(i11));
                    }
                } else if (this.f57675b[i10] != -1) {
                    sb.append("[");
                    sb.append(this.f57675b[i10]);
                    sb.append("]");
                }
            } else if (obj != z9.J.a.f57677a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public final void b() {
        int i6 = this.f57676c;
        int[] iArr = this.f57675b;
        if (iArr[i6] == -2) {
            iArr[i6] = -1;
            this.f57676c = i6 - 1;
        }
        int i10 = this.f57676c;
        if (i10 != -1) {
            this.f57676c = i10 - 1;
        }
    }

    public final void c(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "sd");
        int i6 = this.f57676c + 1;
        this.f57676c = i6;
        if (i6 == this.f57674a.length) {
            e();
        }
        this.f57674a[i6] = fVar;
    }

    public final void d() {
        int[] iArr = this.f57675b;
        int i6 = this.f57676c;
        if (iArr[i6] == -2) {
            this.f57674a[i6] = z9.J.a.f57677a;
        }
    }

    public final void f(java.lang.Object obj) {
        int[] iArr = this.f57675b;
        int i6 = this.f57676c;
        if (iArr[i6] != -2) {
            int i10 = i6 + 1;
            this.f57676c = i10;
            if (i10 == this.f57674a.length) {
                e();
            }
        }
        java.lang.Object[] objArr = this.f57674a;
        int i11 = this.f57676c;
        objArr[i11] = obj;
        this.f57675b[i11] = -2;
    }

    public final void g(int i6) {
        this.f57675b[this.f57676c] = i6;
    }

    public java.lang.String toString() {
        return a();
    }
}
