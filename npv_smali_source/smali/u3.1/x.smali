.class public abstract Lu3/x;
.super Lcom/google/android/gms/internal/ads/Ln;
.source "SourceFile"

# interfaces
.implements Lu3/h;


# static fields
.field static final Y:I


# instance fields
.field protected final C:Landroid/app/Activity;

.field D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field E:Lcom/google/android/gms/internal/ads/Ot;

.field F:Lu3/r;

.field G:Lu3/C;

.field H:Z

.field I:Landroid/widget/FrameLayout;

.field J:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field K:Z

.field L:Z

.field M:Lu3/q;

.field N:Z

.field private final O:Ljava/lang/Object;

.field private final P:Landroid/view/View$OnClickListener;

.field private Q:Ljava/lang/Runnable;

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Landroid/widget/Toolbar;

.field X:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lu3/x;->Y:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ln;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/x;->H:Z

    iput-boolean v0, p0, Lu3/x;->K:Z

    iput-boolean v0, p0, Lu3/x;->L:Z

    iput-boolean v0, p0, Lu3/x;->N:Z

    const/4 v1, 0x1

    iput v1, p0, Lu3/x;->X:I

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lu3/x;->O:Ljava/lang/Object;

    new-instance v2, Lu3/o;

    invoke-direct {v2, p0}, Lu3/o;-><init>(Lu3/x;)V

    iput-object v2, p0, Lu3/x;->P:Landroid/view/View$OnClickListener;

    iput-boolean v0, p0, Lu3/x;->T:Z

    iput-boolean v0, p0, Lu3/x;->U:Z

    iput-boolean v1, p0, Lu3/x;->V:Z

    iput-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    return-void
.end method

