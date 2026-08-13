package C5;

/* JADX INFO: loaded from: classes3.dex */
class i implements z5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1328a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1329b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z5.c f1330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5.f f1331d;

    i(C5.f fVar) {
        this.f1331d = fVar;
    }

    private void a() {
        if (this.f1328a) {
            throw new z5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f1328a = true;
    }

    void b(z5.c cVar, boolean z6) {
        this.f1328a = false;
        this.f1330c = cVar;
        this.f1329b = z6;
    }

    @Override // z5.g
    public z5.g e(java.lang.String str) {
        a();
        this.f1331d.o(this.f1330c, str, this.f1329b);
        return this;
    }

    @Override // z5.g
    public z5.g f(boolean z6) {
        a();
        this.f1331d.l(this.f1330c, z6, this.f1329b);
        return this;
    }
}
