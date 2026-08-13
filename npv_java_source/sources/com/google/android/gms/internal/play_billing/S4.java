package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Object f41464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.google.android.gms.internal.play_billing.V4 f41465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.X4 f41466c = com.google.android.gms.internal.play_billing.X4.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41467d;

    S4() {
    }

    final void a() {
        this.f41464a = null;
        this.f41465b = null;
        this.f41466c.c(null);
    }

    public final boolean b(java.lang.Object obj) {
        this.f41467d = true;
        com.google.android.gms.internal.play_billing.V4 v6 = this.f41465b;
        boolean z6 = v6 != null && v6.a(obj);
        if (z6) {
            this.f41464a = null;
            this.f41465b = null;
            this.f41466c = null;
        }
        return z6;
    }

    protected final void finalize() {
        com.google.android.gms.internal.play_billing.X4 x6;
        com.google.android.gms.internal.play_billing.V4 v6 = this.f41465b;
        if (v6 != null && !v6.isDone()) {
            v6.b(new com.google.android.gms.internal.play_billing.T4("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(java.lang.String.valueOf(this.f41464a))));
        }
        if (this.f41467d || (x6 = this.f41466c) == null) {
            return;
        }
        x6.c(null);
    }
}
