.class public final synthetic Lcom/google/android/gms/internal/ads/Jx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/La0;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lw3/w;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Jx;->C:Lcom/google/android/gms/internal/ads/La0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Jx;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Jx;->E:Lw3/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jx;->C:Lcom/google/android/gms/internal/ads/La0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Jx;->D:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Jx;->E:Lw3/w;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/La0;->d(Ljava/lang/String;Lw3/w;Lcom/google/android/gms/internal/ads/Q90;)V

    return-void
.end method
