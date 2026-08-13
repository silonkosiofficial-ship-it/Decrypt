package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class O4 extends com.google.android.gms.internal.play_billing.D1 {
    O4() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final void a(com.google.android.gms.internal.play_billing.P4 p6, com.google.android.gms.internal.play_billing.P4 p10) {
        p6.f41440b = p10;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final void b(com.google.android.gms.internal.play_billing.P4 p6, java.lang.Thread thread) {
        p6.f41439a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean c(com.google.android.gms.internal.play_billing.R4 r6, com.google.android.gms.internal.play_billing.C6316w3 c6316w3, com.google.android.gms.internal.play_billing.C6316w3 c6316w4) {
        synchronized (r6) {
            try {
                if (r6.f41457D != c6316w3) {
                    return false;
                }
                r6.f41457D = c6316w4;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean d(com.google.android.gms.internal.play_billing.R4 r6, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (r6) {
            try {
                if (r6.f41456C != obj) {
                    return false;
                }
                r6.f41456C = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean e(com.google.android.gms.internal.play_billing.R4 r6, com.google.android.gms.internal.play_billing.P4 p6, com.google.android.gms.internal.play_billing.P4 p10) {
        synchronized (r6) {
            try {
                if (r6.f41458E != p6) {
                    return false;
                }
                r6.f41458E = p10;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
