package X2;

/* JADX INFO: loaded from: classes.dex */
final class f extends X2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2.s f15750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X2.p.b f15751b;

    static final class b extends X2.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private X2.s f15752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private X2.p.b f15753b;

        b() {
        }

        @Override // X2.p.a
        public X2.p a() {
            return new X2.f(this.f15752a, this.f15753b);
        }

        @Override // X2.p.a
        public X2.p.a b(X2.s sVar) {
            this.f15752a = sVar;
            return this;
        }

        @Override // X2.p.a
        public X2.p.a c(X2.p.b bVar) {
            this.f15753b = bVar;
            return this;
        }
    }

    private f(X2.s sVar, X2.p.b bVar) {
        this.f15750a = sVar;
        this.f15751b = bVar;
    }

    @Override // X2.p
    public X2.s b() {
        return this.f15750a;
    }

    @Override // X2.p
    public X2.p.b c() {
        return this.f15751b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.p)) {
            return false;
        }
        X2.p pVar = (X2.p) obj;
        X2.s sVar = this.f15750a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            X2.p.b bVar = this.f15751b;
            X2.p.b bVarC = pVar.c();
            if (bVar == null) {
                if (bVarC == null) {
                    return true;
                }
            } else if (bVar.equals(bVarC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        X2.s sVar = this.f15750a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        X2.p.b bVar = this.f15751b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ComplianceData{privacyContext=" + this.f15750a + ", productIdOrigin=" + this.f15751b + "}";
    }
}
