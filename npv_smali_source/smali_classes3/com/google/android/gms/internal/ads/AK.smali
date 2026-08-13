.class public final synthetic Lcom/google/android/gms/internal/ads/AK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/CK;

.field public final synthetic b:LP4/d;

.field public final synthetic c:LP4/d;

.field public final synthetic d:LP4/d;

.field public final synthetic e:LP4/d;

.field public final synthetic f:LP4/d;

.field public final synthetic g:Lorg/json/JSONObject;

.field public final synthetic h:LP4/d;

.field public final synthetic i:LP4/d;

.field public final synthetic j:LP4/d;

.field public final synthetic k:LP4/d;

.field public final synthetic l:LP4/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/CK;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;Lorg/json/JSONObject;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/AK;->a:Lcom/google/android/gms/internal/ads/CK;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/AK;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/AK;->c:LP4/d;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/AK;->d:LP4/d;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/AK;->e:LP4/d;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/AK;->f:LP4/d;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/AK;->g:Lorg/json/JSONObject;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/AK;->h:LP4/d;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/AK;->i:LP4/d;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/AK;->j:LP4/d;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/AK;->k:LP4/d;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/AK;->l:LP4/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/AK;->b:LP4/d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/AK;->c:LP4/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/AK;->d:LP4/d;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/AK;->e:LP4/d;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/AK;->f:LP4/d;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/AK;->g:Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/AK;->h:LP4/d;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/AK;->i:LP4/d;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/AK;->j:LP4/d;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/AK;->k:LP4/d;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/AK;->l:LP4/d;

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/CK;->b(LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;Lorg/json/JSONObject;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v0

    return-object v0
.end method
