package p068g8;

/* JADX INFO: renamed from: g8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6622d extends p068g8.AbstractC6620b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f45638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f45639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f45640c;

    public C6622d(java.util.Map map, java.util.Map map2, java.util.Map map3) {
        p247y7.AbstractC7350t.f(map, "memberAnnotations");
        p247y7.AbstractC7350t.f(map2, "propertyConstants");
        p247y7.AbstractC7350t.f(map3, "annotationParametersDefaultValues");
        this.f45638a = map;
        this.f45639b = map2;
        this.f45640c = map3;
    }

    @Override // p068g8.AbstractC6620b.a
    public java.util.Map a() {
        return this.f45638a;
    }

    public final java.util.Map b() {
        return this.f45640c;
    }

    public final java.util.Map c() {
        return this.f45639b;
    }
}
