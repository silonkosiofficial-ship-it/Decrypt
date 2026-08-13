package p240y;

/* JADX INFO: loaded from: classes.dex */
final class l implements p240y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.InterfaceC7175j f57124a;

    public l(p200u.InterfaceC7175j interfaceC7175j) {
        this.f57124a = interfaceC7175j;
    }

    @Override // p240y.b
    public /* bridge */ /* synthetic */ java.lang.Object a(p230x.w wVar, java.lang.Object obj, java.lang.Object obj2, p237x7.l lVar, p127m7.e eVar) {
        return b(wVar, ((java.lang.Number) obj).floatValue(), ((java.lang.Number) obj2).floatValue(), lVar, eVar);
    }

    public java.lang.Object b(p230x.w wVar, float f6, float f10, p237x7.l lVar, p127m7.e eVar) {
        java.lang.Object objH = p240y.h.h(wVar, java.lang.Math.abs(f6) * java.lang.Math.signum(f10), f6, p200u.AbstractC7181m.c(0.0f, f10, 0L, 0L, false, 28, null), this.f57124a, lVar, eVar);
        return objH == p137n7.b.g() ? objH : (p240y.a) objH;
    }
}
