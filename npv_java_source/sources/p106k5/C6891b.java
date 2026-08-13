package p106k5;

/* JADX INFO: renamed from: k5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6891b extends p106k5.AbstractC6914z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p136n5.F f49601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.io.File f49603c;

    C6891b(p136n5.F f6, java.lang.String str, java.io.File file) {
        if (f6 == null) {
            throw new java.lang.NullPointerException("Null report");
        }
        this.f49601a = f6;
        if (str == null) {
            throw new java.lang.NullPointerException("Null sessionId");
        }
        this.f49602b = str;
        if (file == null) {
            throw new java.lang.NullPointerException("Null reportFile");
        }
        this.f49603c = file;
    }

    @Override // p106k5.AbstractC6914z
    public p136n5.F b() {
        return this.f49601a;
    }

    @Override // p106k5.AbstractC6914z
    public java.io.File c() {
        return this.f49603c;
    }

    @Override // p106k5.AbstractC6914z
    public java.lang.String d() {
        return this.f49602b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p106k5.AbstractC6914z)) {
            return false;
        }
        p106k5.AbstractC6914z abstractC6914z = (p106k5.AbstractC6914z) obj;
        return this.f49601a.equals(abstractC6914z.b()) && this.f49602b.equals(abstractC6914z.d()) && this.f49603c.equals(abstractC6914z.c());
    }

    public int hashCode() {
        return ((((this.f49601a.hashCode() ^ 1000003) * 1000003) ^ this.f49602b.hashCode()) * 1000003) ^ this.f49603c.hashCode();
    }

    public java.lang.String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f49601a + ", sessionId=" + this.f49602b + ", reportFile=" + this.f49603c + "}";
    }
}
