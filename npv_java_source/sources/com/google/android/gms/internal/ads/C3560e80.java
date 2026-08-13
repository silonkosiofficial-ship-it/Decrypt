package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3560e80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3451d80 f34900a = new com.google.android.gms.internal.ads.C3451d80();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34905f;

    C3560e80() {
    }

    public final com.google.android.gms.internal.ads.C3451d80 a() {
        com.google.android.gms.internal.ads.C3451d80 c3451d80 = this.f34900a;
        com.google.android.gms.internal.ads.C3451d80 c3451d80Clone = c3451d80.clone();
        c3451d80.f34652C = false;
        c3451d80.f34653D = false;
        return c3451d80Clone;
    }

    public final java.lang.String b() {
        return "\n\tPool does not exist: " + this.f34903d + "\n\tNew pools created: " + this.f34901b + "\n\tPools removed: " + this.f34902c + "\n\tEntries added: " + this.f34905f + "\n\tNo entries retrieved: " + this.f34904e + "\n";
    }

    public final void c() {
        this.f34905f++;
    }

    public final void d() {
        this.f34901b++;
        this.f34900a.f34652C = true;
    }

    public final void e() {
        this.f34904e++;
    }

    public final void f() {
        this.f34903d++;
    }

    public final void g() {
        this.f34902c++;
        this.f34900a.f34653D = true;
    }
}
