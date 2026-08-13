package X2;

/* JADX INFO: loaded from: classes.dex */
final class i extends X2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2.r f15760a;

    static final class b extends X2.s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private X2.r f15761a;

        b() {
        }

        @Override // X2.s.a
        public X2.s a() {
            return new X2.i(this.f15761a);
        }

        @Override // X2.s.a
        public X2.s.a b(X2.r rVar) {
            this.f15761a = rVar;
            return this;
        }
    }

    private i(X2.r rVar) {
        this.f15760a = rVar;
    }

    @Override // X2.s
    public X2.r b() {
        return this.f15760a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.s)) {
            return false;
        }
        X2.r rVar = this.f15760a;
        X2.r rVarB = ((X2.s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        X2.r rVar = this.f15760a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public java.lang.String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f15760a + "}";
    }
}
