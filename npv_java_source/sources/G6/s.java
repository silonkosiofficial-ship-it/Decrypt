package G6;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends H9.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Long f3128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.a f3129c;

    public s(java.lang.Long l6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "block");
        this.f3128b = l6;
        this.f3129c = aVar;
    }

    @Override // H9.A
    public long a() {
        java.lang.Long l6 = this.f3128b;
        if (l6 != null) {
            return l6.longValue();
        }
        return -1L;
    }

    @Override // H9.A
    public H9.w b() {
        return null;
    }

    @Override // H9.A
    public boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // H9.A
    public void e(X9.InterfaceC1837e interfaceC1837e) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        try {
            java.lang.Long th = null;
            X9.Z zF = X9.K.f(p047e7.a.b((io.ktor.utils.io.d) this.f3129c.b(), null, 1, null));
            try {
                java.lang.Long lValueOf = java.lang.Long.valueOf(interfaceC1837e.c0(zF));
                if (zF != null) {
                    try {
                        zF.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                java.lang.Long l6 = th;
                th = lValueOf;
                th = l6;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (zF != null) {
                    try {
                        zF.close();
                    } catch (java.lang.Throwable th4) {
                        p087i7.AbstractC6661g.a(th, th4);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            th.longValue();
        } catch (java.io.IOException e6) {
            throw e6;
        } catch (java.lang.Throwable th5) {
            throw new G6.r(th5);
        }
    }
}
