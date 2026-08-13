package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 extends com.google.android.gms.internal.measurement.T0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f40644C = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f40645D;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object L0(android.os.Bundle r4, java.lang.Class r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L41
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L41
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            throw r0
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Q0.L0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final java.lang.Long c2(long j6) {
        return (java.lang.Long) L0(y0(j6), java.lang.Long.class);
    }

    public final java.lang.String d2(long j6) {
        return (java.lang.String) L0(y0(j6), java.lang.String.class);
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void e0(android.os.Bundle bundle) {
        synchronized (this.f40644C) {
            try {
                try {
                    this.f40644C.set(bundle);
                    this.f40645D = true;
                    this.f40644C.notify();
                } catch (java.lang.Throwable th) {
                    this.f40644C.notify();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final android.os.Bundle y0(long j6) {
        android.os.Bundle bundle;
        synchronized (this.f40644C) {
            if (!this.f40645D) {
                try {
                    this.f40644C.wait(j6);
                } catch (java.lang.InterruptedException unused) {
                    return null;
                }
            }
            bundle = (android.os.Bundle) this.f40644C.get();
        }
        return bundle;
    }
}
