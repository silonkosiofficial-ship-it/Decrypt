package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class h6 extends com.google.android.gms.measurement.internal.E5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f42424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.Set f42425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.Map f42426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Long f42427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.Long f42428h;

    h6(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
    }

    private final void B(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        p170r.C7026a c7026a = new p170r.C7026a();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.C6136u2 c6136u2 = (com.google.android.gms.internal.measurement.C6136u2) it.next();
            java.lang.String strT = c6136u2.T();
            java.util.Map mapR0 = (java.util.Map) c7026a.get(strT);
            if (mapR0 == null) {
                mapR0 = q().R0(this.f42424d, strT);
                c7026a.put(strT, mapR0);
            }
            for (java.lang.Integer num : mapR0.keySet()) {
                int iIntValue = num.intValue();
                if (this.f42425e.contains(num)) {
                    j().K().b("Skipping failed audience ID", num);
                    break;
                }
                boolean zK = true;
                for (com.google.android.gms.internal.measurement.N1 n6 : (java.util.List) mapR0.get(num)) {
                    if (j().C(2)) {
                        j().K().d("Evaluating filter. audience, filter, property", num, n6.N() ? java.lang.Integer.valueOf(n6.k()) : null, g().g(n6.J()));
                        j().K().b("Filter definition", o().L(n6));
                    }
                    if (!n6.N() || n6.k() > 256) {
                        j().L().c("Invalid property filter ID. appId, id", com.google.android.gms.measurement.internal.C6428n2.v(this.f42424d), java.lang.String.valueOf(n6.N() ? java.lang.Integer.valueOf(n6.k()) : null));
                        zK = false;
                        break;
                    }
                    com.google.android.gms.measurement.internal.n6 n6Var = new com.google.android.gms.measurement.internal.n6(this, this.f42424d, iIntValue, n6);
                    zK = n6Var.k(this.f42427g, this.f42428h, c6136u2, D(iIntValue, n6.k()));
                    if (!zK) {
                        this.f42425e.add(num);
                        break;
                    }
                    y(num).c(n6Var);
                }
                if (!zK) {
                    this.f42425e.add(num);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(java.util.List list, boolean z6) {
        com.google.android.gms.measurement.internal.A a6;
        com.google.android.gms.measurement.internal.m6 m6Var;
        java.lang.Integer num;
        java.util.Map map;
        long j6;
        if (list.isEmpty()) {
            return;
        }
        java.lang.String str = null;
        com.google.android.gms.measurement.internal.m6 m6Var2 = new com.google.android.gms.measurement.internal.m6(this);
        p170r.C7026a c7026a = new p170r.C7026a();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.C6061l2 c6061l2 = (com.google.android.gms.internal.measurement.C6061l2) it.next();
            com.google.android.gms.internal.measurement.C6061l2 c6061l2A = m6Var2.a(this.f42424d, c6061l2);
            if (c6061l2A != null) {
                com.google.android.gms.measurement.internal.C6404k c6404kQ = q();
                java.lang.String str2 = this.f42424d;
                java.lang.String strT = c6061l2A.T();
                com.google.android.gms.measurement.internal.A aL0 = c6404kQ.L0(str2, c6061l2.T());
                if (aL0 == null) {
                    c6404kQ.j().L().c("Event aggregate wasn't created during raw event logging. appId, event", com.google.android.gms.measurement.internal.C6428n2.v(str2), c6404kQ.g().c(strT));
                    a6 = new com.google.android.gms.measurement.internal.A(str2, c6061l2.T(), 1L, 1L, 1L, c6061l2.Q(), 0L, null, null, null, null);
                } else {
                    a6 = new com.google.android.gms.measurement.internal.A(aL0.f41689a, aL0.f41690b, aL0.f41691c + 1, aL0.f41692d + 1, aL0.f41693e + 1, aL0.f41694f, aL0.f41695g, aL0.f41696h, aL0.f41697i, aL0.f41698j, aL0.f41699k);
                }
                com.google.android.gms.measurement.internal.A a10 = a6;
                q().U(a10);
                if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().H(str, com.google.android.gms.measurement.internal.G.f41861Z0) || !z6) {
                    long j10 = a10.f41691c;
                    java.lang.String strT2 = c6061l2A.T();
                    java.util.Map mapP0 = (java.util.Map) c7026a.get(strT2);
                    if (mapP0 == null) {
                        mapP0 = q().P0(this.f42424d, strT2);
                        c7026a.put(strT2, mapP0);
                    }
                    java.util.Map map2 = mapP0;
                    for (java.lang.Integer num2 : map2.keySet()) {
                        int iIntValue = num2.intValue();
                        if (this.f42425e.contains(num2)) {
                            j().K().b("Skipping failed audience ID", num2);
                        } else {
                            java.util.Iterator it2 = ((java.util.List) map2.get(num2)).iterator();
                            boolean zK = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    m6Var = m6Var2;
                                    num = num2;
                                    map = map2;
                                    j6 = j10;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.K1 k6 = (com.google.android.gms.internal.measurement.K1) it2.next();
                                com.google.android.gms.measurement.internal.l6 l6Var = new com.google.android.gms.measurement.internal.l6(this, this.f42424d, iIntValue, k6);
                                m6Var = m6Var2;
                                num = num2;
                                int i6 = iIntValue;
                                map = map2;
                                j6 = j10;
                                zK = l6Var.k(this.f42427g, this.f42428h, c6061l2A, j10, a10, D(iIntValue, k6.I()));
                                if (!zK) {
                                    this.f42425e.add(num);
                                    break;
                                }
                                y(num).c(l6Var);
                                num2 = num;
                                m6Var2 = m6Var;
                                iIntValue = i6;
                                map2 = map;
                                j10 = j6;
                            }
                            if (!zK) {
                                this.f42425e.add(num);
                            }
                            m6Var2 = m6Var;
                            map2 = map;
                            j10 = j6;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final boolean D(int i6, int i10) {
        com.google.android.gms.measurement.internal.j6 j6Var = (com.google.android.gms.measurement.internal.j6) this.f42426f.get(java.lang.Integer.valueOf(i6));
        if (j6Var == null) {
            return false;
        }
        return j6Var.f42467d.get(i10);
    }

    private final java.util.List E() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<java.lang.Integer> setKeySet = this.f42426f.keySet();
        setKeySet.removeAll(this.f42425e);
        for (java.lang.Integer num : setKeySet) {
            int iIntValue = num.intValue();
            com.google.android.gms.measurement.internal.j6 j6Var = (com.google.android.gms.measurement.internal.j6) this.f42426f.get(num);
            Q3.AbstractC1477p.l(j6Var);
            com.google.android.gms.internal.measurement.C6043j2 c6043j2A = j6Var.a(iIntValue);
            arrayList.add(c6043j2A);
            com.google.android.gms.measurement.internal.C6404k c6404kQ = q();
            java.lang.String str = this.f42424d;
            com.google.android.gms.internal.measurement.C6120s2 c6120s2L = c6043j2A.L();
            c6404kQ.u();
            c6404kQ.n();
            Q3.AbstractC1477p.f(str);
            Q3.AbstractC1477p.l(c6120s2L);
            byte[] bArrJ = c6120s2L.j();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrJ);
            try {
                if (c6404kQ.B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    c6404kQ.j().G().b("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                }
            } catch (android.database.sqlite.SQLiteException e6) {
                c6404kQ.j().G().c("Error storing filter results. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            }
        }
        return arrayList;
    }

    private final com.google.android.gms.measurement.internal.j6 y(java.lang.Integer num) {
        if (this.f42426f.containsKey(num)) {
            return (com.google.android.gms.measurement.internal.j6) this.f42426f.get(num);
        }
        com.google.android.gms.measurement.internal.j6 j6Var = new com.google.android.gms.measurement.internal.j6(this, this.f42424d);
        this.f42426f.put(num, j6Var);
        return j6Var;
    }

    final java.util.List A(java.lang.String str, java.util.List list, java.util.List list2, java.lang.Long l6, java.lang.Long l10, boolean z6) {
        boolean z10;
        java.util.Map map;
        java.util.List<com.google.android.gms.internal.measurement.K1> list3;
        java.util.Iterator it;
        java.util.Map map2;
        java.util.Iterator it2;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(list);
        Q3.AbstractC1477p.l(list2);
        this.f42424d = str;
        this.f42425e = new java.util.HashSet();
        this.f42426f = new p170r.C7026a();
        this.f42427g = l6;
        this.f42428h = l10;
        java.util.Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.C6061l2) it3.next()).T())) {
                z10 = true;
                break;
            }
        }
        boolean z11 = com.google.android.gms.internal.measurement.B6.a() && d().H(this.f42424d, com.google.android.gms.measurement.internal.G.f41908q0);
        boolean z12 = com.google.android.gms.internal.measurement.B6.a() && d().H(this.f42424d, com.google.android.gms.measurement.internal.G.f41906p0);
        if (z10) {
            com.google.android.gms.measurement.internal.C6404k c6404kQ = q();
            java.lang.String str2 = this.f42424d;
            c6404kQ.u();
            c6404kQ.n();
            Q3.AbstractC1477p.f(str2);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("current_session_count", (java.lang.Integer) 0);
            try {
                c6404kQ.B().update("events", contentValues, "app_id = ?", new java.lang.String[]{str2});
            } catch (android.database.sqlite.SQLiteException e6) {
                c6404kQ.j().G().c("Error resetting session-scoped event counts. appId", com.google.android.gms.measurement.internal.C6428n2.v(str2), e6);
            }
        }
        java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
        if (z12 && z11) {
            mapEmptyMap = q().a1(this.f42424d);
        }
        java.util.Map mapZ0 = q().Z0(this.f42424d);
        if (!mapZ0.isEmpty()) {
            java.util.HashSet hashSet = new java.util.HashSet(mapZ0.keySet());
            if (z10) {
                java.lang.String str3 = this.f42424d;
                java.util.Map mapB1 = q().b1(this.f42424d);
                Q3.AbstractC1477p.f(str3);
                Q3.AbstractC1477p.l(mapZ0);
                p170r.C7026a c7026a = new p170r.C7026a();
                if (!mapZ0.isEmpty()) {
                    java.util.Iterator it4 = mapZ0.keySet().iterator();
                    while (it4.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) it4.next();
                        num.intValue();
                        com.google.android.gms.internal.measurement.C6120s2 c6120s2 = (com.google.android.gms.internal.measurement.C6120s2) mapZ0.get(num);
                        java.util.List list4 = (java.util.List) mapB1.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map2 = mapB1;
                            it2 = it4;
                            c7026a.put(num, c6120s2);
                        } else {
                            java.util.List listP = o().P(c6120s2.U(), list4);
                            if (!listP.isEmpty()) {
                                com.google.android.gms.internal.measurement.C6120s2.a aVarY = ((com.google.android.gms.internal.measurement.C6120s2.a) c6120s2.x()).x().y(listP);
                                aVarY.B().C(o().P(c6120s2.W(), list4));
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (com.google.android.gms.internal.measurement.C6052k2 c6052k2 : c6120s2.T()) {
                                    java.util.Map map3 = mapB1;
                                    java.util.Iterator it5 = it4;
                                    if (!list4.contains(java.lang.Integer.valueOf(c6052k2.k()))) {
                                        arrayList.add(c6052k2);
                                    }
                                    mapB1 = map3;
                                    it4 = it5;
                                }
                                map2 = mapB1;
                                it2 = it4;
                                aVarY.v().w(arrayList);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (com.google.android.gms.internal.measurement.C6128t2 c6128t2 : c6120s2.V()) {
                                    if (!list4.contains(java.lang.Integer.valueOf(c6128t2.I()))) {
                                        arrayList2.add(c6128t2);
                                    }
                                }
                                aVarY.z().A(arrayList2);
                                c7026a.put(num, (com.google.android.gms.internal.measurement.C6120s2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarY.q()));
                            }
                        }
                        mapB1 = map2;
                        it4 = it2;
                    }
                }
                map = c7026a;
            } else {
                map = mapZ0;
            }
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                java.lang.Integer num2 = (java.lang.Integer) it6.next();
                num2.intValue();
                com.google.android.gms.internal.measurement.C6120s2 c6120s3 = (com.google.android.gms.internal.measurement.C6120s2) map.get(num2);
                java.util.BitSet bitSet = new java.util.BitSet();
                java.util.BitSet bitSet2 = new java.util.BitSet();
                p170r.C7026a c7026a2 = new p170r.C7026a();
                if (c6120s3 != null && c6120s3.k() != 0) {
                    for (com.google.android.gms.internal.measurement.C6052k2 c6052k3 : c6120s3.T()) {
                        if (c6052k3.L()) {
                            c7026a2.put(java.lang.Integer.valueOf(c6052k3.k()), c6052k3.K() ? java.lang.Long.valueOf(c6052k3.H()) : null);
                        }
                    }
                }
                p170r.C7026a c7026a3 = new p170r.C7026a();
                if (c6120s3 != null && c6120s3.K() != 0) {
                    java.util.Iterator it7 = c6120s3.V().iterator();
                    while (it7.hasNext()) {
                        com.google.android.gms.internal.measurement.C6128t2 c6128t3 = (com.google.android.gms.internal.measurement.C6128t2) it7.next();
                        if (c6128t3.M() && c6128t3.k() > 0) {
                            c7026a3.put(java.lang.Integer.valueOf(c6128t3.I()), java.lang.Long.valueOf(c6128t3.F(c6128t3.k() - 1)));
                        }
                        it7 = it7;
                        map = map;
                    }
                }
                java.util.Map map4 = map;
                if (c6120s3 != null) {
                    int i6 = 0;
                    while (i6 < (c6120s3.N() << 6)) {
                        if (com.google.android.gms.measurement.internal.Z5.e0(c6120s3.W(), i6)) {
                            it = it6;
                            j().K().c("Filter already evaluated. audience ID, filter ID", num2, java.lang.Integer.valueOf(i6));
                            bitSet2.set(i6);
                            if (com.google.android.gms.measurement.internal.Z5.e0(c6120s3.U(), i6)) {
                                bitSet.set(i6);
                            }
                            i6++;
                            it6 = it;
                        } else {
                            it = it6;
                        }
                        c7026a2.remove(java.lang.Integer.valueOf(i6));
                        i6++;
                        it6 = it;
                    }
                }
                java.util.Iterator it8 = it6;
                com.google.android.gms.internal.measurement.C6120s2 c6120s4 = (com.google.android.gms.internal.measurement.C6120s2) mapZ0.get(num2);
                if (z12 && z11 && (list3 = (java.util.List) mapEmptyMap.get(num2)) != null && this.f42428h != null && this.f42427g != null) {
                    for (com.google.android.gms.internal.measurement.K1 k6 : list3) {
                        int I10 = k6.I();
                        long jLongValue = this.f42428h.longValue() / 1000;
                        if (k6.P()) {
                            jLongValue = this.f42427g.longValue() / 1000;
                        }
                        if (c7026a2.containsKey(java.lang.Integer.valueOf(I10))) {
                            c7026a2.put(java.lang.Integer.valueOf(I10), java.lang.Long.valueOf(jLongValue));
                        }
                        if (c7026a3.containsKey(java.lang.Integer.valueOf(I10))) {
                            c7026a3.put(java.lang.Integer.valueOf(I10), java.lang.Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f42426f.put(num2, new com.google.android.gms.measurement.internal.j6(this, this.f42424d, c6120s4, bitSet, bitSet2, c7026a2, c7026a3));
                it6 = it8;
                mapZ0 = mapZ0;
                map = map4;
            }
        }
        if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().H(null, com.google.android.gms.measurement.internal.G.f41861Z0)) {
            C(list, true);
            B(list2);
            return E();
        }
        C(list, z6);
        if (z6) {
            return new java.util.ArrayList();
        }
        B(list2);
        return E();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    final java.util.List z(java.lang.String str, java.util.List list, java.util.List list2, java.lang.Long l6, java.lang.Long l10) {
        return A(str, list, list2, l6, l10, false);
    }
}
