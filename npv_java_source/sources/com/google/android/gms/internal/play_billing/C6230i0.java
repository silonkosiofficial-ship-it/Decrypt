package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6230i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f41567a = new java.util.ArrayList();

    public final com.google.android.gms.internal.play_billing.C6230i0 a(com.google.android.gms.internal.play_billing.C6325y0 c6325y0) {
        if (!(!c6325y0.d())) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.AbstractC6300u.a("range must not be empty, but was %s", c6325y0));
        }
        this.f41567a.add(c6325y0);
        return this;
    }

    final com.google.android.gms.internal.play_billing.C6230i0 b(com.google.android.gms.internal.play_billing.C6230i0 c6230i0) {
        java.util.Iterator it = c6230i0.f41567a.iterator();
        while (it.hasNext()) {
            a((com.google.android.gms.internal.play_billing.C6325y0) it.next());
        }
        return this;
    }

    public final com.google.android.gms.internal.play_billing.C6236j0 c() {
        com.google.android.gms.internal.play_billing.C6182a0 c6182a0 = new com.google.android.gms.internal.play_billing.C6182a0(this.f41567a.size());
        java.util.Collections.sort(this.f41567a, com.google.android.gms.internal.play_billing.C6319x0.f41675C);
        java.util.Iterator it = this.f41567a.iterator();
        com.google.android.gms.internal.play_billing.C6266o0 c6266o0 = it instanceof com.google.android.gms.internal.play_billing.C6266o0 ? (com.google.android.gms.internal.play_billing.C6266o0) it : new com.google.android.gms.internal.play_billing.C6266o0(it);
        while (c6266o0.hasNext()) {
            com.google.android.gms.internal.play_billing.C6325y0 c6325y0C = (com.google.android.gms.internal.play_billing.C6325y0) c6266o0.next();
            while (c6266o0.hasNext()) {
                com.google.android.gms.internal.play_billing.C6325y0 c6325y0 = (com.google.android.gms.internal.play_billing.C6325y0) c6266o0.a();
                if (c6325y0C.f41677C.e(c6325y0.f41678D) > 0 || c6325y0.f41677C.e(c6325y0C.f41678D) > 0) {
                    break;
                }
                com.google.android.gms.internal.play_billing.AbstractC6294t.d(c6325y0C.b(c6325y0).d(), "Overlapping ranges not permitted but found %s overlapping %s", c6325y0C, c6325y0);
                c6325y0C = c6325y0C.c((com.google.android.gms.internal.play_billing.C6325y0) c6266o0.next());
            }
            c6182a0.e(c6325y0C);
        }
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0F = c6182a0.f();
        if (abstractC6206e0F.isEmpty()) {
            return com.google.android.gms.internal.play_billing.C6236j0.b();
        }
        if (abstractC6206e0F.size() == 1) {
            com.google.android.gms.internal.play_billing.O0 o0ListIterator = abstractC6206e0F.listIterator(0);
            java.lang.Object next = o0ListIterator.next();
            if (o0ListIterator.hasNext()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("expected one element but was: <");
                sb.append(next);
                for (int i6 = 0; i6 < 4 && o0ListIterator.hasNext(); i6++) {
                    sb.append(", ");
                    sb.append(o0ListIterator.next());
                }
                if (o0ListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (((com.google.android.gms.internal.play_billing.C6325y0) next).equals(com.google.android.gms.internal.play_billing.C6325y0.a())) {
                return com.google.android.gms.internal.play_billing.C6236j0.a();
            }
        }
        return new com.google.android.gms.internal.play_billing.C6236j0(abstractC6206e0F);
    }
}
