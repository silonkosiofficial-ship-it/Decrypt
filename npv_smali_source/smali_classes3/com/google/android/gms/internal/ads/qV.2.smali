.class public final synthetic Lcom/google/android/gms/internal/ads/qV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/sV;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sV;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qV;->a:Lcom/google/android/gms/internal/ads/sV;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qV;->b:Lcom/google/android/gms/internal/ads/e70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qV;->c:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qV;->a:Lcom/google/android/gms/internal/ads/sV;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qV;->b:Lcom/google/android/gms/internal/ads/e70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qV;->c:Lcom/google/android/gms/internal/ads/R60;

    check-cast p1, Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/sV;->f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONArray;)LP4/d;

    move-result-object p1

    return-object p1
.end method
