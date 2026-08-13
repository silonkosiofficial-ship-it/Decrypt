.class public final Lcom/google/android/gms/internal/play_billing/h;
.super Lcom/google/android/gms/internal/play_billing/e;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/e;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final N1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/l;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/e;->q0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    sget p1, Lcom/google/android/gms/internal/play_billing/g;->a:I

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/e;->L0(ILandroid/os/Parcel;)V

    return-void
.end method
