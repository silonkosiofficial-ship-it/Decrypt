.class final Lcom/google/android/gms/internal/ads/yl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/or;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/mr;

.field final synthetic b:Lcom/google/android/gms/internal/ads/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/mr;Lcom/google/android/gms/internal/ads/bl;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yl;->a:Lcom/google/android/gms/internal/ads/mr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yl;->b:Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const-string v0, "callJs > getEngine: Promise rejected"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/kl;

    const-string v1, "Unable to obtain a JavascriptEngine."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/kl;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yl;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yl;->b:Lcom/google/android/gms/internal/ads/bl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bl;->h()V

    return-void
.end method
