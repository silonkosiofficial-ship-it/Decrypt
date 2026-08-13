package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class K extends j$.util.stream.L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j$.util.stream.G f48268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.util.stream.G f48269d;

    static {
        j$.util.stream.EnumC6761g3 enumC6761g3 = j$.util.stream.EnumC6761g3.REFERENCE;
        f48268c = new j$.util.stream.G(true, enumC6761g3, j$.util.Optional.empty(), new j$.util.stream.C6816s(4), new j$.util.stream.C6807q(7));
        f48269d = new j$.util.stream.G(false, enumC6761g3, j$.util.Optional.empty(), new j$.util.stream.C6816s(4), new j$.util.stream.C6807q(7));
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.f48275a) {
            return j$.util.Optional.of(this.f48276b);
        }
        return null;
    }
}
