.class public final Lcom/google/android/gms/internal/ads/lV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/XT;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/SM;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/SM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lV;->a:Lcom/google/android/gms/internal/ads/SM;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/YT;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lV;->a:Lcom/google/android/gms/internal/ads/SM;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/SM;->c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/M70;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/TU;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/TU;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/YT;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/YT;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/qD;Ljava/lang/String;)V

    return-object v1
.end method
