.class final Lcom/google/android/gms/internal/ads/sT;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic C:Landroid/app/AlertDialog;

.field final synthetic D:Ljava/util/Timer;

.field final synthetic E:Lu3/x;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tT;Landroid/app/AlertDialog;Ljava/util/Timer;Lu3/x;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sT;->C:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sT;->D:Ljava/util/Timer;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sT;->E:Lu3/x;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sT;->C:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sT;->D:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sT;->E:Lu3/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu3/x;->b()V

    :cond_0
    return-void
.end method
