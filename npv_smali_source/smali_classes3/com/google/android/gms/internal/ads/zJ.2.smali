.class public final synthetic Lcom/google/android/gms/internal/ads/zJ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic D:I

.field public final synthetic E:Lcom/google/android/gms/internal/ads/aK;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILcom/google/android/gms/internal/ads/aK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zJ;->C:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zJ;->D:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zJ;->E:Lcom/google/android/gms/internal/ads/aK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zJ;->C:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zJ;->E:Lcom/google/android/gms/internal/ads/aK;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zJ;->D:I

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/cL;

    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/internal/ads/cL;->a(ILcom/google/android/gms/internal/ads/aK;)V

    goto :goto_0

    :cond_0
    return-void
.end method
