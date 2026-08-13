package H8;

/* JADX INFO: loaded from: classes2.dex */
public class f implements p248y8.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H8.g f4415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f4416c;

    public f(H8.g gVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(gVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        this.f4415b = gVar;
        java.lang.String strG = gVar.g();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(strG, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p247y7.AbstractC7350t.e(str, "format(...)");
        this.f4416c = str;
    }

    @Override // p248y8.h
    public java.util.Set a() {
        return p097j7.Z.d();
    }

    @Override // p248y8.h
    public java.util.Set d() {
        return p097j7.Z.d();
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.AbstractC6879v.m();
    }

    @Override // p248y8.h
    public java.util.Set f() {
        return p097j7.Z.d();
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        java.lang.String str = java.lang.String.format(H8.b.ERROR_CLASS.g(), java.util.Arrays.copyOf(new java.lang.Object[]{fVar}, 1));
        p247y7.AbstractC7350t.e(str, "format(...)");
        p138n8.f fVarS = p138n8.f.s(str);
        p247y7.AbstractC7350t.e(fVarS, "special(...)");
        return new H8.a(fVarS);
    }

    @Override // p248y8.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public java.util.Set b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p097j7.Z.c(new H8.c(H8.k.f4528a.h()));
    }

    @Override // p248y8.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.util.Set c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return H8.k.f4528a.j();
    }

    protected final java.lang.String j() {
        return this.f4416c;
    }

    public java.lang.String toString() {
        return "ErrorScope{" + this.f4416c + '}';
    }
}
