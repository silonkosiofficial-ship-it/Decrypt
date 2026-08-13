.class public final synthetic Lcom/google/android/gms/internal/ads/uQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/xQ;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xQ;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uQ;->b:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uQ;->b:Lcom/google/android/gms/internal/ads/Po;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/xQ;->a(Lcom/google/android/gms/internal/ads/Po;)Lcom/google/android/gms/internal/ads/BR;

    move-result-object v0

    return-object v0
.end method
