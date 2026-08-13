.class final Lcom/google/android/gms/internal/ads/k90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/a90;

.field final synthetic b:Lcom/google/android/gms/internal/ads/l90;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/l90;Lcom/google/android/gms/internal/ads/a90;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/k90;->a:Lcom/google/android/gms/internal/ads/a90;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k90;->b:Lcom/google/android/gms/internal/ads/l90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k90;->b:Lcom/google/android/gms/internal/ads/l90;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n90;->c(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/o90;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/k90;->a:Lcom/google/android/gms/internal/ads/a90;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/o90;->c0(Lcom/google/android/gms/internal/ads/a90;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/k90;->b:Lcom/google/android/gms/internal/ads/l90;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/n90;->c(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/o90;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k90;->a:Lcom/google/android/gms/internal/ads/a90;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/o90;->r(Lcom/google/android/gms/internal/ads/a90;)V

    return-void
.end method
