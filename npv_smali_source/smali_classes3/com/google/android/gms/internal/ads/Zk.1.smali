.class final Lcom/google/android/gms/internal/ads/Zk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qr;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Zk;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    const-string p1, "Releasing engine reference."

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Zk;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bl;->g(Lcom/google/android/gms/internal/ads/bl;)Lcom/google/android/gms/internal/ads/gl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gl;->j()V

    return-void
.end method
