.class public final synthetic Lcom/google/android/gms/internal/ads/Dx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Lx;

.field public final synthetic D:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dx;->C:Lcom/google/android/gms/internal/ads/Lx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Dx;->D:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dx;->C:Lcom/google/android/gms/internal/ads/Lx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Dx;->D:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Lx;->h(Ljava/lang/Throwable;)V

    return-void
.end method
