package W1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends W1.g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.view.ViewGroup f15326D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.f fVar, android.view.ViewGroup viewGroup) {
        super(fVar, "Attempting to add fragment " + fVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        p247y7.AbstractC7350t.f(fVar, "fragment");
        p247y7.AbstractC7350t.f(viewGroup, "container");
        this.f15326D = viewGroup;
    }
}
