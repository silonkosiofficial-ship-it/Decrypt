package p012b1;

/* JADX INFO: renamed from: b1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2113c implements p012b1.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p082i1.f f24016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f24017b;

    public AbstractC2113c(p082i1.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "containerObject");
        this.f24016a = fVar;
        this.f24017b = p012b1.C2111a.f24013a.b(i6);
    }

    @Override // p012b1.B
    public final void a(b1.i.c cVar, float f6, float f10) {
        p247y7.AbstractC7350t.f(cVar, "anchor");
        java.lang.String strB = p012b1.C2111a.f24013a.b(cVar.b());
        p082i1.a aVar = new p082i1.a(new char[0]);
        i1.h.a aVar2 = p082i1.h.f46655K;
        aVar.P(aVar2.a(cVar.a().toString()));
        aVar.P(aVar2.a(strB));
        aVar.P(new p082i1.e(f6));
        aVar.P(new p082i1.e(f10));
        this.f24016a.k0(this.f24017b, aVar);
    }
}
