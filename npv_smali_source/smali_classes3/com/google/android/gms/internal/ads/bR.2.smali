.class public final synthetic Lcom/google/android/gms/internal/ads/bR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/dR;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/iS;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/dR;Lcom/google/android/gms/internal/ads/iS;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bR;->a:Lcom/google/android/gms/internal/ads/dR;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bR;->b:Lcom/google/android/gms/internal/ads/iS;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bR;->a:Lcom/google/android/gms/internal/ads/dR;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bR;->b:Lcom/google/android/gms/internal/ads/iS;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/dR;->c(Lcom/google/android/gms/internal/ads/iS;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
