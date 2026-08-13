package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalTime implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable<j$.time.LocalTime>, java.io.Serializable {
    public static final j$.time.LocalTime MAX;
    public static final j$.time.LocalTime MIDNIGHT;
    public static final j$.time.LocalTime MIN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j$.time.LocalTime[] f47689e = new j$.time.LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f47690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f47691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f47692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47693d;

    static {
        int i6 = 0;
        while (true) {
            j$.time.LocalTime[] localTimeArr = f47689e;
            if (i6 >= localTimeArr.length) {
                j$.time.LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                j$.time.LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new j$.time.LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i6] = new j$.time.LocalTime(i6, 0, 0, 0);
            i6++;
        }
    }

    private LocalTime(int i6, int i10, int i11, int i12) {
        this.f47690a = (byte) i6;
        this.f47691b = (byte) i10;
        this.f47692c = (byte) i11;
        this.f47693d = i12;
    }

    private static j$.time.LocalTime M(int i6, int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f47689e[i6] : new j$.time.LocalTime(i6, i10, i11, i12);
    }

    public static j$.time.LocalTime N(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.LocalTime localTime = (j$.time.LocalTime) temporalAccessor.x(j$.time.temporal.n.g());
        if (localTime != null) {
            return localTime;
        }
        throw new j$.time.DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int O(j$.time.temporal.s sVar) {
        int i6 = j$.time.g.f47895a[((j$.time.temporal.a) sVar).ordinal()];
        byte b6 = this.f47691b;
        int i10 = this.f47693d;
        byte b10 = this.f47690a;
        switch (i6) {
            case 1:
                return i10;
            case 2:
                throw new j$.time.temporal.u("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i10 / 1000;
            case 4:
                throw new j$.time.temporal.u("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i10 / 1000000;
            case 6:
                return (int) (Y() / 1000000);
            case 7:
                return this.f47692c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b6;
            case 10:
                return (b10 * 60) + b6;
            case 11:
                return b10 % 12;
            case 12:
                int i11 = b10 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return b10;
            case 14:
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return b10 / 12;
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
    }

    public static j$.time.LocalTime P(int i6) {
        j$.time.temporal.a.HOUR_OF_DAY.O(i6);
        return f47689e[i6];
    }

    public static j$.time.LocalTime Q(long j6) {
        j$.time.temporal.a.NANO_OF_DAY.O(j6);
        int i6 = (int) (j6 / 3600000000000L);
        long j10 = j6 - (((long) i6) * 3600000000000L);
        int i10 = (int) (j10 / 60000000000L);
        long j11 = j10 - (((long) i10) * 60000000000L);
        int i11 = (int) (j11 / 1000000000);
        return M(i6, i10, i11, (int) (j11 - (((long) i11) * 1000000000)));
    }

    public static j$.time.LocalTime R(long j6) {
        j$.time.temporal.a.SECOND_OF_DAY.O(j6);
        int i6 = (int) (j6 / 3600);
        long j10 = j6 - ((long) (i6 * 3600));
        int i10 = (int) (j10 / 60);
        return M(i6, i10, (int) (j10 - ((long) (i10 * 60))), 0);
    }

    static j$.time.LocalTime X(java.io.DataInput dataInput) throws java.io.IOException {
        int i6;
        int i10;
        int i11 = dataInput.readByte();
        int i12 = 0;
        if (i11 < 0) {
            i11 = ~i11;
            i6 = 0;
            i10 = 0;
        } else {
            byte b6 = dataInput.readByte();
            if (b6 < 0) {
                int i13 = ~b6;
                i10 = 0;
                i12 = i13;
                i6 = 0;
            } else {
                byte b10 = dataInput.readByte();
                if (b10 < 0) {
                    i6 = ~b10;
                } else {
                    i12 = dataInput.readInt();
                    i6 = b10;
                }
                i10 = i12;
                i12 = b6;
            }
        }
        return of(i11, i12, i6, i10);
    }

    public static j$.time.LocalTime of(int i6, int i10, int i11, int i12) {
        j$.time.temporal.a.HOUR_OF_DAY.O(i6);
        j$.time.temporal.a.MINUTE_OF_HOUR.O(i10);
        j$.time.temporal.a.SECOND_OF_MINUTE.O(i11);
        j$.time.temporal.a.NANO_OF_SECOND.O(i12);
        return M(i6, i10, i11, i12);
    }

    public static j$.time.LocalTime parse(java.lang.CharSequence charSequence) {
        j$.time.format.DateTimeFormatter dateTimeFormatter = j$.time.format.DateTimeFormatter.f47793h;
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (j$.time.LocalTime) dateTimeFormatter.parse(charSequence, new j$.time.d(2));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 4, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalTime d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.LocalTime) tVar.n(this, j6);
        }
        switch (j$.time.g.f47896b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return V(j6);
            case 2:
                return V((j6 % 86400000000L) * 1000);
            case 3:
                return V((j6 % 86400000) * 1000000);
            case 4:
                return W(j6);
            case 5:
                return U(j6);
            case 6:
                return T(j6);
            case 7:
                return T((j6 % 2) * 12);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final j$.time.LocalTime T(long j6) {
        if (j6 == 0) {
            return this;
        }
        return M(((((int) (j6 % 24)) + this.f47690a) + 24) % 24, this.f47691b, this.f47692c, this.f47693d);
    }

    public final j$.time.LocalTime U(long j6) {
        if (j6 == 0) {
            return this;
        }
        int i6 = (this.f47690a * 60) + this.f47691b;
        int i10 = ((((int) (j6 % 1440)) + i6) + 1440) % 1440;
        return i6 == i10 ? this : M(i10 / 60, i10 % 60, this.f47692c, this.f47693d);
    }

    public final j$.time.LocalTime V(long j6) {
        if (j6 == 0) {
            return this;
        }
        long jY = Y();
        long j10 = (((j6 % 86400000000000L) + jY) + 86400000000000L) % 86400000000000L;
        return jY == j10 ? this : M((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
    }

    public final j$.time.LocalTime W(long j6) {
        if (j6 == 0) {
            return this;
        }
        int i6 = (this.f47691b * 60) + (this.f47690a * 3600) + this.f47692c;
        int i10 = ((((int) (j6 % 86400)) + i6) + 86400) % 86400;
        return i6 == i10 ? this : M(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f47693d);
    }

    public final long Y() {
        return (((long) this.f47692c) * 1000000000) + (((long) this.f47691b) * 60000000000L) + (((long) this.f47690a) * 3600000000000L) + ((long) this.f47693d);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalTime c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalTime) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        aVar.O(j6);
        int i6 = j$.time.g.f47895a[aVar.ordinal()];
        byte b6 = this.f47691b;
        byte b10 = this.f47692c;
        int i10 = this.f47693d;
        byte b11 = this.f47690a;
        switch (i6) {
            case 1:
                return a0((int) j6);
            case 2:
                return Q(j6);
            case 3:
                return a0(((int) j6) * 1000);
            case 4:
                return Q(j6 * 1000);
            case 5:
                return a0(((int) j6) * 1000000);
            case 6:
                return Q(j6 * 1000000);
            case 7:
                int i11 = (int) j6;
                if (b10 == i11) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.O(i11);
                return M(b11, b6, i11, i10);
            case 8:
                return W(j6 - ((long) toSecondOfDay()));
            case 9:
                int i12 = (int) j6;
                if (b6 == i12) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.O(i12);
                return M(b11, i12, b10, i10);
            case 10:
                return U(j6 - ((long) ((b11 * 60) + b6)));
            case 11:
                return T(j6 - ((long) (b11 % 12)));
            case 12:
                if (j6 == 12) {
                    j6 = 0;
                }
                return T(j6 - ((long) (b11 % 12)));
            case 13:
                int i13 = (int) j6;
                if (b11 == i13) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.O(i13);
                return M(i13, b6, b10, i10);
            case 14:
                if (j6 == 24) {
                    j6 = 0;
                }
                int i14 = (int) j6;
                if (b11 == i14) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.O(i14);
                return M(i14, b6, b10, i10);
            case 15:
                return T((j6 - ((long) (b11 / 12))) * 12);
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
    }

    public final j$.time.LocalTime a0(int i6) {
        if (this.f47693d == i6) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.O(i6);
        return M(this.f47690a, this.f47691b, this.f47692c, i6);
    }

    final void b0(java.io.DataOutput dataOutput) {
        int i6;
        byte b6 = this.f47692c;
        byte b10 = this.f47690a;
        byte b11 = this.f47691b;
        int i10 = this.f47693d;
        if (i10 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b6);
            dataOutput.writeInt(i10);
            return;
        }
        if (b6 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            i6 = ~b6;
        } else if (b11 == 0) {
            i6 = ~b10;
        } else {
            dataOutput.writeByte(b10);
            i6 = ~b11;
        }
        dataOutput.writeByte(i6);
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.LocalTime localTime) {
        int iCompare = java.lang.Integer.compare(this.f47690a, localTime.f47690a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = java.lang.Integer.compare(this.f47691b, localTime.f47691b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = java.lang.Integer.compare(this.f47692c, localTime.f47692c);
        return iCompare3 == 0 ? java.lang.Integer.compare(this.f47693d, localTime.f47693d) : iCompare3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P();
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.LocalTime)) {
            return false;
        }
        j$.time.LocalTime localTime = (j$.time.LocalTime) obj;
        return this.f47690a == localTime.f47690a && this.f47691b == localTime.f47691b && this.f47692c == localTime.f47692c && this.f47693d == localTime.f47693d;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public int getHour() {
        return this.f47690a;
    }

    public int getMinute() {
        return this.f47691b;
    }

    public int getNano() {
        return this.f47693d;
    }

    public int getSecond() {
        return this.f47692c;
    }

    public int hashCode() {
        long jY = Y();
        return (int) (jY ^ (jY >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? O(sVar) : j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.LocalTime) j$.time.chrono.AbstractC6701g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    public int toSecondOfDay() {
        return (this.f47691b * 60) + (this.f47690a * 3600) + this.f47692c;
    }

    public java.lang.String toString() {
        int i6;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
        byte b6 = this.f47690a;
        sb.append(b6 < 10 ? "0" : "");
        sb.append((int) b6);
        byte b10 = this.f47691b;
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        byte b11 = this.f47692c;
        int i10 = this.f47693d;
        if (b11 > 0 || i10 > 0) {
            sb.append(b11 < 10 ? ":0" : ":");
            sb.append((int) b11);
            if (i10 > 0) {
                sb.append('.');
                int i11 = 1000000;
                if (i10 % 1000000 == 0) {
                    i6 = (i10 / 1000000) + 1000;
                } else {
                    if (i10 % 1000 == 0) {
                        i10 /= 1000;
                    } else {
                        i11 = 1000000000;
                    }
                    i6 = i10 + i11;
                }
                sb.append(java.lang.Integer.toString(i6).substring(1));
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        if (sVar == j$.time.temporal.a.NANO_OF_DAY) {
            return Y();
        }
        return sVar == j$.time.temporal.a.MICRO_OF_DAY ? Y() / 1000 : O(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.e() || temporalQuery == j$.time.temporal.n.l() || temporalQuery == j$.time.temporal.n.k() || temporalQuery == j$.time.temporal.n.i()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.n.f()) {
            return null;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(Y(), j$.time.temporal.a.NANO_OF_DAY);
    }
}
