package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final androidx.fragment.app.x f22705a = new androidx.fragment.app.w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final androidx.fragment.app.x f22706b = b();

    static void a(androidx.fragment.app.f fVar, androidx.fragment.app.f fVar2, boolean z6, p170r.C7026a c7026a, boolean z10) {
        if (z6) {
            fVar2.x();
        } else {
            fVar.x();
        }
    }

    private static androidx.fragment.app.x b() {
        try {
            return (androidx.fragment.app.x) androidx.transition.C2102e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static void c(p170r.C7026a c7026a, p170r.C7026a c7026a2) {
        for (int size = c7026a.size() - 1; size >= 0; size--) {
            if (!c7026a2.containsKey((java.lang.String) c7026a.k(size))) {
                c7026a.h(size);
            }
        }
    }

    static void d(java.util.ArrayList arrayList, int i6) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((android.view.View) arrayList.get(size)).setVisibility(i6);
        }
    }
}
