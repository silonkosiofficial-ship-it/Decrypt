.class public final Lk4/g;
.super Ld4/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Ld4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c2(Lk4/j;Lk4/f;)V
    .locals 1

    invoke-virtual {p0}, Ld4/a;->q0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ld4/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Ld4/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Ld4/a;->y0(ILandroid/os/Parcel;)V

    return-void
.end method
