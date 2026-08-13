package p170r;

/* JADX INFO: renamed from: r.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7048x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p180s.c f53422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p180s.b f53423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53429i;

    public C7048x(int i6) {
        this.f53421a = i6;
        if (!(i6 > 0)) {
            p180s.d.a("maxSize <= 0");
        }
        this.f53422b = new p180s.c(0, 0.75f);
        this.f53423c = new p180s.b();
    }

    private final int f(java.lang.Object obj, java.lang.Object obj2) {
        int iG = g(obj, obj2);
        if (!(iG >= 0)) {
            p180s.d.b("Negative size: " + obj + '=' + obj2);
        }
        return iG;
    }

    protected java.lang.Object a(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "key");
        return null;
    }

    protected void b(boolean z6, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p247y7.AbstractC7350t.f(obj, "key");
        p247y7.AbstractC7350t.f(obj2, "oldValue");
    }

    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object objD;
        p247y7.AbstractC7350t.f(obj, "key");
        synchronized (this.f53423c) {
            java.lang.Object objA = this.f53422b.a(obj);
            if (objA != null) {
                this.f53428h++;
                return objA;
            }
            this.f53429i++;
            java.lang.Object objA2 = a(obj);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f53423c) {
                try {
                    this.f53426f++;
                    objD = this.f53422b.d(obj, objA2);
                    if (objD != null) {
                        this.f53422b.d(obj, objD);
                    } else {
                        this.f53424d += f(obj, objA2);
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, obj, objA2, objD);
                return objD;
            }
            i(this.f53421a);
            return objA2;
        }
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objD;
        p247y7.AbstractC7350t.f(obj, "key");
        p247y7.AbstractC7350t.f(obj2, "value");
        synchronized (this.f53423c) {
            try {
                this.f53425e++;
                this.f53424d += f(obj, obj2);
                objD = this.f53422b.d(obj, obj2);
                if (objD != null) {
                    this.f53424d -= f(obj, objD);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, obj, objD, obj2);
        }
        i(this.f53421a);
        return objD;
    }

    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object objE;
        p247y7.AbstractC7350t.f(obj, "key");
        synchronized (this.f53423c) {
            try {
                objE = this.f53422b.e(obj);
                if (objE != null) {
                    this.f53424d -= f(obj, objE);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (objE != null) {
            b(false, obj, objE, null);
        }
        return objE;
    }

    protected int g(java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(obj, "key");
        p247y7.AbstractC7350t.f(obj2, "value");
        return 1;
    }

    public final java.util.Map h() {
        java.util.LinkedHashMap linkedHashMap;
        synchronized (this.f53423c) {
            linkedHashMap = new java.util.LinkedHashMap(this.f53422b.b().size());
            for (java.util.Map.Entry entry : this.f53422b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public void i(int i6) {
        java.lang.Object key;
        java.lang.Object value;
        while (true) {
            synchronized (this.f53423c) {
                try {
                    if (!(this.f53424d >= 0 && (!this.f53422b.c() || this.f53424d == 0))) {
                        p180s.d.b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f53424d <= i6 || this.f53422b.c()) {
                        break;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) p097j7.AbstractC6879v.j0(this.f53422b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f53422b.e(key);
                    this.f53424d -= f(key, value);
                    this.f53427g++;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this.f53423c) {
            try {
                int i6 = this.f53428h;
                int i10 = this.f53429i + i6;
                str = "LruCache[maxSize=" + this.f53421a + ",hits=" + this.f53428h + ",misses=" + this.f53429i + ",hitRate=" + (i10 != 0 ? (i6 * 100) / i10 : 0) + "%]";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
