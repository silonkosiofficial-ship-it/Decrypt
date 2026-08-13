package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p109k9.AbstractC6915a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.InterfaceC6916b f49854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f49856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p109k9.m f49857d;

    public q(p109k9.InterfaceC6916b interfaceC6916b, java.lang.String str, java.lang.Object obj, p109k9.m mVar) {
        p247y7.AbstractC7350t.f(interfaceC6916b, "accessor");
        p247y7.AbstractC7350t.f(str, "name");
        this.f49854a = interfaceC6916b;
        this.f49855b = str;
        this.f49856c = obj;
        this.f49857d = mVar;
    }

    public /* synthetic */ q(p109k9.InterfaceC6916b interfaceC6916b, java.lang.String str, java.lang.Object obj, p109k9.m mVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC6916b, (i6 & 2) != 0 ? interfaceC6916b.getName() : str, (i6 & 4) != 0 ? null : obj, (i6 & 8) != 0 ? null : mVar);
    }

    @Override // p109k9.n
    public java.lang.Object a() {
        return this.f49856c;
    }

    @Override // p109k9.n
    public p109k9.InterfaceC6916b b() {
        return this.f49854a;
    }

    @Override // p109k9.n
    public p109k9.m c() {
        return this.f49857d;
    }

    @Override // p109k9.n
    public java.lang.String getName() {
        return this.f49855b;
    }
}
