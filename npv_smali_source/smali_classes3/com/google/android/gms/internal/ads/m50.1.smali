.class public final synthetic Lcom/google/android/gms/internal/ads/m50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/q50;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/jC;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/q50;Lcom/google/android/gms/internal/ads/jC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/m50;->a:Lcom/google/android/gms/internal/ads/q50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/m50;->b:Lcom/google/android/gms/internal/ads/jC;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m50;->a:Lcom/google/android/gms/internal/ads/q50;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m50;->b:Lcom/google/android/gms/internal/ads/jC;

    check-cast p1, Lcom/google/android/gms/internal/ads/y50;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/q50;->b(Lcom/google/android/gms/internal/ads/jC;Lcom/google/android/gms/internal/ads/y50;)LP4/d;

    move-result-object p1

    return-object p1
.end method
