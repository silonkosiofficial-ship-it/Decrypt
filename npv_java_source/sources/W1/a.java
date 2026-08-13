package W1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends W1.g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f15306D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.f fVar, java.lang.String str) {
        super(fVar, "Attempting to reuse fragment " + fVar + " with previous ID " + str);
        p247y7.AbstractC7350t.f(fVar, "fragment");
        p247y7.AbstractC7350t.f(str, "previousFragmentId");
        this.f15306D = str;
    }
}
