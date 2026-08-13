package I4;

/* JADX INFO: loaded from: classes3.dex */
final class f extends I4.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f5026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private K4.x f5027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.app.PendingIntent f5028c;

    f() {
    }

    @Override // I4.n
    final I4.n a(android.app.PendingIntent pendingIntent) {
        this.f5028c = pendingIntent;
        return this;
    }

    @Override // I4.n
    final I4.n b(K4.x xVar) {
        if (xVar == null) {
            throw new java.lang.NullPointerException("Null logger");
        }
        this.f5027b = xVar;
        return this;
    }

    @Override // I4.n
    final I4.n c(java.lang.String str) {
        this.f5026a = str;
        return this;
    }

    @Override // I4.n
    final I4.o d() {
        K4.x xVar;
        java.lang.String str = this.f5026a;
        if (str != null && (xVar = this.f5027b) != null) {
            return new I4.o(str, xVar, this.f5028c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f5026a == null) {
            sb.append(" token");
        }
        if (this.f5027b == null) {
            sb.append(" logger");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
