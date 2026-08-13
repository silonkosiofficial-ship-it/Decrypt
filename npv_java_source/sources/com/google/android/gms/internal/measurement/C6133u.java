package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6133u implements com.google.android.gms.internal.measurement.InterfaceC6117s, java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f41229C;

    public C6133u(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("StringValue cannot be null.");
        }
        this.f41229C = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return new com.google.android.gms.internal.measurement.C6133u(this.f41229C);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        double d6;
        if (this.f41229C.isEmpty()) {
            d6 = 0.0d;
        } else {
            try {
                return java.lang.Double.valueOf(this.f41229C);
            } catch (java.lang.NumberFormatException unused) {
                d6 = Double.NaN;
            }
        }
        return java.lang.Double.valueOf(d6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return this.f41229C;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.C6133u) {
            return this.f41229C.equals(((com.google.android.gms.internal.measurement.C6133u) obj).f41229C);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.valueOf(!this.f41229C.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return new com.google.android.gms.internal.measurement.C6157x(this);
    }

    public final int hashCode() {
        return this.f41229C.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.C6149w(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x016c  */
    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0180  */
    /* JADX WARN: Code duplicated, block: B:109:0x0190  */
    /* JADX WARN: Code duplicated, block: B:110:0x0192  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x01be  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x0209  */
    /* JADX WARN: Code duplicated, block: B:129:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0235  */
    /* JADX WARN: Code duplicated, block: B:134:0x0247 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x024c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0272  */
    /* JADX WARN: Code duplicated, block: B:141:0x029c  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0317  */
    /* JADX WARN: Code duplicated, block: B:154:0x0329  */
    /* JADX WARN: Code duplicated, block: B:156:0x0335  */
    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:159:0x0346  */
    /* JADX WARN: Code duplicated, block: B:161:0x035b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0372  */
    /* JADX WARN: Code duplicated, block: B:165:0x037b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0381  */
    /* JADX WARN: Code duplicated, block: B:174:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b5 A[LOOP:0: B:178:0x03b3->B:179:0x03b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03da  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:188:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:189:0x0405  */
    /* JADX WARN: Code duplicated, block: B:192:0x0416  */
    /* JADX WARN: Code duplicated, block: B:193:0x0429  */
    /* JADX WARN: Code duplicated, block: B:196:0x0438  */
    /* JADX WARN: Code duplicated, block: B:197:0x0443  */
    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0471  */
    /* JADX WARN: Code duplicated, block: B:203:0x0474  */
    /* JADX WARN: Code duplicated, block: B:206:0x0491  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:212:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:221:0x0500  */
    /* JADX WARN: Code duplicated, block: B:222:0x0503  */
    /* JADX WARN: Code duplicated, block: B:225:0x051c  */
    /* JADX WARN: Code duplicated, block: B:226:0x051f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0533  */
    /* JADX WARN: Code duplicated, block: B:231:0x0547  */
    /* JADX WARN: Code duplicated, block: B:233:0x0558  */
    /* JADX WARN: Code duplicated, block: B:235:0x0567  */
    /* JADX WARN: Code duplicated, block: B:238:0x057a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0589  */
    /* JADX WARN: Code duplicated, block: B:242:0x0595  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:247:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c6 A[LOOP:1: B:248:0x05c0->B:250:0x05c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:255:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:256:0x060d  */
    /* JADX WARN: Code duplicated, block: B:266:0x062a  */
    /* JADX WARN: Code duplicated, block: B:268:0x063e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0647  */
    /* JADX WARN: Code duplicated, block: B:272:0x066a  */
    /* JADX WARN: Code duplicated, block: B:274:0x066d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[PHI: r6 r7 r14 r15
  0x00cd: PHI (r6v31 java.lang.String) = 
  (r6v4 java.lang.String)
  (r6v5 java.lang.String)
  (r6v6 java.lang.String)
  (r6v7 java.lang.String)
  (r6v32 java.lang.String)
 binds: [B:111:0x019e, B:107:0x018c, B:103:0x017a, B:99:0x0168, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r7v13 java.lang.String) = 
  (r7v1 java.lang.String)
  (r7v2 java.lang.String)
  (r7v3 java.lang.String)
  (r7v4 java.lang.String)
  (r7v14 java.lang.String)
 binds: [B:111:0x019e, B:107:0x018c, B:103:0x017a, B:99:0x0168, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r14v10 java.lang.String) = 
  (r14v1 java.lang.String)
  (r14v2 java.lang.String)
  (r14v3 java.lang.String)
  (r14v4 java.lang.String)
  (r14v11 java.lang.String)
 binds: [B:111:0x019e, B:107:0x018c, B:103:0x017a, B:99:0x0168, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r15v7 java.lang.String) = 
  (r15v1 java.lang.String)
  (r15v2 java.lang.String)
  (r15v3 java.lang.String)
  (r15v4 java.lang.String)
  (r15v8 java.lang.String)
 binds: [B:111:0x019e, B:107:0x018c, B:103:0x017a, B:99:0x0168, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        byte b6;
        java.lang.String str8;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB;
        int i6;
        int iA;
        java.lang.StringBuilder sb;
        int i10;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3;
        double dDoubleValue;
        double dA;
        java.lang.String strE;
        java.lang.String str9;
        double dDoubleValue2;
        double dA2;
        double dMin;
        double length;
        double dA3;
        double dMin2;
        java.lang.String str10;
        java.util.ArrayList arrayList;
        java.lang.String strE2;
        long jM;
        java.lang.String[] strArrSplit;
        int length2;
        int i11;
        boolean zIsEmpty;
        java.lang.String str11;
        int iA2;
        int length3;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA;
        java.lang.String strE3;
        java.lang.String str12;
        int iIndexOf;
        int i12;
        com.google.android.gms.internal.measurement.C5963a3 c5963a4;
        java.lang.String strE4;
        double dDoubleValue3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a String function", str));
                }
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                    if (str.equals(str6)) {
                        b6 = 0;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    str5 = "toString";
                    str7 = "toLocaleLowerCase";
                    str6 = r6;
                    if (str.equals(str5)) {
                        b6 = 1;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -1464939364:
                    str4 = "charAt";
                    str7 = "toLocaleLowerCase";
                    str5 = "toString";
                    str6 = r6;
                    if (str.equals(str7)) {
                        b6 = 2;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -1361633751:
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                    if (str.equals(str4)) {
                        b6 = 3;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b6 = 4;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b6 = 5;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b6 = 6;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b6 = 7;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b6 = 8;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b6 = 9;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b6 = 10;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b6 = 11;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b6 = 12;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b6 = 13;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b6 = 14;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b6 = 15;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b6 = 16;
                        str4 = "charAt";
                        str5 = "toString";
                        str6 = r6;
                        str7 = "toLocaleLowerCase";
                    }
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
                default:
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = "hasOwnProperty";
                    str7 = "toLocaleLowerCase";
                    b6 = -1;
                    break;
            }
            switch (b6) {
                case 0:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g(str6, 1, list);
                    str8 = this.f41229C;
                    interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                    if ("length".equals(interfaceC6117sB.e())) {
                        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t;
                    }
                    double dDoubleValue4 = interfaceC6117sB.d().doubleValue();
                    return (dDoubleValue4 == java.lang.Math.floor(dDoubleValue4) || (i6 = (int) dDoubleValue4) < 0 || i6 >= str8.length()) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41180u : com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t;
                case 1:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g(str5, 0, list);
                    return this;
                case 2:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g(str7, 0, list);
                    return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toLowerCase());
                case 3:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n(str4, 1, list);
                    if (list.isEmpty()) {
                        iA = 0;
                    } else {
                        iA = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                    }
                    java.lang.String str13 = this.f41229C;
                    return (iA >= 0 || iA >= str13.length()) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41181v : new com.google.android.gms.internal.measurement.C6133u(java.lang.String.valueOf(str13.charAt(iA)));
                case 4:
                    if (list.isEmpty()) {
                        return this;
                    }
                    sb = new java.lang.StringBuilder(this.f41229C);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        sb.append(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i10)).e());
                    }
                    return new com.google.android.gms.internal.measurement.C6133u(sb.toString());
                case 5:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g("toLowerCase", 0, list);
                    return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toLowerCase(java.util.Locale.ENGLISH));
                case 6:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("search", 1, list);
                    if (list.isEmpty()) {
                        interfaceC6117sB2 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                    } else {
                        interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                    }
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(interfaceC6117sB2.e()).matcher(this.f41229C);
                    return matcher.find() ? new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(matcher.start())) : new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(-1.0d));
                case 7:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g(str2, 0, list);
                    return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toUpperCase());
                case 8:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("lastIndexOf", 2, list);
                    java.lang.String str14 = this.f41229C;
                    if (list.size() <= 0) {
                        interfaceC6117sB3 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                    } else {
                        interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                    }
                    java.lang.String strE5 = interfaceC6117sB3.e();
                    if (list.size() < 2) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                    }
                    if (java.lang.Double.isNaN(dDoubleValue)) {
                        dA = Double.POSITIVE_INFINITY;
                    } else {
                        dA = com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue);
                    }
                    return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(str14.lastIndexOf(strE5, (int) dA)));
                case 9:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g("toUpperCase", 0, list);
                    return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toUpperCase(java.util.Locale.ENGLISH));
                case 10:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.g("toUpperCase", 0, list);
                    return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.trim());
                case 11:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("match", 1, list);
                    java.lang.String str15 = this.f41229C;
                    if (list.size() <= 0) {
                        strE = "";
                    } else {
                        strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                    }
                    java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile(strE).matcher(str15);
                    return matcher2.find() ? new com.google.android.gms.internal.measurement.C6013g(new com.google.android.gms.internal.measurement.C6133u(matcher2.group())) : com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p;
                case 12:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("slice", 2, list);
                    str9 = this.f41229C;
                    if (list.isEmpty()) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue();
                    }
                    dA2 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue2);
                    if (dA2 < 0.0d) {
                        dMin = java.lang.Math.max(((double) str9.length()) + dA2, 0.0d);
                    } else {
                        dMin = java.lang.Math.min(dA2, str9.length());
                    }
                    int i13 = (int) dMin;
                    if (list.size() > 1) {
                        length = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                    } else {
                        length = str9.length();
                    }
                    dA3 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(length);
                    if (dA3 < 0.0d) {
                        dMin2 = java.lang.Math.max(((double) str9.length()) + dA3, 0.0d);
                    } else {
                        dMin2 = java.lang.Math.min(dA3, str9.length());
                    }
                    return new com.google.android.gms.internal.measurement.C6133u(str9.substring(i13, java.lang.Math.max(0, ((int) dMin2) - i13) + i13));
                case 13:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("split", 2, list);
                    str10 = this.f41229C;
                    if (str10.length() == 0) {
                        return new com.google.android.gms.internal.measurement.C6013g(this);
                    }
                    arrayList = new java.util.ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strE2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                        if (list.size() > 1) {
                            jM = com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                        } else {
                            jM = 2147483647L;
                        }
                        if (jM == 0) {
                            return new com.google.android.gms.internal.measurement.C6013g();
                        }
                        strArrSplit = str10.split(java.util.regex.Pattern.quote(strE2), ((int) jM) + 1);
                        length2 = strArrSplit.length;
                        if (strE2.isEmpty() || strArrSplit.length <= 0) {
                            i11 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                                i11 = zIsEmpty;
                                length2 = strArrSplit.length - 1;
                                i11 = zIsEmpty;
                            }
                        }
                        i11 = zIsEmpty;
                        if (strArrSplit.length > jM) {
                            length2--;
                        }
                        while (i11 < length2) {
                            arrayList.add(new com.google.android.gms.internal.measurement.C6133u(strArrSplit[i11]));
                            i11++;
                        }
                    }
                    return new com.google.android.gms.internal.measurement.C6013g(arrayList);
                case 14:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("substring", 2, list);
                    str11 = this.f41229C;
                    if (list.isEmpty()) {
                        iA2 = 0;
                    } else {
                        iA2 = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                    } else {
                        length3 = str11.length();
                    }
                    int iMin = java.lang.Math.min(java.lang.Math.max(iA2, 0), str11.length());
                    int iMin2 = java.lang.Math.min(java.lang.Math.max(length3, 0), str11.length());
                    return new com.google.android.gms.internal.measurement.C6133u(str11.substring(java.lang.Math.min(iMin, iMin2), java.lang.Math.max(iMin, iMin2)));
                case 15:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("replace", 2, list);
                    interfaceC6117sA = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                    strE3 = interfaceC6117sA.e();
                    if (!list.isEmpty()) {
                        strE3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                        if (list.size() > 1) {
                            interfaceC6117sA = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                        }
                    }
                    str12 = this.f41229C;
                    iIndexOf = str12.indexOf(strE3);
                    if (iIndexOf < 0) {
                        return this;
                    }
                    if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.AbstractC6076n) {
                        i12 = 0;
                        interfaceC6117sA = ((com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sA).a(c5963a3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C6133u(strE3), new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(iIndexOf)), this));
                    } else {
                        i12 = 0;
                    }
                    return new com.google.android.gms.internal.measurement.C6133u(str12.substring(i12, iIndexOf) + interfaceC6117sA.e() + str12.substring(iIndexOf + strE3.length()));
                case 16:
                    com.google.android.gms.internal.measurement.AbstractC6152w2.n("indexOf", 2, list);
                    java.lang.String str16 = this.f41229C;
                    if (list.size() <= 0) {
                        strE4 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o.e();
                        c5963a4 = c5963a3;
                    } else {
                        c5963a4 = c5963a3;
                        strE4 = c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                    }
                    if (list.size() < 2) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                    }
                    return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(str16.indexOf(strE4, (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue3))));
                default:
                    throw new java.lang.IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        str.hashCode();
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = "toString";
                str6 = r6;
                str7 = "toLocaleLowerCase";
                if (str.equals(str6)) {
                    b6 = -1;
                } else {
                    b6 = 0;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                str5 = "toString";
                str7 = "toLocaleLowerCase";
                str6 = r6;
                if (str.equals(str5)) {
                    b6 = -1;
                } else {
                    b6 = 1;
                }
                break;
            case -1464939364:
                str4 = "charAt";
                str7 = "toLocaleLowerCase";
                str5 = "toString";
                str6 = r6;
                if (str.equals(str7)) {
                    b6 = -1;
                } else {
                    b6 = 2;
                }
                break;
            case -1361633751:
                str4 = "charAt";
                str5 = "toString";
                str6 = r6;
                str7 = "toLocaleLowerCase";
                if (str.equals(str4)) {
                    b6 = -1;
                } else {
                    b6 = 3;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b6 = 4;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b6 = 5;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case -906336856:
                if (str.equals("search")) {
                    b6 = 6;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b6 = 7;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b6 = 8;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b6 = 9;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b6 = 10;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 103668165:
                if (str.equals("match")) {
                    b6 = 11;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b6 = 12;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 109648666:
                if (str.equals("split")) {
                    b6 = 13;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b6 = 14;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b6 = 15;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b6 = 16;
                    str4 = "charAt";
                    str5 = "toString";
                    str6 = r6;
                    str7 = "toLocaleLowerCase";
                }
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
            default:
                str4 = "charAt";
                str5 = "toString";
                str6 = "hasOwnProperty";
                str7 = "toLocaleLowerCase";
                b6 = -1;
                break;
        }
        switch (b6) {
            case 0:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str6, 1, list);
                str8 = this.f41229C;
                interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if ("length".equals(interfaceC6117sB.e())) {
                    return com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t;
                }
                double dDoubleValue5 = interfaceC6117sB.d().doubleValue();
                if (dDoubleValue5 == java.lang.Math.floor(dDoubleValue5)) {
                }
                break;
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str5, 0, list);
                return this;
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str7, 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toLowerCase());
            case 3:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n(str4, 1, list);
                if (list.isEmpty()) {
                    iA = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                } else {
                    iA = 0;
                }
                java.lang.String str17 = this.f41229C;
                if (iA >= 0) {
                }
                break;
            case 4:
                if (list.isEmpty()) {
                    return this;
                }
                sb = new java.lang.StringBuilder(this.f41229C);
                while (i10 < list.size()) {
                    sb.append(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i10)).e());
                }
                return new com.google.android.gms.internal.measurement.C6133u(sb.toString());
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("toLowerCase", 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toLowerCase(java.util.Locale.ENGLISH));
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("search", 1, list);
                if (list.isEmpty()) {
                    interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                } else {
                    interfaceC6117sB2 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                }
                java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile(interfaceC6117sB2.e()).matcher(this.f41229C);
                if (matcher3.find()) {
                }
            case 7:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str2, 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toUpperCase());
            case 8:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("lastIndexOf", 2, list);
                java.lang.String str18 = this.f41229C;
                if (list.size() <= 0) {
                    interfaceC6117sB3 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                } else {
                    interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                }
                java.lang.String strE6 = interfaceC6117sB3.e();
                if (list.size() < 2) {
                    dDoubleValue = Double.NaN;
                } else {
                    dDoubleValue = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                }
                if (java.lang.Double.isNaN(dDoubleValue)) {
                    dA = Double.POSITIVE_INFINITY;
                } else {
                    dA = com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue);
                }
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(str18.lastIndexOf(strE6, (int) dA)));
            case 9:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("toUpperCase", 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.toUpperCase(java.util.Locale.ENGLISH));
            case 10:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("toUpperCase", 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f41229C.trim());
            case 11:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("match", 1, list);
                java.lang.String str19 = this.f41229C;
                if (list.size() <= 0) {
                    strE = "";
                } else {
                    strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                }
                java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile(strE).matcher(str19);
                if (matcher4.find()) {
                }
            case 12:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("slice", 2, list);
                str9 = this.f41229C;
                if (list.isEmpty()) {
                    dDoubleValue2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                dA2 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue2);
                if (dA2 < 0.0d) {
                    dMin = java.lang.Math.max(((double) str9.length()) + dA2, 0.0d);
                } else {
                    dMin = java.lang.Math.min(dA2, str9.length());
                }
                int i14 = (int) dMin;
                if (list.size() > 1) {
                    length = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                } else {
                    length = str9.length();
                }
                dA3 = com.google.android.gms.internal.measurement.AbstractC6152w2.a(length);
                if (dA3 < 0.0d) {
                    dMin2 = java.lang.Math.max(((double) str9.length()) + dA3, 0.0d);
                } else {
                    dMin2 = java.lang.Math.min(dA3, str9.length());
                }
                return new com.google.android.gms.internal.measurement.C6133u(str9.substring(i14, java.lang.Math.max(0, ((int) dMin2) - i14) + i14));
            case 13:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("split", 2, list);
                str10 = this.f41229C;
                if (str10.length() == 0) {
                    return new com.google.android.gms.internal.measurement.C6013g(this);
                }
                arrayList = new java.util.ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strE2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                    if (list.size() > 1) {
                        jM = com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                    } else {
                        jM = 2147483647L;
                    }
                    if (jM == 0) {
                        return new com.google.android.gms.internal.measurement.C6013g();
                    }
                    strArrSplit = str10.split(java.util.regex.Pattern.quote(strE2), ((int) jM) + 1);
                    length2 = strArrSplit.length;
                    if (strE2.isEmpty()) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                    i11 = zIsEmpty;
                    if (strArrSplit.length > jM) {
                        length2--;
                    }
                    while (i11 < length2) {
                        arrayList.add(new com.google.android.gms.internal.measurement.C6133u(strArrSplit[i11]));
                        i11++;
                    }
                }
                return new com.google.android.gms.internal.measurement.C6013g(arrayList);
            case 14:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("substring", 2, list);
                str11 = this.f41229C;
                if (list.isEmpty()) {
                    iA2 = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue());
                } else {
                    iA2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
                } else {
                    length3 = str11.length();
                }
                int iMin3 = java.lang.Math.min(java.lang.Math.max(iA2, 0), str11.length());
                int iMin4 = java.lang.Math.min(java.lang.Math.max(length3, 0), str11.length());
                return new com.google.android.gms.internal.measurement.C6133u(str11.substring(java.lang.Math.min(iMin3, iMin4), java.lang.Math.max(iMin3, iMin4)));
            case 15:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("replace", 2, list);
                interfaceC6117sA = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
                strE3 = interfaceC6117sA.e();
                if (!list.isEmpty()) {
                    strE3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                    if (list.size() > 1) {
                        interfaceC6117sA = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                    }
                }
                str12 = this.f41229C;
                iIndexOf = str12.indexOf(strE3);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.AbstractC6076n) {
                    i12 = 0;
                    interfaceC6117sA = ((com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sA).a(c5963a3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C6133u(strE3), new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(iIndexOf)), this));
                } else {
                    i12 = 0;
                }
                return new com.google.android.gms.internal.measurement.C6133u(str12.substring(i12, iIndexOf) + interfaceC6117sA.e() + str12.substring(iIndexOf + strE3.length()));
            case 16:
                com.google.android.gms.internal.measurement.AbstractC6152w2.n("indexOf", 2, list);
                java.lang.String str110 = this.f41229C;
                if (list.size() <= 0) {
                    strE4 = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o.e();
                    c5963a4 = c5963a3;
                } else {
                    c5963a4 = c5963a3;
                    strE4 = c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                }
                if (list.size() < 2) {
                    dDoubleValue3 = 0.0d;
                } else {
                    dDoubleValue3 = c5963a4.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue();
                }
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(str110.indexOf(strE4, (int) com.google.android.gms.internal.measurement.AbstractC6152w2.a(dDoubleValue3))));
            default:
                throw new java.lang.IllegalArgumentException("Command not supported");
        }
    }

    public final java.lang.String toString() {
        return "\"" + this.f41229C + "\"";
    }
}
