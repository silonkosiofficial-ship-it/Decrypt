package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
final class C implements java.io.Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f47714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f47715b;

    public C() {
    }

    C(byte b6, java.lang.Object obj) {
        this.f47714a = b6;
        this.f47715b = obj;
    }

    private java.lang.Object readResolve() {
        return this.f47715b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.lang.Object objU;
        byte b6 = objectInput.readByte();
        this.f47714a = b6;
        switch (b6) {
            case 1:
                int i6 = j$.time.chrono.AbstractC6695a.f47724d;
                objU = j$.time.chrono.AbstractC6695a.u(objectInput.readUTF());
                break;
            case 2:
                objU = ((j$.time.chrono.ChronoLocalDate) objectInput.readObject()).w((j$.time.LocalTime) objectInput.readObject());
                break;
            case 3:
                objU = ((j$.time.chrono.ChronoLocalDateTime) objectInput.readObject()).m((j$.time.ZoneOffset) objectInput.readObject()).j((j$.time.ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.LocalDate localDate = j$.time.chrono.v.f47763d;
                int i10 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                j$.time.chrono.t.f47761e.getClass();
                objU = new j$.time.chrono.v(j$.time.LocalDate.of(i10, b10, b11));
                break;
            case 5:
                j$.time.chrono.w wVar = j$.time.chrono.w.f47767d;
                objU = j$.time.chrono.w.r(objectInput.readByte());
                break;
            case 6:
                j$.time.chrono.m mVar = (j$.time.chrono.m) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                mVar.getClass();
                objU = j$.time.chrono.o.R(mVar, i11, b12, b13);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                j$.time.chrono.y.f47773e.getClass();
                objU = new j$.time.chrono.A(j$.time.LocalDate.of(i12 + 1911, b14, b15));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                j$.time.chrono.E.f47717e.getClass();
                objU = new j$.time.chrono.G(j$.time.LocalDate.of(i13 - 543, b16, b17));
                break;
            case 9:
                int i14 = j$.time.chrono.C6700f.f47729e;
                objU = new j$.time.chrono.C6700f(j$.time.chrono.AbstractC6695a.u(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
        this.f47715b = objU;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b6 = this.f47714a;
        java.lang.Object obj = this.f47715b;
        objectOutput.writeByte(b6);
        switch (b6) {
            case 1:
                objectOutput.writeUTF(((j$.time.chrono.AbstractC6695a) obj).getId());
                return;
            case 2:
                ((j$.time.chrono.C6699e) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((j$.time.chrono.j) obj).writeExternal(objectOutput);
                return;
            case 4:
                j$.time.chrono.v vVar = (j$.time.chrono.v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(vVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(vVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(vVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((j$.time.chrono.w) obj).E(objectOutput);
                return;
            case 6:
                ((j$.time.chrono.o) obj).writeExternal(objectOutput);
                return;
            case 7:
                j$.time.chrono.A a6 = (j$.time.chrono.A) obj;
                a6.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(a6, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(a6, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(a6, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j$.time.chrono.G g6 = (j$.time.chrono.G) obj;
                g6.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(g6, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(g6, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(g6, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((j$.time.chrono.C6700f) obj).a(objectOutput);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }
}
