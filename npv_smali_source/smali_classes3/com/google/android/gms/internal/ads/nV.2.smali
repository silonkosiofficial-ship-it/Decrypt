.class public final synthetic Lcom/google/android/gms/internal/ads/nV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/sV;

.field public final synthetic b:LP4/d;

.field public final synthetic c:LP4/d;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic f:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sV;LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nV;->a:Lcom/google/android/gms/internal/ads/sV;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nV;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/nV;->c:LP4/d;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/nV;->d:Lcom/google/android/gms/internal/ads/e70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/nV;->e:Lcom/google/android/gms/internal/ads/R60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/nV;->f:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nV;->a:Lcom/google/android/gms/internal/ads/sV;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nV;->b:LP4/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nV;->c:LP4/d;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/nV;->d:Lcom/google/android/gms/internal/ads/e70;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/nV;->e:Lcom/google/android/gms/internal/ads/R60;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/nV;->f:Lorg/json/JSONObject;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/sV;->c(LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ZI;

    move-result-object v0

    return-object v0
.end method
