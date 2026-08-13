.class final Lcom/google/android/gms/internal/ads/x50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/B50;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/B50;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x50;->a:Lcom/google/android/gms/internal/ads/B50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/Po;

    new-instance v0, Lcom/google/android/gms/internal/ads/y50;

    new-instance v1, Lcom/google/android/gms/internal/ads/o80;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/Po;->L:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/o80;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/y50;-><init>(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/A50;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x50;->a:Lcom/google/android/gms/internal/ads/B50;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/B50;->d(Lcom/google/android/gms/internal/ads/B50;Lcom/google/android/gms/internal/ads/y50;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x50;->a:Lcom/google/android/gms/internal/ads/B50;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/B50;->a(Lcom/google/android/gms/internal/ads/B50;)Lcom/google/android/gms/internal/ads/y50;

    move-result-object p1

    return-object p1
.end method
