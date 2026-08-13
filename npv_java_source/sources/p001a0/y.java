package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p001a0.u {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p001a0.i f17032F;

    public y(p001a0.i iVar) {
        this.f17032F = iVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public java.util.Map.Entry next() {
        p021c0.a.a(f());
        p(e() + 2);
        return new p001a0.c(this.f17032F, d()[e() - 2], d()[e() - 1]);
    }
}
