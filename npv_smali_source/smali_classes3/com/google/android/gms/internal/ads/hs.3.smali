.class final Lcom/google/android/gms/internal/ads/hs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Tr;

.field private D:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Tr;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/hs;->D:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hs;->C:Lcom/google/android/gms/internal/ads/Tr;

    return-void
.end method

.method private final c()V
    .locals 3

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/hs;->D:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hs;->C:Lcom/google/android/gms/internal/ads/Tr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Tr;->D()V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/hs;->D:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hs;->c()V

    return-void
.end method

.method public final run()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/hs;->D:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hs;->C:Lcom/google/android/gms/internal/ads/Tr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Tr;->D()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hs;->c()V

    :cond_0
    return-void
.end method
