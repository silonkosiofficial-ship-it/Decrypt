package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5031rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4702oc f38513b = new com.google.android.gms.internal.ads.C5251tc();

    public C5031rc(int i6) {
        this.f38512a = i6;
    }

    public final java.lang.String a(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            sb.append(((java.lang.String) arrayList.get(i6)).toLowerCase(java.util.Locale.US));
            sb.append('\n');
        }
        java.lang.String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        com.google.android.gms.internal.ads.C4922qc c4922qc = new com.google.android.gms.internal.ads.C4922qc();
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(this.f38512a, new com.google.android.gms.internal.ads.C4812pc(this));
        for (java.lang.String str : strArrSplit) {
            java.lang.String[] strArrB = com.google.android.gms.internal.ads.AbstractC5141sc.b(str, false);
            if (strArrB.length != 0) {
                com.google.android.gms.internal.ads.AbstractC5471vc.c(strArrB, this.f38512a, 6, priorityQueue);
            }
        }
        java.util.Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c4922qc.f38290b.write(this.f38513b.b(((com.google.android.gms.internal.ads.C5361uc) it.next()).f39186b));
            } catch (java.io.IOException e6) {
                p224w3.p.e("Error while writing hash to byteStream", e6);
            }
        }
        return c4922qc.toString();
    }
}
