.class public final Lm1/h;
.super Lm1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/h$a;,
        Lm1/h$b;
    }
.end annotation


# static fields
.field public static final O0:Lm1/h$a;

.field public static final P0:I


# instance fields
.field private G0:F

.field private H0:I

.field private I0:I

.field private J0:Z

.field private K0:Lm1/d;

.field private L0:I

.field private M0:Z

.field private N0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/h;->O0:Lm1/h$a;

    const/16 v0, 0x8

    sput v0, Lm1/h;->P0:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    invoke-direct {p0}, Lm1/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lm1/h;->G0:F

    const/4 v0, -0x1

    iput v0, p0, Lm1/h;->H0:I

    iput v0, p0, Lm1/h;->I0:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/h;->J0:Z

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    iput-object v0, p0, Lm1/h;->K0:Lm1/d;

    const-string v0, "Guideline"

    iput-object v0, p0, Lm1/h;->N0:Ljava/lang/String;

    invoke-virtual {p0}, Lm1/e;->E()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lm1/e;->E()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    iget-object v3, p0, Lm1/h;->K0:Lm1/d;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public K1(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm1/h;->N0:Ljava/lang/String;

    return-void
.end method

.method public Q0()Z
    .locals 1

    iget-boolean v0, p0, Lm1/h;->M0:Z

    return v0
.end method

.method public R0()Z
    .locals 1

    iget-boolean v0, p0, Lm1/h;->M0:Z

    return v0
.end method

.method public Z1(Le1/d;Z)V
    .locals 2

    .prologue
    const-string p2, "system"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, p2}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lm1/h;->L0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, Lm1/e;->V1(I)V

    invoke-virtual {p0, v1}, Lm1/e;->W1(I)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p1

    invoke-virtual {p0, p1}, Lm1/e;->m1(I)V

    invoke-virtual {p0, v1}, Lm1/e;->U1(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lm1/e;->V1(I)V

    invoke-virtual {p0, p1}, Lm1/e;->W1(I)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p1

    invoke-virtual {p0, p1}, Lm1/e;->U1(I)V

    invoke-virtual {p0, v1}, Lm1/e;->m1(I)V

    :goto_0
    return-void
.end method

.method public final a2()Lm1/d;
    .locals 1

    iget-object v0, p0, Lm1/h;->K0:Lm1/d;

    return-object v0
.end method

.method public final b2()I
    .locals 1

    iget v0, p0, Lm1/h;->L0:I

    return v0
.end method

.method public final c2()I
    .locals 1

    iget v0, p0, Lm1/h;->H0:I

    return v0
.end method

.method public d(Le1/d;Z)V
    .locals 7

    .prologue
    const-string p2, "system"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    check-cast p2, Lm1/f;

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {p2, v0}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v0

    sget-object v1, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {p2, v1}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v1

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v2

    aget-object v2, v2, v4

    sget-object v5, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v5, p0, Lm1/h;->L0:I

    if-nez v5, :cond_3

    sget-object v0, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {p2, v0}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v0

    sget-object v1, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {p2, v1}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v1

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p2

    aget-object p2, p2, v3

    sget-object v2, Lm1/e$b;->D:Lm1/e$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    :cond_3
    iget-boolean p2, p0, Lm1/h;->M0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p2}, Lm1/d;->s()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, p2}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v6, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {v6}, Lm1/d;->e()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Le1/d;->j(Le1/i;I)V

    iget v6, p0, Lm1/h;->H0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p2, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    goto :goto_2

    :cond_4
    iget v6, p0, Lm1/h;->I0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v1

    invoke-virtual {p1, v0}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v0, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v1, p2, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    :cond_5
    :goto_2
    iput-boolean v4, p0, Lm1/h;->M0:Z

    return-void

    :cond_6
    iget p2, p0, Lm1/h;->H0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, p2}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p2

    invoke-virtual {p1, v0}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lm1/h;->H0:I

    invoke-virtual {p1, p2, v0, v3, v6}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    if-eqz v2, :cond_a

    invoke-virtual {p1, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p2, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    goto :goto_3

    :cond_7
    iget p2, p0, Lm1/h;->I0:I

    if-eq p2, v3, :cond_8

    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, p2}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v1

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lm1/h;->I0:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    if-eqz v2, :cond_a

    invoke-virtual {p1, v0}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v0, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, Le1/d;->l(Le1/i;Le1/i;II)V

    goto :goto_3

    :cond_8
    iget p2, p0, Lm1/h;->G0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float p2, p2, v0

    if-nez p2, :cond_9

    goto :goto_3

    :cond_9
    iget-object p2, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, p2}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v0

    sget-object v1, Le1/d;->s:Le1/d$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lm1/h;->G0:F

    invoke-virtual {v1, p1, p2, v0, v2}, Le1/d$a;->a(Le1/d;Le1/i;Le1/i;F)Le1/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Le1/d;->h(Le1/b;)V

    :cond_a
    :goto_3
    return-void
.end method

.method public final d2()I
    .locals 1

    iget v0, p0, Lm1/h;->I0:I

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e2()F
    .locals 1

    iget v0, p0, Lm1/h;->G0:F

    return v0
.end method

.method public final f2(I)V
    .locals 1

    iget-object v0, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {v0, p1}, Lm1/d;->y(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm1/h;->M0:Z

    return-void
.end method

.method public final g2(I)V
    .locals 2

    .prologue
    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lm1/h;->G0:F

    iput p1, p0, Lm1/h;->H0:I

    iput v0, p0, Lm1/h;->I0:I

    :cond_0
    return-void
.end method

.method public final h2(I)V
    .locals 2

    .prologue
    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lm1/h;->G0:F

    iput v0, p0, Lm1/h;->H0:I

    iput p1, p0, Lm1/h;->I0:I

    :cond_0
    return-void
.end method

.method public final i2(F)V
    .locals 1

    .prologue
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lm1/h;->G0:F

    const/4 p1, -0x1

    iput p1, p0, Lm1/h;->H0:I

    iput p1, p0, Lm1/h;->I0:I

    :cond_0
    return-void
.end method

.method public final j2(I)V
    .locals 3

    .prologue
    iget v0, p0, Lm1/h;->L0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lm1/h;->L0:I

    invoke-virtual {p0}, Lm1/e;->E()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lm1/h;->L0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p0}, Lm1/e;->E()Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lm1/h;->K0:Lm1/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p1

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    iget-object v2, p0, Lm1/h;->K0:Lm1/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public l(Lm1/d$b;)Lm1/d;
    .locals 2

    .prologue
    const-string v0, "anchorType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm1/h$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lm1/h;->L0:I

    if-nez p1, :cond_2

    iget-object p1, p0, Lm1/h;->K0:Lm1/d;

    return-object p1

    :cond_1
    iget p1, p0, Lm1/h;->L0:I

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lm1/h;->K0:Lm1/d;

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public u0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm1/h;->N0:Ljava/lang/String;

    return-object v0
.end method
