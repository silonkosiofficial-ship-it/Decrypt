.class public final synthetic Lcom/google/android/gms/internal/ads/wY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/xY;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wY;->a:Lcom/google/android/gms/internal/ads/xY;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wY;->a:Lcom/google/android/gms/internal/ads/xY;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xY;->c()Lcom/google/android/gms/internal/ads/zY;

    move-result-object v0

    return-object v0
.end method
