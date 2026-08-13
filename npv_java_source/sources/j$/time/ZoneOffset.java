package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class ZoneOffset extends j$.time.ZoneId implements j$.time.temporal.TemporalAccessor, j$.time.temporal.o, java.lang.Comparable<j$.time.ZoneOffset>, java.io.Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient java.lang.String f47704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47699d = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47700e = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    public static final j$.time.ZoneOffset UTC = ofTotalSeconds(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.ZoneOffset f47701f = ofTotalSeconds(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j$.time.ZoneOffset f47702g = ofTotalSeconds(64800);

    private ZoneOffset(int i6) {
        java.lang.String string;
        this.f47703b = i6;
        if (i6 == 0) {
            string = "Z";
        } else {
            int iAbs = java.lang.Math.abs(i6);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i10 = iAbs / 3600;
            int i11 = (iAbs / 60) % 60;
            sb.append(i6 < 0 ? "-" : "+");
            sb.append(i10 < 10 ? "0" : "");
            sb.append(i10);
            sb.append(i11 < 10 ? ":0" : ":");
            sb.append(i11);
            int i12 = iAbs % 60;
            if (i12 != 0) {
                sb.append(i12 < 10 ? ":0" : ":");
                sb.append(i12);
            }
            string = sb.toString();
        }
        this.f47704c = string;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.ZoneOffset R(java.lang.String str) {
        int iS;
        int iS2;
        int iS3;
        char cCharAt;
        j$.util.Objects.requireNonNull(str, "offsetId");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) f47700e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 3, false);
                } else if (length == 6) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 4, true);
                } else if (length == 7) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 3, false);
                    iS3 = S(str, 5, false);
                } else {
                    if (length != 9) {
                        throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    iS = S(str, 1, false);
                    iS2 = S(str, 4, true);
                    iS3 = S(str, 7, true);
                }
                iS3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? ofHoursMinutesSeconds(-iS, -iS2, -iS3) : ofHoursMinutesSeconds(iS, iS2, iS3);
            }
            throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iS = S(str, 1, false);
        iS2 = 0;
        iS3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    private static int S(java.lang.CharSequence charSequence, int i6, boolean z6) {
        if (z6 && charSequence.charAt(i6 - 1) != ':') {
            throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((java.lang.Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i6);
        char cCharAt2 = charSequence.charAt(i6 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new j$.time.DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((java.lang.Object) charSequence));
    }

    static j$.time.ZoneOffset T(java.io.DataInput dataInput) throws java.io.IOException {
        byte b6 = dataInput.readByte();
        return b6 == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b6 * 900);
    }

    public static j$.time.ZoneOffset from(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) temporalAccessor.x(j$.time.temporal.n.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new j$.time.DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static j$.time.ZoneOffset ofHoursMinutesSeconds(int i6, int i10, int i11) {
        if (i6 < -18 || i6 > 18) {
            throw new j$.time.DateTimeException("Zone offset hours not in valid range: value " + i6 + " is not in the range -18 to 18");
        }
        if (i6 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new j$.time.DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i6 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new j$.time.DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new j$.time.DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new j$.time.DateTimeException("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new j$.time.DateTimeException("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (java.lang.Math.abs(i6) == 18 && (i10 | i11) != 0) {
            throw new j$.time.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return ofTotalSeconds((i10 * 60) + (i6 * 3600) + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.ZoneOffset ofTotalSeconds(int i6) {
        if (i6 < -64800 || i6 > 64800) {
            throw new j$.time.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i6 % 900 != 0) {
            return new j$.time.ZoneOffset(i6);
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = f47699d;
        j$.time.ZoneOffset zoneOffset = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new j$.time.ZoneOffset(i6));
        j$.time.ZoneOffset zoneOffset2 = (j$.time.ZoneOffset) concurrentHashMap.get(numValueOf);
        f47700e.putIfAbsent(zoneOffset2.f47704c, zoneOffset2);
        return zoneOffset2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 8, this);
    }

    @Override // j$.time.ZoneId
    final void P(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeByte(8);
        U(dataOutput);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.ZoneOffset zoneOffset) {
        return zoneOffset.f47703b - this.f47703b;
    }

    final void U(java.io.DataOutput dataOutput) {
        int i6 = this.f47703b;
        int i10 = i6 % 900 == 0 ? i6 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i6);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return sVar != null && sVar.u(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneOffset) {
            return this.f47703b == ((j$.time.ZoneOffset) obj).f47703b;
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final java.lang.String getId() {
        return this.f47704c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.ZoneRules getRules() {
        return j$.time.zone.ZoneRules.i(this);
    }

    public int getTotalSeconds() {
        return this.f47703b;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f47703b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f47703b;
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return j$.time.temporal.n.d(this, sVar).a(u(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.ZoneId
    public java.lang.String toString() {
        return this.f47704c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f47703b;
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.n.i() || temporalQuery == j$.time.temporal.n.k()) ? this : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(this.f47703b, j$.time.temporal.a.OFFSET_SECONDS);
    }
}
