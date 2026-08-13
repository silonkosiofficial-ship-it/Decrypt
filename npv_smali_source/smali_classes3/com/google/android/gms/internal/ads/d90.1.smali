.class public final synthetic Lcom/google/android/gms/internal/ads/d90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Z80;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Z80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d90;->a:Lcom/google/android/gms/internal/ads/Z80;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d90;->a:Lcom/google/android/gms/internal/ads/Z80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Z80;->a()V

    const/4 v0, 0x0

    return-object v0
.end method
