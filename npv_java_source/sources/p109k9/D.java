package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends p109k9.AbstractC6915a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.InterfaceC6916b f49828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f49831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Integer f49832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p109k9.m f49833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f49834g;

    public D(p109k9.InterfaceC6916b interfaceC6916b, int i6, int i10, java.lang.String str, java.lang.Integer num, p109k9.m mVar) {
        int i11;
        p247y7.AbstractC7350t.f(interfaceC6916b, "accessor");
        p247y7.AbstractC7350t.f(str, "name");
        this.f49828a = interfaceC6916b;
        this.f49829b = i6;
        this.f49830c = i10;
        this.f49831d = str;
        this.f49832e = num;
        this.f49833f = mVar;
        if (i10 < 10) {
            i11 = 1;
        } else if (i10 < 100) {
            i11 = 2;
        } else {
            if (i10 >= 1000) {
                throw new java.lang.IllegalArgumentException("Max value " + i10 + " is too large");
            }
            i11 = 3;
        }
        this.f49834g = i11;
    }

    public /* synthetic */ D(p109k9.InterfaceC6916b interfaceC6916b, int i6, int i10, java.lang.String str, java.lang.Integer num, p109k9.m mVar, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC6916b, i6, i10, (i11 & 8) != 0 ? interfaceC6916b.getName() : str, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : mVar);
    }

    @Override // p109k9.n
    public p109k9.InterfaceC6916b b() {
        return this.f49828a;
    }

    @Override // p109k9.n
    public p109k9.m c() {
        return this.f49833f;
    }

    @Override // p109k9.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer a() {
        return this.f49832e;
    }

    public final int e() {
        return this.f49834g;
    }

    public final int f() {
        return this.f49830c;
    }

    public final int g() {
        return this.f49829b;
    }

    @Override // p109k9.n
    public java.lang.String getName() {
        return this.f49831d;
    }
}
