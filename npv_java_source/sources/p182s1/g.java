package p182s1;

/* JADX INFO: loaded from: classes.dex */
class g extends p182s1.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54086m;

    public g(p182s1.m mVar) {
        super(mVar);
        this.f54069e = mVar instanceof p182s1.j ? s1.f.a.HORIZONTAL_DIMENSION : s1.f.a.VERTICAL_DIMENSION;
    }

    @Override // p182s1.f
    public void d(int i6) {
        if (this.f54074j) {
            return;
        }
        this.f54074j = true;
        this.f54071g = i6;
        for (p182s1.d dVar : this.f54075k) {
            dVar.a(dVar);
        }
    }
}
