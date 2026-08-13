.class public final LQ3/u0;
.super Le4/a;
.source "SourceFile"

# interfaces
.implements LQ3/S;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-direct {p0, p1, v0}, Le4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final f()LX3/a;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
