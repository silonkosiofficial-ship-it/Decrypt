package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5471vc {
    static long a(long j6, int i6) {
        if (i6 == 1) {
            return j6;
        }
        int i10 = i6 >> 1;
        long j10 = (j6 * j6) % 1073807359;
        return ((i6 & 1) == 0 ? a(j10, i10) : j6 * (a(j10, i10) % 1073807359)) % 1073807359;
    }

    static java.lang.String b(java.lang.String[] strArr, int i6, int i10) {
        int i11 = i10 + i6;
        if (strArr.length < i11) {
            p224w3.p.d("Unable to construct shingle");
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i12 = i11 - 1;
            if (i6 >= i12) {
                sb.append(strArr[i12]);
                return sb.toString();
            }
            sb.append(strArr[i6]);
            sb.append(' ');
            i6++;
        }
    }

    public static void c(java.lang.String[] strArr, int i6, int i10, java.util.PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i6, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        d(i6, jE, b(strArr, 0, 6), 6, priorityQueue);
        int i11 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i11 >= length2 - 5) {
                return;
            }
            long jA = com.google.android.gms.internal.ads.AbstractC5141sc.a(strArr[i11 - 1]);
            long jA2 = com.google.android.gms.internal.ads.AbstractC5141sc.a(strArr[i11 + 5]);
            java.lang.String strB = b(strArr, i11, 6);
            jE = ((((((jE + 1073807359) - ((a(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i6, jE, strB, length2, priorityQueue);
            i11++;
        }
    }

    static void d(int i6, long j6, java.lang.String str, int i10, java.util.PriorityQueue priorityQueue) {
        com.google.android.gms.internal.ads.C5361uc c5361uc = new com.google.android.gms.internal.ads.C5361uc(j6, str, i10);
        if ((priorityQueue.size() != i6 || (((com.google.android.gms.internal.ads.C5361uc) priorityQueue.peek()).f39187c <= c5361uc.f39187c && ((com.google.android.gms.internal.ads.C5361uc) priorityQueue.peek()).f39185a <= c5361uc.f39185a)) && !priorityQueue.contains(c5361uc)) {
            priorityQueue.add(c5361uc);
            if (priorityQueue.size() > i6) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(java.lang.String[] strArr, int i6, int i10) {
        long jA = (((long) com.google.android.gms.internal.ads.AbstractC5141sc.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jA = (((jA * 16785407) % 1073807359) + ((((long) com.google.android.gms.internal.ads.AbstractC5141sc.a(strArr[i11])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}
