package I4;

/* JADX INFO: loaded from: classes3.dex */
final class p extends I4.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f5046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Long f5047b;

    p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I4.d.a
    public final I4.d a() {
        java.lang.String str = this.f5046a;
        if (str != null) {
            return new I4.r(str, this.f5047b, null, 0 == true ? 1 : 0);
        }
        throw new java.lang.IllegalStateException("Missing required properties: nonce");
    }

    @Override // I4.d.a
    public final I4.d.a b(long j6) {
        this.f5047b = java.lang.Long.valueOf(j6);
        return this;
    }

    @Override // I4.d.a
    public final I4.d.a c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null nonce");
        }
        this.f5046a = str;
        return this;
    }
}
