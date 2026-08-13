package p012b1;

/* JADX INFO: renamed from: b1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2112b implements p012b1.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p082i1.f f24014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f24015b;

    public AbstractC2112b(p082i1.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "containerObject");
        this.f24014a = fVar;
        this.f24015b = p012b1.C2111a.f24013a.a(i6);
    }

    @Override // p012b1.u
    public final void a(b1.i.b bVar, float f6, float f10) {
        p247y7.AbstractC7350t.f(bVar, "anchor");
        java.lang.String strA = p012b1.C2111a.f24013a.a(bVar.b());
        p082i1.a aVar = new p082i1.a(new char[0]);
        i1.h.a aVar2 = p082i1.h.f46655K;
        aVar.P(aVar2.a(bVar.a().toString()));
        aVar.P(aVar2.a(strA));
        aVar.P(new p082i1.e(f6));
        aVar.P(new p082i1.e(f10));
        this.f24014a.k0(this.f24015b, aVar);
    }
}
