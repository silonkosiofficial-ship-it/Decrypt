.class public final Lcom/google/android/gms/internal/ads/aI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/uD;
.implements Lu3/z;
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/Ot;

.field private final E:Lcom/google/android/gms/internal/ads/R60;

.field private final F:Lw3/a;

.field private final G:Lcom/google/android/gms/internal/ads/vd;

.field private final H:Lcom/google/android/gms/internal/ads/OT;

.field I:Lcom/google/android/gms/internal/ads/QT;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/R60;Lw3/a;Lcom/google/android/gms/internal/ads/vd;Lcom/google/android/gms/internal/ads/OT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aI;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aI;->E:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aI;->F:Lw3/a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/aI;->G:Lcom/google/android/gms/internal/ads/vd;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/aI;->H:Lcom/google/android/gms/internal/ads/OT;

    return-void
.end method

.method private final a()Z
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->f5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->H:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final T2()V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aI;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->H:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->b()V

    :cond_2
    return-void
.end method

.method public final d2()V
    .locals 0

    return-void
.end method

.method public final f3()V
    .locals 0

    return-void
.end method

.method public final p4(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    return-void
.end method

.method public final q0()V
    .locals 0

    return-void
.end method

.method public final t()V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aI;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->H:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->b()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public final u()V
    .locals 12

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->G:Lcom/google/android/gms/internal/ads/vd;

    sget-object v1, Lcom/google/android/gms/internal/ads/vd;->K:Lcom/google/android/gms/internal/ads/vd;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/vd;->G:Lcom/google/android/gms/internal/ads/vd;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/vd;->N:Lcom/google/android/gms/internal/ads/vd;

    if-ne v0, v1, :cond_6

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->T:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->C:Landroid/content/Context;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/LT;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aI;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->H:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->c()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->F:Lw3/a;

    iget v1, v0, Lw3/a;->D:I

    iget v0, v0, Lw3/a;->E:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->V:Lcom/google/android/gms/internal/ads/q70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q70;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q70;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/MT;->F:Lcom/google/android/gms/internal/ads/MT;

    sget-object v1, Lcom/google/android/gms/internal/ads/NT;->E:Lcom/google/android/gms/internal/ads/NT;

    move-object v10, v0

    move-object v9, v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->E:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->Y:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/NT;->G:Lcom/google/android/gms/internal/ads/NT;

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/NT;->D:Lcom/google/android/gms/internal/ads/NT;

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/MT;->D:Lcom/google/android/gms/internal/ads/MT;

    move-object v9, v0

    move-object v10, v1

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aI;->E:Lcom/google/android/gms/internal/ads/R60;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v5

    iget-object v11, v1, Lcom/google/android/gms/internal/ads/R60;->l0:Ljava/lang/String;

    const-string v6, ""

    const-string v7, "javascript"

    invoke-interface/range {v3 .. v11}, Lcom/google/android/gms/internal/ads/LT;->k(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->e5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v0

    invoke-interface {v2, v1, v0}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->X0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Lcom/google/android/gms/internal/ads/LT;->d(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    goto :goto_2

    :cond_4
    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aI;->I:Lcom/google/android/gms/internal/ads/QT;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/Ot;->n1(Lcom/google/android/gms/internal/ads/QT;)V

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/LT;->e(Lcom/google/android/gms/internal/ads/Bb0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aI;->D:Lcom/google/android/gms/internal/ads/Ot;

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_6
    return-void
.end method

.method public final y0()V
    .locals 0

    return-void
.end method
