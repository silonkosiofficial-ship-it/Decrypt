.class public final synthetic Lcom/google/android/gms/internal/ads/y60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/A60;

.field public final synthetic D:Ls3/W0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/A60;Ls3/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y60;->C:Lcom/google/android/gms/internal/ads/A60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/y60;->D:Ls3/W0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y60;->C:Lcom/google/android/gms/internal/ads/A60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/A60;->e:Lcom/google/android/gms/internal/ads/E60;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/E60;->f(Lcom/google/android/gms/internal/ads/E60;)Lcom/google/android/gms/internal/ads/t60;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/y60;->D:Ls3/W0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/t60;->u0(Ls3/W0;)V

    return-void
.end method
