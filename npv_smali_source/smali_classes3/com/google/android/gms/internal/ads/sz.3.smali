.class public final Lcom/google/android/gms/internal/ads/sz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Ot;

.field private final D:Lcom/google/android/gms/internal/ads/eO;

.field private final E:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sz;->C:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sz;->D:Lcom/google/android/gms/internal/ads/eO;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sz;->E:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final t()V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Lc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sz;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lv3/d;->a(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const-string v0, "0"

    goto :goto_0

    :cond_0
    const-string v0, "1"

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sz;->D:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v1

    const-string v2, "action"

    const-string v3, "hcp"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sz;->E:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/dO;->c(Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dO;->g()V

    :cond_1
    return-void
.end method
