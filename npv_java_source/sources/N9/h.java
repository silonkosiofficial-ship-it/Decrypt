package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends H9.C {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f7927D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final long f7928E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final X9.InterfaceC1838f f7929F;

    public h(java.lang.String str, long j6, X9.InterfaceC1838f interfaceC1838f) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        this.f7927D = str;
        this.f7928E = j6;
        this.f7929F = interfaceC1838f;
    }

    @Override // H9.C
    public long a() {
        return this.f7928E;
    }

    @Override // H9.C
    public H9.w f() {
        java.lang.String str = this.f7927D;
        if (str != null) {
            return H9.w.f4831e.b(str);
        }
        return null;
    }

    @Override // H9.C
    public X9.InterfaceC1838f g() {
        return this.f7929F;
    }
}
