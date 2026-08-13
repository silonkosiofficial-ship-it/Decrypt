package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3385cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f34530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5031rc f34531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5801yc f34532f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34540n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f34533g = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.ArrayList f34534h = new java.util.ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.ArrayList f34535i = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.ArrayList f34536j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34537k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34538l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34539m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.lang.String f34541o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.String f34542p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private java.lang.String f34543q = "";

    public C3385cc(int i6, int i10, int i11, int i12, int i13, int i14, int i15, boolean z6) {
        this.f34527a = i6;
        this.f34528b = i10;
        this.f34529c = i11;
        this.f34530d = z6;
        this.f34531e = new com.google.android.gms.internal.ads.C5031rc(i12);
        this.f34532f = new com.google.android.gms.internal.ads.C5801yc(i13, i14, i15);
    }

    private final void m(java.lang.String str, boolean z6, float f6, float f10, float f11, float f12) {
        if (str != null) {
            if (str.length() < this.f34529c) {
                return;
            }
            synchronized (this.f34533g) {
                try {
                    this.f34534h.add(str);
                    this.f34537k += str.length();
                    if (z6) {
                        this.f34535i.add(str);
                        this.f34536j.add(new com.google.android.gms.internal.ads.C4592nc(f6, f10, f11, f12, this.f34535i.size() - 1));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final java.lang.String n(java.util.ArrayList arrayList, int i6) {
        if (arrayList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb.append((java.lang.String) arrayList.get(i10));
            sb.append(' ');
            i10++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        java.lang.String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    final int a(int i6, int i10) {
        return this.f34530d ? this.f34528b : (i6 * this.f34527a) + (i10 * this.f34528b);
    }

    final int b() {
        return this.f34537k;
    }

    public final java.lang.String c() {
        return this.f34541o;
    }

    public final java.lang.String d() {
        return this.f34543q;
    }

    public final void e() {
        synchronized (this.f34533g) {
            this.f34539m--;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C3385cc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        java.lang.String str = ((com.google.android.gms.internal.ads.C3385cc) obj).f34541o;
        return str != null && str.equals(this.f34541o);
    }

    public final void f() {
        synchronized (this.f34533g) {
            this.f34539m++;
        }
    }

    public final void g(int i6) {
        this.f34538l = i6;
    }

    public final void h(java.lang.String str, boolean z6, float f6, float f10, float f11, float f12) {
        m(str, z6, f6, f10, f11, f12);
    }

    public final int hashCode() {
        return this.f34541o.hashCode();
    }

    public final void i(java.lang.String str, boolean z6, float f6, float f10, float f11, float f12) {
        m(str, z6, f6, f10, f11, f12);
        synchronized (this.f34533g) {
            try {
                if (this.f34539m < 0) {
                    p224w3.p.b("ActivityContent: negative number of WebViews.");
                }
                j();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f34533g) {
            try {
                int iA = a(this.f34537k, this.f34538l);
                if (iA > this.f34540n) {
                    this.f34540n = iA;
                    if (!p174r3.v.s().j().b0()) {
                        this.f34541o = this.f34531e.a(this.f34534h);
                        this.f34542p = this.f34531e.a(this.f34535i);
                    }
                    if (!p174r3.v.s().j().P()) {
                        this.f34543q = this.f34532f.a(this.f34535i, this.f34536j);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f34533g) {
            try {
                int iA = a(this.f34537k, this.f34538l);
                if (iA > this.f34540n) {
                    this.f34540n = iA;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z6;
        synchronized (this.f34533g) {
            z6 = this.f34539m == 0;
        }
        return z6;
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.f34534h;
        return "ActivityContent fetchId: " + this.f34538l + " score:" + this.f34540n + " total_length:" + this.f34537k + "\n text: " + n(arrayList, 100) + "\n viewableText" + n(this.f34535i, 100) + "\n signture: " + this.f34541o + "\n viewableSignture: " + this.f34542p + "\n viewableSignatureForVertical: " + this.f34543q;
    }
}
