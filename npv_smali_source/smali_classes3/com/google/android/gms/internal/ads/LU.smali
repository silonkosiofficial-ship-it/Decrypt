.class public final synthetic Lcom/google/android/gms/internal/ads/LU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZH;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/MU;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/MU;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LU;->a:Lcom/google/android/gms/internal/ads/MU;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/LU;->b:Lcom/google/android/gms/internal/ads/mr;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LU;->a:Lcom/google/android/gms/internal/ads/MU;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/LU;->b:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/MU;->d(Lcom/google/android/gms/internal/ads/mr;ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V

    return-void
.end method
