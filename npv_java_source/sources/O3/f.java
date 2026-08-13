package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set f8047a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public interface a extends P3.InterfaceC1447c {
    }

    public interface b extends P3.h {
    }

    public static java.util.Set b() {
        java.util.Set set = f8047a;
        synchronized (set) {
        }
        return set;
    }

    public abstract com.google.android.gms.common.api.internal.AbstractC2147b a(com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b);

    public abstract android.os.Looper c();

    public boolean d(P3.j jVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void e() {
        throw new java.lang.UnsupportedOperationException();
    }
}
