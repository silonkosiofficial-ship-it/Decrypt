package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6271p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.C6259n f41607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.C6259n f41608c;

    /* synthetic */ C6271p(java.lang.String str, com.google.android.gms.internal.play_billing.AbstractC6277q abstractC6277q) {
        com.google.android.gms.internal.play_billing.C6259n c6259n = new com.google.android.gms.internal.play_billing.C6259n();
        this.f41607b = c6259n;
        this.f41608c = c6259n;
        str.getClass();
        this.f41606a = str;
    }

    public final com.google.android.gms.internal.play_billing.C6271p a(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.C6259n c6259n = new com.google.android.gms.internal.play_billing.C6259n();
        this.f41608c.f41596b = c6259n;
        this.f41608c = c6259n;
        c6259n.f41595a = obj;
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.f41606a);
        sb.append('{');
        com.google.android.gms.internal.play_billing.C6259n c6259n = this.f41607b.f41596b;
        java.lang.String str = "";
        while (c6259n != null) {
            java.lang.Object obj = c6259n.f41595a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c6259n = c6259n.f41596b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
