.class public abstract LQ3/W;
.super Le4/b;
.source "SourceFile"

# interfaces
.implements LQ3/X;


# direct methods
.method public static y0(Landroid/os/IBinder;)LQ3/X;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LQ3/X;

    if-eqz v1, :cond_1

    check-cast v0, LQ3/X;

    return-object v0

    :cond_1
    new-instance v0, LQ3/V;

    invoke-direct {v0, p0}, LQ3/V;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
