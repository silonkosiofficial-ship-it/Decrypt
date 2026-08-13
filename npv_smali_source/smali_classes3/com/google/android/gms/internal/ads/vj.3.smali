.class final Lcom/google/android/gms/internal/ads/vj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/wj;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/xj;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/kl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/kl;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
