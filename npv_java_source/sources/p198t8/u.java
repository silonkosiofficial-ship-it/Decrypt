package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends p198t8.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str) {
        super(str);
        p247y7.AbstractC7350t.f(str, "value");
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mW = g6.t().W();
        p247y7.AbstractC7350t.e(mW, "getStringType(...)");
        return mW;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return '\"' + ((java.lang.String) b()) + '\"';
    }
}
