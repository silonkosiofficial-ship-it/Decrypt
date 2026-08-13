.class final Lcom/google/android/gms/internal/ads/w50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/B50;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/B50;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/w50;->a:Lcom/google/android/gms/internal/ads/B50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-string v0, ""

    check-cast p1, Lcom/google/android/gms/internal/ads/AR;

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, "Failed to get a cache key, reverting to legacy flow."

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w50;->a:Lcom/google/android/gms/internal/ads/B50;

    new-instance v0, Lcom/google/android/gms/internal/ads/y50;

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/B50;->b(Lcom/google/android/gms/internal/ads/B50;)Lcom/google/android/gms/internal/ads/m80;

    move-result-object v2

    invoke-direct {v0, v1, v2, v1}, Lcom/google/android/gms/internal/ads/y50;-><init>(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/A50;)V

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/B50;->d(Lcom/google/android/gms/internal/ads/B50;Lcom/google/android/gms/internal/ads/y50;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/w50;->a:Lcom/google/android/gms/internal/ads/B50;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/B50;->a(Lcom/google/android/gms/internal/ads/B50;)Lcom/google/android/gms/internal/ads/y50;

    move-result-object p1

    return-object p1
.end method
