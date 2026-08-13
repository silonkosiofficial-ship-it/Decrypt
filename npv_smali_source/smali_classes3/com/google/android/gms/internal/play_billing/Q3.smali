.class public final Lcom/google/android/gms/internal/play_billing/Q3;
.super Lcom/google/android/gms/internal/play_billing/J2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/R3;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S3;->A()Lcom/google/android/gms/internal/play_billing/S3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/J2;-><init>(Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method


# virtual methods
.method public final q(Lcom/google/android/gms/internal/play_billing/L4;)Lcom/google/android/gms/internal/play_billing/Q3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/S3;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/N4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/S3;->B(Lcom/google/android/gms/internal/play_billing/S3;Lcom/google/android/gms/internal/play_billing/N4;)V

    return-object p0
.end method

.method public final r(I)Lcom/google/android/gms/internal/play_billing/Q3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/S3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/S3;->C(Lcom/google/android/gms/internal/play_billing/S3;I)V

    return-object p0
.end method
