.class public final Lcom/google/android/gms/internal/play_billing/L4;
.super Lcom/google/android/gms/internal/play_billing/J2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/M4;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N4;->A()Lcom/google/android/gms/internal/play_billing/N4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/J2;-><init>(Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method


# virtual methods
.method public final q(Z)Lcom/google/android/gms/internal/play_billing/L4;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->n()V

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    check-cast p1, Lcom/google/android/gms/internal/play_billing/N4;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/N4;->B(Lcom/google/android/gms/internal/play_billing/N4;Z)V

    return-object p0
.end method
