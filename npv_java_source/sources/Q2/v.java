package Q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f8850d;

        static {
            int[] iArr = new int[I2.n.values().length];
            f8850d = iArr;
            try {
                iArr[I2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f8850d[I2.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I2.k.values().length];
            f8849c = iArr2;
            try {
                iArr2[I2.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f8849c[I2.k.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f8849c[I2.k.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f8849c[I2.k.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f8849c[I2.k.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[I2.a.values().length];
            f8848b = iArr3;
            try {
                iArr3[I2.a.EXPONENTIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f8848b[I2.a.LINEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[I2.s.values().length];
            f8847a = iArr4;
            try {
                iArr4[I2.s.ENQUEUED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f8847a[I2.s.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f8847a[I2.s.SUCCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f8847a[I2.s.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f8847a[I2.s.BLOCKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f8847a[I2.s.CANCELLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(I2.a aVar) {
        int i6 = Q2.v.a.f8848b[aVar.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static I2.c b(byte[] bArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.ObjectInputStream objectInputStream;
        java.io.IOException e6;
        I2.c cVar = new I2.c();
        if (bArr == null) {
            return cVar;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i6 = objectInputStream.readInt(); i6 > 0; i6--) {
                            cVar.a(android.net.Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e10) {
                            e10.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (java.io.IOException e11) {
                        e6 = e11;
                        e6.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.io.IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (java.io.IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (java.io.IOException e14) {
                        e14.printStackTrace();
                        throw th;
                    }
                }
            } catch (java.io.IOException e15) {
                objectInputStream = null;
                e6 = e15;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (java.io.IOException e16) {
            e16.printStackTrace();
        }
        return cVar;
    }

    public static byte[] c(I2.c cVar) throws java.lang.Throwable {
        java.io.ObjectOutputStream objectOutputStream = null;
        if (cVar.c() == 0) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            try {
                try {
                    java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(cVar.c());
                        for (I2.c.a aVar : cVar.b()) {
                            objectOutputStream2.writeUTF(aVar.a().toString());
                            objectOutputStream2.writeBoolean(aVar.b());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (java.io.IOException e6) {
                            e6.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e10) {
                        e = e10;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (java.io.IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (java.io.IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (java.io.IOException e13) {
                            e13.printStackTrace();
                            throw th;
                        }
                    }
                } catch (java.io.IOException e14) {
                    e = e14;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException e15) {
            e15.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static I2.a d(int i6) {
        if (i6 == 0) {
            return I2.a.EXPONENTIAL;
        }
        if (i6 == 1) {
            return I2.a.LINEAR;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i6 + " to BackoffPolicy");
    }

    public static I2.k e(int i6) {
        if (i6 == 0) {
            return I2.k.NOT_REQUIRED;
        }
        if (i6 == 1) {
            return I2.k.CONNECTED;
        }
        if (i6 == 2) {
            return I2.k.UNMETERED;
        }
        if (i6 == 3) {
            return I2.k.NOT_ROAMING;
        }
        if (i6 == 4) {
            return I2.k.METERED;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && i6 == 5) {
            return I2.k.TEMPORARILY_UNMETERED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i6 + " to NetworkType");
    }

    public static I2.n f(int i6) {
        if (i6 == 0) {
            return I2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i6 == 1) {
            return I2.n.DROP_WORK_REQUEST;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i6 + " to OutOfQuotaPolicy");
    }

    public static I2.s g(int i6) {
        if (i6 == 0) {
            return I2.s.ENQUEUED;
        }
        if (i6 == 1) {
            return I2.s.RUNNING;
        }
        if (i6 == 2) {
            return I2.s.SUCCEEDED;
        }
        if (i6 == 3) {
            return I2.s.FAILED;
        }
        if (i6 == 4) {
            return I2.s.BLOCKED;
        }
        if (i6 == 5) {
            return I2.s.CANCELLED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + i6 + " to State");
    }

    public static int h(I2.k kVar) {
        int i6 = Q2.v.a.f8849c[kVar.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && kVar == I2.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(I2.n nVar) {
        int i6 = Q2.v.a.f8850d[nVar.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(I2.s sVar) {
        switch (Q2.v.a.f8847a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new java.lang.IllegalArgumentException("Could not convert " + sVar + " to int");
        }
    }
}
