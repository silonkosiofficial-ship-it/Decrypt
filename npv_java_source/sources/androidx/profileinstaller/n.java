package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f22942a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f22943b = {112, 114, 109, 0};

    private static void A(java.io.InputStream inputStream) {
        androidx.profileinstaller.f.h(inputStream);
        int iJ = androidx.profileinstaller.f.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            androidx.profileinstaller.f.j(inputStream);
            for (int iJ2 = androidx.profileinstaller.f.j(inputStream); iJ2 > 0; iJ2--) {
                androidx.profileinstaller.f.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean B(java.io.OutputStream outputStream, byte[] bArr, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22954a)) {
            N(outputStream, eVarArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22955b)) {
            M(outputStream, eVarArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22957d)) {
            K(outputStream, eVarArr);
            return true;
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22956c)) {
            L(outputStream, eVarArr);
            return true;
        }
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22958e)) {
            return false;
        }
        J(outputStream, eVarArr);
        return true;
    }

    private static void C(java.io.OutputStream outputStream, androidx.profileinstaller.e eVar) throws java.io.IOException {
        int[] iArr = eVar.f22923h;
        int length = iArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            int i11 = iArr[i6];
            androidx.profileinstaller.f.p(outputStream, i11 - i10);
            i6++;
            i10 = i11;
        }
    }

    private static androidx.profileinstaller.q D(androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            androidx.profileinstaller.f.p(byteArrayOutputStream, eVarArr.length);
            int i6 = 2;
            for (androidx.profileinstaller.e eVar : eVarArr) {
                androidx.profileinstaller.f.q(byteArrayOutputStream, eVar.f22918c);
                androidx.profileinstaller.f.q(byteArrayOutputStream, eVar.f22919d);
                androidx.profileinstaller.f.q(byteArrayOutputStream, eVar.f22922g);
                java.lang.String strJ = j(eVar.f22916a, eVar.f22917b, androidx.profileinstaller.p.f22954a);
                int iK = androidx.profileinstaller.f.k(strJ);
                androidx.profileinstaller.f.p(byteArrayOutputStream, iK);
                i6 = i6 + 14 + iK;
                androidx.profileinstaller.f.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i6 == byteArray.length) {
                androidx.profileinstaller.q qVar = new androidx.profileinstaller.q(androidx.profileinstaller.g.DEX_FILES, i6, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw androidx.profileinstaller.f.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(f22942a);
        outputStream.write(bArr);
    }

    private static void F(java.io.OutputStream outputStream, androidx.profileinstaller.e eVar) throws java.io.IOException {
        I(outputStream, eVar);
        C(outputStream, eVar);
        H(outputStream, eVar);
    }

    private static void G(java.io.OutputStream outputStream, androidx.profileinstaller.e eVar, java.lang.String str) throws java.io.IOException {
        androidx.profileinstaller.f.p(outputStream, androidx.profileinstaller.f.k(str));
        androidx.profileinstaller.f.p(outputStream, eVar.f22920e);
        androidx.profileinstaller.f.q(outputStream, eVar.f22921f);
        androidx.profileinstaller.f.q(outputStream, eVar.f22918c);
        androidx.profileinstaller.f.q(outputStream, eVar.f22922g);
        androidx.profileinstaller.f.n(outputStream, str);
    }

    private static void H(java.io.OutputStream outputStream, androidx.profileinstaller.e eVar) throws java.io.IOException {
        byte[] bArr = new byte[k(eVar.f22922g)];
        for (java.util.Map.Entry entry : eVar.f22924i.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
            int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, eVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(java.io.OutputStream outputStream, androidx.profileinstaller.e eVar) throws java.io.IOException {
        int i6 = 0;
        for (java.util.Map.Entry entry : eVar.f22924i.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                androidx.profileinstaller.f.p(outputStream, iIntValue - i6);
                androidx.profileinstaller.f.p(outputStream, 0);
                i6 = iIntValue;
            }
        }
    }

    private static void J(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        androidx.profileinstaller.f.p(outputStream, eVarArr.length);
        for (androidx.profileinstaller.e eVar : eVarArr) {
            java.lang.String strJ = j(eVar.f22916a, eVar.f22917b, androidx.profileinstaller.p.f22958e);
            androidx.profileinstaller.f.p(outputStream, androidx.profileinstaller.f.k(strJ));
            androidx.profileinstaller.f.p(outputStream, eVar.f22924i.size());
            androidx.profileinstaller.f.p(outputStream, eVar.f22923h.length);
            androidx.profileinstaller.f.q(outputStream, eVar.f22918c);
            androidx.profileinstaller.f.n(outputStream, strJ);
            java.util.Iterator it = eVar.f22924i.keySet().iterator();
            while (it.hasNext()) {
                androidx.profileinstaller.f.p(outputStream, ((java.lang.Integer) it.next()).intValue());
            }
            for (int i6 : eVar.f22923h) {
                androidx.profileinstaller.f.p(outputStream, i6);
            }
        }
    }

    private static void K(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        androidx.profileinstaller.f.r(outputStream, eVarArr.length);
        for (androidx.profileinstaller.e eVar : eVarArr) {
            int size = eVar.f22924i.size() * 4;
            java.lang.String strJ = j(eVar.f22916a, eVar.f22917b, androidx.profileinstaller.p.f22957d);
            androidx.profileinstaller.f.p(outputStream, androidx.profileinstaller.f.k(strJ));
            androidx.profileinstaller.f.p(outputStream, eVar.f22923h.length);
            androidx.profileinstaller.f.q(outputStream, size);
            androidx.profileinstaller.f.q(outputStream, eVar.f22918c);
            androidx.profileinstaller.f.n(outputStream, strJ);
            java.util.Iterator it = eVar.f22924i.keySet().iterator();
            while (it.hasNext()) {
                androidx.profileinstaller.f.p(outputStream, ((java.lang.Integer) it.next()).intValue());
                androidx.profileinstaller.f.p(outputStream, 0);
            }
            for (int i6 : eVar.f22923h) {
                androidx.profileinstaller.f.p(outputStream, i6);
            }
        }
    }

    private static void L(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        byte[] bArrB = b(eVarArr, androidx.profileinstaller.p.f22956c);
        androidx.profileinstaller.f.r(outputStream, eVarArr.length);
        androidx.profileinstaller.f.m(outputStream, bArrB);
    }

    private static void M(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        byte[] bArrB = b(eVarArr, androidx.profileinstaller.p.f22955b);
        androidx.profileinstaller.f.r(outputStream, eVarArr.length);
        androidx.profileinstaller.f.m(outputStream, bArrB);
    }

    private static void N(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        O(outputStream, eVarArr);
    }

    private static void O(java.io.OutputStream outputStream, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        int length;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        arrayList.add(D(eVarArr));
        arrayList.add(c(eVarArr));
        arrayList.add(d(eVarArr));
        long length2 = ((long) androidx.profileinstaller.p.f22954a.length) + ((long) f22942a.length) + 4 + ((long) (arrayList.size() * 16));
        androidx.profileinstaller.f.q(outputStream, arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            androidx.profileinstaller.q qVar = (androidx.profileinstaller.q) arrayList.get(i6);
            androidx.profileinstaller.f.q(outputStream, qVar.f22961a.g());
            androidx.profileinstaller.f.q(outputStream, length2);
            if (qVar.f22964d) {
                byte[] bArr = qVar.f22963c;
                long length3 = bArr.length;
                byte[] bArrB = androidx.profileinstaller.f.b(bArr);
                arrayList2.add(bArrB);
                androidx.profileinstaller.f.q(outputStream, bArrB.length);
                androidx.profileinstaller.f.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(qVar.f22963c);
                androidx.profileinstaller.f.q(outputStream, qVar.f22963c.length);
                androidx.profileinstaller.f.q(outputStream, 0L);
                length = qVar.f22963c.length;
            }
            length2 += (long) length;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            outputStream.write((byte[]) arrayList2.get(i10));
        }
    }

    private static int a(androidx.profileinstaller.e eVar) {
        java.util.Iterator it = eVar.f22924i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((java.lang.Integer) ((java.util.Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private static byte[] b(androidx.profileinstaller.e[] eVarArr, byte[] bArr) throws java.io.IOException {
        int i6 = 0;
        int iK = 0;
        for (androidx.profileinstaller.e eVar : eVarArr) {
            iK += androidx.profileinstaller.f.k(j(eVar.f22916a, eVar.f22917b, bArr)) + 16 + (eVar.f22920e * 2) + eVar.f22921f + k(eVar.f22922g);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(iK);
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22956c)) {
            int length = eVarArr.length;
            while (i6 < length) {
                androidx.profileinstaller.e eVar2 = eVarArr[i6];
                G(byteArrayOutputStream, eVar2, j(eVar2.f22916a, eVar2.f22917b, bArr));
                F(byteArrayOutputStream, eVar2);
                i6++;
            }
        } else {
            for (androidx.profileinstaller.e eVar3 : eVarArr) {
                G(byteArrayOutputStream, eVar3, j(eVar3.f22916a, eVar3.f22917b, bArr));
            }
            int length2 = eVarArr.length;
            while (i6 < length2) {
                F(byteArrayOutputStream, eVarArr[i6]);
                i6++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw androidx.profileinstaller.f.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static androidx.profileinstaller.q c(androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i6 = 0;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            try {
                androidx.profileinstaller.e eVar = eVarArr[i10];
                androidx.profileinstaller.f.p(byteArrayOutputStream, i10);
                androidx.profileinstaller.f.p(byteArrayOutputStream, eVar.f22920e);
                i6 = i6 + 4 + (eVar.f22920e * 2);
                C(byteArrayOutputStream, eVar);
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            androidx.profileinstaller.q qVar = new androidx.profileinstaller.q(androidx.profileinstaller.g.CLASSES, i6, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw androidx.profileinstaller.f.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    private static androidx.profileinstaller.q d(androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i6 = 0;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            try {
                androidx.profileinstaller.e eVar = eVarArr[i10];
                int iA = a(eVar);
                byte[] bArrE = e(eVar);
                byte[] bArrF = f(eVar);
                androidx.profileinstaller.f.p(byteArrayOutputStream, i10);
                int length = bArrE.length + 2 + bArrF.length;
                androidx.profileinstaller.f.q(byteArrayOutputStream, length);
                androidx.profileinstaller.f.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i6 = i6 + 6 + length;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i6 == byteArray.length) {
            androidx.profileinstaller.q qVar = new androidx.profileinstaller.q(androidx.profileinstaller.g.METHODS, i6, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw androidx.profileinstaller.f.c("Expected size " + i6 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(androidx.profileinstaller.e eVar) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(androidx.profileinstaller.e eVar) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static java.lang.String g(java.lang.String str, java.lang.String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static java.lang.String h(java.lang.String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static androidx.profileinstaller.e i(androidx.profileinstaller.e[] eVarArr, java.lang.String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        java.lang.String strH = h(str);
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            if (eVarArr[i6].f22917b.equals(strH)) {
                return eVarArr[i6];
            }
        }
        return null;
    }

    private static java.lang.String j(java.lang.String str, java.lang.String str2, byte[] bArr) {
        java.lang.String strA = androidx.profileinstaller.p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + androidx.profileinstaller.p.a(bArr) + str2;
    }

    private static int k(int i6) {
        return y(i6 * 2) / 8;
    }

    private static int l(int i6, int i10, int i11) {
        if (i6 == 1) {
            throw androidx.profileinstaller.f.c("HOT methods are not stored in the bitmap");
        }
        if (i6 == 2) {
            return i10;
        }
        if (i6 == 4) {
            return i10 + i11;
        }
        throw androidx.profileinstaller.f.c("Unexpected flag: " + i6);
    }

    private static int[] m(java.io.InputStream inputStream, int i6) {
        int[] iArr = new int[i6];
        int iH = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            iH += androidx.profileinstaller.f.h(inputStream);
            iArr[i10] = iH;
        }
        return iArr;
    }

    private static int n(java.util.BitSet bitSet, int i6, int i10) {
        int i11 = bitSet.get(l(2, i6, i10)) ? 2 : 0;
        return bitSet.get(l(4, i6, i10)) ? i11 | 4 : i11;
    }

    static byte[] o(java.io.InputStream inputStream, byte[] bArr) {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.f.d(inputStream, bArr.length))) {
            return androidx.profileinstaller.f.d(inputStream, androidx.profileinstaller.p.f22955b.length);
        }
        throw androidx.profileinstaller.f.c("Invalid magic");
    }

    private static void p(java.io.InputStream inputStream, androidx.profileinstaller.e eVar) {
        int iAvailable = inputStream.available() - eVar.f22921f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += androidx.profileinstaller.f.h(inputStream);
            eVar.f22924i.put(java.lang.Integer.valueOf(iH), 1);
            for (int iH2 = androidx.profileinstaller.f.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw androidx.profileinstaller.f.c("Read too much data during profile line parse");
        }
    }

    static androidx.profileinstaller.e[] q(java.io.InputStream inputStream, byte[] bArr, byte[] bArr2, androidx.profileinstaller.e[] eVarArr) {
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22959f)) {
            if (java.util.Arrays.equals(androidx.profileinstaller.p.f22954a, bArr2)) {
                throw androidx.profileinstaller.f.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, eVarArr);
        }
        if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22960g)) {
            return t(inputStream, bArr2, eVarArr);
        }
        throw androidx.profileinstaller.f.c("Unsupported meta version");
    }

    static androidx.profileinstaller.e[] r(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22959f)) {
            throw androidx.profileinstaller.f.c("Unsupported meta version");
        }
        int iJ = androidx.profileinstaller.f.j(inputStream);
        byte[] bArrE = androidx.profileinstaller.f.e(inputStream, (int) androidx.profileinstaller.f.i(inputStream), (int) androidx.profileinstaller.f.i(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.f.c("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrE);
        try {
            androidx.profileinstaller.e[] eVarArrS = s(byteArrayInputStream, iJ, eVarArr);
            byteArrayInputStream.close();
            return eVarArrS;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.e[] s(java.io.InputStream inputStream, int i6, androidx.profileinstaller.e[] eVarArr) {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.e[0];
        }
        if (i6 != eVarArr.length) {
            throw androidx.profileinstaller.f.c("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i6];
        int[] iArr = new int[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            int iH = androidx.profileinstaller.f.h(inputStream);
            iArr[i10] = androidx.profileinstaller.f.h(inputStream);
            strArr[i10] = androidx.profileinstaller.f.f(inputStream, iH);
        }
        for (int i11 = 0; i11 < i6; i11++) {
            androidx.profileinstaller.e eVar = eVarArr[i11];
            if (!eVar.f22917b.equals(strArr[i11])) {
                throw androidx.profileinstaller.f.c("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            eVar.f22920e = i12;
            eVar.f22923h = m(inputStream, i12);
        }
        return eVarArr;
    }

    static androidx.profileinstaller.e[] t(java.io.InputStream inputStream, byte[] bArr, androidx.profileinstaller.e[] eVarArr) throws java.io.IOException {
        int iH = androidx.profileinstaller.f.h(inputStream);
        byte[] bArrE = androidx.profileinstaller.f.e(inputStream, (int) androidx.profileinstaller.f.i(inputStream), (int) androidx.profileinstaller.f.i(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.f.c("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrE);
        try {
            androidx.profileinstaller.e[] eVarArrU = u(byteArrayInputStream, bArr, iH, eVarArr);
            byteArrayInputStream.close();
            return eVarArrU;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.e[] u(java.io.InputStream inputStream, byte[] bArr, int i6, androidx.profileinstaller.e[] eVarArr) {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.e[0];
        }
        if (i6 != eVarArr.length) {
            throw androidx.profileinstaller.f.c("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i6; i10++) {
            androidx.profileinstaller.f.h(inputStream);
            java.lang.String strF = androidx.profileinstaller.f.f(inputStream, androidx.profileinstaller.f.h(inputStream));
            long jI = androidx.profileinstaller.f.i(inputStream);
            int iH = androidx.profileinstaller.f.h(inputStream);
            androidx.profileinstaller.e eVarI = i(eVarArr, strF);
            if (eVarI == null) {
                throw androidx.profileinstaller.f.c("Missing profile key: " + strF);
            }
            eVarI.f22919d = jI;
            int[] iArrM = m(inputStream, iH);
            if (java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22958e)) {
                eVarI.f22920e = iH;
                eVarI.f22923h = iArrM;
            }
        }
        return eVarArr;
    }

    private static void v(java.io.InputStream inputStream, androidx.profileinstaller.e eVar) {
        java.util.BitSet bitSetValueOf = java.util.BitSet.valueOf(androidx.profileinstaller.f.d(inputStream, androidx.profileinstaller.f.a(eVar.f22922g * 2)));
        int i6 = 0;
        while (true) {
            int i10 = eVar.f22922g;
            if (i6 >= i10) {
                return;
            }
            int iN = n(bitSetValueOf, i6, i10);
            if (iN != 0) {
                java.lang.Integer num = (java.lang.Integer) eVar.f22924i.get(java.lang.Integer.valueOf(i6));
                if (num == null) {
                    num = 0;
                }
                eVar.f22924i.put(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(iN | num.intValue()));
            }
            i6++;
        }
    }

    static androidx.profileinstaller.e[] w(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, androidx.profileinstaller.p.f22955b)) {
            throw androidx.profileinstaller.f.c("Unsupported version");
        }
        int iJ = androidx.profileinstaller.f.j(inputStream);
        byte[] bArrE = androidx.profileinstaller.f.e(inputStream, (int) androidx.profileinstaller.f.i(inputStream), (int) androidx.profileinstaller.f.i(inputStream));
        if (inputStream.read() > 0) {
            throw androidx.profileinstaller.f.c("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrE);
        try {
            androidx.profileinstaller.e[] eVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return eVarArrX;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static androidx.profileinstaller.e[] x(java.io.InputStream inputStream, java.lang.String str, int i6) {
        if (inputStream.available() == 0) {
            return new androidx.profileinstaller.e[0];
        }
        androidx.profileinstaller.e[] eVarArr = new androidx.profileinstaller.e[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            int iH = androidx.profileinstaller.f.h(inputStream);
            int iH2 = androidx.profileinstaller.f.h(inputStream);
            eVarArr[i10] = new androidx.profileinstaller.e(str, androidx.profileinstaller.f.f(inputStream, iH), androidx.profileinstaller.f.i(inputStream), 0L, iH2, (int) androidx.profileinstaller.f.i(inputStream), (int) androidx.profileinstaller.f.i(inputStream), new int[iH2], new java.util.TreeMap());
        }
        for (int i11 = 0; i11 < i6; i11++) {
            androidx.profileinstaller.e eVar = eVarArr[i11];
            p(inputStream, eVar);
            eVar.f22923h = m(inputStream, eVar.f22920e);
            v(inputStream, eVar);
        }
        return eVarArr;
    }

    private static int y(int i6) {
        return (i6 + 7) & (-8);
    }

    private static void z(byte[] bArr, int i6, int i10, androidx.profileinstaller.e eVar) {
        int iL = l(i6, i10, eVar.f22922g);
        int i11 = iL / 8;
        bArr[i11] = (byte) ((1 << (iL % 8)) | bArr[i11]);
    }
}
