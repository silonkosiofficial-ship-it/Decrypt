.class public final synthetic Lcom/google/android/gms/internal/ads/NK0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/xI;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xI;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NK0;->C:Lcom/google/android/gms/internal/ads/xI;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NK0;->C:Lcom/google/android/gms/internal/ads/xI;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    return-void
.end method
