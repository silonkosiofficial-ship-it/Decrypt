package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class Z5 extends com.google.android.gms.measurement.internal.E5 {
    Z5(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
    }

    static android.os.Bundle B(java.util.List list) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.C6079n2 c6079n2 = (com.google.android.gms.internal.measurement.C6079n2) it.next();
            java.lang.String strV = c6079n2.V();
            if (c6079n2.Y()) {
                bundle.putDouble(strV, c6079n2.F());
            } else if (c6079n2.Z()) {
                bundle.putFloat(strV, c6079n2.M());
            } else if (c6079n2.c0()) {
                bundle.putString(strV, c6079n2.W());
            } else if (c6079n2.a0()) {
                bundle.putLong(strV, c6079n2.R());
            }
        }
        return bundle;
    }

    private final android.os.Bundle C(java.util.Map map, boolean z6) {
        java.lang.String string;
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (!(obj instanceof java.util.ArrayList)) {
                string = obj.toString();
            } else if (z6) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    java.lang.Object obj2 = arrayList.get(i6);
                    i6++;
                    arrayList2.add(C((java.util.Map) obj2, false));
                }
                bundle.putParcelableArray(str, (android.os.Parcelable[]) arrayList2.toArray(new android.os.Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    static com.google.android.gms.internal.measurement.C6079n2 F(com.google.android.gms.internal.measurement.C6061l2 c6061l2, java.lang.String str) {
        for (com.google.android.gms.internal.measurement.C6079n2 c6079n2 : c6061l2.U()) {
            if (c6079n2.V().equals(str)) {
                return c6079n2;
            }
        }
        return null;
    }

    static com.google.android.gms.internal.measurement.Z4 G(com.google.android.gms.internal.measurement.Z4 z6, byte[] bArr) {
        com.google.android.gms.internal.measurement.C6018g4 c6018g4A = com.google.android.gms.internal.measurement.C6018g4.a();
        return c6018g4A != null ? z6.e0(bArr, c6018g4A) : z6.f(bArr);
    }

    static java.lang.Object J(com.google.android.gms.internal.measurement.C6061l2 c6061l2, java.lang.String str, java.lang.Object obj) {
        java.lang.Object objF0 = f0(c6061l2, str);
        return objF0 == null ? obj : objF0;
    }

    private static java.lang.String N(boolean z6, boolean z10, boolean z11) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z6) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static java.util.List O(java.util.BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            long j6 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i6 << 6) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j6 |= 1 << i10;
                }
            }
            arrayList.add(java.lang.Long.valueOf(j6));
        }
        return arrayList;
    }

    private static void R(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2, java.util.Set set) {
        if (set.contains(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void S(android.net.Uri.Builder builder, java.lang.String[] strArr, android.os.Bundle bundle, java.util.Set set) {
        for (java.lang.String str : strArr) {
            java.lang.String[] strArrSplit = str.split(",");
            java.lang.String str2 = strArrSplit[0];
            java.lang.String str3 = strArrSplit[strArrSplit.length - 1];
            java.lang.String string = bundle.getString(str2);
            if (string != null) {
                R(builder, str3, string, set);
            }
        }
    }

    static void T(com.google.android.gms.internal.measurement.C6061l2.a aVar, java.lang.String str, java.lang.Object obj) {
        java.util.List listL = aVar.L();
        int i6 = 0;
        while (true) {
            if (i6 >= listL.size()) {
                i6 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.C6079n2) listL.get(i6)).V())) {
                break;
            } else {
                i6++;
            }
        }
        com.google.android.gms.internal.measurement.C6079n2.a aVarA = com.google.android.gms.internal.measurement.C6079n2.T().A(str);
        if (obj instanceof java.lang.Long) {
            aVarA.x(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.String) {
            aVarA.C((java.lang.String) obj);
        } else if (obj instanceof java.lang.Double) {
            aVarA.w(((java.lang.Double) obj).doubleValue());
        }
        if (i6 >= 0) {
            aVar.x(i6, aVarA);
        } else {
            aVar.A(aVarA);
        }
    }

    private static void W(java.lang.StringBuilder sb, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            sb.append("  ");
        }
    }

    private final void X(java.lang.StringBuilder sb, int i6, com.google.android.gms.internal.measurement.L1 l6) {
        if (l6 == null) {
            return;
        }
        W(sb, i6);
        sb.append("filter {\n");
        if (l6.M()) {
            a0(sb, i6, "complement", java.lang.Boolean.valueOf(l6.L()));
        }
        if (l6.O()) {
            a0(sb, i6, "param_name", g().f(l6.K()));
        }
        if (l6.P()) {
            int i10 = i6 + 1;
            com.google.android.gms.internal.measurement.O1 o1J = l6.J();
            if (o1J != null) {
                W(sb, i10);
                sb.append("string_filter");
                sb.append(" {\n");
                if (o1J.N()) {
                    a0(sb, i10, "match_type", o1J.F().name());
                }
                if (o1J.M()) {
                    a0(sb, i10, "expression", o1J.I());
                }
                if (o1J.L()) {
                    a0(sb, i10, "case_sensitive", java.lang.Boolean.valueOf(o1J.K()));
                }
                if (o1J.k() > 0) {
                    W(sb, i6 + 2);
                    sb.append("expression_list {\n");
                    for (java.lang.String str : o1J.J()) {
                        W(sb, i6 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                W(sb, i10);
                sb.append("}\n");
            }
        }
        if (l6.N()) {
            Y(sb, i6 + 1, "number_filter", l6.I());
        }
        W(sb, i6);
        sb.append("}\n");
    }

    private static void Y(java.lang.StringBuilder sb, int i6, java.lang.String str, com.google.android.gms.internal.measurement.M1 m6) {
        if (m6 == null) {
            return;
        }
        W(sb, i6);
        sb.append(str);
        sb.append(" {\n");
        if (m6.M()) {
            a0(sb, i6, "comparison_type", m6.F().name());
        }
        if (m6.O()) {
            a0(sb, i6, "match_as_float", java.lang.Boolean.valueOf(m6.L()));
        }
        if (m6.N()) {
            a0(sb, i6, "comparison_value", m6.I());
        }
        if (m6.Q()) {
            a0(sb, i6, "min_comparison_value", m6.K());
        }
        if (m6.P()) {
            a0(sb, i6, "max_comparison_value", m6.J());
        }
        W(sb, i6);
        sb.append("}\n");
    }

    private static void Z(java.lang.StringBuilder sb, int i6, java.lang.String str, com.google.android.gms.internal.measurement.C6120s2 c6120s2) {
        if (c6120s2 == null) {
            return;
        }
        W(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c6120s2.H() != 0) {
            W(sb, 4);
            sb.append("results: ");
            int i10 = 0;
            for (java.lang.Long l6 : c6120s2.U()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l6);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (c6120s2.N() != 0) {
            W(sb, 4);
            sb.append("status: ");
            int i12 = 0;
            for (java.lang.Long l10 : c6120s2.W()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (c6120s2.k() != 0) {
            W(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.C6052k2 c6052k2 : c6120s2.T()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(c6052k2.L() ? java.lang.Integer.valueOf(c6052k2.k()) : null);
                sb.append(":");
                sb.append(c6052k2.K() ? java.lang.Long.valueOf(c6052k2.H()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (c6120s2.K() != 0) {
            W(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.C6128t2 c6128t2 : c6120s2.V()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(c6128t2.M() ? java.lang.Integer.valueOf(c6128t2.I()) : null);
                sb.append(": [");
                java.util.Iterator it = c6128t2.L().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((java.lang.Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        W(sb, 3);
        sb.append("}\n");
    }

    private static void a0(java.lang.StringBuilder sb, int i6, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        W(sb, i6 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void b0(java.lang.StringBuilder sb, int i6, java.util.List list) {
        if (list == null) {
            return;
        }
        int i10 = i6 + 1;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.C6079n2 c6079n2 = (com.google.android.gms.internal.measurement.C6079n2) it.next();
            if (c6079n2 != null) {
                W(sb, i10);
                sb.append("param {\n");
                a0(sb, i10, "name", c6079n2.b0() ? g().f(c6079n2.V()) : null);
                a0(sb, i10, "string_value", c6079n2.c0() ? c6079n2.W() : null);
                a0(sb, i10, "int_value", c6079n2.a0() ? java.lang.Long.valueOf(c6079n2.R()) : null);
                a0(sb, i10, "double_value", c6079n2.Y() ? java.lang.Double.valueOf(c6079n2.F()) : null);
                if (c6079n2.P() > 0) {
                    b0(sb, i10, c6079n2.X());
                }
                W(sb, i10);
                sb.append("}\n");
            }
        }
    }

    static boolean d0(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.l(e6);
        Q3.AbstractC1477p.l(m6);
        return (android.text.TextUtils.isEmpty(m6.f42032D) && android.text.TextUtils.isEmpty(m6.f42047S)) ? false : true;
    }

    static boolean e0(java.util.List list, int i6) {
        if (i6 < (list.size() << 6)) {
            return ((1 << (i6 % 64)) & ((java.lang.Long) list.get(i6 / 64)).longValue()) != 0;
        }
        return false;
    }

    static java.lang.Object f0(com.google.android.gms.internal.measurement.C6061l2 c6061l2, java.lang.String str) {
        com.google.android.gms.internal.measurement.C6079n2 c6079n2F = F(c6061l2, str);
        if (c6079n2F == null) {
            return null;
        }
        if (c6079n2F.c0()) {
            return c6079n2F.W();
        }
        if (c6079n2F.a0()) {
            return java.lang.Long.valueOf(c6079n2F.R());
        }
        if (c6079n2F.Y()) {
            return java.lang.Double.valueOf(c6079n2F.F());
        }
        if (c6079n2F.P() > 0) {
            return i0(c6079n2F.X());
        }
        return null;
    }

    static boolean g0(java.lang.String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static android.os.Bundle[] i0(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.C6079n2 c6079n2 = (com.google.android.gms.internal.measurement.C6079n2) it.next();
            if (c6079n2 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.C6079n2 c6079n3 : c6079n2.X()) {
                    if (c6079n3.c0()) {
                        bundle.putString(c6079n3.V(), c6079n3.W());
                    } else if (c6079n3.a0()) {
                        bundle.putLong(c6079n3.V(), c6079n3.R());
                    } else if (c6079n3.Y()) {
                        bundle.putDouble(c6079n3.V(), c6079n3.F());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (android.os.Bundle[]) arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    static int y(com.google.android.gms.internal.measurement.C6105q2.a aVar, java.lang.String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i6 = 0; i6 < aVar.f0(); i6++) {
            if (str.equals(aVar.O0(i6).T())) {
                return i6;
            }
        }
        return -1;
    }

    final long A(byte[] bArr) {
        Q3.AbstractC1477p.l(bArr);
        i().n();
        java.security.MessageDigest messageDigestV0 = com.google.android.gms.measurement.internal.d6.V0();
        if (messageDigestV0 != null) {
            return com.google.android.gms.measurement.internal.d6.B(messageDigestV0.digest(bArr));
        }
        j().G().a("Failed to get MD5");
        return 0L;
    }

    final android.os.Parcelable D(byte[] bArr, android.os.Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (android.os.Parcelable) creator.createFromParcel(parcelObtain);
        } catch (R3.b.a unused) {
            j().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final com.google.android.gms.internal.measurement.C6061l2 E(com.google.android.gms.measurement.internal.B b6) {
        com.google.android.gms.internal.measurement.C6061l2.a aVarZ = com.google.android.gms.internal.measurement.C6061l2.R().z(b6.f41726e);
        for (java.lang.String str : b6.f41727f) {
            com.google.android.gms.internal.measurement.C6079n2.a aVarA = com.google.android.gms.internal.measurement.C6079n2.T().A(str);
            java.lang.Object objD = b6.f41727f.D(str);
            Q3.AbstractC1477p.l(objD);
            U(aVarA, objD);
            aVarZ.A(aVarA);
        }
        if (d().t(com.google.android.gms.measurement.internal.G.f41891j1) && !android.text.TextUtils.isEmpty(b6.f41724c) && b6.f41727f.D("_o") == null) {
            aVarZ.B((com.google.android.gms.internal.measurement.C6079n2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) com.google.android.gms.internal.measurement.C6079n2.T().A("_o").C(b6.f41724c).q()));
        }
        return (com.google.android.gms.internal.measurement.C6061l2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarZ.q());
    }

    final com.google.android.gms.measurement.internal.E H(com.google.android.gms.internal.measurement.C5995e c5995e) {
        java.lang.Object obj;
        android.os.Bundle bundleC = C(c5995e.g(), true);
        java.lang.String string = (!bundleC.containsKey("_o") || (obj = bundleC.get("_o")) == null) ? "app" : obj.toString();
        java.lang.String strB = p085i4.q.b(c5995e.e());
        if (strB == null) {
            strB = c5995e.e();
        }
        return new com.google.android.gms.measurement.internal.E(strB, new com.google.android.gms.measurement.internal.D(bundleC), string, c5995e.a());
    }

    final com.google.android.gms.measurement.internal.B5 I(java.lang.String str, com.google.android.gms.internal.measurement.C6105q2.a aVar, com.google.android.gms.internal.measurement.C6061l2.a aVar2, java.lang.String str2) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        int iIndexOf;
        if (!com.google.android.gms.internal.measurement.C6066l7.a() || !d().F(str, com.google.android.gms.measurement.internal.G.f41827I0)) {
            return null;
        }
        long jA = b().a();
        java.lang.String[] strArrSplit = d().D(str, com.google.android.gms.measurement.internal.G.f41884h0).split(",");
        java.util.HashSet hashSet = new java.util.HashSet(strArrSplit.length);
        for (java.lang.String str3 : strArrSplit) {
            j$.util.Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new java.lang.IllegalArgumentException("duplicate element: " + ((java.lang.Object) str3));
            }
        }
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(hashSet);
        com.google.android.gms.measurement.internal.G5 g5T = t();
        java.lang.String strR = g5T.r().R(str);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(g5T.d().D(str, com.google.android.gms.measurement.internal.G.f41863a0));
        builder.authority(android.text.TextUtils.isEmpty(strR) ? g5T.d().D(str, com.google.android.gms.measurement.internal.G.f41866b0) : strR + "." + g5T.d().D(str, com.google.android.gms.measurement.internal.G.f41866b0));
        builder.path(g5T.d().D(str, com.google.android.gms.measurement.internal.G.f41869c0));
        R(builder, "gmp_app_id", aVar.k1(), setUnmodifiableSet);
        R(builder, "gmp_version", "106000", setUnmodifiableSet);
        java.lang.String strH1 = aVar.h1();
        com.google.android.gms.measurement.internal.C6376g c6376gD = d();
        com.google.android.gms.measurement.internal.C6344b2 c6344b2 = com.google.android.gms.measurement.internal.G.f41833L0;
        if (c6376gD.F(str, c6344b2) && r().a0(str)) {
            strH1 = "";
        }
        R(builder, "app_instance_id", strH1, setUnmodifiableSet);
        R(builder, "rdid", aVar.m1(), setUnmodifiableSet);
        R(builder, "bundle_id", aVar.g1(), setUnmodifiableSet);
        java.lang.String strK = aVar2.K();
        java.lang.String strA = p085i4.q.a(strK);
        if (!android.text.TextUtils.isEmpty(strA)) {
            strK = strA;
        }
        R(builder, "app_event_name", strK, setUnmodifiableSet);
        R(builder, "app_version", java.lang.String.valueOf(aVar.S()), setUnmodifiableSet);
        java.lang.String strL1 = aVar.l1();
        if (d().F(str, c6344b2) && r().e0(str) && !android.text.TextUtils.isEmpty(strL1) && (iIndexOf = strL1.indexOf(".")) != -1) {
            strL1 = strL1.substring(0, iIndexOf);
        }
        R(builder, "os_version", strL1, setUnmodifiableSet);
        R(builder, "timestamp", java.lang.String.valueOf(aVar2.I()), setUnmodifiableSet);
        if (aVar.P()) {
            R(builder, "lat", "1", setUnmodifiableSet);
        }
        R(builder, "privacy_sandbox_version", java.lang.String.valueOf(aVar.v()), setUnmodifiableSet);
        R(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        R(builder, "trigger_uri_timestamp", java.lang.String.valueOf(jA), setUnmodifiableSet);
        R(builder, "request_uuid", str2, setUnmodifiableSet);
        java.util.List<com.google.android.gms.internal.measurement.C6079n2> listL = aVar2.L();
        android.os.Bundle bundle = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.C6079n2 c6079n2 : listL) {
            java.lang.String strV = c6079n2.V();
            if (c6079n2.Y()) {
                strValueOf2 = java.lang.String.valueOf(c6079n2.F());
            } else if (c6079n2.Z()) {
                strValueOf2 = java.lang.String.valueOf(c6079n2.M());
            } else if (c6079n2.c0()) {
                strValueOf2 = c6079n2.W();
            } else if (c6079n2.a0()) {
                strValueOf2 = java.lang.String.valueOf(c6079n2.R());
            }
            bundle.putString(strV, strValueOf2);
        }
        S(builder, d().D(str, com.google.android.gms.measurement.internal.G.f41881g0).split("\\|"), bundle, setUnmodifiableSet);
        java.util.List<com.google.android.gms.internal.measurement.C6136u2> listM = aVar.M();
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.C6136u2 c6136u2 : listM) {
            java.lang.String strT = c6136u2.T();
            if (c6136u2.V()) {
                strValueOf = java.lang.String.valueOf(c6136u2.F());
            } else if (c6136u2.W()) {
                strValueOf = java.lang.String.valueOf(c6136u2.K());
            } else if (c6136u2.Z()) {
                strValueOf = c6136u2.U();
            } else if (c6136u2.X()) {
                strValueOf = java.lang.String.valueOf(c6136u2.O());
            }
            bundle2.putString(strT, strValueOf);
        }
        S(builder, d().D(str, com.google.android.gms.measurement.internal.G.f41878f0).split("\\|"), bundle2, setUnmodifiableSet);
        R(builder, "dma", aVar.O() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.j1().isEmpty()) {
            R(builder, "dma_cps", aVar.j1(), setUnmodifiableSet);
        }
        if (d().t(com.google.android.gms.measurement.internal.G.f41837N0) && aVar.Q()) {
            com.google.android.gms.internal.measurement.C6016g2 c6016g2V0 = aVar.v0();
            if (!c6016g2V0.a0().isEmpty()) {
                R(builder, "dl_gclid", c6016g2V0.a0(), setUnmodifiableSet);
            }
            if (!c6016g2V0.Z().isEmpty()) {
                R(builder, "dl_gbraid", c6016g2V0.Z(), setUnmodifiableSet);
            }
            if (!c6016g2V0.W().isEmpty()) {
                R(builder, "dl_gs", c6016g2V0.W(), setUnmodifiableSet);
            }
            if (c6016g2V0.F() > 0) {
                R(builder, "dl_ss_ts", java.lang.String.valueOf(c6016g2V0.F()), setUnmodifiableSet);
            }
            if (!c6016g2V0.d0().isEmpty()) {
                R(builder, "mr_gclid", c6016g2V0.d0(), setUnmodifiableSet);
            }
            if (!c6016g2V0.c0().isEmpty()) {
                R(builder, "mr_gbraid", c6016g2V0.c0(), setUnmodifiableSet);
            }
            if (!c6016g2V0.b0().isEmpty()) {
                R(builder, "mr_gs", c6016g2V0.b0(), setUnmodifiableSet);
            }
            if (c6016g2V0.J() > 0) {
                R(builder, "mr_click_ts", java.lang.String.valueOf(c6016g2V0.J()), setUnmodifiableSet);
            }
        }
        return new com.google.android.gms.measurement.internal.B5(builder.build().toString(), jA, 1);
    }

    final java.lang.String K(com.google.android.gms.internal.measurement.K1 k6) {
        if (k6 == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nevent_filter {\n");
        if (k6.S()) {
            a0(sb, 0, "filter_id", java.lang.Integer.valueOf(k6.I()));
        }
        a0(sb, 0, "event_name", g().c(k6.M()));
        java.lang.String strN = N(k6.O(), k6.P(), k6.Q());
        if (!strN.isEmpty()) {
            a0(sb, 0, "filter_type", strN);
        }
        if (k6.R()) {
            Y(sb, 1, "event_count_filter", k6.L());
        }
        if (k6.k() > 0) {
            sb.append("  filters {\n");
            java.util.Iterator it = k6.N().iterator();
            while (it.hasNext()) {
                X(sb, 2, (com.google.android.gms.internal.measurement.L1) it.next());
            }
        }
        W(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final java.lang.String L(com.google.android.gms.internal.measurement.N1 n6) {
        if (n6 == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (n6.N()) {
            a0(sb, 0, "filter_id", java.lang.Integer.valueOf(n6.k()));
        }
        a0(sb, 0, "property_name", g().g(n6.J()));
        java.lang.String strN = N(n6.K(), n6.L(), n6.M());
        if (!strN.isEmpty()) {
            a0(sb, 0, "filter_type", strN);
        }
        X(sb, 1, n6.G());
        sb.append("}\n");
        return sb.toString();
    }

    final java.lang.String M(com.google.android.gms.internal.measurement.C6097p2 c6097p2) {
        com.google.android.gms.internal.measurement.C6034i2 c6034i2T2;
        if (c6097p2 == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nbatch {\n");
        if (com.google.android.gms.internal.measurement.s7.a() && d().t(com.google.android.gms.measurement.internal.G.f41924y0) && c6097p2.k() > 0) {
            i();
            if (com.google.android.gms.measurement.internal.d6.H0(c6097p2.G(0).x2())) {
                if (c6097p2.S()) {
                    a0(sb, 0, "upload_subdomain", c6097p2.P());
                }
                if (c6097p2.R()) {
                    a0(sb, 0, "sgtm_join_id", c6097p2.O());
                }
            }
        }
        for (com.google.android.gms.internal.measurement.C6105q2 c6105q2 : c6097p2.Q()) {
            if (c6105q2 != null) {
                W(sb, 1);
                sb.append("bundle {\n");
                if (c6105q2.R0()) {
                    a0(sb, 1, "protocol_version", java.lang.Integer.valueOf(c6105q2.w1()));
                }
                if (com.google.android.gms.internal.measurement.C6075m7.a() && d().F(c6105q2.x2(), com.google.android.gms.measurement.internal.G.f41922x0) && c6105q2.U0()) {
                    a0(sb, 1, "session_stitching_token", c6105q2.i0());
                }
                a0(sb, 1, "platform", c6105q2.g0());
                if (c6105q2.M0()) {
                    a0(sb, 1, "gmp_version", java.lang.Long.valueOf(c6105q2.f2()));
                }
                if (c6105q2.Z0()) {
                    a0(sb, 1, "uploading_gmp_version", java.lang.Long.valueOf(c6105q2.r2()));
                }
                if (c6105q2.K0()) {
                    a0(sb, 1, "dynamite_version", java.lang.Long.valueOf(c6105q2.Y1()));
                }
                if (c6105q2.D0()) {
                    a0(sb, 1, "config_version", java.lang.Long.valueOf(c6105q2.Q1()));
                }
                a0(sb, 1, "gmp_app_id", c6105q2.c0());
                a0(sb, 1, "admob_app_id", c6105q2.w2());
                a0(sb, 1, "app_id", c6105q2.x2());
                a0(sb, 1, "app_version", c6105q2.V());
                if (c6105q2.s0()) {
                    a0(sb, 1, "app_version_major", java.lang.Integer.valueOf(c6105q2.u0()));
                }
                a0(sb, 1, "firebase_instance_id", c6105q2.b0());
                if (c6105q2.I0()) {
                    a0(sb, 1, "dev_cert_hash", java.lang.Long.valueOf(c6105q2.U1()));
                }
                a0(sb, 1, "app_store", c6105q2.U());
                if (c6105q2.Y0()) {
                    a0(sb, 1, "upload_timestamp_millis", java.lang.Long.valueOf(c6105q2.p2()));
                }
                if (c6105q2.V0()) {
                    a0(sb, 1, "start_timestamp_millis", java.lang.Long.valueOf(c6105q2.l2()));
                }
                if (c6105q2.L0()) {
                    a0(sb, 1, "end_timestamp_millis", java.lang.Long.valueOf(c6105q2.c2()));
                }
                if (c6105q2.Q0()) {
                    a0(sb, 1, "previous_bundle_start_timestamp_millis", java.lang.Long.valueOf(c6105q2.j2()));
                }
                if (c6105q2.P0()) {
                    a0(sb, 1, "previous_bundle_end_timestamp_millis", java.lang.Long.valueOf(c6105q2.h2()));
                }
                a0(sb, 1, "app_instance_id", c6105q2.T());
                a0(sb, 1, "resettable_device_id", c6105q2.h0());
                a0(sb, 1, "ds_id", c6105q2.a0());
                if (c6105q2.O0()) {
                    a0(sb, 1, "limited_ad_tracking", java.lang.Boolean.valueOf(c6105q2.p0()));
                }
                a0(sb, 1, "os_version", c6105q2.f0());
                a0(sb, 1, "device_model", c6105q2.Z());
                a0(sb, 1, "user_default_language", c6105q2.j0());
                if (c6105q2.X0()) {
                    a0(sb, 1, "time_zone_offset_minutes", java.lang.Integer.valueOf(c6105q2.G1()));
                }
                if (c6105q2.C0()) {
                    a0(sb, 1, "bundle_sequential_index", java.lang.Integer.valueOf(c6105q2.a1()));
                }
                if (com.google.android.gms.internal.measurement.s7.a()) {
                    i();
                    if (com.google.android.gms.measurement.internal.d6.H0(c6105q2.x2()) && d().t(com.google.android.gms.measurement.internal.G.f41924y0) && c6105q2.H0()) {
                        a0(sb, 1, "delivery_index", java.lang.Integer.valueOf(c6105q2.j1()));
                    }
                }
                if (c6105q2.T0()) {
                    a0(sb, 1, "service_upload", java.lang.Boolean.valueOf(c6105q2.q0()));
                }
                a0(sb, 1, "health_monitor", c6105q2.d0());
                if (c6105q2.S0()) {
                    a0(sb, 1, "retry_counter", java.lang.Integer.valueOf(c6105q2.B1()));
                }
                if (c6105q2.F0()) {
                    a0(sb, 1, "consent_signals", c6105q2.X());
                }
                if (c6105q2.N0()) {
                    a0(sb, 1, "is_dma_region", java.lang.Boolean.valueOf(c6105q2.o0()));
                }
                if (c6105q2.G0()) {
                    a0(sb, 1, "core_platform_services", c6105q2.Y());
                }
                if (c6105q2.E0()) {
                    a0(sb, 1, "consent_diagnostics", c6105q2.W());
                }
                if (c6105q2.W0()) {
                    a0(sb, 1, "target_os_version", java.lang.Long.valueOf(c6105q2.n2()));
                }
                if (com.google.android.gms.internal.measurement.C6066l7.a() && d().F(c6105q2.x2(), com.google.android.gms.measurement.internal.G.f41827I0)) {
                    a0(sb, 1, "ad_services_version", java.lang.Integer.valueOf(c6105q2.k()));
                    if (c6105q2.t0() && (c6034i2T2 = c6105q2.t2()) != null) {
                        W(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        a0(sb, 2, "eligible", java.lang.Boolean.valueOf(c6034i2T2.Q()));
                        a0(sb, 2, "no_access_adservices_attribution_permission", java.lang.Boolean.valueOf(c6034i2T2.T()));
                        a0(sb, 2, "pre_r", java.lang.Boolean.valueOf(c6034i2T2.U()));
                        a0(sb, 2, "r_extensions_too_old", java.lang.Boolean.valueOf(c6034i2T2.V()));
                        a0(sb, 2, "adservices_extension_too_old", java.lang.Boolean.valueOf(c6034i2T2.O()));
                        a0(sb, 2, "ad_storage_not_allowed", java.lang.Boolean.valueOf(c6034i2T2.M()));
                        a0(sb, 2, "measurement_manager_disabled", java.lang.Boolean.valueOf(c6034i2T2.S()));
                        W(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (com.google.android.gms.internal.measurement.S6.a() && d().t(com.google.android.gms.measurement.internal.G.f41853V0) && c6105q2.r0()) {
                    com.google.android.gms.internal.measurement.C6016g2 c6016g2S2 = c6105q2.s2();
                    W(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (c6016g2S2.h0()) {
                        a0(sb, 2, "deep_link_gclid", c6016g2S2.a0());
                    }
                    if (c6016g2S2.g0()) {
                        a0(sb, 2, "deep_link_gbraid", c6016g2S2.Z());
                    }
                    if (c6016g2S2.f0()) {
                        a0(sb, 2, "deep_link_gad_source", c6016g2S2.W());
                    }
                    if (c6016g2S2.i0()) {
                        a0(sb, 2, "deep_link_session_millis", java.lang.Long.valueOf(c6016g2S2.F()));
                    }
                    if (c6016g2S2.m0()) {
                        a0(sb, 2, "market_referrer_gclid", c6016g2S2.d0());
                    }
                    if (c6016g2S2.l0()) {
                        a0(sb, 2, "market_referrer_gbraid", c6016g2S2.c0());
                    }
                    if (c6016g2S2.k0()) {
                        a0(sb, 2, "market_referrer_gad_source", c6016g2S2.b0());
                    }
                    if (c6016g2S2.j0()) {
                        a0(sb, 2, "market_referrer_click_millis", java.lang.Long.valueOf(c6016g2S2.J()));
                    }
                    W(sb, 2);
                    sb.append("}\n");
                }
                java.util.List<com.google.android.gms.internal.measurement.C6136u2> listM0 = c6105q2.m0();
                if (listM0 != null) {
                    for (com.google.android.gms.internal.measurement.C6136u2 c6136u2 : listM0) {
                        if (c6136u2 != null) {
                            W(sb, 2);
                            sb.append("user_property {\n");
                            a0(sb, 2, "set_timestamp_millis", c6136u2.Y() ? java.lang.Long.valueOf(c6136u2.Q()) : null);
                            a0(sb, 2, "name", g().g(c6136u2.T()));
                            a0(sb, 2, "string_value", c6136u2.U());
                            a0(sb, 2, "int_value", c6136u2.X() ? java.lang.Long.valueOf(c6136u2.O()) : null);
                            a0(sb, 2, "double_value", c6136u2.V() ? java.lang.Double.valueOf(c6136u2.F()) : null);
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.C6043j2> listK0 = c6105q2.k0();
                c6105q2.x2();
                if (listK0 != null) {
                    for (com.google.android.gms.internal.measurement.C6043j2 c6043j2 : listK0) {
                        if (c6043j2 != null) {
                            W(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c6043j2.O()) {
                                a0(sb, 2, "audience_id", java.lang.Integer.valueOf(c6043j2.k()));
                            }
                            if (c6043j2.P()) {
                                a0(sb, 2, "new_audience", java.lang.Boolean.valueOf(c6043j2.N()));
                            }
                            Z(sb, 2, "current_data", c6043j2.L());
                            if (c6043j2.Q()) {
                                Z(sb, 2, "previous_data", c6043j2.M());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.C6061l2> listL0 = c6105q2.l0();
                if (listL0 != null) {
                    for (com.google.android.gms.internal.measurement.C6061l2 c6061l2 : listL0) {
                        if (c6061l2 != null) {
                            W(sb, 2);
                            sb.append("event {\n");
                            a0(sb, 2, "name", g().c(c6061l2.T()));
                            if (c6061l2.X()) {
                                a0(sb, 2, "timestamp_millis", java.lang.Long.valueOf(c6061l2.Q()));
                            }
                            if (c6061l2.W()) {
                                a0(sb, 2, "previous_timestamp_millis", java.lang.Long.valueOf(c6061l2.P()));
                            }
                            if (c6061l2.V()) {
                                a0(sb, 2, "count", java.lang.Integer.valueOf(c6061l2.k()));
                            }
                            if (c6061l2.N() != 0) {
                                b0(sb, 2, c6061l2.U());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                W(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final java.util.List P(java.util.List list, java.util.List list2) {
        int i6;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num.intValue() < 0) {
                j().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    j().L().c("Ignoring bit index greater than bitSet size", num, java.lang.Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, java.lang.Long.valueOf(((java.lang.Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i6 = size;
            size = i10;
            if (size < 0 || ((java.lang.Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i6);
    }

    final java.util.Map Q(android.os.Bundle bundle, boolean z6) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            boolean z10 = obj instanceof android.os.Parcelable[];
            if (z10 || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle)) {
                if (z6) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (z10) {
                        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                            if (parcelable instanceof android.os.Bundle) {
                                arrayList.add(Q((android.os.Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            java.lang.Object obj2 = arrayList2.get(i6);
                            i6++;
                            if (obj2 instanceof android.os.Bundle) {
                                arrayList.add(Q((android.os.Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof android.os.Bundle) {
                        arrayList.add(Q((android.os.Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void U(com.google.android.gms.internal.measurement.C6079n2.a aVar, java.lang.Object obj) {
        Q3.AbstractC1477p.l(obj);
        aVar.G().E().B().F();
        if (obj instanceof java.lang.String) {
            aVar.C((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            aVar.x(((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            aVar.w(((java.lang.Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof android.os.Bundle[])) {
            j().G().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Bundle bundle : (android.os.Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.C6079n2.a aVarT = com.google.android.gms.internal.measurement.C6079n2.T();
                for (java.lang.String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.C6079n2.a aVarA = com.google.android.gms.internal.measurement.C6079n2.T().A(str);
                    java.lang.Object obj2 = bundle.get(str);
                    if (obj2 instanceof java.lang.Long) {
                        aVarA.x(((java.lang.Long) obj2).longValue());
                    } else if (obj2 instanceof java.lang.String) {
                        aVarA.C((java.lang.String) obj2);
                    } else if (obj2 instanceof java.lang.Double) {
                        aVarA.w(((java.lang.Double) obj2).doubleValue());
                    }
                    aVarT.y(aVarA);
                }
                if (aVarT.v() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.C6079n2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarT.q()));
                }
            }
        }
        aVar.z(arrayList);
    }

    final void V(com.google.android.gms.internal.measurement.C6136u2.a aVar, java.lang.Object obj) {
        Q3.AbstractC1477p.l(obj);
        aVar.C().z().v();
        if (obj instanceof java.lang.String) {
            aVar.B((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            aVar.x(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Double) {
            aVar.w(((java.lang.Double) obj).doubleValue());
        } else {
            j().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    final boolean c0(long j6, long j10) {
        return j6 == 0 || j10 <= 0 || java.lang.Math.abs(b().a() - j6) > j10;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    final byte[] h0(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e6) {
            j().G().b("Failed to gzip content", e6);
            throw e6;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    final byte[] j0(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i6 = gZIPInputStream.read(bArr2);
                if (i6 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i6);
            }
        } catch (java.io.IOException e6) {
            j().G().b("Failed to ungzip content", e6);
            throw e6;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    final java.util.List k0() {
        java.util.Map mapE = com.google.android.gms.measurement.internal.G.e(this.f41809b.a());
        if (mapE == null || mapE.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iIntValue = ((java.lang.Integer) com.google.android.gms.measurement.internal.G.f41846S.a(null)).intValue();
        for (java.util.Map.Entry entry : mapE.entrySet()) {
            if (((java.lang.String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i6 = java.lang.Integer.parseInt((java.lang.String) entry.getValue());
                    if (i6 != 0) {
                        arrayList.add(java.lang.Integer.valueOf(i6));
                        if (arrayList.size() >= iIntValue) {
                            j().L().b("Too many experiment IDs. Number of IDs", java.lang.Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (java.lang.NumberFormatException e6) {
                    j().L().b("Experiment ID NumberFormatException", e6);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.Z5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.h6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6404k q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.I2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6403j5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.G5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    final long z(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(java.nio.charset.Charset.forName("UTF-8")));
    }
}
