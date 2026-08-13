package X0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.k.a f15631b = new X0.k.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X0.k f15632c = new X0.k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X0.k f15633d = new X0.k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X0.k f15634e = new X0.k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15635a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X0.k a(java.util.List list) {
            java.lang.Integer numValueOf = 0;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() | ((X0.k) list.get(i6)).e());
            }
            return new X0.k(numValueOf.intValue());
        }

        public final X0.k b() {
            return X0.k.f15634e;
        }

        public final X0.k c() {
            return X0.k.f15632c;
        }

        public final X0.k d() {
            return X0.k.f15633d;
        }
    }

    public k(int i6) {
        this.f15635a = i6;
    }

    public final boolean d(X0.k kVar) {
        int i6 = this.f15635a;
        return (kVar.f15635a | i6) == i6;
    }

    public final int e() {
        return this.f15635a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X0.k) && this.f15635a == ((X0.k) obj).f15635a;
    }

    public int hashCode() {
        return this.f15635a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        if (this.f15635a == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((this.f15635a & f15633d.f15635a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f15635a & f15634e.f15635a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            sb = new java.lang.StringBuilder();
            sb.append("TextDecoration.");
            sb.append((java.lang.String) arrayList.get(0));
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("TextDecoration[");
            sb.append(p002a1.a.e(arrayList, ", ", null, null, 0, null, null, 62, null));
            sb.append(']');
        }
        return sb.toString();
    }
}
