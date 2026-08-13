.class final Lcom/google/android/gms/internal/ads/O1;
.super Lcom/google/android/gms/internal/ads/H0;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/ads/T0;

.field final synthetic c:Lcom/google/android/gms/internal/ads/P1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/P1;Lcom/google/android/gms/internal/ads/T0;Lcom/google/android/gms/internal/ads/T0;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/O1;->b:Lcom/google/android/gms/internal/ads/T0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O1;->c:Lcom/google/android/gms/internal/ads/P1;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/H0;-><init>(Lcom/google/android/gms/internal/ads/T0;)V

    return-void
.end method


# virtual methods
.method public final b(J)Lcom/google/android/gms/internal/ads/R0;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O1;->b:Lcom/google/android/gms/internal/ads/T0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/T0;->b(J)Lcom/google/android/gms/internal/ads/R0;

    move-result-object p1

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/R0;->a:Lcom/google/android/gms/internal/ads/U0;

    iget-wide v0, p2, Lcom/google/android/gms/internal/ads/U0;->b:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/O1;->c:Lcom/google/android/gms/internal/ads/P1;

    new-instance v3, Lcom/google/android/gms/internal/ads/R0;

    new-instance v4, Lcom/google/android/gms/internal/ads/U0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/P1;->a(Lcom/google/android/gms/internal/ads/P1;)J

    move-result-wide v5

    add-long/2addr v0, v5

    iget-wide v5, p2, Lcom/google/android/gms/internal/ads/U0;->a:J

    invoke-direct {v4, v5, v6, v0, v1}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R0;->b:Lcom/google/android/gms/internal/ads/U0;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/U0;->b:J

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/O1;->c:Lcom/google/android/gms/internal/ads/P1;

    new-instance v2, Lcom/google/android/gms/internal/ads/U0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/P1;->a(Lcom/google/android/gms/internal/ads/P1;)J

    move-result-wide v5

    add-long/2addr v0, v5

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/U0;->a:J

    invoke-direct {v2, p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    invoke-direct {v3, v4, v2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object v3
.end method
