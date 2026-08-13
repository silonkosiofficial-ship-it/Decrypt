package W1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.fragment.app.f f15325C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.f fVar, java.lang.String str) {
        super(str);
        p247y7.AbstractC7350t.f(fVar, "fragment");
        this.f15325C = fVar;
    }

    public final androidx.fragment.app.f a() {
        return this.f15325C;
    }
}
