.class public final synthetic Lcom/google/android/gms/internal/ads/UI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ZI;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/UI;->D:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/UI;->D:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ZI;->e0(Z)V

    return-void
.end method
