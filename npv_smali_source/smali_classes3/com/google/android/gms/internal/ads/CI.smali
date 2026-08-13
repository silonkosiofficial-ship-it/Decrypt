.class public final Lcom/google/android/gms/internal/ads/CI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/BI;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CI;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CI;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/EI;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/EI;->a()Lcom/google/android/gms/internal/ads/jJ;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jJ;->c()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
