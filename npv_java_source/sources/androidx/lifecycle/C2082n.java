package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2082n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.lifecycle.C2082n f22834a = new androidx.lifecycle.C2082n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f22835b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    public static final class a extends androidx.lifecycle.AbstractC2075g {
        @Override // androidx.lifecycle.AbstractC2075g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.c(activity);
        }
    }

    private C2082n() {
    }

    public static final void a(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        if (f22835b.getAndSet(true)) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        p247y7.AbstractC7350t.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.C2082n.a());
    }
}
