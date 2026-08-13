package p245y4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.animation.TimeInterpolator f57237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final android.view.View f57238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f57239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f57240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f57241e;

    public a(android.view.View view) {
        this.f57238b = view;
        android.content.Context context = view.getContext();
        this.f57237a = p245y4.d.g(context, p125m4.a.f50492J, androidx.core.view.animation.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f57239c = p245y4.d.f(context, p125m4.a.f50484B, 300);
        this.f57240d = p245y4.d.f(context, p125m4.a.f50487E, 150);
        this.f57241e = p245y4.d.f(context, p125m4.a.f50486D, 100);
    }
}
