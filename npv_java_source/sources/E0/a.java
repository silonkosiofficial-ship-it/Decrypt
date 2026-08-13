package E0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends E0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E0.k f2090a;

    public a(E0.k kVar) {
        super(null);
        this.f2090a = kVar;
    }

    @Override // E0.g
    public boolean a(E0.c cVar) {
        return cVar == this.f2090a.getKey();
    }

    @Override // E0.g
    public java.lang.Object b(E0.c cVar) {
        if (!(cVar == this.f2090a.getKey())) {
            C0.a.b("Check failed.");
        }
        return this.f2090a.getValue();
    }

    public final void c(E0.k kVar) {
        this.f2090a = kVar;
    }
}
