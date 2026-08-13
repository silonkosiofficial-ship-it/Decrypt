package R7;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements R7.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f9715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f9716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f9717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f9718d;

    public w(java.util.List list, java.util.Set set, java.util.List list2, java.util.Set set2) {
        p247y7.AbstractC7350t.f(list, "allDependencies");
        p247y7.AbstractC7350t.f(set, "modulesWhoseInternalsAreVisible");
        p247y7.AbstractC7350t.f(list2, "directExpectedByDependencies");
        p247y7.AbstractC7350t.f(set2, "allExpectedByDependencies");
        this.f9715a = list;
        this.f9716b = set;
        this.f9717c = list2;
        this.f9718d = set2;
    }

    @Override // R7.v
    public java.util.List a() {
        return this.f9715a;
    }

    @Override // R7.v
    public java.util.Set b() {
        return this.f9716b;
    }

    @Override // R7.v
    public java.util.List c() {
        return this.f9717c;
    }
}
