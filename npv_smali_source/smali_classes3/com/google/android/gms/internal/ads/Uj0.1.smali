.class final Lcom/google/android/gms/internal/ads/Uj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final C:Lcom/google/android/gms/internal/ads/ak0;

.field final D:LP4/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ak0;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uj0;->C:Lcom/google/android/gms/internal/ads/ak0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Uj0;->D:LP4/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uj0;->C:Lcom/google/android/gms/internal/ads/ak0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ak0;->n(Lcom/google/android/gms/internal/ads/ak0;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uj0;->D:LP4/d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Uj0;->C:Lcom/google/android/gms/internal/ads/ak0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ak0;->o(LP4/d;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ak0;->k()Lcom/google/android/gms/internal/ads/Pj0;

    move-result-object v2

    invoke-virtual {v2, v1, p0, v0}, Lcom/google/android/gms/internal/ads/Pj0;->f(Lcom/google/android/gms/internal/ads/ak0;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uj0;->C:Lcom/google/android/gms/internal/ads/ak0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ak0;->s(Lcom/google/android/gms/internal/ads/ak0;Z)V

    :cond_1
    :goto_0
    return-void
.end method
