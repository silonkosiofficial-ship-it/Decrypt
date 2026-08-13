package R3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(android.os.Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(android.os.Parcel parcel, int i6) {
        w(parcel, i6);
    }

    public static void c(android.os.Parcel parcel, int i6, boolean z6) {
        x(parcel, i6, 4);
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static void d(android.os.Parcel parcel, int i6, java.lang.Boolean bool, boolean z6) {
        if (bool != null) {
            x(parcel, i6, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z6) {
            x(parcel, i6, 0);
        }
    }

    public static void e(android.os.Parcel parcel, int i6, android.os.Bundle bundle, boolean z6) {
        if (bundle == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeBundle(bundle);
            w(parcel, iV);
        }
    }

    public static void f(android.os.Parcel parcel, int i6, byte[] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeByteArray(bArr);
            w(parcel, iV);
        }
    }

    public static void g(android.os.Parcel parcel, int i6, java.lang.Double d6, boolean z6) {
        if (d6 != null) {
            x(parcel, i6, 8);
            parcel.writeDouble(d6.doubleValue());
        } else if (z6) {
            x(parcel, i6, 0);
        }
    }

    public static void h(android.os.Parcel parcel, int i6, float f6) {
        x(parcel, i6, 4);
        parcel.writeFloat(f6);
    }

    public static void i(android.os.Parcel parcel, int i6, java.lang.Float f6, boolean z6) {
        if (f6 != null) {
            x(parcel, i6, 4);
            parcel.writeFloat(f6.floatValue());
        } else if (z6) {
            x(parcel, i6, 0);
        }
    }

    public static void j(android.os.Parcel parcel, int i6, android.os.IBinder iBinder, boolean z6) {
        if (iBinder == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeStrongBinder(iBinder);
            w(parcel, iV);
        }
    }

    public static void k(android.os.Parcel parcel, int i6, int i10) {
        x(parcel, i6, 4);
        parcel.writeInt(i10);
    }

    public static void l(android.os.Parcel parcel, int i6, int[] iArr, boolean z6) {
        if (iArr == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeIntArray(iArr);
            w(parcel, iV);
        }
    }

    public static void m(android.os.Parcel parcel, int i6, java.util.List list, boolean z6) {
        if (list == null) {
            if (z6) {
                x(parcel, i6, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((java.lang.Integer) list.get(i10)).intValue());
        }
        w(parcel, iV);
    }

    public static void n(android.os.Parcel parcel, int i6, long j6) {
        x(parcel, i6, 8);
        parcel.writeLong(j6);
    }

    public static void o(android.os.Parcel parcel, int i6, java.lang.Long l6, boolean z6) {
        if (l6 != null) {
            x(parcel, i6, 8);
            parcel.writeLong(l6.longValue());
        } else if (z6) {
            x(parcel, i6, 0);
        }
    }

    public static void p(android.os.Parcel parcel, int i6, android.os.Parcelable parcelable, int i10, boolean z6) {
        if (parcelable == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcelable.writeToParcel(parcel, i10);
            w(parcel, iV);
        }
    }

    public static void q(android.os.Parcel parcel, int i6, java.lang.String str, boolean z6) {
        if (str == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeString(str);
            w(parcel, iV);
        }
    }

    public static void r(android.os.Parcel parcel, int i6, java.lang.String[] strArr, boolean z6) {
        if (strArr == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeStringArray(strArr);
            w(parcel, iV);
        }
    }

    public static void s(android.os.Parcel parcel, int i6, java.util.List list, boolean z6) {
        if (list == null) {
            if (z6) {
                x(parcel, i6, 0);
            }
        } else {
            int iV = v(parcel, i6);
            parcel.writeStringList(list);
            w(parcel, iV);
        }
    }

    public static void t(android.os.Parcel parcel, int i6, android.os.Parcelable[] parcelableArr, int i10, boolean z6) {
        if (parcelableArr == null) {
            if (z6) {
                x(parcel, i6, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i6);
        parcel.writeInt(parcelableArr.length);
        for (android.os.Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, i10);
            }
        }
        w(parcel, iV);
    }

    public static void u(android.os.Parcel parcel, int i6, java.util.List list, boolean z6) {
        if (list == null) {
            if (z6) {
                x(parcel, i6, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, 0);
            }
        }
        w(parcel, iV);
    }

    private static int v(android.os.Parcel parcel, int i6) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void w(android.os.Parcel parcel, int i6) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(iDataPosition - i6);
        parcel.setDataPosition(iDataPosition);
    }

    private static void x(android.os.Parcel parcel, int i6, int i10) {
        parcel.writeInt(i6 | (i10 << 16));
    }

    private static void y(android.os.Parcel parcel, android.os.Parcelable parcelable, int i6) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i6);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
