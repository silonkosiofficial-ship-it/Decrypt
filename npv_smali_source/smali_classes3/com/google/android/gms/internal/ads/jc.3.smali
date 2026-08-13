.class public final synthetic Lcom/google/android/gms/internal/ads/jc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/kc;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/cc;

.field public final synthetic c:Landroid/webkit/WebView;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kc;Lcom/google/android/gms/internal/ads/cc;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jc;->a:Lcom/google/android/gms/internal/ads/kc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jc;->b:Lcom/google/android/gms/internal/ads/cc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jc;->c:Landroid/webkit/WebView;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/jc;->d:Z

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jc;->a:Lcom/google/android/gms/internal/ads/kc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kc;->G:Lcom/google/android/gms/internal/ads/mc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jc;->b:Lcom/google/android/gms/internal/ads/cc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jc;->c:Landroid/webkit/WebView;

    check-cast p1, Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/jc;->d:Z

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/mc;->c(Lcom/google/android/gms/internal/ads/cc;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void
.end method
