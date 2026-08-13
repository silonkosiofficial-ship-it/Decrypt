package j$.time;

/* JADX INFO: loaded from: classes4.dex */
final class n implements java.io.Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f47908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f47909b;

    public n() {
    }

    n(byte b6, java.lang.Object obj) {
        this.f47908a = b6;
        this.f47909b = obj;
    }

    static java.io.Serializable a(java.io.ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static java.io.Serializable b(byte b6, java.io.ObjectInput objectInput) throws java.io.StreamCorruptedException {
        switch (b6) {
            case 1:
                j$.time.Duration duration = j$.time.Duration.f47679c;
                return j$.time.Duration.y(objectInput.readLong(), objectInput.readInt());
            case 2:
                j$.time.Instant instant = j$.time.Instant.EPOCH;
                return j$.time.Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
                return j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j$.time.LocalTime.X(objectInput);
            case 5:
                j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.MIN;
                j$.time.LocalDate localDate2 = j$.time.LocalDate.MIN;
                return j$.time.LocalDateTime.of(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.X(objectInput));
            case 6:
                return j$.time.ZonedDateTime.Q(objectInput);
            case 7:
                int i6 = j$.time.s.f47918d;
                return j$.time.ZoneId.M(objectInput.readUTF(), false);
            case 8:
                return j$.time.ZoneOffset.T(objectInput);
            case 9:
                return j$.time.l.O(objectInput);
            case 10:
                return j$.time.OffsetDateTime.P(objectInput);
            case 11:
                int i10 = j$.time.p.f47912b;
                return j$.time.p.M(objectInput.readInt());
            case 12:
                return j$.time.r.Q(objectInput);
            case 13:
                return j$.time.j.M(objectInput);
            case 14:
                return j$.time.m.c(objectInput);
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
    }

    private java.lang.Object readResolve() {
        return this.f47909b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b6 = objectInput.readByte();
        this.f47908a = b6;
        this.f47909b = b(b6, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b6 = this.f47908a;
        java.lang.Object obj = this.f47909b;
        objectOutput.writeByte(b6);
        switch (b6) {
            case 1:
                ((j$.time.Duration) obj).M(objectOutput);
                return;
            case 2:
                ((j$.time.Instant) obj).S(objectOutput);
                return;
            case 3:
                ((j$.time.LocalDate) obj).h0(objectOutput);
                return;
            case 4:
                ((j$.time.LocalTime) obj).b0(objectOutput);
                return;
            case 5:
                ((j$.time.LocalDateTime) obj).c0(objectOutput);
                return;
            case 6:
                ((j$.time.ZonedDateTime) obj).U(objectOutput);
                return;
            case 7:
                ((j$.time.s) obj).R(objectOutput);
                return;
            case 8:
                ((j$.time.ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                ((j$.time.l) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((j$.time.OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((j$.time.p) obj).Q(objectOutput);
                return;
            case 12:
                ((j$.time.r) obj).T(objectOutput);
                return;
            case 13:
                ((j$.time.j) obj).N(objectOutput);
                return;
            case 14:
                ((j$.time.m) obj).e(objectOutput);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }
}
