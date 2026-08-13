.class final Lcom/google/android/gms/internal/ads/fl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qr;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/gl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fl;->a:Lcom/google/android/gms/internal/ads/gl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/Bk;

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/el;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/el;-><init>(Lcom/google/android/gms/internal/ads/fl;Lcom/google/android/gms/internal/ads/Bk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
