.class public final synthetic Lcom/google/android/gms/internal/ads/Ia0;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ia0;->C:Lcom/google/android/gms/internal/ads/La0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ia0;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ia0;->E:Lw3/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ia0;->C:Lcom/google/android/gms/internal/ads/La0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ia0;->D:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ia0;->E:Lw3/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/La0;->c(Ljava/lang/String;Lw3/w;)LP4/d;

    return-void
.end method
