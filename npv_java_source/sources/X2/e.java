package X2;

/* JADX INFO: loaded from: classes.dex */
final class e extends X2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2.o.b f15746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X2.a f15747b;

    static final class b extends X2.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private X2.o.b f15748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private X2.a f15749b;

        b() {
        }

        @Override // X2.o.a
        public X2.o a() {
            return new X2.e(this.f15748a, this.f15749b);
        }

        @Override // X2.o.a
        public X2.o.a b(X2.a aVar) {
            this.f15749b = aVar;
            return this;
        }

        @Override // X2.o.a
        public X2.o.a c(X2.o.b bVar) {
            this.f15748a = bVar;
            return this;
        }
    }

    private e(X2.o.b bVar, X2.a aVar) {
        this.f15746a = bVar;
        this.f15747b = aVar;
    }

    @Override // X2.o
    public X2.a b() {
        return this.f15747b;
    }

    @Override // X2.o
    public X2.o.b c() {
        return this.f15746a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.o)) {
            return false;
        }
        X2.o oVar = (X2.o) obj;
        X2.o.b bVar = this.f15746a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            X2.a aVar = this.f15747b;
            X2.a aVarB = oVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        X2.o.b bVar = this.f15746a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        X2.a aVar = this.f15747b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ClientInfo{clientType=" + this.f15746a + ", androidClientInfo=" + this.f15747b + "}";
    }
}
