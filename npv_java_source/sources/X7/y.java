package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.EnumMap f16059a;

    public y(java.util.EnumMap enumMap) {
        p247y7.AbstractC7350t.f(enumMap, "defaultQualifiers");
        this.f16059a = enumMap;
    }

    public final X7.r a(X7.EnumC1824b enumC1824b) {
        return (X7.r) this.f16059a.get(enumC1824b);
    }

    public final java.util.EnumMap b() {
        return this.f16059a;
    }
}
