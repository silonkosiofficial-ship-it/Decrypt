.class public final LQ3/V;
.super Le4/a;
.source "SourceFile"

# interfaces
.implements LQ3/X;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-direct {p0, p1, v0}, Le4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final F5(LN3/C;)LN3/E;
    .locals 1

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le4/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, LN3/E;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Le4/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, LN3/E;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final P3(LN3/C;)LN3/E;
    .locals 1

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le4/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, LN3/E;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Le4/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, LN3/E;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final h()Z
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, Le4/c;->e(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final z3(LN3/G;LX3/a;)Z
    .locals 1

    invoke-virtual {p0}, Le4/a;->y0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le4/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Le4/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Le4/a;->q0(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, Le4/c;->e(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method
