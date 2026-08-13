.class final Lcom/google/android/gms/internal/ads/tH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/HI0;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/HI0;

.field private final D:Lcom/google/android/gms/internal/ads/ci0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/HI0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ci0;->M(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tH0;->D:Lcom/google/android/gms/internal/ads/ci0;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/HI0;->a(J)V

    return-void
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/HI0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/HI0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/ZA0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/HI0;->d(Lcom/google/android/gms/internal/ads/ZA0;)Z

    move-result p1

    return p1
.end method

.method public final e()Lcom/google/android/gms/internal/ads/ci0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->D:Lcom/google/android/gms/internal/ads/ci0;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tH0;->C:Lcom/google/android/gms/internal/ads/HI0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/HI0;->q()Z

    move-result v0

    return v0
.end method
