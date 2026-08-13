.class final Lcom/google/android/gms/internal/ads/sr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/qr;

.field final synthetic b:Lcom/google/android/gms/internal/ads/or;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tr;Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sr;->a:Lcom/google/android/gms/internal/ads/qr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sr;->b:Lcom/google/android/gms/internal/ads/or;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sr;->b:Lcom/google/android/gms/internal/ads/or;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/or;->a()V

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sr;->a:Lcom/google/android/gms/internal/ads/qr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/qr;->b(Ljava/lang/Object;)V

    return-void
.end method
