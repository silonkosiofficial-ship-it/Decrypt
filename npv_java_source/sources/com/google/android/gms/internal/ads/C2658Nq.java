package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2658Nq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.f f30381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f30382b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f30385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f30386f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f30384d = new java.lang.Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f30387g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30388h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30389i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f30390j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f30391k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.LinkedList f30383c = new java.util.LinkedList();

    C2658Nq(V3.f fVar, com.google.android.gms.internal.ads.C3022Xq c3022Xq, java.lang.String str, java.lang.String str2) {
        this.f30381a = fVar;
        this.f30382b = c3022Xq;
        this.f30385e = str;
        this.f30386f = str2;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle;
        synchronized (this.f30384d) {
            try {
                bundle = new android.os.Bundle();
                bundle.putString("seq_num", this.f30385e);
                bundle.putString("slotid", this.f30386f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f30390j);
                bundle.putLong("tresponse", this.f30391k);
                bundle.putLong("timp", this.f30387g);
                bundle.putLong("tload", this.f30388h);
                bundle.putLong("pcc", this.f30389i);
                bundle.putLong("tfetch", -1L);
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                java.util.Iterator it = this.f30383c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.gms.internal.ads.C2621Mq) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final java.lang.String c() {
        return this.f30385e;
    }

    public final void d() {
        synchronized (this.f30384d) {
            try {
                if (this.f30391k != -1) {
                    com.google.android.gms.internal.ads.C2621Mq c2621Mq = new com.google.android.gms.internal.ads.C2621Mq(this);
                    c2621Mq.d();
                    this.f30383c.add(c2621Mq);
                    this.f30389i++;
                    this.f30382b.f();
                    this.f30382b.e(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f30384d) {
            try {
                if (this.f30391k != -1 && !this.f30383c.isEmpty()) {
                    com.google.android.gms.internal.ads.C2621Mq c2621Mq = (com.google.android.gms.internal.ads.C2621Mq) this.f30383c.getLast();
                    if (c2621Mq.a() == -1) {
                        c2621Mq.c();
                        this.f30382b.e(this);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f30384d) {
            try {
                if (this.f30391k != -1 && this.f30387g == -1) {
                    this.f30387g = this.f30381a.c();
                    this.f30382b.e(this);
                }
                this.f30382b.g();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f30384d) {
            this.f30382b.h();
        }
    }

    public final void h(boolean z6) {
        synchronized (this.f30384d) {
            try {
                if (this.f30391k != -1) {
                    this.f30388h = this.f30381a.c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f30384d) {
            this.f30382b.i();
        }
    }

    public final void j(p184s3.X1 x6) {
        synchronized (this.f30384d) {
            long jC = this.f30381a.c();
            this.f30390j = jC;
            this.f30382b.j(x6, jC);
        }
    }

    public final void k(long j6) {
        synchronized (this.f30384d) {
            try {
                this.f30391k = j6;
                if (j6 != -1) {
                    this.f30382b.e(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
