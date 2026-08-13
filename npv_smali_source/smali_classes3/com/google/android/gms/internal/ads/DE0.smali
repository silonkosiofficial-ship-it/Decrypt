.class public final synthetic Lcom/google/android/gms/internal/ads/DE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/JE0;

.field public final synthetic D:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/JE0;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/DE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/DE0;->D:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/DE0;->D:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/JE0;->k(Ljava/lang/Exception;)V

    return-void
.end method
