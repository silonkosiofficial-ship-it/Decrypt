package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5150sg0 {
    static final java.lang.CharSequence a(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public static final java.lang.StringBuilder b(java.lang.StringBuilder sb, java.lang.Iterable iterable, java.lang.String str) {
        c(sb, iterable.iterator(), str);
        return sb;
    }

    public static final java.lang.StringBuilder c(java.lang.StringBuilder sb, java.util.Iterator it, java.lang.String str) {
        try {
            if (it.hasNext()) {
                java.lang.CharSequence charSequenceA = a(it.next());
                while (true) {
                    sb.append(charSequenceA);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((java.lang.CharSequence) str);
                    charSequenceA = a(it.next());
                }
            }
            return sb;
        } catch (java.io.IOException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }
}
