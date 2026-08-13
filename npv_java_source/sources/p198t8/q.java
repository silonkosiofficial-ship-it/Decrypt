package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p198t8.o {
    public q(long j6) {
        super(java.lang.Long.valueOf(j6));
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mF = g6.t().F();
        p247y7.AbstractC7350t.e(mF, "getLongType(...)");
        return mF;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return ((java.lang.Number) b()).longValue() + ".toLong()";
    }
}
