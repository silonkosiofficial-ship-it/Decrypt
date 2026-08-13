.class final Lcom/google/android/gms/internal/play_billing/d3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    check-cast p0, Lcom/google/android/gms/internal/play_billing/c3;

    check-cast p1, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/c3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/c3;->b()Lcom/google/android/gms/internal/play_billing/c3;

    move-result-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/c3;->d(Lcom/google/android/gms/internal/play_billing/c3;)V

    :cond_1
    return-object p0
.end method
