.class final Lcom/google/android/gms/internal/ads/cl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qr;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/bl;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cl;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/Bk;

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Bk;->j()Lcom/google/android/gms/internal/ads/jl;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cl;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/tr;->e(Ljava/lang/Object;)V

    return-void
.end method
