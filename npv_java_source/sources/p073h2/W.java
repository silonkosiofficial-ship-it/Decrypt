package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h2.W.a f46059e = new h2.W.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p073h2.W f46060f = new p073h2.W(0, p097j7.AbstractC6879v.m());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f46061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f46062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f46064d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p073h2.W a() {
            return p073h2.W.f46060f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(int i6, java.util.List list) {
        this(new int[]{i6}, list, i6, null);
        p247y7.AbstractC7350t.f(list, "data");
    }

    public W(int[] iArr, java.util.List list, int i6, java.util.List list2) {
        p247y7.AbstractC7350t.f(iArr, "originalPageOffsets");
        p247y7.AbstractC7350t.f(list, "data");
        this.f46061a = iArr;
        this.f46062b = list;
        this.f46063c = i6;
        this.f46064d = list2;
        if (!(!(iArr.length == 0))) {
            throw new java.lang.IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("If originalIndices (size = ");
        p247y7.AbstractC7350t.c(list2);
        sb.append(list2.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(list.size());
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final java.util.List b() {
        return this.f46062b;
    }

    public final java.util.List c() {
        return this.f46064d;
    }

    public final int d() {
        return this.f46063c;
    }

    public final int[] e() {
        return this.f46061a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p073h2.W.class != obj.getClass()) {
            return false;
        }
        p073h2.W w6 = (p073h2.W) obj;
        return java.util.Arrays.equals(this.f46061a, w6.f46061a) && p247y7.AbstractC7350t.b(this.f46062b, w6.f46062b) && this.f46063c == w6.f46063c && p247y7.AbstractC7350t.b(this.f46064d, w6.f46064d);
    }

    public final h2.Z.a f(int i6, int i10, int i11, int i12, int i13) {
        E7.i iVarN;
        int i14 = this.f46063c;
        java.util.List list = this.f46064d;
        if (list != null && (iVarN = p097j7.AbstractC6879v.n(list)) != null && iVarN.D(i6)) {
            i6 = ((java.lang.Number) this.f46064d.get(i6)).intValue();
        }
        return new h2.Z.a(i14, i6, i10, i11, i12, i13);
    }

    public int hashCode() {
        int iHashCode = ((((java.util.Arrays.hashCode(this.f46061a) * 31) + this.f46062b.hashCode()) * 31) + this.f46063c) * 31;
        java.util.List list = this.f46064d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TransformablePage(originalPageOffsets=" + java.util.Arrays.toString(this.f46061a) + ", data=" + this.f46062b + ", hintOriginalPageOffset=" + this.f46063c + ", hintOriginalIndices=" + this.f46064d + ')';
    }
}
