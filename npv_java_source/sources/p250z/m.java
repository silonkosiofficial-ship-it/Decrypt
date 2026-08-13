package p250z;

/* JADX INFO: loaded from: classes.dex */
final class m implements p250z.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.x f57454a = Z8.E.b(0, 16, Y8.EnumC1863d.DROP_OLDEST, 1, null);

    @Override // p250z.l
    public boolean a(p250z.i iVar) {
        return b().n(iVar);
    }

    @Override // p250z.l
    public java.lang.Object c(p250z.i iVar, p127m7.e eVar) {
        java.lang.Object objA = b().a(iVar, eVar);
        return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
    }

    @Override // p250z.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Z8.x b() {
        return this.f57454a;
    }
}
