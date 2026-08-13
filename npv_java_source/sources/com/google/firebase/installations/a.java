package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
final class a extends com.google.firebase.installations.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f44004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f44006c;

    static final class b extends com.google.firebase.installations.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f44007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Long f44008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Long f44009c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public com.google.firebase.installations.g a() {
            java.lang.String str = "";
            if (this.f44007a == null) {
                str = " token";
            }
            if (this.f44008b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f44009c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new com.google.firebase.installations.a(this.f44007a, this.f44008b.longValue(), this.f44009c.longValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public com.google.firebase.installations.g.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null token");
            }
            this.f44007a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public com.google.firebase.installations.g.a c(long j6) {
            this.f44009c = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public com.google.firebase.installations.g.a d(long j6) {
            this.f44008b = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private a(java.lang.String str, long j6, long j10) {
        this.f44004a = str;
        this.f44005b = j6;
        this.f44006c = j10;
    }

    @Override // com.google.firebase.installations.g
    public java.lang.String b() {
        return this.f44004a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f44006c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f44005b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.g)) {
            return false;
        }
        com.google.firebase.installations.g gVar = (com.google.firebase.installations.g) obj;
        return this.f44004a.equals(gVar.b()) && this.f44005b == gVar.d() && this.f44006c == gVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f44004a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f44005b;
        long j10 = this.f44006c;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public java.lang.String toString() {
        return "InstallationTokenResult{token=" + this.f44004a + ", tokenExpirationTimestamp=" + this.f44005b + ", tokenCreationTimestamp=" + this.f44006c + "}";
    }
}