.method private final u6(Landroid/view/View;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->f5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->d0()Lcom/google/android/gms/internal/ads/OT;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/OT;->a(Landroid/view/View;)V

    return-void

    :cond_2
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->e5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->g0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QT;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Lcom/google/android/gms/internal/ads/LT;->d(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private final v6(Landroid/content/res/Configuration;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Q:Lr3/l;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lr3/l;->D:Z

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object v4

    invoke-virtual {v4, v3, p1}, Lv3/b;->d(Landroid/app/Activity;Landroid/content/res/Configuration;)Z

    move-result p1

    iget-boolean v3, p0, Lu3/x;->L:Z

    if-eqz v3, :cond_2

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Q0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->P0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_3
    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Q:Lr3/l;

    if-eqz p1, :cond_4

    iget-boolean p1, p1, Lr3/l;->I:Z

    if-eqz p1, :cond_4

    move v2, v1

    :cond_4
    :goto_2
    iget-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz v1, :cond_6

    if-eqz v2, :cond_5

    const/16 v0, 0x1706

    goto :goto_3

    :cond_5
    const/16 v0, 0x1504

    goto :goto_3

    :cond_6
    const/16 v0, 0x100

    :goto_3
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void

    :cond_7
    const/16 v0, 0x800

    const/16 v3, 0x400

    if-eqz v1, :cond_9

    invoke-virtual {p1, v3}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x1002

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_8
    return-void

    :cond_9
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1, v3}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method private static final w6(Lcom/google/android/gms/internal/ads/QT;Landroid/view/View;)V
    .locals 2

    .prologue
    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->e5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/QT;->b()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object p0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/x;->F:Lu3/r;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->onPause()V

    :cond_1
    invoke-virtual {p0}, Lu3/x;->N()V

    return-void
.end method

.method public final C()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/x;->S:Z

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lu3/x;->M:Lu3/q;

    iget-object v1, p0, Lu3/x;->G:Lu3/C;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lu3/x;->y6(Z)V

    return-void
.end method

.method protected final N()V
    .locals 5

    .prologue
    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lu3/x;->T:Z

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/x;->T:Z

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_3

    iget v1, p0, Lu3/x;->X:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->S0(I)V

    iget-object v0, p0, Lu3/x;->O:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lu3/x;->R:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->T0()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->Q4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lu3/x;->U:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lu3/z;->d2()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Lu3/m;

    invoke-direct {v1, p0}, Lu3/m;-><init>(Lu3/x;)V

    iput-object v1, p0, Lu3/x;->Q:Ljava/lang/Runnable;

    sget-object v2, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->g1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :cond_2
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lu3/x;->c()V

    :cond_4
    :goto_3
    return-void
.end method

.method public final N2(I[Ljava/lang/String;[I)V
    .locals 2

    .prologue
    const/16 v0, 0x3039

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-static {}, Lcom/google/android/gms/internal/ads/vT;->e()Lcom/google/android/gms/internal/ads/uT;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/uT;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/uT;

    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/uT;->b(Lu3/x;)Lcom/google/android/gms/internal/ads/uT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/uT;->e()Lcom/google/android/gms/internal/ads/vT;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->X:Lcom/google/android/gms/internal/ads/En;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {v0, p2, p3, p1}, Lcom/google/android/gms/internal/ads/En;->i6([Ljava/lang/String;[ILX3/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final T()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    iput v0, p0, Lu3/x;->X:I

    iget-object v1, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-nez v1, :cond_0

    return v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->O8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->canGoBack()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->goBack()V

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->o1()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v1, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    const-string v2, "onbackblocked"

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return v0
.end method

.method public W3(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    iget-boolean v0, p0, Lu3/x;->S:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v2, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Lu3/x;->K:Z

    const/4 v2, 0x4

    :try_start_0
    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    move-result-object v3

    iput-object v3, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_11

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Y:Z

    if-eqz v3, :cond_3

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v3, v4, :cond_2

    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-static {v3, v1}, Lu3/v;->a(Landroid/app/Activity;Z)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    const/high16 v4, 0x80000

    invoke-virtual {v3, v4}, Landroid/view/Window;->addFlags(I)V

    :cond_3
    :goto_1
    iget-object v3, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->O:Lw3/a;

    iget v3, v3, Lw3/a;->E:I

    const v4, 0x7270e0

    if-le v3, v4, :cond_4

    iput v2, p0, Lu3/x;->X:I

    :cond_4
    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "shouldCallOnOverlayOpened"

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lu3/x;->V:Z

    :cond_5
    iget-object v3, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Q:Lr3/l;

    const/4 v5, 0x5

    if-eqz v4, :cond_6

    iget-boolean v6, v4, Lr3/l;->C:Z

    iput-boolean v6, p0, Lu3/x;->L:Z

    if-eqz v6, :cond_8

    goto :goto_2

    :cond_6
    iget v6, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    if-ne v6, v5, :cond_7

    iput-boolean v1, p0, Lu3/x;->L:Z

    :goto_2
    iget v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    if-eq v3, v5, :cond_8

    iget v3, v4, Lr3/l;->H:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_8

    new-instance v3, Lu3/t;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lu3/t;-><init>(Lu3/x;Lu3/u;)V

    invoke-virtual {v3}, Lv3/B;->b()LP4/d;

    goto :goto_3

    :cond_7
    iput-boolean v0, p0, Lu3/x;->L:Z

    :cond_8
    :goto_3
    if-nez p1, :cond_c

    iget-boolean p1, p0, Lu3/x;->V:Z

    if-eqz p1, :cond_a

    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->V:Lcom/google/android/gms/internal/ads/SC;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/SC;->d()V

    :cond_9
    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lu3/z;->T2()V

    :cond_a
    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v3, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    if-eq v3, v1, :cond_c

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->D:Ls3/a;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ls3/a;->e0()V

    :cond_b
    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->W:Lcom/google/android/gms/internal/ads/MG;

    if-eqz p1, :cond_c

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/MG;->p0()V

    :cond_c
    new-instance p1, Lu3/q;

    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    iget-object v4, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v6, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->P:Ljava/lang/String;

    iget-object v7, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->O:Lw3/a;

    iget-object v7, v7, Lw3/a;->C:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->U:Ljava/lang/String;

    invoke-direct {p1, v3, v6, v7, v4}, Lu3/q;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lu3/x;->M:Lu3/q;

    const/16 v3, 0x3e8

    invoke-virtual {p1, v3}, Landroid/view/View;->setId(I)V

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object p1

    iget-object v3, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {p1, v3}, Lv3/b;->j(Landroid/app/Activity;)V

    iget-object p1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v3, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    if-eq v3, v1, :cond_10

    const/4 v4, 0x2

    if-eq v3, v4, :cond_f

    const/4 p1, 0x3

    if-eq v3, p1, :cond_e

    if-ne v3, v5, :cond_d

    invoke-virtual {p0, v0}, Lu3/x;->s6(Z)V

    return-void

    :cond_d
    new-instance p1, Lu3/p;

    const-string v0, "Could not determine ad overlay type."

    invoke-direct {p1, v0}, Lu3/p;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-virtual {p0, v1}, Lu3/x;->s6(Z)V

    return-void

    :cond_f
    new-instance v1, Lu3/r;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    invoke-direct {v1, p1}, Lu3/r;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    iput-object v1, p0, Lu3/x;->F:Lu3/r;

    invoke-virtual {p0, v0}, Lu3/x;->s6(Z)V

    return-void

    :cond_10
    invoke-virtual {p0, v0}, Lu3/x;->s6(Z)V

    return-void

    :cond_11
    new-instance p1, Lu3/p;

    const-string v0, "Could not get info for ad overlay."

    invoke-direct {p1, v0}, Lu3/p;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lu3/p; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iput v2, p0, Lu3/x;->X:I

    iget-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v0, 0x3

    iput v0, p0, Lu3/x;->X:I

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->W0(Lu3/x;)V

    :cond_0
    return-void
.end method

.method public final b0(LX3/a;)V
    .locals 0

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Configuration;

    invoke-direct {p0, p1}, Lu3/x;->v6(Landroid/content/res/Configuration;)V

    return-void
.end method

.method final c()V
    .locals 5

    .prologue
    iget-boolean v0, p0, Lu3/x;->U:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/x;->U:Z

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lu3/x;->M:Lu3/q;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lu3/x;->F:Lu3/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v0, v0, Lu3/r;->d:Landroid/content/Context;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/Ot;->O0(Landroid/content/Context;)V

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/Ot;->f1(Z)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ac:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v2, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lu3/x;->F:Lu3/r;

    iget-object v0, v0, Lu3/r;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lu3/x;->F:Lu3/r;

    iget v4, v3, Lu3/r;->a:I

    iget-object v3, v3, Lu3/r;->b:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iput-object v1, p0, Lu3/x;->F:Lu3/r;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v2, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/Ot;->O0(Landroid/content/Context;)V

    :cond_3
    :goto_0
    iput-object v1, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    :cond_4
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_5

    iget v1, p0, Lu3/x;->X:I

    invoke-interface {v0, v1}, Lu3/z;->p4(I)V

    :cond_5
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->g0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    iget-object v1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lu3/x;->w6(Lcom/google/android/gms/internal/ads/QT;Landroid/view/View;)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected final d()V
    .locals 1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->f0()V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lu3/x;->M:Lu3/q;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lu3/q;->D:Z

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu3/x;->X:I

    return-void
.end method

.method public final i()V
    .locals 3

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lu3/x;->H:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->L:I

    invoke-virtual {p0, v0}, Lu3/x;->p6(I)V

    :cond_0
    iget-object v0, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    iget-object v2, p0, Lu3/x;->M:Lu3/q;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/x;->S:Z

    iget-object v0, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iput-object v1, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lu3/x;->J:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v1, p0, Lu3/x;->J:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/x;->H:Z

    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu3/x;->X:I

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final j2(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/16 v0, 0xec

    if-ne p1, v0, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->Wc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Callback from intent launch with requestCode: 236 and resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ku;->d()Lcom/google/android/gms/internal/ads/eO;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_3

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object p1

    const-string v0, "action"

    const-string v2, "hilca"

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->S:Ljava/lang/String;

    const-string v1, "gqi"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Sg0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hilr"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    if-eqz p3, :cond_2

    const-string p2, "callerPackage"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "loadingStage"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p2, :cond_1

    const-string v0, "hilcp"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_1
    if-eqz p3, :cond_2

    const-string p2, "hills"

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dO;->f()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final m()V
    .locals 2

    .prologue
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lu3/x;->M:Lu3/q;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-virtual {p0}, Lu3/x;->N()V

    return-void
.end method

.method public final n()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lu3/x;->N:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/x;->N:Z

    invoke-virtual {p0}, Lu3/x;->d()V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lu3/x;->i()V

    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->y0()V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->F:Lu3/r;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->onPause()V

    :cond_2
    invoke-virtual {p0}, Lu3/x;->N()V

    return-void
.end method

.method public final p6(I)V
    .locals 3

    .prologue
    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->Q5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->R5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gt v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->S5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->T5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "AdOverlay.setRequestedOrientation"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final q6(Z)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, Lu3/x;->M:Lu3/q;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lu3/x;->M:Lu3/q;

    const/high16 v0, -0x1000000

    goto :goto_0
.end method

.method public final r0()V
    .locals 3

    .prologue
    iget-object v0, p0, Lu3/x;->O:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lu3/x;->R:Z

    iget-object v1, p0, Lu3/x;->Q:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    sget-object v2, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lu3/x;->Q:Ljava/lang/Runnable;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final r6(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    iget-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    iget-object v0, p0, Lu3/x;->I:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu3/x;->S:Z

    iput-object p2, p0, Lu3/x;->J:Landroid/webkit/WebChromeClient$CustomViewCallback;

    iput-boolean p1, p0, Lu3/x;->H:Z

    return-void
.end method

.method public final s()V
    .locals 0

    return-void
.end method

.method protected final s6(Z)V
    .locals 26

    .prologue
    move-object/from16 v1, p0

    iget-boolean v0, v1, Lu3/x;->S:Z

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    iget-object v0, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_18

    iget-object v3, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ku;->o0()Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    iput-boolean v5, v1, Lu3/x;->N:Z

    if-eqz v3, :cond_5

    iget-object v6, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v6, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->L:I

    const/4 v7, 0x6

    if-ne v6, v7, :cond_4

    iget-object v6, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v2, :cond_3

    :goto_2
    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v5

    :goto_3
    iput-boolean v6, v1, Lu3/x;->N:Z

    goto :goto_4

    :cond_4
    const/4 v7, 0x7

    if-ne v6, v7, :cond_5

    iget-object v6, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    goto :goto_2

    :cond_5
    move v6, v5

    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Delay onShow to next orientation change: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lw3/p;->b(Ljava/lang/String;)V

    iget-object v6, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v6, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->L:I

    invoke-virtual {v1, v6}, Lu3/x;->p6(I)V

    const/high16 v6, 0x1000000

    invoke-virtual {v0, v6, v6}, Landroid/view/Window;->setFlags(II)V

    const-string v0, "Hardware acceleration on the AdActivity window enabled."

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    iget-boolean v0, v1, Lu3/x;->L:Z

    if-nez v0, :cond_6

    iget-object v0, v1, Lu3/x;->M:Lu3/q;

    const/high16 v6, -0x1000000

    :goto_5
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_6

    :cond_6
    iget-object v0, v1, Lu3/x;->M:Lu3/q;

    sget v6, Lu3/x;->Y:I

    goto :goto_5

    :goto_6
    iget-object v0, v1, Lu3/x;->C:Landroid/app/Activity;

    iget-object v6, v1, Lu3/x;->M:Lu3/q;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iput-boolean v2, v1, Lu3/x;->S:Z

    if-eqz p1, :cond_d

    :try_start_0
    invoke-static {}, Lr3/v;->a()Lcom/google/android/gms/internal/ads/eu;

    iget-object v6, v1, Lu3/x;->C:Landroid/app/Activity;

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v0

    move-object v7, v0

    goto :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :cond_7
    move-object v7, v4

    :goto_7
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->Y()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_8

    :cond_8
    move-object v8, v4

    :goto_8
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v13, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->O:Lw3/a;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->j()Lr3/a;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_9

    :cond_9
    move-object/from16 v16, v4

    :goto_9
    invoke-static {}, Lcom/google/android/gms/internal/ads/od;->a()Lcom/google/android/gms/internal/ads/od;

    move-result-object v17

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v10, v3

    invoke-static/range {v6 .. v21}, Lcom/google/android/gms/internal/ads/eu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    iput-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v6

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v8, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->R:Lcom/google/android/gms/internal/ads/vi;

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->G:Lcom/google/android/gms/internal/ads/xi;

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->K:Lu3/d;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ku;->f()Lr3/b;

    move-result-object v0

    move-object v14, v0

    goto :goto_a

    :cond_a
    move-object v14, v4

    :goto_a
    const/16 v24, 0x0

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-interface/range {v6 .. v25}, Lcom/google/android/gms/internal/ads/Ku;->V(Ls3/a;Lcom/google/android/gms/internal/ads/vi;Lu3/z;Lcom/google/android/gms/internal/ads/xi;Lu3/d;ZLcom/google/android/gms/internal/ads/jj;Lr3/b;Lcom/google/android/gms/internal/ads/xn;Lcom/google/android/gms/internal/ads/aq;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/Bj;Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Aj;Lcom/google/android/gms/internal/ads/uj;Lcom/google/android/gms/internal/ads/hj;Lcom/google/android/gms/internal/ads/Lx;)V

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    new-instance v6, Lu3/n;

    invoke-direct {v6, v1}, Lu3/n;-><init>(Lu3/x;)V

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->N:Ljava/lang/String;

    if-eqz v6, :cond_b

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/Ot;->loadUrl(Ljava/lang/String;)V

    goto :goto_b

    :cond_b
    iget-object v9, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->J:Ljava/lang/String;

    if-eqz v9, :cond_c

    iget-object v7, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v8, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->H:Ljava/lang/String;

    const-string v11, "UTF-8"

    const/4 v12, 0x0

    const-string v10, "text/html"

    invoke-interface/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/Ot;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_b
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_e

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->i1(Lu3/x;)V

    goto :goto_d

    :cond_c
    new-instance v0, Lu3/p;

    const-string v2, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v2}, Lu3/p;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_c
    const-string v2, "Error obtaining webview."

    invoke-static {v2, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Lu3/p;

    const-string v3, "Could not obtain webview for the overlay."

    invoke-direct {v2, v3, v0}, Lu3/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_d
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    iput-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v6, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/Ot;->O0(Landroid/content/Context;)V

    :cond_e
    :goto_d
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Y:Z

    if-eqz v0, :cond_f

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    iget-object v6, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v6

    invoke-virtual {v0, v6, v5}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    :cond_f
    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->W0(Lu3/x;)V

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->F:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->g0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    iget-object v6, v1, Lu3/x;->M:Lu3/q;

    invoke-static {v0, v6}, Lu3/x;->w6(Lcom/google/android/gms/internal/ads/QT;Landroid/view/View;)V

    :cond_10
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    const/4 v6, 0x5

    if-eq v0, v6, :cond_14

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_11

    instance-of v7, v0, Landroid/view/ViewGroup;

    if-eqz v7, :cond_11

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v7, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v7}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_11
    iget-boolean v0, v1, Lu3/x;->L:Z

    if-eqz v0, :cond_12

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->m0()V

    :cond_12
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Y:Z

    const/4 v7, -0x1

    if-eqz v0, :cond_13

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x18

    if-lt v0, v8, :cond_13

    iget-object v0, v1, Lu3/x;->C:Landroid/app/Activity;

    new-instance v8, Landroid/widget/Toolbar;

    invoke-direct {v8, v0}, Landroid/widget/Toolbar;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/view/View;->setId(I)V

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/view/View;->setId(I)V

    iget-object v0, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    const v8, -0xbbbbbc

    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    :try_start_1
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->f()Landroid/content/res/Resources;

    move-result-object v0

    sget v8, Lp3/a;->c:I

    invoke-virtual {v0, v8, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v4, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-virtual {v4, v0}, Landroid/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_f

    :catch_1
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    :goto_e
    const-string v4, "Error obtaining close icon."

    invoke-static {v4, v0}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_f
    iget-object v0, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    iget-object v4, v1, Lu3/x;->P:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-static {v0, v5}, Lu3/w;->a(Landroid/widget/Toolbar;I)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v0, v7, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0xa

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v5, v1, Lu3/x;->M:Lu3/q;

    iget-object v8, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-virtual {v5, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v7, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v4, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v5, 0x3

    invoke-virtual {v0, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v4, v1, Lu3/x;->M:Lu3/q;

    iget-object v5, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v1, Lu3/x;->W:Landroid/widget/Toolbar;

    invoke-direct {v1, v0}, Lu3/x;->u6(Landroid/view/View;)V

    goto :goto_10

    :cond_13
    iget-object v0, v1, Lu3/x;->M:Lu3/q;

    iget-object v4, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4, v7, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_14
    :goto_10
    if-nez p1, :cond_15

    iget-boolean v0, v1, Lu3/x;->N:Z

    if-nez v0, :cond_15

    invoke-virtual/range {p0 .. p0}, Lu3/x;->d()V

    :cond_15
    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->M:I

    if-eq v0, v6, :cond_17

    invoke-virtual {v1, v3}, Lu3/x;->y6(Z)V

    iget-object v0, v1, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->e1()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v1, v3, v2}, Lu3/x;->z6(ZZ)V

    :cond_16
    return-void

    :cond_17
    iget-object v0, v1, Lu3/x;->C:Landroid/app/Activity;

    invoke-static {}, Lcom/google/android/gms/internal/ads/vT;->e()Lcom/google/android/gms/internal/ads/uT;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/uT;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/uT;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/uT;->b(Lu3/x;)Lcom/google/android/gms/internal/ads/uT;

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->S:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/uT;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/uT;

    iget-object v0, v1, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->T:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/uT;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/uT;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/uT;->e()Lcom/google/android/gms/internal/ads/vT;

    move-result-object v0

    :try_start_2
    invoke-virtual {v1, v0}, Lu3/x;->x6(Lcom/google/android/gms/internal/ads/vT;)V
    :try_end_2
    .catch Lu3/p; {:try_start_2 .. :try_end_2} :catch_4
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_3

    return-void

    :catch_3
    move-exception v0

    goto :goto_11

    :catch_4
    move-exception v0

    :goto_11
    new-instance v2, Lu3/p;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lu3/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_18
    new-instance v0, Lu3/p;

    const-string v2, "Invalid activity, no window available."

    invoke-direct {v0, v2}, Lu3/p;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t()V
    .locals 2

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->f3()V

    :cond_0
    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {p0, v0}, Lu3/x;->v6(Landroid/content/res/Configuration;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->L0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->onResume()V

    return-void

    :cond_1
    const-string v0, "The webview does not exist. Ignoring action."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final t6(Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/x;->W:Landroid/widget/Toolbar;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final v()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->q0()V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->L0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->onResume()V

    return-void

    :cond_0
    const-string v0, "The webview does not exist. Ignoring action."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final x6(Lcom/google/android/gms/internal/ads/vT;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->X:Lcom/google/android/gms/internal/ads/En;

    if-eqz v0, :cond_0

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/En;->j0(LX3/a;)V

    return-void

    :cond_0
    new-instance p1, Lu3/p;

    const-string v0, "noioou"

    invoke-direct {p1, v0}, Lu3/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y6(Z)V
    .locals 6

    .prologue
    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->V4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->j1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    if-eqz p1, :cond_2

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    new-instance v4, Lu3/B;

    invoke-direct {v4}, Lu3/B;-><init>()V

    const/16 v5, 0x32

    iput v5, v4, Lu3/B;->d:I

    if-eq v3, v1, :cond_3

    move v5, v2

    goto :goto_1

    :cond_3
    move v5, v0

    :goto_1
    iput v5, v4, Lu3/B;->a:I

    if-eq v3, v1, :cond_4

    move v2, v0

    :cond_4
    iput v2, v4, Lu3/B;->b:I

    iput v0, v4, Lu3/B;->c:I

    iget-object v0, p0, Lu3/x;->C:Landroid/app/Activity;

    new-instance v2, Lu3/C;

    invoke-direct {v2, v0, v4, p0}, Lu3/C;-><init>(Landroid/content/Context;Lu3/B;Lu3/h;)V

    iput-object v2, p0, Lu3/x;->G:Lu3/C;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eq v3, v1, :cond_5

    const/16 v1, 0x9

    goto :goto_2

    :cond_5
    const/16 v1, 0xb

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->I:Z

    invoke-virtual {p0, p1, v1}, Lu3/x;->z6(ZZ)V

    iget-object p1, p0, Lu3/x;->M:Lu3/q;

    iget-object v1, p0, Lu3/x;->G:Lu3/C;

    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lu3/x;->G:Lu3/C;

    invoke-direct {p0, p1}, Lu3/x;->u6(Landroid/view/View;)V

    return-void
.end method

.method public final z0(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lu3/x;->K:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final z6(ZZ)V
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->h1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Q:Lr3/l;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lr3/l;->J:Z

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->i1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lu3/x;->D:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->Q:Lr3/l;

    if-eqz v3, :cond_1

    iget-boolean v3, v3, Lr3/l;->K:Z

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/wn;

    iget-object v4, p0, Lu3/x;->E:Lcom/google/android/gms/internal/ads/Ot;

    const-string v5, "useCustomClose"

    invoke-direct {p1, v4, v5}, Lcom/google/android/gms/internal/ads/wn;-><init>(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;)V

    const-string v4, "Custom close has been disabled for interstitial ads in this ad slot."

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/wn;->c(Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lu3/x;->G:Lu3/C;

    if-eqz p1, :cond_5

    if-nez v3, :cond_4

    if-eqz p2, :cond_3

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :cond_4
    :goto_2
    invoke-virtual {p1, v1}, Lu3/C;->b(Z)V

    :cond_5
    return-void
.end method
