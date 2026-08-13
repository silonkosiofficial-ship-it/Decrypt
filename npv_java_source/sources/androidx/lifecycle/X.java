package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f22800a = new java.util.LinkedHashMap();

    public final void a() {
        java.util.Iterator it = this.f22800a.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.T) it.next()).e();
        }
        this.f22800a.clear();
    }

    public final androidx.lifecycle.T b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return (androidx.lifecycle.T) this.f22800a.get(str);
    }

    public final java.util.Set c() {
        return new java.util.HashSet(this.f22800a.keySet());
    }

    public final void d(java.lang.String str, androidx.lifecycle.T t6) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(t6, "viewModel");
        androidx.lifecycle.T t10 = (androidx.lifecycle.T) this.f22800a.put(str, t6);
        if (t10 != null) {
            t10.e();
        }
    }
}
