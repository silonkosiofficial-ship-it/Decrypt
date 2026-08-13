package T8;

/* JADX INFO: loaded from: classes2.dex */
abstract class e {
    public static final double a(double d6, T8.d dVar, T8.d dVar2) {
        p247y7.AbstractC7350t.f(dVar, "sourceUnit");
        p247y7.AbstractC7350t.f(dVar2, "targetUnit");
        long jConvert = dVar2.g().convert(1L, dVar.g());
        return jConvert > 0 ? d6 * jConvert : d6 / dVar.g().convert(1L, dVar2.g());
    }

    public static final long b(long j6, T8.d dVar, T8.d dVar2) {
        p247y7.AbstractC7350t.f(dVar, "sourceUnit");
        p247y7.AbstractC7350t.f(dVar2, "targetUnit");
        return dVar2.g().convert(j6, dVar.g());
    }

    public static final long c(long j6, T8.d dVar, T8.d dVar2) {
        p247y7.AbstractC7350t.f(dVar, "sourceUnit");
        p247y7.AbstractC7350t.f(dVar2, "targetUnit");
        return dVar2.g().convert(j6, dVar.g());
    }
}
