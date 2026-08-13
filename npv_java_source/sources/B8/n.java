package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements B8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.L f911a;

    public n(O7.L l6) {
        p247y7.AbstractC7350t.f(l6, "packageFragmentProvider");
        this.f911a = l6;
    }

    @Override // B8.h
    public B8.C0826g a(p138n8.b bVar) {
        B8.C0826g c0826gA;
        p247y7.AbstractC7350t.f(bVar, "classId");
        O7.L l6 = this.f911a;
        p138n8.c cVarH = bVar.h();
        p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
        for (O7.K k6 : O7.N.c(l6, cVarH)) {
            if ((k6 instanceof B8.o) && (c0826gA = ((B8.o) k6).O0().a(bVar)) != null) {
                return c0826gA;
            }
        }
        return null;
    }
}
