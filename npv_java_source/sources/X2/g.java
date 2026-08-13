package X2;

/* JADX INFO: loaded from: classes.dex */
final class g extends X2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f15755b;

    static final class b extends X2.q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f15756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f15757b;

        b() {
        }

        @Override // X2.q.a
        public X2.q a() {
            return new X2.g(this.f15756a, this.f15757b);
        }

        @Override // X2.q.a
        public X2.q.a b(byte[] bArr) {
            this.f15756a = bArr;
            return this;
        }

        @Override // X2.q.a
        public X2.q.a c(byte[] bArr) {
            this.f15757b = bArr;
            return this;
        }
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f15754a = bArr;
        this.f15755b = bArr2;
    }

    @Override // X2.q
    public byte[] b() {
        return this.f15754a;
    }

    @Override // X2.q
    public byte[] c() {
        return this.f15755b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.q)) {
            return false;
        }
        X2.q qVar = (X2.q) obj;
        boolean z6 = qVar instanceof X2.g;
        if (java.util.Arrays.equals(this.f15754a, z6 ? ((X2.g) qVar).f15754a : qVar.b())) {
            if (java.util.Arrays.equals(this.f15755b, z6 ? ((X2.g) qVar).f15755b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((java.util.Arrays.hashCode(this.f15754a) ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f15755b);
    }

    public java.lang.String toString() {
        return "ExperimentIds{clearBlob=" + java.util.Arrays.toString(this.f15754a) + ", encryptedBlob=" + java.util.Arrays.toString(this.f15755b) + "}";
    }
}
