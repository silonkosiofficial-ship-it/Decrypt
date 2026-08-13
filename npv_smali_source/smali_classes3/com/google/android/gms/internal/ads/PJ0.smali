.class public abstract Lcom/google/android/gms/internal/ads/PJ0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/OJ0;

.field private b:Lcom/google/android/gms/internal/ads/XJ0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b()Lcom/google/android/gms/internal/ads/CB0;
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/PJ0;->a:Lcom/google/android/gms/internal/ads/OJ0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/PJ0;->b:Lcom/google/android/gms/internal/ads/XJ0;

    return-void
.end method

.method public abstract d(Lcom/google/android/gms/internal/ads/vS;)V
.end method

.method public abstract e()Z
.end method

.method public abstract f([Lcom/google/android/gms/internal/ads/DB0;Lcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/QJ0;
.end method

.method public abstract g(Ljava/lang/Object;)V
.end method

.method protected final h()Lcom/google/android/gms/internal/ads/XJ0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PJ0;->b:Lcom/google/android/gms/internal/ads/XJ0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/OJ0;Lcom/google/android/gms/internal/ads/XJ0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PJ0;->a:Lcom/google/android/gms/internal/ads/OJ0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/PJ0;->b:Lcom/google/android/gms/internal/ads/XJ0;

    return-void
.end method

.method protected final j()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PJ0;->a:Lcom/google/android/gms/internal/ads/OJ0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/OJ0;->j()V

    :cond_0
    return-void
.end method
