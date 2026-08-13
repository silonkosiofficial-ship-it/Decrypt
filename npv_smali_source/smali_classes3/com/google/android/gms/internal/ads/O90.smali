.class final Lcom/google/android/gms/internal/ads/O90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Q90;

.field final synthetic b:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O90;->a:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/O90;->b:Lcom/google/android/gms/internal/ads/E90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O90;->b:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/O90;->a:Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
