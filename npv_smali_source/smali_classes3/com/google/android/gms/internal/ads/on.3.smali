.class public final synthetic Lcom/google/android/gms/internal/ads/on;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/qn;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/qn;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/on;->C:Lcom/google/android/gms/internal/ads/qn;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/on;->D:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/on;->C:Lcom/google/android/gms/internal/ads/qn;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/on;->D:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/qn;->j(Z)V

    return-void
.end method
