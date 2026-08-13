package U6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends U6.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f14553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T6.C1660h f14554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.C f14555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f14556d;

    public f(java.lang.String str, T6.C1660h c1660h, T6.C c6) {
        p247y7.AbstractC7350t.f(str, "text");
        p247y7.AbstractC7350t.f(c1660h, "contentType");
        this.f14553a = str;
        this.f14554b = c1660h;
        this.f14555c = c6;
        java.nio.charset.Charset charsetA = T6.AbstractC1661i.a(b());
        this.f14556d = p037d7.e.c(str, charsetA == null ? S8.C1631d.f12624b : charsetA);
    }

    public /* synthetic */ f(java.lang.String str, T6.C1660h c1660h, T6.C c6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, c1660h, (i6 & 4) != 0 ? null : c6);
    }

    @Override // U6.b
    public java.lang.Long a() {
        return java.lang.Long.valueOf(this.f14556d.length);
    }

    @Override // U6.b
    public T6.C1660h b() {
        return this.f14554b;
    }

    @Override // U6.b.a
    public byte[] d() {
        return this.f14556d;
    }

    public java.lang.String toString() {
        return "TextContent[" + b() + "] \"" + S8.r.B1(this.f14553a, 30) + '\"';
    }
}
