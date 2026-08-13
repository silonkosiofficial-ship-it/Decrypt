.class public final synthetic Lcom/google/android/gms/internal/ads/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/F;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Gz0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/F;Lcom/google/android/gms/internal/ads/Gz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/C;->C:Lcom/google/android/gms/internal/ads/F;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/C;->D:Lcom/google/android/gms/internal/ads/Gz0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C;->C:Lcom/google/android/gms/internal/ads/F;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/C;->D:Lcom/google/android/gms/internal/ads/Gz0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/F;->i(Lcom/google/android/gms/internal/ads/Gz0;)V

    return-void
.end method
