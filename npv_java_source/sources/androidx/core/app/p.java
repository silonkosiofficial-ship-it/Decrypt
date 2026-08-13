package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.Configuration f21482b;

    public p(boolean z6) {
        this.f21481a = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(boolean z6, android.content.res.Configuration configuration) {
        this(z6);
        p247y7.AbstractC7350t.f(configuration, "newConfig");
        this.f21482b = configuration;
    }

    public final boolean a() {
        return this.f21481a;
    }
}
