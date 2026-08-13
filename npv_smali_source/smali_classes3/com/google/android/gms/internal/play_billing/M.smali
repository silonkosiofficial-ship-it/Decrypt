.class final Lcom/google/android/gms/internal/play_billing/M;
.super Lcom/google/android/gms/internal/play_billing/Q;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/Q;-><init>(Lcom/google/android/gms/internal/play_billing/O;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/gms/internal/play_billing/Q;
    .locals 0

    .prologue
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/Q;->e()Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/Q;->d()Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/Q;->c()Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object p1

    :goto_0
    return-object p1
.end method
