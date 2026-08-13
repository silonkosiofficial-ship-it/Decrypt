package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class z extends n5.F.e.AbstractC0667e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51917d;

    static final class b extends n5.F.e.AbstractC0667e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f51922e;

        b() {
        }

        @Override // n5.F.e.AbstractC0667e.a
        public n5.F.e.AbstractC0667e a() {
            java.lang.String str;
            java.lang.String str2;
            if (this.f51922e == 3 && (str = this.f51919b) != null && (str2 = this.f51920c) != null) {
                return new p136n5.z(this.f51918a, str, str2, this.f51921d);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51922e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f51919b == null) {
                sb.append(" version");
            }
            if (this.f51920c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f51922e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.AbstractC0667e.a
        public n5.F.e.AbstractC0667e.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildVersion");
            }
            this.f51920c = str;
            return this;
        }

        @Override // n5.F.e.AbstractC0667e.a
        public n5.F.e.AbstractC0667e.a c(boolean z6) {
            this.f51921d = z6;
            this.f51922e = (byte) (this.f51922e | 2);
            return this;
        }

        @Override // n5.F.e.AbstractC0667e.a
        public n5.F.e.AbstractC0667e.a d(int i6) {
            this.f51918a = i6;
            this.f51922e = (byte) (this.f51922e | 1);
            return this;
        }

        @Override // n5.F.e.AbstractC0667e.a
        public n5.F.e.AbstractC0667e.a e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null version");
            }
            this.f51919b = str;
            return this;
        }
    }

    private z(int i6, java.lang.String str, java.lang.String str2, boolean z6) {
        this.f51914a = i6;
        this.f51915b = str;
        this.f51916c = str2;
        this.f51917d = z6;
    }

    @Override // n5.F.e.AbstractC0667e
    public java.lang.String b() {
        return this.f51916c;
    }

    @Override // n5.F.e.AbstractC0667e
    public int c() {
        return this.f51914a;
    }

    @Override // n5.F.e.AbstractC0667e
    public java.lang.String d() {
        return this.f51915b;
    }

    @Override // n5.F.e.AbstractC0667e
    public boolean e() {
        return this.f51917d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.AbstractC0667e)) {
            return false;
        }
        n5.F.e.AbstractC0667e abstractC0667e = (n5.F.e.AbstractC0667e) obj;
        return this.f51914a == abstractC0667e.c() && this.f51915b.equals(abstractC0667e.d()) && this.f51916c.equals(abstractC0667e.b()) && this.f51917d == abstractC0667e.e();
    }

    public int hashCode() {
        return ((((((this.f51914a ^ 1000003) * 1000003) ^ this.f51915b.hashCode()) * 1000003) ^ this.f51916c.hashCode()) * 1000003) ^ (this.f51917d ? 1231 : 1237);
    }

    public java.lang.String toString() {
        return "OperatingSystem{platform=" + this.f51914a + ", version=" + this.f51915b + ", buildVersion=" + this.f51916c + ", jailbroken=" + this.f51917d + "}";
    }
}
