package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class D1 extends com.google.android.gms.internal.ads.F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f26593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f26594d;

    public D1() {
        super(new com.google.android.gms.internal.ads.C4641o0());
        this.f26592b = -9223372036854775807L;
        this.f26593c = new long[0];
        this.f26594d = new long[0];
    }

    private static java.lang.Double g(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c5128sR.J()));
    }

    private static java.lang.Object h(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        if (i6 == 0) {
            return g(c5128sR);
        }
        if (i6 == 1) {
            return java.lang.Boolean.valueOf(c5128sR.C() == 1);
        }
        if (i6 == 2) {
            return i(c5128sR);
        }
        if (i6 != 3) {
            if (i6 == 8) {
                return j(c5128sR);
            }
            if (i6 != 10) {
                if (i6 != 11) {
                    return null;
                }
                java.util.Date date = new java.util.Date((long) g(c5128sR).doubleValue());
                c5128sR.m(2);
                return date;
            }
            int iF = c5128sR.F();
            java.util.ArrayList arrayList = new java.util.ArrayList(iF);
            for (int i10 = 0; i10 < iF; i10++) {
                java.lang.Object objH = h(c5128sR, c5128sR.C());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        java.util.HashMap map = new java.util.HashMap();
        while (true) {
            java.lang.String strI = i(c5128sR);
            int iC = c5128sR.C();
            if (iC == 9) {
                return map;
            }
            java.lang.Object objH2 = h(c5128sR, iC);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    private static java.lang.String i(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iG = c5128sR.G();
        int iT = c5128sR.t();
        c5128sR.m(iG);
        return new java.lang.String(c5128sR.n(), iT, iG);
    }

    private static java.util.HashMap j(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iF = c5128sR.F();
        java.util.HashMap map = new java.util.HashMap(iF);
        for (int i6 = 0; i6 < iF; i6++) {
            java.lang.String strI = i(c5128sR);
            java.lang.Object objH = h(c5128sR, c5128sR.C());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean b(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6) {
        if (c5128sR.C() == 2 && "onMetaData".equals(i(c5128sR)) && c5128sR.r() != 0 && c5128sR.C() == 8) {
            java.util.HashMap mapJ = j(c5128sR);
            java.lang.Object obj = mapJ.get("duration");
            if (obj instanceof java.lang.Double) {
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f26592b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            java.lang.Object obj2 = mapJ.get("keyframes");
            if (obj2 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj2;
                java.lang.Object obj3 = map.get("filepositions");
                java.lang.Object obj4 = map.get("times");
                if ((obj3 instanceof java.util.List) && (obj4 instanceof java.util.List)) {
                    java.util.List list = (java.util.List) obj3;
                    java.util.List list2 = (java.util.List) obj4;
                    int size = list2.size();
                    this.f26593c = new long[size];
                    this.f26594d = new long[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        java.lang.Object obj5 = list.get(i6);
                        java.lang.Object obj6 = list2.get(i6);
                        if (!(obj6 instanceof java.lang.Double) || !(obj5 instanceof java.lang.Double)) {
                            this.f26593c = new long[0];
                            this.f26594d = new long[0];
                            break;
                        }
                        this.f26593c[i6] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
                        this.f26594d[i6] = ((java.lang.Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f26592b;
    }

    public final long[] e() {
        return this.f26594d;
    }

    public final long[] f() {
        return this.f26593c;
    }
}
