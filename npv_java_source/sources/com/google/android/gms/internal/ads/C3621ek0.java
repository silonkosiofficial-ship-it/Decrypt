package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3621ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.net.Uri f35040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Map f35041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35044e;

    public C3621ek0() {
        this.f35041b = java.util.Collections.emptyMap();
        this.f35043d = -1L;
    }

    /* synthetic */ C3621ek0(com.google.android.gms.internal.ads.C3843gl0 c3843gl0, com.google.android.gms.internal.ads.AbstractC2357Fk0 abstractC2357Fk0) {
        this.f35040a = c3843gl0.f35675a;
        this.f35041b = c3843gl0.f35678d;
        this.f35042c = c3843gl0.f35679e;
        this.f35043d = c3843gl0.f35680f;
        this.f35044e = c3843gl0.f35681g;
    }

    public final com.google.android.gms.internal.ads.C3621ek0 a(int i6) {
        this.f35044e = 6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3621ek0 b(java.util.Map map) {
        this.f35041b = map;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3621ek0 c(long j6) {
        this.f35042c = j6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3621ek0 d(android.net.Uri uri) {
        this.f35040a = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3843gl0 e() {
        if (this.f35040a == null) {
            throw new java.lang.IllegalStateException("The uri must be set.");
        }
        return new com.google.android.gms.internal.ads.C3843gl0(this.f35040a, this.f35041b, this.f35042c, this.f35043d, this.f35044e);
    }
}
