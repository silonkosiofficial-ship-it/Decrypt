.class public final Lcom/google/android/gms/internal/ads/HJ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/HJ;->a:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Lc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1}, Lv3/d;->a(Landroid/view/View;)Z

    move-result p1

    if-eq v0, p1, :cond_1

    const-string p1, "0"

    goto :goto_0

    :cond_1
    const-string p1, "1"

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HJ;->a:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "hcp"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/dO;->c(Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    :cond_2
    :goto_1
    return-void
.end method
