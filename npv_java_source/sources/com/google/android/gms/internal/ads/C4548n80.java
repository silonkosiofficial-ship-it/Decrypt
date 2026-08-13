package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4548n80 implements com.google.android.gms.internal.ads.InterfaceC4438m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f37528a;

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    public C4548n80(p184s3.X1 x6, java.lang.String str, int i6, java.lang.String str2, p184s3.i2 i2Var) {
        java.util.List list;
        android.location.Location location;
        java.util.List list2;
        java.lang.String string;
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(str2.split(",")));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(java.lang.Integer.valueOf(i6));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(java.lang.Long.valueOf(x6.f54153D));
        }
        if (!hashSet.contains("extras")) {
            string = hashSet.contains("npa") ? x6.f54154E.getString("npa") : string;
            if (hashSet.contains("gender")) {
                arrayList.add(java.lang.Integer.valueOf(x6.f54155F));
            }
            if (hashSet.contains("keywords")) {
                list2 = x6.f54156G;
                if (list2 != null) {
                    arrayList.add(list2.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("isTestDevice")) {
                arrayList.add(java.lang.Boolean.valueOf(x6.f54157H));
            }
            if (hashSet.contains("tagForChildDirectedTreatment")) {
                arrayList.add(java.lang.Integer.valueOf(x6.f54158I));
            }
            if (hashSet.contains("manualImpressionsEnabled")) {
                arrayList.add(java.lang.Boolean.valueOf(x6.f54159J));
            }
            if (hashSet.contains("publisherProvidedId")) {
                arrayList.add(x6.f54160K);
            }
            if (hashSet.contains("location")) {
                location = x6.f54162M;
                if (location != null) {
                    arrayList.add(location.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("contentUrl")) {
                arrayList.add(x6.f54163N);
            }
            if (hashSet.contains("networkExtras")) {
                arrayList.add(a(x6.f54164O));
            }
            if (hashSet.contains("customTargeting")) {
                arrayList.add(a(x6.f54165P));
            }
            if (hashSet.contains("categoryExclusions")) {
                list = x6.f54166Q;
                if (list != null) {
                    arrayList.add(list.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("requestAgent")) {
                arrayList.add(x6.f54167R);
            }
            if (hashSet.contains("requestPackage")) {
                arrayList.add(x6.f54168S);
            }
            if (hashSet.contains("isDesignedForFamilies")) {
                arrayList.add(java.lang.Boolean.valueOf(x6.f54169T));
            }
            if (hashSet.contains("tagForUnderAgeOfConsent")) {
                arrayList.add(java.lang.Integer.valueOf(x6.f54171V));
            }
            if (hashSet.contains("maxAdContentRating")) {
                arrayList.add(x6.f54172W);
            }
            if (hashSet.contains("orientation")) {
                if (i2Var != null) {
                    arrayList.add(java.lang.Integer.valueOf(i2Var.f54278C));
                } else {
                    arrayList.add(null);
                }
            }
            this.f37528a = arrayList.toArray();
        }
        string = a(x6.f54154E);
        arrayList.add(string);
        if (hashSet.contains("gender")) {
            arrayList.add(java.lang.Integer.valueOf(x6.f54155F));
        }
        if (hashSet.contains("keywords")) {
            list2 = x6.f54156G;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(java.lang.Boolean.valueOf(x6.f54157H));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(java.lang.Integer.valueOf(x6.f54158I));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(java.lang.Boolean.valueOf(x6.f54159J));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(x6.f54160K);
        }
        if (hashSet.contains("location")) {
            location = x6.f54162M;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(x6.f54163N);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(x6.f54164O));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(x6.f54165P));
        }
        if (hashSet.contains("categoryExclusions")) {
            list = x6.f54166Q;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(x6.f54167R);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(x6.f54168S);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(java.lang.Boolean.valueOf(x6.f54169T));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(java.lang.Integer.valueOf(x6.f54171V));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(x6.f54172W);
        }
        if (hashSet.contains("orientation")) {
            if (i2Var != null) {
                arrayList.add(java.lang.Integer.valueOf(i2Var.f54278C));
            } else {
                arrayList.add(null);
            }
        }
        this.f37528a = arrayList.toArray();
    }

    private static java.lang.String a(android.os.Bundle bundle) {
        java.lang.String strA;
        if (bundle == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = new java.util.TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            java.lang.Object obj = bundle.get((java.lang.String) it.next());
            if (obj == null) {
                strA = "null";
            } else {
                strA = obj instanceof android.os.Bundle ? a((android.os.Bundle) obj) : obj.toString();
            }
            sb.append(strA);
        }
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C4548n80) {
            return java.util.Arrays.equals(this.f37528a, ((com.google.android.gms.internal.ads.C4548n80) obj).f37528a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f37528a);
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = this.f37528a;
        return "[PoolKey#" + java.util.Arrays.hashCode(objArr) + " " + java.util.Arrays.toString(objArr) + "]";
    }
}
