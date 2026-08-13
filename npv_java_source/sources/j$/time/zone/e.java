package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.io.Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.Month f47992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f47993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.DayOfWeek f47994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.LocalTime f47995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j$.time.zone.d f47997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j$.time.ZoneOffset f47998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j$.time.ZoneOffset f47999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j$.time.ZoneOffset f48000i;

    e(j$.time.Month month, int i6, j$.time.DayOfWeek dayOfWeek, j$.time.LocalTime localTime, boolean z6, j$.time.zone.d dVar, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2, j$.time.ZoneOffset zoneOffset3) {
        this.f47992a = month;
        this.f47993b = (byte) i6;
        this.f47994c = dayOfWeek;
        this.f47995d = localTime;
        this.f47996e = z6;
        this.f47997f = dVar;
        this.f47998g = zoneOffset;
        this.f47999h = zoneOffset2;
        this.f48000i = zoneOffset3;
    }

    static j$.time.zone.e b(java.io.DataInput dataInput) {
        j$.time.ZoneOffset zoneOffsetOfTotalSeconds;
        j$.time.ZoneOffset zoneOffsetOfTotalSeconds2;
        int i6 = dataInput.readInt();
        j$.time.Month monthP = j$.time.Month.P(i6 >>> 28);
        int i10 = ((264241152 & i6) >>> 22) - 32;
        int i11 = (3670016 & i6) >>> 19;
        j$.time.DayOfWeek dayOfWeekM = i11 == 0 ? null : j$.time.DayOfWeek.M(i11);
        int i12 = (507904 & i6) >>> 14;
        j$.time.zone.d dVar = j$.time.zone.d.values()[(i6 & 12288) >>> 12];
        int i13 = (i6 & 4080) >>> 4;
        int i14 = (i6 & 12) >>> 2;
        int i15 = i6 & 3;
        j$.time.LocalTime localTimeR = i12 == 31 ? j$.time.LocalTime.R(dataInput.readInt()) : j$.time.LocalTime.P(i12 % 24);
        j$.time.ZoneOffset zoneOffsetOfTotalSeconds3 = j$.time.ZoneOffset.ofTotalSeconds(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        if (i14 == 3) {
            zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds(dataInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds((i14 * 1800) + zoneOffsetOfTotalSeconds3.getTotalSeconds());
        }
        j$.time.ZoneOffset zoneOffset = zoneOffsetOfTotalSeconds;
        if (i15 == 3) {
            zoneOffsetOfTotalSeconds2 = j$.time.ZoneOffset.ofTotalSeconds(dataInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds2 = j$.time.ZoneOffset.ofTotalSeconds((i15 * 1800) + zoneOffsetOfTotalSeconds3.getTotalSeconds());
        }
        boolean z6 = i12 == 24;
        j$.util.Objects.requireNonNull(monthP, "month");
        j$.util.Objects.requireNonNull(localTimeR, "time");
        j$.util.Objects.requireNonNull(dVar, "timeDefnition");
        j$.util.Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "standardOffset");
        j$.util.Objects.requireNonNull(zoneOffset, "offsetBefore");
        j$.util.Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new java.lang.IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z6 && !localTimeR.equals(j$.time.LocalTime.MIDNIGHT)) {
            throw new java.lang.IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeR.getNano() == 0) {
            return new j$.time.zone.e(monthP, i10, dayOfWeekM, localTimeR, z6, dVar, zoneOffsetOfTotalSeconds3, zoneOffset, zoneOffsetOfTotalSeconds2);
        }
        throw new java.lang.IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a((byte) 3, this);
    }

    public final j$.time.zone.b a(int i6) {
        j$.time.LocalDate localDateU;
        j$.time.temporal.p pVar;
        int totalSeconds;
        j$.time.ZoneOffset zoneOffset;
        j$.time.DayOfWeek dayOfWeek = this.f47994c;
        j$.time.Month month = this.f47992a;
        byte b6 = this.f47993b;
        if (b6 < 0) {
            localDateU = j$.time.LocalDate.U(i6, month, month.N(j$.time.chrono.q.f47758e.J(i6)) + 1 + b6);
            if (dayOfWeek != null) {
                pVar = new j$.time.temporal.p(dayOfWeek.getValue(), 1);
                localDateU = localDateU.k(pVar);
            }
        } else {
            localDateU = j$.time.LocalDate.U(i6, month, b6);
            if (dayOfWeek != null) {
                pVar = new j$.time.temporal.p(dayOfWeek.getValue(), 0);
                localDateU = localDateU.k(pVar);
            }
        }
        if (this.f47996e) {
            localDateU = localDateU.Y(1L);
        }
        j$.time.LocalDateTime localDateTimeOf = j$.time.LocalDateTime.of(localDateU, this.f47995d);
        j$.time.zone.d dVar = this.f47997f;
        dVar.getClass();
        int i10 = j$.time.zone.c.f47990a[dVar.ordinal()];
        j$.time.ZoneOffset zoneOffset2 = this.f47999h;
        if (i10 != 1) {
            if (i10 == 2) {
                totalSeconds = zoneOffset2.getTotalSeconds();
                zoneOffset = this.f47998g;
            }
            return new j$.time.zone.b(localDateTimeOf, zoneOffset2, this.f48000i);
        }
        totalSeconds = zoneOffset2.getTotalSeconds();
        zoneOffset = j$.time.ZoneOffset.UTC;
        localDateTimeOf = localDateTimeOf.W(totalSeconds - zoneOffset.getTotalSeconds());
        return new j$.time.zone.b(localDateTimeOf, zoneOffset2, this.f48000i);
    }

    final void c(java.io.DataOutput dataOutput) {
        int hour;
        j$.time.LocalTime localTime = this.f47995d;
        boolean z6 = this.f47996e;
        int secondOfDay = z6 ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.f47998g.getTotalSeconds();
        j$.time.ZoneOffset zoneOffset = this.f47999h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        j$.time.ZoneOffset zoneOffset2 = this.f48000i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            hour = z6 ? 24 : localTime.getHour();
        } else {
            hour = 31;
        }
        int i6 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i10 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i11 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        j$.time.DayOfWeek dayOfWeek = this.f47994c;
        dataOutput.writeInt((this.f47992a.getValue() << 28) + ((this.f47993b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f47997f.ordinal() << 12) + (i6 << 4) + (i10 << 2) + i11);
        if (hour == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i6 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i10 == 3) {
            dataOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i11 == 3) {
            dataOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j$.time.zone.e)) {
            return false;
        }
        j$.time.zone.e eVar = (j$.time.zone.e) obj;
        return this.f47992a == eVar.f47992a && this.f47993b == eVar.f47993b && this.f47994c == eVar.f47994c && this.f47997f == eVar.f47997f && this.f47995d.equals(eVar.f47995d) && this.f47996e == eVar.f47996e && this.f47998g.equals(eVar.f47998g) && this.f47999h.equals(eVar.f47999h) && this.f48000i.equals(eVar.f48000i);
    }

    public final int hashCode() {
        int secondOfDay = ((this.f47995d.toSecondOfDay() + (this.f47996e ? 1 : 0)) << 15) + (this.f47992a.ordinal() << 11) + ((this.f47993b + 32) << 5);
        j$.time.DayOfWeek dayOfWeek = this.f47994c;
        return ((this.f47998g.hashCode() ^ (this.f47997f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f47999h.hashCode()) ^ this.f48000i.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionRule[");
        j$.time.ZoneOffset zoneOffset = this.f47999h;
        j$.time.ZoneOffset zoneOffset2 = this.f48000i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        j$.time.Month month = this.f47992a;
        byte b6 = this.f47993b;
        j$.time.DayOfWeek dayOfWeek = this.f47994c;
        if (dayOfWeek == null) {
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b6);
        } else {
            if (b6 == -1) {
                sb.append(dayOfWeek.name());
                str = " on or before last day of ";
            } else if (b6 < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-b6) - 1);
                str = " of ";
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(month.name());
                sb.append(' ');
                sb.append((int) b6);
            }
            sb.append(str);
            sb.append(month.name());
        }
        sb.append(" at ");
        sb.append(this.f47996e ? "24:00" : this.f47995d.toString());
        sb.append(" ");
        sb.append(this.f47997f);
        sb.append(", standard offset ");
        sb.append(this.f47998g);
        sb.append(']');
        return sb.toString();
    }
}
