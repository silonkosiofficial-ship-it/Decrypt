.class public final Lcom/google/android/gms/internal/ads/Cc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/json/JSONObject;

.field private final b:Lcom/google/android/gms/internal/ads/Jc0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Jc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cc0;->b:Lcom/google/android/gms/internal/ads/Jc0;

    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Cc0;->a:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final b()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Kc0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Kc0;-><init>(Lcom/google/android/gms/internal/ads/Cc0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Cc0;->b:Lcom/google/android/gms/internal/ads/Jc0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Jc0;->b(Lcom/google/android/gms/internal/ads/Ic0;)V

    return-void
.end method

.method public final c(Lorg/json/JSONObject;Ljava/util/HashSet;J)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/Lc0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Lc0;-><init>(Lcom/google/android/gms/internal/ads/Cc0;Ljava/util/HashSet;Lorg/json/JSONObject;J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Cc0;->b:Lcom/google/android/gms/internal/ads/Jc0;

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/Jc0;->b(Lcom/google/android/gms/internal/ads/Ic0;)V

    return-void
.end method

.method public final d(Lorg/json/JSONObject;Ljava/util/HashSet;J)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/Nc0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Nc0;-><init>(Lcom/google/android/gms/internal/ads/Cc0;Ljava/util/HashSet;Lorg/json/JSONObject;J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Cc0;->b:Lcom/google/android/gms/internal/ads/Jc0;

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/Jc0;->b(Lcom/google/android/gms/internal/ads/Ic0;)V

    return-void
.end method

.method public final e(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cc0;->a:Lorg/json/JSONObject;

    return-void
.end method
