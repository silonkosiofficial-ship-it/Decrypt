package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends U7.f implements p048e8.InterfaceC6537c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.annotation.Annotation f14588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p138n8.f fVar, java.lang.annotation.Annotation annotation) {
        super(fVar, null);
        p247y7.AbstractC7350t.f(annotation, "annotation");
        this.f14588c = annotation;
    }

    @Override // p048e8.InterfaceC6537c
    public p048e8.InterfaceC6535a a() {
        return new U7.e(this.f14588c);
    }
}
