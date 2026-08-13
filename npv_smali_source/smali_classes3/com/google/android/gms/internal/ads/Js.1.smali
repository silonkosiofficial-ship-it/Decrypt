.class final Lcom/google/android/gms/internal/ads/Js;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/Ks;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ks;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Js;->C:Lcom/google/android/gms/internal/ads/Ks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {}, Lr3/v;->C()Lcom/google/android/gms/internal/ads/Ls;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Js;->C:Lcom/google/android/gms/internal/ads/Ks;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Ls;->f(Lcom/google/android/gms/internal/ads/Ks;)V

    return-void
.end method
