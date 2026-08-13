package N;

/* JADX INFO: renamed from: N.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1361k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N.C1361k.a f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N.C1361k.a f7435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7436c;

    /* JADX INFO: renamed from: N.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X0.i f7437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7439c;

        public a(X0.i iVar, int i6, long j6) {
            this.f7437a = iVar;
            this.f7438b = i6;
            this.f7439c = j6;
        }

        public static /* synthetic */ N.C1361k.a b(N.C1361k.a aVar, X0.i iVar, int i6, long j6, int i10, java.lang.Object obj) {
            if ((i10 & 1) != 0) {
                iVar = aVar.f7437a;
            }
            if ((i10 & 2) != 0) {
                i6 = aVar.f7438b;
            }
            if ((i10 & 4) != 0) {
                j6 = aVar.f7439c;
            }
            return aVar.a(iVar, i6, j6);
        }

        public final N.C1361k.a a(X0.i iVar, int i6, long j6) {
            return new N.C1361k.a(iVar, i6, j6);
        }

        public final int c() {
            return this.f7438b;
        }

        public final long d() {
            return this.f7439c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof N.C1361k.a)) {
                return false;
            }
            N.C1361k.a aVar = (N.C1361k.a) obj;
            return this.f7437a == aVar.f7437a && this.f7438b == aVar.f7438b && this.f7439c == aVar.f7439c;
        }

        public int hashCode() {
            return (((this.f7437a.hashCode() * 31) + this.f7438b) * 31) + p170r.r.a(this.f7439c);
        }

        public java.lang.String toString() {
            return "AnchorInfo(direction=" + this.f7437a + ", offset=" + this.f7438b + ", selectableId=" + this.f7439c + ')';
        }
    }

    public C1361k(N.C1361k.a aVar, N.C1361k.a aVar2, boolean z6) {
        this.f7434a = aVar;
        this.f7435b = aVar2;
        this.f7436c = z6;
    }

    public static /* synthetic */ N.C1361k b(N.C1361k c1361k, N.C1361k.a aVar, N.C1361k.a aVar2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            aVar = c1361k.f7434a;
        }
        if ((i6 & 2) != 0) {
            aVar2 = c1361k.f7435b;
        }
        if ((i6 & 4) != 0) {
            z6 = c1361k.f7436c;
        }
        return c1361k.a(aVar, aVar2, z6);
    }

    public final N.C1361k a(N.C1361k.a aVar, N.C1361k.a aVar2, boolean z6) {
        return new N.C1361k(aVar, aVar2, z6);
    }

    public final N.C1361k.a c() {
        return this.f7435b;
    }

    public final boolean d() {
        return this.f7436c;
    }

    public final N.C1361k.a e() {
        return this.f7434a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N.C1361k)) {
            return false;
        }
        N.C1361k c1361k = (N.C1361k) obj;
        return p247y7.AbstractC7350t.b(this.f7434a, c1361k.f7434a) && p247y7.AbstractC7350t.b(this.f7435b, c1361k.f7435b) && this.f7436c == c1361k.f7436c;
    }

    public int hashCode() {
        return (((this.f7434a.hashCode() * 31) + this.f7435b.hashCode()) * 31) + p190t.h.a(this.f7436c);
    }

    public java.lang.String toString() {
        return "Selection(start=" + this.f7434a + ", end=" + this.f7435b + ", handlesCrossed=" + this.f7436c + ')';
    }
}
