package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends H8.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(H8.g gVar, java.lang.String... strArr) {
        super(gVar, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        p247y7.AbstractC7350t.f(gVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
    }

    @Override // H8.f, p248y8.h
    public java.util.Set a() {
        throw new java.lang.IllegalStateException();
    }

    @Override // H8.f, p248y8.h
    public java.util.Set d() {
        throw new java.lang.IllegalStateException();
    }

    @Override // H8.f, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        throw new java.lang.IllegalStateException(j());
    }

    @Override // H8.f, p248y8.h
    public java.util.Set f() {
        throw new java.lang.IllegalStateException();
    }

    @Override // H8.f, p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        throw new java.lang.IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // H8.f, p248y8.h
    /* JADX INFO: renamed from: h */
    public java.util.Set b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        throw new java.lang.IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // H8.f, p248y8.h
    /* JADX INFO: renamed from: i */
    public java.util.Set c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        throw new java.lang.IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // H8.f
    public java.lang.String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
