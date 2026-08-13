.class public final Lcom/google/android/gms/internal/ads/W0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/T0;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final b(J)Lcom/google/android/gms/internal/ads/R0;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/R0;

    new-instance v1, Lcom/google/android/gms/internal/ads/U0;

    const-wide/16 v2, 0x0

    invoke-direct {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
