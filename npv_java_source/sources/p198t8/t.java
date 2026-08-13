package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends p198t8.o {
    public t(short s6) {
        super(java.lang.Short.valueOf(s6));
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mT = g6.t().T();
        p247y7.AbstractC7350t.e(mT, "getShortType(...)");
        return mT;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return ((java.lang.Number) b()).intValue() + ".toShort()";
    }
}
