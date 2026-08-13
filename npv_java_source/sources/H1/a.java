package H1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f4278a = H1.d.f4282b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4279b = H1.d.f4281a;

    public static final void a(android.view.View view, H1.b bVar) {
        p247y7.AbstractC7350t.f(view, "<this>");
        p247y7.AbstractC7350t.f(bVar, "listener");
        b(view).a(bVar);
    }

    private static final H1.c b(android.view.View view) {
        int i6 = f4278a;
        H1.c cVar = (H1.c) view.getTag(i6);
        if (cVar != null) {
            return cVar;
        }
        H1.c cVar2 = new H1.c();
        view.setTag(i6, cVar2);
        return cVar2;
    }

    public static final boolean c(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        java.lang.Object tag = view.getTag(f4279b);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        for (java.lang.Object obj : androidx.core.view.AbstractC1997d0.a(view)) {
            if ((obj instanceof android.view.View) && c((android.view.View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(android.view.View view, H1.b bVar) {
        p247y7.AbstractC7350t.f(view, "<this>");
        p247y7.AbstractC7350t.f(bVar, "listener");
        b(view).b(bVar);
    }
}
