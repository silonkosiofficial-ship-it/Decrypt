.class public abstract Lcom/google/android/gms/internal/play_billing/i;
.super Lcom/google/android/gms/internal/play_billing/f;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j;


# direct methods
.method public static y0(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/j;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/j;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/j;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/h;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/h;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
