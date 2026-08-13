package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46080d;

    public static final class a extends p073h2.Z {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f46081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f46082f;

        public a(int i6, int i10, int i11, int i12, int i13, int i14) {
            super(i11, i12, i13, i14, null);
            this.f46081e = i6;
            this.f46082f = i10;
        }

        @Override // p073h2.Z
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h2.Z.a)) {
                return false;
            }
            h2.Z.a aVar = (h2.Z.a) obj;
            return this.f46081e == aVar.f46081e && this.f46082f == aVar.f46082f && d() == aVar.d() && c() == aVar.c() && a() == aVar.a() && b() == aVar.b();
        }

        public final int f() {
            return this.f46082f;
        }

        public final int g() {
            return this.f46081e;
        }

        @Override // p073h2.Z
        public int hashCode() {
            return super.hashCode() + this.f46081e + this.f46082f;
        }

        public java.lang.String toString() {
            return S8.r.q("ViewportHint.Access(\n            |    pageOffset=" + this.f46081e + ",\n            |    indexInPage=" + this.f46082f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public static final class b extends p073h2.Z {
        public b(int i6, int i10, int i11, int i12) {
            super(i6, i10, i11, i12, null);
        }

        public java.lang.String toString() {
            return S8.r.q("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46083a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46083a = iArr;
        }
    }

    private Z(int i6, int i10, int i11, int i12) {
        this.f46077a = i6;
        this.f46078b = i10;
        this.f46079c = i11;
        this.f46080d = i12;
    }

    public /* synthetic */ Z(int i6, int i10, int i11, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, i10, i11, i12);
    }

    public final int a() {
        return this.f46079c;
    }

    public final int b() {
        return this.f46080d;
    }

    public final int c() {
        return this.f46078b;
    }

    public final int d() {
        return this.f46077a;
    }

    public final int e(p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        int i6 = h2.Z.c.f46083a[enumC6642t.ordinal()];
        if (i6 == 1) {
            throw new java.lang.IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i6 == 2) {
            return this.f46077a;
        }
        if (i6 == 3) {
            return this.f46078b;
        }
        throw new p087i7.s();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p073h2.Z)) {
            return false;
        }
        p073h2.Z z6 = (p073h2.Z) obj;
        return this.f46077a == z6.f46077a && this.f46078b == z6.f46078b && this.f46079c == z6.f46079c && this.f46080d == z6.f46080d;
    }

    public int hashCode() {
        return this.f46077a + this.f46078b + this.f46079c + this.f46080d;
    }
}
