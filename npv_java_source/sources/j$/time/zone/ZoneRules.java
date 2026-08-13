package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
public final class ZoneRules implements java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long[] f47972i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j$.time.zone.e[] f47973j = new j$.time.zone.e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final j$.time.LocalDateTime[] f47974k = new j$.time.LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final j$.time.zone.b[] f47975l = new j$.time.zone.b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f47976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.ZoneOffset[] f47977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f47978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.LocalDateTime[] f47979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.time.ZoneOffset[] f47980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j$.time.zone.e[] f47981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.TimeZone f47982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient j$.util.concurrent.ConcurrentHashMap f47983h = new j$.util.concurrent.ConcurrentHashMap();

    private ZoneRules(j$.time.ZoneOffset zoneOffset) {
        j$.time.ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f47977b = zoneOffsetArr;
        long[] jArr = f47972i;
        this.f47976a = jArr;
        this.f47978c = jArr;
        this.f47979d = f47974k;
        this.f47980e = zoneOffsetArr;
        this.f47981f = f47973j;
        this.f47982g = null;
    }

    ZoneRules(java.util.TimeZone timeZone) {
        j$.time.ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.f47977b = zoneOffsetArr;
        long[] jArr = f47972i;
        this.f47976a = jArr;
        this.f47978c = jArr;
        this.f47979d = f47974k;
        this.f47980e = zoneOffsetArr;
        this.f47981f = f47973j;
        this.f47982g = timeZone;
    }

    private ZoneRules(long[] jArr, j$.time.ZoneOffset[] zoneOffsetArr, long[] jArr2, j$.time.ZoneOffset[] zoneOffsetArr2, j$.time.zone.e[] eVarArr) {
        j$.time.LocalDateTime localDateTimeP;
        this.f47976a = jArr;
        this.f47977b = zoneOffsetArr;
        this.f47978c = jArr2;
        this.f47980e = zoneOffsetArr2;
        this.f47981f = eVarArr;
        if (jArr2.length == 0) {
            this.f47979d = f47974k;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i6 = 0;
            while (i6 < jArr2.length) {
                int i10 = i6 + 1;
                j$.time.zone.b bVar = new j$.time.zone.b(jArr2[i6], zoneOffsetArr2[i6], zoneOffsetArr2[i10]);
                if (bVar.M()) {
                    arrayList.add(bVar.p());
                    localDateTimeP = bVar.n();
                } else {
                    arrayList.add(bVar.n());
                    localDateTimeP = bVar.p();
                }
                arrayList.add(localDateTimeP);
                i6 = i10;
            }
            this.f47979d = (j$.time.LocalDateTime[]) arrayList.toArray(new j$.time.LocalDateTime[arrayList.size()]);
        }
        this.f47982g = null;
    }

    private static java.lang.Object a(j$.time.LocalDateTime localDateTime, j$.time.zone.b bVar) {
        j$.time.LocalDateTime localDateTimeP = bVar.p();
        boolean zM = bVar.M();
        boolean zR = localDateTime.R(localDateTimeP);
        if (zM) {
            if (zR) {
                return bVar.x();
            }
            return localDateTime.R(bVar.n()) ? bVar : bVar.u();
        }
        if (zR) {
            return localDateTime.R(bVar.n()) ? bVar.x() : bVar;
        }
        return bVar.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j$.time.zone.b[] b(int i6) {
        long j6;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f47983h;
        j$.time.zone.b[] bVarArr = (j$.time.zone.b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone == null) {
            j$.time.zone.e[] eVarArr = this.f47981f;
            j$.time.zone.b[] bVarArr2 = new j$.time.zone.b[eVarArr.length];
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                bVarArr2[i10] = eVarArr[i10].a(i6);
            }
            if (i6 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        j$.time.zone.b[] bVarArr3 = f47975l;
        if (i6 < 1800) {
            return bVarArr3;
        }
        long jN = j$.time.chrono.AbstractC6701g.n(j$.time.LocalDateTime.S(i6 - 1), this.f47977b[0]);
        int offset = timeZone.getOffset(jN * 1000);
        long j10 = 31968000 + jN;
        while (jN < j10) {
            long j11 = 7776000 + jN;
            long j12 = jN;
            if (offset != timeZone.getOffset(j11 * 1000)) {
                jN = j12;
                while (j11 - jN > 1) {
                    int i11 = offset;
                    long j13 = j10;
                    long jL = j$.com.android.tools.r8.a.l(j11 + jN, 2L);
                    if (timeZone.getOffset(jL * 1000) == i11) {
                        jN = jL;
                    } else {
                        j11 = jL;
                    }
                    offset = i11;
                    j10 = j13;
                }
                j6 = j10;
                int i12 = offset;
                if (timeZone.getOffset(jN * 1000) == i12) {
                    jN = j11;
                }
                j$.time.ZoneOffset zoneOffsetJ = j(i12);
                offset = timeZone.getOffset(jN * 1000);
                j$.time.ZoneOffset zoneOffsetJ2 = j(offset);
                if (c(jN, zoneOffsetJ2) == i6) {
                    bVarArr3 = (j$.time.zone.b[]) java.util.Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new j$.time.zone.b(jN, zoneOffsetJ, zoneOffsetJ2);
                }
            } else {
                j6 = j10;
                jN = j11;
            }
            j10 = j6;
        }
        if (1916 <= i6 && i6 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j6, j$.time.ZoneOffset zoneOffset) {
        return j$.time.LocalDate.V(j$.com.android.tools.r8.a.l(j6 + ((long) zoneOffset.getTotalSeconds()), 86400)).getYear();
    }

    private java.lang.Object e(j$.time.LocalDateTime localDateTime) {
        java.lang.Object obj = null;
        j$.time.ZoneOffset[] zoneOffsetArr = this.f47977b;
        int i6 = 0;
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone != null) {
            j$.time.zone.b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return j(timeZone.getOffset(j$.time.chrono.AbstractC6701g.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i6 < length) {
                j$.time.zone.b bVar = bVarArrB[i6];
                java.lang.Object objA = a(localDateTime, bVar);
                if ((objA instanceof j$.time.zone.b) || objA.equals(bVar.x())) {
                    return objA;
                }
                i6++;
                obj = objA;
            }
            return obj;
        }
        if (this.f47978c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f47981f.length;
        j$.time.LocalDateTime[] localDateTimeArr = this.f47979d;
        if (length2 > 0 && localDateTime.Q(localDateTimeArr[localDateTimeArr.length - 1])) {
            j$.time.zone.b[] bVarArrB2 = b(localDateTime.getYear());
            int length3 = bVarArrB2.length;
            while (i6 < length3) {
                j$.time.zone.b bVar2 = bVarArrB2[i6];
                java.lang.Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof j$.time.zone.b) || objA2.equals(bVar2.x())) {
                    return objA2;
                }
                i6++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = java.util.Arrays.binarySearch(localDateTimeArr, localDateTime);
        j$.time.ZoneOffset[] zoneOffsetArr2 = this.f47980e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i10 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i10])) {
                iBinarySearch = i10;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        j$.time.LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        j$.time.LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i11 = iBinarySearch / 2;
        j$.time.ZoneOffset zoneOffset = zoneOffsetArr2[i11];
        j$.time.ZoneOffset zoneOffset2 = zoneOffsetArr2[i11 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new j$.time.zone.b(localDateTime2, zoneOffset, zoneOffset2) : new j$.time.zone.b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static j$.time.zone.ZoneRules i(j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        return new j$.time.zone.ZoneRules(zoneOffset);
    }

    private static j$.time.ZoneOffset j(int i6) {
        return j$.time.ZoneOffset.ofTotalSeconds(i6 / 1000);
    }

    static j$.time.zone.ZoneRules k(java.io.DataInput dataInput) throws java.io.IOException {
        int i6 = dataInput.readInt();
        long[] jArr = f47972i;
        long[] jArr2 = i6 == 0 ? jArr : new long[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            jArr2[i10] = j$.time.zone.a.a(dataInput);
        }
        int i11 = i6 + 1;
        j$.time.ZoneOffset[] zoneOffsetArr = new j$.time.ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr[i12] = j$.time.zone.a.b(dataInput);
        }
        int i13 = dataInput.readInt();
        if (i13 != 0) {
            jArr = new long[i13];
        }
        long[] jArr3 = jArr;
        for (int i14 = 0; i14 < i13; i14++) {
            jArr3[i14] = j$.time.zone.a.a(dataInput);
        }
        int i15 = i13 + 1;
        j$.time.ZoneOffset[] zoneOffsetArr2 = new j$.time.ZoneOffset[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            zoneOffsetArr2[i16] = j$.time.zone.a.b(dataInput);
        }
        int i17 = dataInput.readByte();
        j$.time.zone.e[] eVarArr = i17 == 0 ? f47973j : new j$.time.zone.e[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            eVarArr[i18] = j$.time.zone.e.b(dataInput);
        }
        return new j$.time.zone.ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a(this.f47982g != null ? (byte) 100 : (byte) 1, this);
    }

    public final j$.time.ZoneOffset d(j$.time.Instant instant) {
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f47978c;
        if (jArr.length == 0) {
            return this.f47977b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f47981f.length;
        j$.time.ZoneOffset[] zoneOffsetArr = this.f47980e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = java.util.Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        j$.time.zone.b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        j$.time.zone.b bVar = null;
        for (int i6 = 0; i6 < bVarArrB.length; i6++) {
            bVar = bVarArrB[i6];
            if (epochSecond < bVar.L()) {
                return bVar.x();
            }
        }
        return bVar.u();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.zone.ZoneRules)) {
            return false;
        }
        j$.time.zone.ZoneRules zoneRules = (j$.time.zone.ZoneRules) obj;
        return j$.util.Objects.equals(this.f47982g, zoneRules.f47982g) && java.util.Arrays.equals(this.f47976a, zoneRules.f47976a) && java.util.Arrays.equals(this.f47977b, zoneRules.f47977b) && java.util.Arrays.equals(this.f47978c, zoneRules.f47978c) && java.util.Arrays.equals(this.f47980e, zoneRules.f47980e) && java.util.Arrays.equals(this.f47981f, zoneRules.f47981f);
    }

    public final j$.time.zone.b f(j$.time.LocalDateTime localDateTime) {
        java.lang.Object objE = e(localDateTime);
        if (objE instanceof j$.time.zone.b) {
            return (j$.time.zone.b) objE;
        }
        return null;
    }

    public final java.util.List g(j$.time.LocalDateTime localDateTime) {
        java.lang.Object objE = e(localDateTime);
        return objE instanceof j$.time.zone.b ? ((j$.time.zone.b) objE).y() : java.util.Collections.singletonList((j$.time.ZoneOffset) objE);
    }

    public final boolean h(j$.time.Instant instant) {
        j$.time.ZoneOffset zoneOffsetJ;
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone != null) {
            zoneOffsetJ = j(timeZone.getRawOffset());
        } else {
            int length = this.f47978c.length;
            j$.time.ZoneOffset[] zoneOffsetArr = this.f47977b;
            if (length == 0) {
                zoneOffsetJ = zoneOffsetArr[0];
            } else {
                int iBinarySearch = java.util.Arrays.binarySearch(this.f47976a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetJ = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetJ.equals(d(instant));
    }

    public final int hashCode() {
        return ((((j$.util.Objects.hashCode(this.f47982g) ^ java.util.Arrays.hashCode(this.f47976a)) ^ java.util.Arrays.hashCode(this.f47977b)) ^ java.util.Arrays.hashCode(this.f47978c)) ^ java.util.Arrays.hashCode(this.f47980e)) ^ java.util.Arrays.hashCode(this.f47981f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public boolean isFixedOffset() {
        j$.time.zone.b bVar;
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone == null) {
            return this.f47978c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        j$.time.Instant instant2 = j$.time.Clock.systemUTC().instant();
        long epochSecond = instant2.getEpochSecond();
        if (instant2.O() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iC = c(epochSecond, d(instant2));
        j$.time.zone.b[] bVarArrB = b(iC);
        for (int length = bVarArrB.length - 1; length >= 0; length--) {
            if (epochSecond > bVarArrB[length].L()) {
                bVar = bVarArrB[length];
                if (bVar == null) {
                    return true;
                }
                return false;
            }
        }
        if (iC > 1800) {
            j$.time.zone.b[] bVarArrB2 = b(iC - 1);
            for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                if (epochSecond > bVarArrB2[length2].L()) {
                    bVar = bVarArrB2[length2];
                }
            }
            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
            long epochDay = j$.time.LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
            for (long jMin = java.lang.Math.min(epochSecond - 31104000, (j$.time.Clock.systemUTC().b() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                int offset2 = timeZone.getOffset(jMin * 1000);
                if (offset != offset2) {
                    int iC2 = c(jMin, j(offset2));
                    j$.time.zone.b[] bVarArrB3 = b(iC2 + 1);
                    for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                        if (epochSecond > bVarArrB3[length3].L()) {
                            bVar = bVarArrB3[length3];
                        }
                    }
                    j$.time.zone.b[] bVarArrB4 = b(iC2);
                    bVar = bVarArrB4[bVarArrB4.length - 1];
                }
            }
            bVar = null;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return true;
        }
        return false;
    }

    final void l(java.io.DataOutput dataOutput) throws java.io.IOException {
        long[] jArr = this.f47976a;
        dataOutput.writeInt(jArr.length);
        for (long j6 : jArr) {
            j$.time.zone.a.c(j6, dataOutput);
        }
        for (j$.time.ZoneOffset zoneOffset : this.f47977b) {
            j$.time.zone.a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.f47978c;
        dataOutput.writeInt(jArr2.length);
        for (long j10 : jArr2) {
            j$.time.zone.a.c(j10, dataOutput);
        }
        for (j$.time.ZoneOffset zoneOffset2 : this.f47980e) {
            j$.time.zone.a.d(zoneOffset2, dataOutput);
        }
        j$.time.zone.e[] eVarArr = this.f47981f;
        dataOutput.writeByte(eVarArr.length);
        for (j$.time.zone.e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    final void m(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeUTF(this.f47982g.getID());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.util.TimeZone timeZone = this.f47982g;
        if (timeZone != null) {
            java.lang.String id = timeZone.getID();
            sb = new java.lang.StringBuilder("ZoneRules[timeZone=");
            sb.append(id);
        } else {
            j$.time.ZoneOffset[] zoneOffsetArr = this.f47977b;
            j$.time.ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
            sb = new java.lang.StringBuilder("ZoneRules[currentStandardOffset=");
            sb.append(zoneOffset);
        }
        sb.append("]");
        return sb.toString();
    }
}
