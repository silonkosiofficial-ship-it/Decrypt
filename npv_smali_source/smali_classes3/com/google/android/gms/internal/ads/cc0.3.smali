.class final Lcom/google/android/gms/internal/ads/cc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Landroid/webkit/WebView;

.field final synthetic D:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dc0;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cc0;->C:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cc0;->D:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc0;->C:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cc0;->D:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/dc0;->k(Landroid/webkit/WebView;Ljava/lang/String;)Z

    return-void
.end method
