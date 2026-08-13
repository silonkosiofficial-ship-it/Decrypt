package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends java.io.IOException implements W8.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f5101C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Long f5102D;

    /* JADX WARN: Illegal instructions before constructor call */
    public D(O6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "request");
        java.lang.String strC = dVar.j().c();
        I6.G g6 = (I6.G) dVar.g(I6.F.f5123a);
        this(strC, g6 != null ? g6.c() : null, null, 4, null);
    }

    public D(java.lang.String str, java.lang.Long l6, java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(str, "url");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        sb.append(l6 == null ? "unknown" : l6);
        sb.append(" ms]");
        super(sb.toString(), th);
        this.f5101C = str;
        this.f5102D = l6;
    }

    public /* synthetic */ D(java.lang.String str, java.lang.Long l6, java.lang.Throwable th, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, l6, (i6 & 4) != 0 ? null : th);
    }

    @Override // W8.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public I6.D a() {
        return new I6.D(this.f5101C, this.f5102D, getCause());
    }
}
