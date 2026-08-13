.class final Lcom/google/android/gms/internal/ads/qc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Landroid/webkit/WebView;

.field final synthetic D:Lcom/google/android/gms/internal/ads/rc0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/rc0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qc0;->D:Lcom/google/android/gms/internal/ads/rc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/rc0;->q(Lcom/google/android/gms/internal/ads/rc0;)Landroid/webkit/WebView;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qc0;->C:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qc0;->C:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method
