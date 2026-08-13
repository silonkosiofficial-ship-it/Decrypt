package p240y;

/* JADX INFO: loaded from: classes.dex */
final class c implements p240y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.B f57072a;

    public c(p200u.B b6) {
        this.f57072a = b6;
    }

    @Override // p240y.b
    public /* bridge */ /* synthetic */ java.lang.Object a(p230x.w wVar, java.lang.Object obj, java.lang.Object obj2, p237x7.l lVar, p127m7.e eVar) {
        return b(wVar, ((java.lang.Number) obj).floatValue(), ((java.lang.Number) obj2).floatValue(), lVar, eVar);
    }

    public java.lang.Object b(p230x.w wVar, float f6, float f10, p237x7.l lVar, p127m7.e eVar) {
        java.lang.Object objF = p240y.h.f(wVar, f6, p200u.AbstractC7181m.c(0.0f, f10, 0L, 0L, false, 28, null), this.f57072a, lVar, eVar);
        return objF == p137n7.b.g() ? objF : (p240y.a) objF;
    }
}
