.class public final Lcom/google/android/gms/internal/ads/kO;
.super Lcom/google/android/gms/internal/ads/oO;
.source "SourceFile"


# instance fields
.field private final k:LC3/a;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lw3/v;LC3/a;LC3/c;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2, p4, p5}, Lcom/google/android/gms/internal/ads/oO;-><init>(Ljava/util/concurrent/Executor;Lw3/v;LC3/c;Landroid/content/Context;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kO;->k:LC3/a;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oO;->a:Ljava/util/Map;

    invoke-virtual {p3, p1}, LC3/a;->a(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final i()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oO;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
