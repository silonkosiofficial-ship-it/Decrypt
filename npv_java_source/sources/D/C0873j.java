package D;

/* JADX INFO: renamed from: D.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1676b = X.b.f15549F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f1677a = new X.b(new D.C0873j.a[16], 0);

    /* JADX INFO: renamed from: D.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1679b;

        public a(int i6, int i10) {
            this.f1678a = i6;
            this.f1679b = i10;
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException("negative start index".toString());
            }
            if (i10 < i6) {
                throw new java.lang.IllegalArgumentException("end index greater than start".toString());
            }
        }

        public final int a() {
            return this.f1679b;
        }

        public final int b() {
            return this.f1678a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D.C0873j.a)) {
                return false;
            }
            D.C0873j.a aVar = (D.C0873j.a) obj;
            return this.f1678a == aVar.f1678a && this.f1679b == aVar.f1679b;
        }

        public int hashCode() {
            return (this.f1678a * 31) + this.f1679b;
        }

        public java.lang.String toString() {
            return "Interval(start=" + this.f1678a + ", end=" + this.f1679b + ')';
        }
    }

    public final D.C0873j.a a(int i6, int i10) {
        D.C0873j.a aVar = new D.C0873j.a(i6, i10);
        this.f1677a.d(aVar);
        return aVar;
    }

    public final int b() {
        int iA = ((D.C0873j.a) this.f1677a.p()).a();
        X.b bVar = this.f1677a;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            do {
                D.C0873j.a aVar = (D.C0873j.a) objArrS[i6];
                if (aVar.a() > iA) {
                    iA = aVar.a();
                }
                i6++;
            } while (i6 < iT);
        }
        return iA;
    }

    public final int c() {
        int iB = ((D.C0873j.a) this.f1677a.p()).b();
        X.b bVar = this.f1677a;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            do {
                D.C0873j.a aVar = (D.C0873j.a) objArrS[i6];
                if (aVar.b() < iB) {
                    iB = aVar.b();
                }
                i6++;
            } while (i6 < iT);
        }
        if (iB >= 0) {
            return iB;
        }
        throw new java.lang.IllegalArgumentException("negative minIndex".toString());
    }

    public final boolean d() {
        return this.f1677a.x();
    }

    public final void e(D.C0873j.a aVar) {
        this.f1677a.A(aVar);
    }
}
