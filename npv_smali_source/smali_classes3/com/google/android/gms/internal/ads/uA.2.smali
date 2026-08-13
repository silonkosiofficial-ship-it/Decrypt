.class final Lcom/google/android/gms/internal/ads/uA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Jk0;

.field final synthetic b:Lcom/google/android/gms/internal/ads/vA;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vA;Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uA;->a:Lcom/google/android/gms/internal/ads/Jk0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uA;->b:Lcom/google/android/gms/internal/ads/vA;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uA;->b:Lcom/google/android/gms/internal/ads/vA;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vA;->c(Lcom/google/android/gms/internal/ads/vA;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uA;->a:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Jk0;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uA;->b:Lcom/google/android/gms/internal/ads/vA;

    check-cast p1, Lcom/google/android/gms/internal/ads/fA;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vA;->c(Lcom/google/android/gms/internal/ads/vA;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uA;->a:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Jk0;->c(Ljava/lang/Object;)V

    return-void
.end method
