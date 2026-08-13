.class public final Lcom/google/android/gms/internal/ads/jX;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/QH;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/QH;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jX;->a:Lcom/google/android/gms/internal/ads/QH;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Landroid/view/View;Lcom/google/android/gms/internal/ads/eX;)Ljava/lang/Object;
    .locals 2

    new-instance p3, Lcom/google/android/gms/internal/ads/hX;

    new-instance v0, Lcom/google/android/gms/internal/ads/gX;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gX;-><init>()V

    invoke-direct {p3, p0, v0}, Lcom/google/android/gms/internal/ads/hX;-><init>(Lcom/google/android/gms/internal/ads/jX;Lcom/google/android/gms/internal/ads/ZH;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jX;->a:Lcom/google/android/gms/internal/ads/QH;

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/ads/QH;->c(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/pH;)Lcom/google/android/gms/internal/ads/mH;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/iX;

    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/iX;-><init>(Lcom/google/android/gms/internal/ads/jX;Lcom/google/android/gms/internal/ads/mH;)V

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/eX;->d(Lr3/g;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mH;->i()Lcom/google/android/gms/internal/ads/lH;

    move-result-object p1

    return-object p1
.end method
