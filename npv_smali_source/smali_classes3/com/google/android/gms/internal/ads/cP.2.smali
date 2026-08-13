.class public final synthetic Lcom/google/android/gms/internal/ads/cP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/pP;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cP;->a:Lcom/google/android/gms/internal/ads/pP;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cP;->b:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cP;->a:Lcom/google/android/gms/internal/ads/pP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cP;->b:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pP;->f(Lcom/google/android/gms/internal/ads/E90;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
