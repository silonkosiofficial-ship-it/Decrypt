package Q0;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0.r f8741a = U0.q.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f8742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.LinkedHashSet f8743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8750j;

    public b(int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f8745e = i6;
        this.f8742b = new java.util.HashMap(0, 0.75f);
        this.f8743c = new java.util.LinkedHashSet();
    }

    private final int g(java.lang.Object obj, java.lang.Object obj2) {
        int i6 = i(obj, obj2);
        if (i6 >= 0) {
            return i6;
        }
        throw new java.lang.IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected java.lang.Object b(java.lang.Object obj) {
        return null;
    }

    protected void c(boolean z6, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    public final java.lang.Object d(java.lang.Object obj) {
        synchronized (this.f8741a) {
            java.lang.Object obj2 = this.f8742b.get(obj);
            if (obj2 != null) {
                this.f8743c.remove(obj);
                this.f8743c.add(obj);
                this.f8749i++;
                return obj2;
            }
            this.f8750j++;
            java.lang.Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.f8741a) {
                try {
                    this.f8747g++;
                    java.lang.Object objPut = this.f8742b.put(obj, objB);
                    this.f8743c.remove(obj);
                    this.f8743c.add(obj);
                    if (objPut != null) {
                        this.f8742b.put(obj, objPut);
                        obj2 = objPut;
                    } else {
                        this.f8744d = h() + g(obj, objB);
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, objB, obj2);
                return obj2;
            }
            j(this.f8745e);
            return objB;
        }
    }

    public final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f8741a) {
            try {
                this.f8746f++;
                this.f8744d = h() + g(obj, obj2);
                objPut = this.f8742b.put(obj, obj2);
                if (objPut != null) {
                    this.f8744d = h() - g(obj, objPut);
                }
                if (this.f8743c.contains(obj)) {
                    this.f8743c.remove(obj);
                }
                this.f8743c.add(obj);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            c(false, obj, objPut, obj2);
        }
        j(this.f8745e);
        return objPut;
    }

    public final java.lang.Object f(java.lang.Object obj) {
        java.lang.Object objRemove;
        obj.getClass();
        synchronized (this.f8741a) {
            try {
                objRemove = this.f8742b.remove(obj);
                this.f8743c.remove(obj);
                if (objRemove != null) {
                    this.f8744d = h() - g(obj, objRemove);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int h() {
        int i6;
        synchronized (this.f8741a) {
            i6 = this.f8744d;
        }
        return i6;
    }

    protected int i(java.lang.Object obj, java.lang.Object obj2) {
        return 1;
    }

    public void j(int i6) {
        java.lang.Object objH0;
        java.lang.Object obj;
        while (true) {
            synchronized (this.f8741a) {
                try {
                    if (h() >= 0 && (!this.f8742b.isEmpty() || h() == 0)) {
                        if (this.f8742b.isEmpty() != this.f8743c.isEmpty()) {
                            break;
                        }
                        if (h() <= i6 || this.f8742b.isEmpty()) {
                            objH0 = null;
                            obj = null;
                        } else {
                            objH0 = p097j7.AbstractC6879v.h0(this.f8743c);
                            obj = this.f8742b.get(objH0);
                            if (obj == null) {
                                throw new java.lang.IllegalStateException("inconsistent state");
                            }
                            p247y7.W.d(this.f8742b).remove(objH0);
                            p247y7.W.a(this.f8743c).remove(objH0);
                            int iH = h();
                            p247y7.AbstractC7350t.c(objH0);
                            p247y7.AbstractC7350t.c(obj);
                            this.f8744d = iH - g(objH0, obj);
                            this.f8748h++;
                        }
                        p087i7.M m6 = p087i7.M.f46721a;
                    } else {
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (objH0 == null && obj == null) {
                return;
            }
            p247y7.AbstractC7350t.c(objH0);
            p247y7.AbstractC7350t.c(obj);
            c(true, objH0, obj, null);
        }
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this.f8741a) {
            try {
                int i6 = this.f8749i;
                int i10 = this.f8750j + i6;
                str = "LruCache[maxSize=" + this.f8745e + ",hits=" + this.f8749i + ",misses=" + this.f8750j + ",hitRate=" + (i10 != 0 ? (i6 * 100) / i10 : 0) + "%]";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
