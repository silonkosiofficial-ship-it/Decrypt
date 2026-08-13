package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.Configuration f21395b;

    public g(boolean z6) {
        this.f21394a = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(boolean z6, android.content.res.Configuration configuration) {
        this(z6);
        p247y7.AbstractC7350t.f(configuration, "newConfig");
        this.f21395b = configuration;
    }

    public final boolean a() {
        return this.f21394a;
    }
}
