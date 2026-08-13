package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C9.N.a f1402c = new C9.N.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1403d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9.N.b f1404a = new C9.N.b(0, null, 0, 0, null, null, null, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.LinkedHashMap f1405b = new java.util.LinkedHashMap();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.StringBuilder d(java.util.LinkedHashMap linkedHashMap, int i6, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(sb, "segment");
            int i10 = i6 - 1;
            for (int i11 = i6; i11 < i10; i11++) {
                java.lang.StringBuilder sb2 = (java.lang.StringBuilder) linkedHashMap.get(java.lang.Integer.valueOf(i11));
                if (sb2 != null) {
                    sb2.append((java.lang.CharSequence) sb);
                }
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
            java.lang.Object obj = linkedHashMap.get(numValueOf);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                if (i6 > 0) {
                    java.lang.StringBuilder sb4 = (java.lang.StringBuilder) linkedHashMap.get(java.lang.Integer.valueOf(i10));
                    if (!p247y7.AbstractC7350t.b(java.lang.String.valueOf(sb4), "/")) {
                        sb3.append((java.lang.CharSequence) sb4);
                    }
                }
                linkedHashMap.put(numValueOf, sb3);
                obj2 = sb3;
            }
            java.lang.StringBuilder sb5 = (java.lang.StringBuilder) obj2;
            sb5.append((java.lang.CharSequence) sb);
            return sb5;
        }

        public static /* synthetic */ java.util.List f(C9.N.a aVar, java.lang.String str, p237x7.p pVar, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                pVar = new p237x7.p() { // from class: C9.M
                    @Override // p237x7.p
                    public final java.lang.Object u(java.lang.Object obj2, java.lang.Object obj3) {
                        return C9.N.a.g((java.lang.String) obj2, (java.lang.String) obj3);
                    }
                };
            }
            return aVar.e(str, pVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M g(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "<unused var>");
            return p087i7.M.f46721a;
        }

        public final java.util.List c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "pattern");
            if (str.length() == 0 || p247y7.AbstractC7350t.b(str, "/")) {
                return p097j7.AbstractC6879v.e("/");
            }
            int length = str.length();
            final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            p237x7.p pVar = new p237x7.p() { // from class: C9.L
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return C9.N.a.d(linkedHashMap, ((java.lang.Integer) obj).intValue(), (java.lang.StringBuilder) obj2);
                }
            };
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i6 = 0;
            int i10 = 0;
            boolean z6 = false;
            while (i6 < length) {
                char cCharAt = str.charAt(i6);
                if (cCharAt != '/') {
                    if (cCharAt == '{') {
                        sb.append(cCharAt);
                        i6++;
                        int i11 = 1;
                        while (i6 < length) {
                            int i12 = i6 + 1;
                            char cCharAt2 = str.charAt(i6);
                            sb.append(cCharAt2);
                            if (cCharAt2 == '{') {
                                i11++;
                            } else if (cCharAt2 == '}' && (i11 = i11 - 1) == 0) {
                                i6 = i12;
                                break;
                            }
                            i6 = i12;
                        }
                        if (i6 >= length || str.charAt(i6) != '?') {
                            z6 = false;
                        } else {
                            i6++;
                            if (linkedHashMap.isEmpty()) {
                                linkedHashMap.put(0, new java.lang.StringBuilder("/"));
                            }
                            i10++;
                            z6 = true;
                        }
                        sb.setLength(0);
                    }
                } else if (sb.length() > 0) {
                    pVar.u(java.lang.Integer.valueOf(i10), sb);
                    sb.setLength(0);
                }
                sb.append(cCharAt);
                i6++;
            }
            if (linkedHashMap.isEmpty()) {
                return p097j7.AbstractC6879v.e(str);
            }
            if (sb.length() > 0) {
                pVar.u(java.lang.Integer.valueOf(i10), sb);
                if (z6) {
                    linkedHashMap.put(java.lang.Integer.valueOf(i10 + 1), sb);
                }
            }
            java.util.Collection collectionValues = linkedHashMap.values();
            p247y7.AbstractC7350t.e(collectionValues, "<get-values>(...)");
            java.util.Collection collection = collectionValues;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((java.lang.StringBuilder) it.next()).toString());
            }
            return arrayList;
        }

        public final java.util.List e(java.lang.String str, p237x7.p pVar) {
            java.lang.String strSubstring;
            java.lang.String strSubstring2;
            p247y7.AbstractC7350t.f(str, "pattern");
            p247y7.AbstractC7350t.f(pVar, "onItem");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = str.length();
            int i6 = 0;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i6 < length) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == '*') {
                    if (i6 == length - 1) {
                        strSubstring = "*";
                    } else {
                        strSubstring = str.substring(i6 + 1);
                        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                    }
                    pVar.u(strSubstring, "\\.*");
                    arrayList.add(strSubstring);
                    i6 = length;
                } else if (cCharAt == ':') {
                    i11 = i6;
                } else if (cCharAt == '{') {
                    if (i12 == 0) {
                        i10 = i6 + 1;
                        i11 = Integer.MAX_VALUE;
                    }
                    i12++;
                } else if (cCharAt == '}' && (i12 = i12 - 1) == 0) {
                    java.lang.String strSubstring3 = str.substring(i10, java.lang.Math.min(i6, i11));
                    p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                    if (i11 == Integer.MAX_VALUE) {
                        strSubstring2 = null;
                    } else {
                        strSubstring2 = str.substring(i11 + 1, i6);
                        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                    }
                    pVar.u(strSubstring3, strSubstring2);
                    arrayList.add(strSubstring3);
                    i10 = -1;
                    i11 = Integer.MAX_VALUE;
                }
                i6++;
            }
            return arrayList;
        }
    }

    private static final class b implements java.lang.Comparable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f1406C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.String f1407D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private char f1408E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private char f1409F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private S8.o f1410G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private java.lang.String f1411H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private D9.c f1412I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private java.util.LinkedHashMap f1413J;

        public b(int i6, java.lang.String str, char c6, char c10, S8.o oVar, java.lang.String str2, D9.c cVar) {
            p247y7.AbstractC7350t.f(str, "prefix");
            this.f1406C = i6;
            this.f1407D = str;
            this.f1408E = c6;
            this.f1409F = c10;
            this.f1410G = oVar;
            this.f1411H = str2;
            this.f1412I = cVar;
            this.f1413J = new java.util.LinkedHashMap();
        }

        public /* synthetic */ b(int i6, java.lang.String str, char c6, char c10, S8.o oVar, java.lang.String str2, D9.c cVar, int i10, p247y7.AbstractC7342k abstractC7342k) {
            this((i10 & 1) != 0 ? 0 : i6, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? (char) 0 : c6, (i10 & 8) == 0 ? c10 : (char) 0, (i10 & 16) != 0 ? null : oVar, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : cVar);
        }

        private final C9.N.b[] g(C9.N.b[] bVarArr, C9.N.b bVar) {
            if (bVarArr == null) {
                return new C9.N.b[]{bVar};
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(bVarArr, bVarArr.length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            return (C9.N.b[]) p097j7.AbstractC6872n.G((C9.N.b[]) objArrCopyOf, bVar);
        }

        private final java.lang.String o(java.lang.String str) {
            if (!S8.r.V(str, "{", false, 2, null) && !S8.r.J(str, "}", false, 2, null)) {
                return null;
            }
            int iP0 = S8.r.p0(str, "{", 0, false, 6, null);
            int iP1 = S8.r.p0(str, "}", 0, false, 6, null);
            int iP2 = S8.r.p0(str, ":", 0, false, 6, null);
            if (iP2 == -1) {
                iP2 = str.length();
            }
            java.lang.String strSubstring = str.substring(java.lang.Math.min(iP0 + 1, str.length() - 1), java.lang.Math.min(iP1, iP2));
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return strSubstring;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
        public final C9.N.b e(C9.N.b bVar, java.lang.String str) {
            C9.N.b bVarE;
            p247y7.AbstractC7350t.f(bVar, "child");
            p247y7.AbstractC7350t.f(str, "search");
            C9.N.c cVarV = v(str);
            int iB = cVarV.b();
            int iD = cVarV.d();
            int iA = cVarV.a();
            if (iB == 0) {
                bVarE = bVar;
            } else {
                if (iB == 1) {
                    bVar.f1407D = cVarV.c();
                    bVar.f1410G = new S8.o(cVarV.c());
                }
                if (iD == 0) {
                    bVar.f1406C = iB;
                    if (iB == 3) {
                        iA = -1;
                    }
                    if (iA < 0) {
                        iA = str.length();
                    }
                    bVar.f1409F = cVarV.e();
                    bVar.f1411H = o(str);
                    if (iA != str.length()) {
                        java.lang.String strSubstring = str.substring(iA);
                        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                        bVarE = bVar.e(new C9.N.b(0, strSubstring, strSubstring.charAt(0), (char) 0, null, null, null, 120, null), strSubstring);
                    } else {
                        bVarE = bVar;
                    }
                } else if (iD > 0) {
                    bVar.f1406C = 0;
                    java.lang.String strSubstring2 = str.substring(0, iD);
                    p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                    bVar.f1407D = strSubstring2;
                    bVar.f1410G = null;
                    java.lang.String strSubstring3 = str.substring(iD);
                    p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                    bVarE = bVar.e(new C9.N.b(iB, null, strSubstring3.charAt(0), cVarV.e(), null, o(strSubstring3), null, 82, null), strSubstring3);
                } else {
                    bVarE = bVar;
                }
            }
            java.util.LinkedHashMap linkedHashMap = this.f1413J;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(bVar.f1406C);
            C9.N.b[] bVarArrG = g((C9.N.b[]) this.f1413J.get(java.lang.Integer.valueOf(bVar.f1406C)), bVar);
            x(bVarArrG);
            linkedHashMap.put(numValueOf, bVarArrG);
            return bVarE;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9.N.b)) {
                return false;
            }
            C9.N.b bVar = (C9.N.b) obj;
            return this.f1406C == bVar.f1406C && p247y7.AbstractC7350t.b(this.f1407D, bVar.f1407D) && this.f1408E == bVar.f1408E && this.f1409F == bVar.f1409F && p247y7.AbstractC7350t.b(this.f1410G, bVar.f1410G) && p247y7.AbstractC7350t.b(this.f1411H, bVar.f1411H) && p247y7.AbstractC7350t.b(this.f1412I, bVar.f1412I);
        }

        public int hashCode() {
            int iHashCode = ((((((this.f1406C * 31) + this.f1407D.hashCode()) * 31) + this.f1408E) * 31) + this.f1409F) * 31;
            S8.o oVar = this.f1410G;
            int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
            java.lang.String str = this.f1411H;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            D9.c cVar = this.f1412I;
            return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final void i(D9.c cVar) {
            this.f1412I = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int compareTo(C9.N.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "other");
            return this.f1408E - bVar.f1408E;
        }

        public final C9.N.b n(C9.N.b[] bVarArr, char c6) {
            p247y7.AbstractC7350t.f(bVarArr, "ns");
            int length = bVarArr.length;
            int i6 = length - 1;
            int i10 = 0;
            int i11 = 0;
            while (i10 <= i6) {
                i11 = ((i6 - i10) / 2) + i10;
                if (p247y7.AbstractC7350t.g(c6, bVarArr[i11].f1408E) > 0) {
                    i10 = i11 + 1;
                } else if (p247y7.AbstractC7350t.g(c6, bVarArr[i11].f1408E) < 0) {
                    i6 = i11 - 1;
                } else {
                    i10 = length;
                }
            }
            C9.N.b bVar = bVarArr[i11];
            if (bVar.f1408E != c6) {
                return null;
            }
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x009a  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:68:0x010f  */
        /* JADX WARN: Code duplicated, block: B:79:0x012a  */
        /* JADX WARN: Code duplicated, block: B:81:0x012e  */
        /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0129 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0131 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0131 A[SYNTHETIC] */
        public final D9.c q(C9.J j6, java.lang.String str) {
            C9.N.b bVarN;
            java.lang.String strSubstring;
            D9.c cVarQ;
            D9.c cVar;
            java.lang.String strSubstring2;
            int size;
            java.lang.String strSubstring3;
            D9.c cVarQ2;
            D9.c cVar2;
            java.lang.String str2;
            p247y7.AbstractC7350t.f(j6, "rctx");
            p247y7.AbstractC7350t.f(str, "path");
            int i6 = 0;
            while (true) {
                C9.N.b bVar = null;
                if (i6 >= 4) {
                    return null;
                }
                C9.N.b[] bVarArr = (C9.N.b[]) this.f1413J.get(java.lang.Integer.valueOf(i6));
                if (bVarArr != null) {
                    char cCharAt = str.length() > 0 ? str.charAt(0) : (char) 0;
                    if (i6 != 0) {
                        if (i6 != 1 && i6 != 2) {
                            if (str.length() > 0) {
                                j6.g(str);
                            }
                            bVarN = bVarArr[0];
                            strSubstring = "";
                        } else if (str.length() == 0) {
                            continue;
                        } else {
                            int i10 = 0;
                            while (i10 < bVarArr.length) {
                                C9.N.b bVar2 = bVarArr[i10];
                                if (bVar2.f1406C != 0 && (str2 = bVar2.f1411H) != null) {
                                    j6.a().add(str2);
                                }
                                int iO0 = S8.r.o0(str, bVar2.f1409F, 0, false, 6, null);
                                if (iO0 >= 0) {
                                    S8.o oVar = bVar2.f1410G;
                                    if (i6 == 1 || oVar == null) {
                                        strSubstring2 = str.substring(0, iO0);
                                        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                                        if (S8.r.o0(strSubstring2, '/', 0, false, 6, null) != -1) {
                                            continue;
                                        } else {
                                            size = j6.c().size();
                                            java.lang.String strSubstring4 = str.substring(0, iO0);
                                            p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
                                            j6.g(strSubstring4);
                                            strSubstring3 = str.substring(iO0);
                                            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                                            if (strSubstring3.length() != 0 && bVar2.t() && (cVar2 = bVar2.f1412I) != null) {
                                                j6.d();
                                                return cVar2;
                                            }
                                            cVarQ2 = bVar2.q(j6, strSubstring3);
                                            if (cVarQ2 != null) {
                                                return cVarQ2;
                                            }
                                            j6.f(size);
                                        }
                                    } else {
                                        java.lang.String strSubstring5 = str.substring(0, iO0);
                                        p247y7.AbstractC7350t.e(strSubstring5, "substring(...)");
                                        if (oVar.d(strSubstring5)) {
                                            size = j6.c().size();
                                            java.lang.String strSubstring6 = str.substring(0, iO0);
                                            p247y7.AbstractC7350t.e(strSubstring6, "substring(...)");
                                            j6.g(strSubstring6);
                                            strSubstring3 = str.substring(iO0);
                                            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                                            if (strSubstring3.length() != 0) {
                                            }
                                            cVarQ2 = bVar2.q(j6, strSubstring3);
                                            if (cVarQ2 != null) {
                                                return cVarQ2;
                                            }
                                            j6.f(size);
                                        } else {
                                            continue;
                                        }
                                    }
                                } else if (bVar2.f1409F == '/') {
                                    iO0 = str.length();
                                    S8.o oVar2 = bVar2.f1410G;
                                    if (i6 == 1) {
                                        strSubstring2 = str.substring(0, iO0);
                                        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                                        if (S8.r.o0(strSubstring2, '/', 0, false, 6, null) != -1) {
                                            continue;
                                        } else {
                                            size = j6.c().size();
                                            java.lang.String strSubstring7 = str.substring(0, iO0);
                                            p247y7.AbstractC7350t.e(strSubstring7, "substring(...)");
                                            j6.g(strSubstring7);
                                            strSubstring3 = str.substring(iO0);
                                            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                                            if (strSubstring3.length() != 0) {
                                            }
                                            cVarQ2 = bVar2.q(j6, strSubstring3);
                                            if (cVarQ2 != null) {
                                                return cVarQ2;
                                            }
                                            j6.f(size);
                                        }
                                    } else {
                                        strSubstring2 = str.substring(0, iO0);
                                        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                                        if (S8.r.o0(strSubstring2, '/', 0, false, 6, null) != -1) {
                                            continue;
                                        } else {
                                            size = j6.c().size();
                                            java.lang.String strSubstring8 = str.substring(0, iO0);
                                            p247y7.AbstractC7350t.e(strSubstring8, "substring(...)");
                                            j6.g(strSubstring8);
                                            strSubstring3 = str.substring(iO0);
                                            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                                            if (strSubstring3.length() != 0) {
                                            }
                                            cVarQ2 = bVar2.q(j6, strSubstring3);
                                            if (cVarQ2 != null) {
                                                return cVarQ2;
                                            }
                                            j6.f(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                i10++;
                                bVar = bVar2;
                            }
                            bVarN = bVar;
                            strSubstring = str;
                        }
                        if (bVarN == null) {
                            continue;
                        } else {
                            if (strSubstring.length() != 0 && bVarN.t() && (cVar = bVarN.f1412I) != null) {
                                j6.d();
                                return cVar;
                            }
                            cVarQ = bVarN.q(j6, strSubstring);
                            if (cVarQ != null) {
                                return cVarQ;
                            }
                            if (bVarN.f1406C > 0) {
                                j6.e();
                            }
                        }
                    } else {
                        bVarN = n(bVarArr, cCharAt);
                        if (bVarN != null && S8.r.V(str, bVarN.f1407D, false, 2, null)) {
                            strSubstring = str.substring(bVarN.f1407D.length());
                            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                            if (bVarN == null) {
                                if (strSubstring.length() != 0) {
                                }
                                cVarQ = bVarN.q(j6, strSubstring);
                                if (cVarQ != null) {
                                    return cVarQ;
                                }
                                if (bVarN.f1406C > 0) {
                                    j6.e();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i6++;
            }
        }

        public final C9.N.b r(int i6, char c6, char c10, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "prefix");
            C9.N.b[] bVarArr = (C9.N.b[]) this.f1413J.get(java.lang.Integer.valueOf(i6));
            if (bVarArr == null) {
                return null;
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                C9.N.b bVar = bVarArr[i10];
                if (bVar.f1408E == c6 && bVar.f1409F == c10 && (i6 != 1 || p247y7.AbstractC7350t.b(bVar.f1407D, str))) {
                    return bVarArr[i10];
                }
            }
            return null;
        }

        public final C9.N.b s(java.lang.String str, D9.c cVar) {
            C9.N.c cVarV;
            C9.N.b bVarE;
            p247y7.AbstractC7350t.f(str, "pattern");
            p247y7.AbstractC7350t.f(cVar, "route");
            C9.N.b bVar = this;
            java.lang.String strSubstring = str;
            while (strSubstring.length() != 0) {
                char cCharAt = strSubstring.charAt(0);
                if (cCharAt == '*' || cCharAt == '{') {
                    cVarV = v(strSubstring);
                } else {
                    cVarV = new C9.N.c(0, null, (char) 0, 0, 0, 31, null);
                }
                C9.N.b bVarR = bVar.r(cVarV.b(), cCharAt, cVarV.e(), cVarV.b() == 1 ? cVarV.c() : "");
                if (bVarR == null) {
                    bVarE = bVar.e(new C9.N.b(0, strSubstring, cCharAt, cVarV.e(), null, null, null, 113, null), strSubstring);
                } else {
                    if (bVarR.f1406C > 0) {
                        strSubstring = strSubstring.substring(cVarV.a());
                    } else {
                        int iU = u(strSubstring, bVarR.f1407D);
                        if (iU == bVarR.f1407D.length()) {
                            strSubstring = strSubstring.substring(iU);
                        } else {
                            java.lang.String strSubstring2 = strSubstring.substring(0, iU);
                            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                            C9.N.b bVar2 = new C9.N.b(0, strSubstring2, (char) 0, (char) 0, null, null, null, 124, null);
                            bVar.w(strSubstring.charAt(0), cVarV.e(), bVar2);
                            bVarR.f1408E = bVarR.f1407D.charAt(iU);
                            java.lang.String strSubstring3 = bVarR.f1407D.substring(iU);
                            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                            bVarR.f1407D = strSubstring3;
                            bVar2.e(bVarR, strSubstring3);
                            java.lang.String strSubstring4 = strSubstring.substring(iU);
                            p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
                            if (strSubstring4.length() == 0) {
                                bVar2.i(cVar);
                                return bVar2;
                            }
                            bVarE = bVar2.e(new C9.N.b(0, strSubstring4, strSubstring4.charAt(0), (char) 0, null, null, null, 120, null), strSubstring4);
                        }
                    }
                    p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                    bVar = bVarR;
                }
                bVarE.i(cVar);
                return bVarE;
            }
            bVar.i(cVar);
            return bVar;
        }

        public final boolean t() {
            return this.f1412I != null;
        }

        public java.lang.String toString() {
            return "Node(type=" + this.f1406C + ", prefix=" + this.f1407D + ", label=" + this.f1408E + ", tail=" + this.f1409F + ", rex=" + this.f1410G + ", paramsKey=" + this.f1411H + ", route=" + this.f1412I + ")";
        }

        public final int u(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "k1");
            p247y7.AbstractC7350t.f(str2, "k2");
            int iMin = java.lang.Math.min(str.length(), str2.length());
            for (int i6 = 0; i6 < iMin; i6++) {
                if (str.charAt(i6) != str2.charAt(i6)) {
                    return i6;
                }
            }
            return iMin;
        }

        public final C9.N.c v(java.lang.String str) {
            int i6;
            int i10;
            java.lang.String strSubstring;
            p247y7.AbstractC7350t.f(str, "pattern");
            int iO0 = S8.r.o0(str, '{', 0, false, 6, null);
            int iO1 = S8.r.o0(str, '*', 0, false, 6, null);
            if (iO0 < 0 && iO1 < 0) {
                return new C9.N.c(0, "", (char) 0, 0, str.length());
            }
            if (iO0 >= 0 && iO1 >= 0 && iO1 < iO0) {
                throw new java.lang.IllegalArgumentException("chi: wildcard '*' must be the last pattern in a route, otherwise use a '{param}'".toString());
            }
            if (iO0 < 0) {
                return new C9.N.c(3, "", (char) 0, iO1, str.length());
            }
            java.lang.String strSubstring2 = str.substring(iO0);
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            int length = strSubstring2.length();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    i6 = iO0;
                    break;
                }
                char cCharAt = strSubstring2.charAt(i11);
                if (cCharAt == '{') {
                    i12++;
                } else if (cCharAt == '}' && (i12 = i12 - 1) == 0) {
                    i6 = i11 + iO0;
                    break;
                }
                i11++;
            }
            if (i6 == iO0) {
                throw new java.lang.IllegalArgumentException("Router: route param closing delimiter '}' is missing".toString());
            }
            java.lang.String strSubstring3 = str.substring(iO0 + 1, i6);
            p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
            int i13 = i6 + 1;
            char cCharAt2 = i13 < str.length() ? str.charAt(i13) : '/';
            int iO2 = S8.r.o0(strSubstring3, ':', 0, false, 6, null);
            if (iO2 >= 0) {
                strSubstring = strSubstring3.substring(iO2 + 1);
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                i10 = 1;
            } else {
                i10 = 2;
                strSubstring = "";
            }
            if (strSubstring.length() > 0) {
                if (strSubstring.charAt(0) != '^') {
                    strSubstring = "^" + strSubstring;
                }
                if (strSubstring.charAt(strSubstring.length() - 1) != '$') {
                    strSubstring = strSubstring + "$";
                }
            }
            return new C9.N.c(i10, strSubstring, cCharAt2, iO0, i13);
        }

        public final void w(char c6, char c10, C9.N.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "child");
            C9.N.b[] bVarArr = (C9.N.b[]) this.f1413J.get(java.lang.Integer.valueOf(bVar.f1406C));
            if (bVarArr == null) {
                return;
            }
            for (int i6 = 0; i6 < bVarArr.length; i6++) {
                C9.N.b bVar2 = bVarArr[i6];
                if (bVar2.f1408E == c6 && bVar2.f1409F == c10) {
                    bVarArr[i6] = bVar;
                    bVar.f1408E = c6;
                    bVar.f1409F = c10;
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("chi: replacing missing child");
        }

        public final void x(C9.N.b[] bVarArr) {
            p247y7.AbstractC7350t.f(bVarArr, "ns");
            if (bVarArr.length <= 1) {
                return;
            }
            p097j7.AbstractC6872n.J(bVarArr);
            int length = bVarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i6 = length - 1;
                C9.N.b bVar = bVarArr[length];
                if (bVar.f1406C > 0 && bVar.f1409F == '/') {
                    bVarArr[length] = bVarArr[bVarArr.length - 1];
                    bVarArr[bVarArr.length - 1] = bVar;
                    return;
                } else if (i6 < 0) {
                    return;
                } else {
                    length = i6;
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f1415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f1416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1418e;

        public c(int i6, java.lang.String str, char c6, int i10, int i11) {
            p247y7.AbstractC7350t.f(str, "rexPat");
            this.f1414a = i6;
            this.f1415b = str;
            this.f1416c = c6;
            this.f1417d = i10;
            this.f1418e = i11;
        }

        public /* synthetic */ c(int i6, java.lang.String str, char c6, int i10, int i11, int i12, p247y7.AbstractC7342k abstractC7342k) {
            this((i12 & 1) != 0 ? 0 : i6, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? (char) 0 : c6, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
        }

        public final int a() {
            return this.f1418e;
        }

        public final int b() {
            return this.f1414a;
        }

        public final java.lang.String c() {
            return this.f1415b;
        }

        public final int d() {
            return this.f1417d;
        }

        public final char e() {
            return this.f1416c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9.N.c)) {
                return false;
            }
            C9.N.c cVar = (C9.N.c) obj;
            return this.f1414a == cVar.f1414a && p247y7.AbstractC7350t.b(this.f1415b, cVar.f1415b) && this.f1416c == cVar.f1416c && this.f1417d == cVar.f1417d && this.f1418e == cVar.f1418e;
        }

        public int hashCode() {
            return (((((((this.f1414a * 31) + this.f1415b.hashCode()) * 31) + this.f1416c) * 31) + this.f1417d) * 31) + this.f1418e;
        }

        public java.lang.String toString() {
            return "Segment(nodeType=" + this.f1414a + ", rexPat=" + this.f1415b + ", tail=" + this.f1416c + ", startIndex=" + this.f1417d + ", endIndex=" + this.f1418e + ")";
        }
    }

    private final java.lang.String a(java.lang.String str) {
        int iP0 = S8.r.p0(str, "/?*", 0, false, 6, null);
        if (iP0 <= 0) {
            return "";
        }
        java.lang.String strSubstring = str.substring(0, iP0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final C9.K c(java.lang.String str) {
        C9.J j6 = new C9.J();
        D9.c cVarQ = this.f1404a.q(j6, str);
        if (cVarQ == null) {
            return null;
        }
        return new C9.K(cVarQ, j6.b());
    }

    public final C9.K b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "path");
        D9.c cVar = (D9.c) this.f1405b.get(str);
        return cVar == null ? c(str) : new C9.K(cVar, null, 2, null);
    }

    public final void d(java.lang.String str, D9.c cVar) {
        p247y7.AbstractC7350t.f(str, "pattern");
        p247y7.AbstractC7350t.f(cVar, "route");
        java.lang.String strA = a(str);
        if (strA.length() > 1) {
            d(strA, cVar);
            java.lang.String strSubstring = str.substring(strA.length() + 2);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            str = strA + "/" + strSubstring;
        }
        if (p247y7.AbstractC7350t.b(str, "/?*")) {
            str = "/*";
        }
        if (C9.N.a.f(f1402c, str, null, 2, null).isEmpty()) {
            this.f1405b.put(str, cVar);
        }
        this.f1404a.s(str, cVar);
    }
}
