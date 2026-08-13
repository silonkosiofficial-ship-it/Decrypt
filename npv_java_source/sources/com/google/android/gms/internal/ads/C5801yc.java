package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5801yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4702oc f40107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40109c;

    public C5801yc(int i6, int i10, int i11) {
        this.f40108b = i6;
        i10 = (i10 > 64 || i10 < 0) ? 64 : i10;
        if (i11 <= 0) {
            this.f40109c = 1;
        } else {
            this.f40109c = i11;
        }
        this.f40107a = new com.google.android.gms.internal.ads.C5581wc(i10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final java.lang.String a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.Collections.sort(arrayList2, new com.google.android.gms.internal.ads.C5691xc(this));
        java.util.HashSet hashSet = new java.util.HashSet();
        loop0: for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            java.lang.String[] strArrSplit = java.text.Normalizer.normalize((java.lang.CharSequence) arrayList.get(((com.google.android.gms.internal.ads.C4592nc) arrayList2.get(i6)).e()), java.text.Normalizer.Form.NFKC).toLowerCase(java.util.Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (java.lang.String str : strArrSplit) {
                    if (str.contains("'")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                        int i10 = 1;
                        boolean z6 = false;
                        while (true) {
                            int i11 = i10 + 2;
                            if (i11 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i10) == '\'') {
                                if (sb.charAt(i10 - 1) != ' ') {
                                    int i12 = i10 + 1;
                                    if ((sb.charAt(i12) == 's' || sb.charAt(i12) == 'S') && (i11 == sb.length() || sb.charAt(i11) == ' ')) {
                                        sb.insert(i10, ' ');
                                        i10 = i11;
                                    } else {
                                        sb.setCharAt(i10, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i10, ' ');
                                }
                                z6 = true;
                            }
                            i10++;
                        }
                        java.lang.String string = z6 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    java.lang.String[] strArrB = com.google.android.gms.internal.ads.AbstractC5141sc.b(str, true);
                    if (strArrB.length >= this.f40109c) {
                        for (int i13 = 0; i13 < strArrB.length; i13++) {
                            java.lang.String strConcat = "";
                            for (int i14 = 0; i14 < this.f40109c; i14++) {
                                int i15 = i13 + i14;
                                if (i15 >= strArrB.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(java.lang.String.valueOf(strArrB[i15]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.f40108b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f40108b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        com.google.android.gms.internal.ads.C4922qc c4922qc = new com.google.android.gms.internal.ads.C4922qc();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                c4922qc.f38290b.write(this.f40107a.b((java.lang.String) it.next()));
            } catch (java.io.IOException e6) {
                p224w3.p.e("Error while writing hash to byteStream", e6);
            }
        }
        return c4922qc.toString();
    }
}
