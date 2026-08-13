.class final Lcom/google/android/gms/internal/ads/iq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:LV3/f;

.field private c:Lv3/s0;

.field private d:Lcom/google/android/gms/internal/ads/pq;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lv3/s0;)Lcom/google/android/gms/internal/ads/iq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->c:Lv3/s0;

    return-object p0
.end method

.method public final b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/iq;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->a:Landroid/content/Context;

    return-object p0
.end method

.method public final c(LV3/f;)Lcom/google/android/gms/internal/ads/iq;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->b:LV3/f;

    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/pq;)Lcom/google/android/gms/internal/ads/iq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->d:Lcom/google/android/gms/internal/ads/pq;

    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/qq;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->b:LV3/f;

    const-class v1, LV3/f;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->c:Lv3/s0;

    const-class v1, Lv3/s0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->d:Lcom/google/android/gms/internal/ads/pq;

    const-class v1, Lcom/google/android/gms/internal/ads/pq;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/jq;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/iq;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/iq;->b:LV3/f;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/iq;->c:Lv3/s0;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/iq;->d:Lcom/google/android/gms/internal/ads/pq;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/jq;-><init>(Landroid/content/Context;LV3/f;Lv3/s0;Lcom/google/android/gms/internal/ads/pq;Lcom/google/android/gms/internal/ads/kq;)V

    return-object v0
.end method
