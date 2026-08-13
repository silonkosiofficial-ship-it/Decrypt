package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p198t8.g {
    public l(float f6) {
        super(java.lang.Float.valueOf(f6));
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mB = g6.t().B();
        p247y7.AbstractC7350t.e(mB, "getFloatType(...)");
        return mB;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return ((java.lang.Number) b()).floatValue() + ".toFloat()";
    }
}
