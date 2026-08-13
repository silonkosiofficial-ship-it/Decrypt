.class public final Lcom/google/android/gms/internal/play_billing/Q1;
.super Lcom/google/android/gms/internal/play_billing/J2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/j3;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/S1;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/R1;->B()Lcom/google/android/gms/internal/play_billing/R1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/J2;-><init>(Lcom/google/android/gms/internal/play_billing/L2;)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/play_billing/Q1;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/R1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/R1;->C(Lcom/google/android/gms/internal/play_billing/R1;Ljava/lang/Iterable;)V

    return-object p0
.end method
