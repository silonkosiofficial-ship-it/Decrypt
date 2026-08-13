.class public final synthetic Lcom/google/android/gms/internal/ads/zZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/AZ;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/AZ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zZ;->a:Lcom/google/android/gms/internal/ads/AZ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zZ;->a:Lcom/google/android/gms/internal/ads/AZ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/AZ;->c()Lcom/google/android/gms/internal/ads/BZ;

    move-result-object v0

    return-object v0
.end method
