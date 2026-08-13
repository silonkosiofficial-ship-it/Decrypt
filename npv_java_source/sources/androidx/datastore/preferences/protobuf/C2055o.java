package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2055o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22071b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile androidx.datastore.preferences.protobuf.C2055o f22072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final androidx.datastore.preferences.protobuf.C2055o f22073d = new androidx.datastore.preferences.protobuf.C2055o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f22074a = java.util.Collections.emptyMap();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f22075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22076b;

        a(java.lang.Object obj, int i6) {
            this.f22075a = obj;
            this.f22076b = i6;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.datastore.preferences.protobuf.C2055o.a)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.C2055o.a aVar = (androidx.datastore.preferences.protobuf.C2055o.a) obj;
            return this.f22075a == aVar.f22075a && this.f22076b == aVar.f22076b;
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.f22075a) * 65535) + this.f22076b;
        }
    }

    C2055o(boolean z6) {
    }

    public static androidx.datastore.preferences.protobuf.C2055o b() {
        if (!f22071b) {
            return f22073d;
        }
        androidx.datastore.preferences.protobuf.C2055o c2055oA = f22072c;
        if (c2055oA == null) {
            synchronized (androidx.datastore.preferences.protobuf.C2055o.class) {
                try {
                    c2055oA = f22072c;
                    if (c2055oA == null) {
                        c2055oA = androidx.datastore.preferences.protobuf.AbstractC2054n.a();
                        f22072c = c2055oA;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return c2055oA;
    }

    public androidx.datastore.preferences.protobuf.AbstractC2062w.c a(androidx.datastore.preferences.protobuf.O o6, int i6) {
        androidx.appcompat.app.D.a(this.f22074a.get(new androidx.datastore.preferences.protobuf.C2055o.a(o6, i6)));
        return null;
    }
}
