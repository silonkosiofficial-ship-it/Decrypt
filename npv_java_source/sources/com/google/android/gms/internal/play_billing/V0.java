package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class V0 extends com.google.android.gms.internal.play_billing.P0 {
    /* synthetic */ V0(com.google.android.gms.internal.play_billing.AbstractC6207e1 abstractC6207e1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.S0 a(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6) {
        com.google.android.gms.internal.play_billing.S0 s10;
        synchronized (abstractC6183a1) {
            try {
                s10 = abstractC6183a1.f41514D;
                if (s10 != s6) {
                    abstractC6183a1.f41514D = s6;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return s10;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.Z0 b(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6) {
        com.google.android.gms.internal.play_billing.Z0 z10;
        synchronized (abstractC6183a1) {
            try {
                z10 = abstractC6183a1.f41515E;
                if (z10 != z6) {
                    abstractC6183a1.f41515E = z6;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void c(com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        z6.f41508b = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void d(com.google.android.gms.internal.play_billing.Z0 z6, java.lang.Thread thread) {
        z6.f41507a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean e(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6, com.google.android.gms.internal.play_billing.S0 s10) {
        synchronized (abstractC6183a1) {
            try {
                if (abstractC6183a1.f41514D != s6) {
                    return false;
                }
                abstractC6183a1.f41514D = s10;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean f(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (abstractC6183a1) {
            try {
                if (abstractC6183a1.f41513C != obj) {
                    return false;
                }
                abstractC6183a1.f41513C = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean g(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        synchronized (abstractC6183a1) {
            try {
                if (abstractC6183a1.f41515E != z6) {
                    return false;
                }
                abstractC6183a1.f41515E = z10;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
