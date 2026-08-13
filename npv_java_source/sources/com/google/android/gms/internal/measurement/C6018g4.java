package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6018g4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.android.gms.internal.measurement.C6018g4 f40947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.android.gms.internal.measurement.C6018g4 f40948c = new com.google.android.gms.internal.measurement.C6018g4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f40949a = java.util.Collections.emptyMap();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g4$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f40950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40951b;

        a(java.lang.Object obj, int i6) {
            this.f40950a = obj;
            this.f40951b = i6;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.internal.measurement.C6018g4.a)) {
                return false;
            }
            com.google.android.gms.internal.measurement.C6018g4.a aVar = (com.google.android.gms.internal.measurement.C6018g4.a) obj;
            return this.f40950a == aVar.f40950a && this.f40951b == aVar.f40951b;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.f40950a) * 65535) + this.f40951b;
        }
    }

    private C6018g4(boolean z6) {
    }

    public static com.google.android.gms.internal.measurement.C6018g4 a() {
        com.google.android.gms.internal.measurement.C6018g4 c6018g4 = f40947b;
        if (c6018g4 != null) {
            return c6018g4;
        }
        synchronized (com.google.android.gms.internal.measurement.C6018g4.class) {
            try {
                com.google.android.gms.internal.measurement.C6018g4 c6018g5 = f40947b;
                if (c6018g5 != null) {
                    return c6018g5;
                }
                com.google.android.gms.internal.measurement.C6018g4 c6018g4A = com.google.android.gms.internal.measurement.AbstractC6114r4.a(com.google.android.gms.internal.measurement.C6018g4.class);
                f40947b = c6018g4A;
                return c6018g4A;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.measurement.AbstractC6130t4.d b(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, int i6) {
        androidx.appcompat.app.D.a(this.f40949a.get(new com.google.android.gms.internal.measurement.C6018g4.a(interfaceC5965a5, i6)));
        return null;
    }
}
