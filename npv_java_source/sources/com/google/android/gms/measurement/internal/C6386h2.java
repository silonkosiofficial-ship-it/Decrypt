package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6386h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f42415b = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f42416c = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f42417d = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p085i4.i f42418a;

    public C6386h2(p085i4.i iVar) {
        this.f42418a = iVar;
    }

    private static java.lang.String d(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference atomicReference) {
        java.lang.String str2;
        Q3.AbstractC1477p.l(strArr);
        Q3.AbstractC1477p.l(strArr2);
        Q3.AbstractC1477p.l(atomicReference);
        Q3.AbstractC1477p.a(strArr.length == strArr2.length);
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (j$.util.Objects.equals(str, strArr[i6])) {
                synchronized (atomicReference) {
                    try {
                        java.lang.String[] strArr3 = (java.lang.String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new java.lang.String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i6] == null) {
                            strArr3[i6] = strArr2[i6] + "(" + strArr[i6] + ")";
                        }
                        str2 = strArr3[i6];
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final java.lang.String e(java.lang.Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        for (java.lang.Object obj : objArr) {
            java.lang.String strA = obj instanceof android.os.Bundle ? a((android.os.Bundle) obj) : java.lang.String.valueOf(obj);
            if (strA != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strA);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final java.lang.String a(android.os.Bundle bundle) {
        java.lang.String strE;
        if (bundle == null) {
            return null;
        }
        if (!this.f42418a.a()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bundle[{");
        for (java.lang.String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof android.os.Bundle) {
                strE = e(new java.lang.Object[]{obj});
            } else if (obj instanceof java.lang.Object[]) {
                strE = e((java.lang.Object[]) obj);
            } else {
                strE = obj instanceof java.util.ArrayList ? e(((java.util.ArrayList) obj).toArray()) : java.lang.String.valueOf(obj);
            }
            sb.append(strE);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final java.lang.String b(com.google.android.gms.measurement.internal.E e6) {
        java.lang.String string = null;
        if (e6 == null) {
            return null;
        }
        if (!this.f42418a.a()) {
            return e6.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("origin=");
        sb.append(e6.f41774E);
        sb.append(",name=");
        sb.append(c(e6.f41772C));
        sb.append(",params=");
        com.google.android.gms.measurement.internal.D d6 = e6.f41773D;
        if (d6 != null) {
            string = !this.f42418a.a() ? d6.toString() : a(d6.w());
        }
        sb.append(string);
        return sb.toString();
    }

    protected final java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.f42418a.a() ? str : d(str, p085i4.q.f46680c, p085i4.q.f46678a, f42415b);
    }

    protected final java.lang.String f(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.f42418a.a() ? str : d(str, p085i4.s.f46685b, p085i4.s.f46684a, f42416c);
    }

    protected final java.lang.String g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!this.f42418a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, p085i4.r.f46683b, p085i4.r.f46682a, f42417d);
        }
        return "experiment_id(" + str + ")";
    }
}
