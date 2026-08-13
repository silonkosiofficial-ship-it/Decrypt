package X2;

/* JADX INFO: loaded from: classes.dex */
final class m extends X2.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2.w.c f15795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X2.w.b f15796b;

    static final class b extends X2.w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private X2.w.c f15797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private X2.w.b f15798b;

        b() {
        }

        @Override // X2.w.a
        public X2.w a() {
            return new X2.m(this.f15797a, this.f15798b);
        }

        @Override // X2.w.a
        public X2.w.a b(X2.w.b bVar) {
            this.f15798b = bVar;
            return this;
        }

        @Override // X2.w.a
        public X2.w.a c(X2.w.c cVar) {
            this.f15797a = cVar;
            return this;
        }
    }

    private m(X2.w.c cVar, X2.w.b bVar) {
        this.f15795a = cVar;
        this.f15796b = bVar;
    }

    @Override // X2.w
    public X2.w.b b() {
        return this.f15796b;
    }

    @Override // X2.w
    public X2.w.c c() {
        return this.f15795a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.w)) {
            return false;
        }
        X2.w wVar = (X2.w) obj;
        X2.w.c cVar = this.f15795a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            X2.w.b bVar = this.f15796b;
            X2.w.b bVarB = wVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        X2.w.c cVar = this.f15795a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        X2.w.b bVar = this.f15796b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15795a + ", mobileSubtype=" + this.f15796b + "}";
    }
}
