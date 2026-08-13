package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p198t8.g {
    public i(double d6) {
        super(java.lang.Double.valueOf(d6));
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mZ = g6.t().z();
        p247y7.AbstractC7350t.e(mZ, "getDoubleType(...)");
        return mZ;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return ((java.lang.Number) b()).doubleValue() + ".toDouble()";
    }
}
