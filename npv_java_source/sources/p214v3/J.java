package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f55846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f55847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double[] f55848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f55849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55850e;

    /* synthetic */ J(p214v3.H h6, p214v3.I i6) {
        int size = h6.f55844b.size();
        this.f55846a = (java.lang.String[]) h6.f55843a.toArray(new java.lang.String[size]);
        this.f55847b = c(h6.f55844b);
        this.f55848c = c(h6.f55845c);
        this.f55849d = new int[size];
        this.f55850e = 0;
    }

    private static final double[] c(java.util.List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i6 = 0; i6 < size; i6++) {
            dArr[i6] = ((java.lang.Double) list.get(i6)).doubleValue();
        }
        return dArr;
    }

    public final java.util.List a() {
        p214v3.J j6 = this;
        java.util.ArrayList arrayList = new java.util.ArrayList(j6.f55846a.length);
        int i6 = 0;
        while (true) {
            java.lang.String[] strArr = j6.f55846a;
            if (i6 >= strArr.length) {
                return arrayList;
            }
            java.lang.String str = strArr[i6];
            double[] dArr = j6.f55848c;
            double[] dArr2 = j6.f55847b;
            int[] iArr = j6.f55849d;
            double d6 = dArr[i6];
            double d10 = dArr2[i6];
            int i10 = iArr[i6];
            arrayList.add(new p214v3.G(str, d6, d10, ((double) i10) / ((double) j6.f55850e), i10));
            i6++;
            j6 = this;
        }
    }

    public final void b(double d6) {
        this.f55850e++;
        int i6 = 0;
        while (true) {
            double[] dArr = this.f55848c;
            if (i6 >= dArr.length) {
                return;
            }
            double d10 = dArr[i6];
            if (d10 <= d6 && d6 < this.f55847b[i6]) {
                int[] iArr = this.f55849d;
                iArr[i6] = iArr[i6] + 1;
            }
            if (d6 < d10) {
                return;
            } else {
                i6++;
            }
        }
    }
}
