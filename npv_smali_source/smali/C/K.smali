.class public final LC/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC/K$c;
    }
.end annotation


# static fields
.field public static final v:LC/K$c;

.field private static final w:Le0/j;


# instance fields
.field private final a:LC/B;

.field private final b:LC/F;

.field private final c:LV/w0;

.field private final d:Lz/l;

.field private e:F

.field private final f:Lx/A;

.field private g:I

.field private h:Z

.field private i:LD0/Z;

.field private final j:LD0/a0;

.field private final k:LD/b;

.field private final l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final m:LD/j;

.field private final n:Landroidx/compose/foundation/lazy/layout/d;

.field private final o:LC/z;

.field private final p:LC/e;

.field private final q:LD/D;

.field private final r:LV/w0;

.field private final s:LV/w0;

.field private final t:LV/w0;

.field private final u:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC/K$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC/K$c;-><init>(Ly7/k;)V

    sput-object v0, LC/K;->v:LC/K$c;

    sget-object v0, LC/K$a;->D:LC/K$a;

    sget-object v1, LC/K$b;->D:LC/K$b;

    invoke-static {v0, v1}, Le0/a;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, LC/K;->w:Le0/j;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, LC/C;->b(IILjava/lang/Object;)LC/B;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LC/K;-><init>(IILC/B;)V

    return-void
.end method

.method public constructor <init>(IILC/B;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LC/K;->a:LC/B;

    new-instance v0, LC/F;

    invoke-direct {v0, p1, p2}, LC/F;-><init>(II)V

    iput-object v0, p0, LC/K;->b:LC/F;

    invoke-static {}, LC/L;->a()LC/u;

    move-result-object p2

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object v1

    invoke-static {p2, v1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p2

    iput-object p2, p0, LC/K;->c:LV/w0;

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object p2

    iput-object p2, p0, LC/K;->d:Lz/l;

    new-instance p2, LC/K$i;

    invoke-direct {p2, p0}, LC/K$i;-><init>(LC/K;)V

    invoke-static {p2}, Lx/B;->a(Lx7/l;)Lx/A;

    move-result-object p2

    iput-object p2, p0, LC/K;->f:Lx/A;

    const/4 p2, 0x1

    iput-boolean p2, p0, LC/K;->h:Z

    new-instance v1, LC/K$f;

    invoke-direct {v1, p0}, LC/K$f;-><init>(LC/K;)V

    iput-object v1, p0, LC/K;->j:LD0/a0;

    new-instance v1, LD/b;

    invoke-direct {v1}, LD/b;-><init>()V

    iput-object v1, p0, LC/K;->k:LD/b;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object v1, p0, LC/K;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    new-instance v1, LD/j;

    invoke-direct {v1}, LD/j;-><init>()V

    iput-object v1, p0, LC/K;->m:LD/j;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p3}, LC/B;->b()LD/P;

    move-result-object p3

    new-instance v2, LC/K$e;

    invoke-direct {v2, p0, p1}, LC/K$e;-><init>(LC/K;I)V

    invoke-direct {v1, p3, v2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LD/P;Lx7/l;)V

    iput-object v1, p0, LC/K;->n:Landroidx/compose/foundation/lazy/layout/d;

    new-instance p1, LC/K$d;

    invoke-direct {p1, p0}, LC/K$d;-><init>(LC/K;)V

    iput-object p1, p0, LC/K;->o:LC/z;

    new-instance p1, LC/e;

    invoke-direct {p1, p0}, LC/e;-><init>(LC/K;)V

    iput-object p1, p0, LC/K;->p:LC/e;

    new-instance p1, LD/D;

    invoke-direct {p1}, LD/D;-><init>()V

    iput-object p1, p0, LC/K;->q:LD/D;

    invoke-virtual {v0}, LC/F;->b()LD/A;

    const/4 p1, 0x0

    invoke-static {p1, p2, p1}, LD/L;->c(LV/w0;ILy7/k;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LC/K;->r:LV/w0;

    invoke-static {p1, p2, p1}, LD/L;->c(LV/w0;ILy7/k;)LV/w0;

    move-result-object p2

    iput-object p2, p0, LC/K;->s:LV/w0;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LC/K;->t:LV/w0;

    invoke-static {p2, p1, p3, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LC/K;->u:LV/w0;

    return-void
.end method

.method private final B(FLC/s;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, LC/K;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LC/K;->a:LC/B;

    iget-object v1, p0, LC/K;->o:LC/z;

    invoke-interface {v0, v1, p1, p2}, LC/B;->c(LC/z;FLC/s;)V

    :cond_0
    return-void
.end method

.method public static synthetic E(LC/K;IILm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LC/K;->D(IILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private F(Z)V
    .locals 1

    iget-object v0, p0, LC/K;->u:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private G(Z)V
    .locals 1

    iget-object v0, p0, LC/K;->t:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic f(LC/K;)LV/w0;
    .locals 0

    iget-object p0, p0, LC/K;->c:LV/w0;

    return-object p0
.end method

.method public static final synthetic g(LC/K;)LC/B;
    .locals 0

    iget-object p0, p0, LC/K;->a:LC/B;

    return-object p0
.end method

.method public static final synthetic h()Le0/j;
    .locals 1

    sget-object v0, LC/K;->w:Le0/j;

    return-object v0
.end method

.method public static final synthetic i(LC/K;LD0/Z;)V
    .locals 0

    iput-object p1, p0, LC/K;->i:LD0/Z;

    return-void
.end method

.method public static synthetic k(LC/K;LC/u;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LC/K;->j(LC/u;Z)V

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget-object v0, p0, LC/K;->c:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/u;

    invoke-virtual {v0}, LC/u;->s()I

    move-result v0

    return v0
.end method

.method public final C(F)F
    .locals 5

    .prologue
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    invoke-virtual {p0}, LC/K;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    cmpl-float v1, p1, v0

    if-lez v1, :cond_2

    invoke-virtual {p0}, LC/K;->b()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    return v0

    :cond_2
    iget v1, p0, LC/K;->e:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_7

    iget v1, p0, LC/K;->e:F

    add-float/2addr v1, p1

    iput v1, p0, LC/K;->e:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    iget-object v1, p0, LC/K;->c:LV/w0;

    invoke-interface {v1}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC/u;

    iget v3, p0, LC/K;->e:F

    invoke-static {v3}, LA7/a;->d(F)I

    move-result v4

    invoke-virtual {v1, v4}, LC/u;->t(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    invoke-virtual {p0, v1, v4}, LC/K;->j(LC/u;Z)V

    iget-object v4, p0, LC/K;->r:LV/w0;

    invoke-static {v4}, LD/L;->d(LV/w0;)V

    iget v4, p0, LC/K;->e:F

    sub-float/2addr v3, v4

    :goto_0
    invoke-direct {p0, v3, v1}, LC/K;->B(FLC/s;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, LC/K;->i:LD0/Z;

    if-eqz v1, :cond_4

    invoke-interface {v1}, LD0/Z;->j()V

    :cond_4
    iget v1, p0, LC/K;->e:F

    sub-float/2addr v3, v1

    invoke-virtual {p0}, LC/K;->r()LC/s;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_1
    iget v1, p0, LC/K;->e:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_6

    return p1

    :cond_6
    iget v1, p0, LC/K;->e:F

    sub-float/2addr p1, v1

    iput v0, p0, LC/K;->e:F

    return p1

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "entered drag with non-zero pending scroll: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LC/K;->e:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final D(IILm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    new-instance v2, LC/K$h;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, p2, v0}, LC/K$h;-><init>(LC/K;IILm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lx/z;->c(Lx/A;Lv/L;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(IIZ)V
    .locals 1

    .prologue
    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0}, LC/F;->a()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0}, LC/F;->c()I

    move-result v0

    if-eq v0, p2, :cond_1

    :cond_0
    iget-object v0, p0, LC/K;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n()V

    :cond_1
    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0, p1, p2}, LC/F;->d(II)V

    if-eqz p3, :cond_2

    iget-object p1, p0, LC/K;->i:LD0/Z;

    if-eqz p1, :cond_3

    invoke-interface {p1}, LD0/Z;->j()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LC/K;->s:LV/w0;

    invoke-static {p1}, LD/L;->d(LV/w0;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final I(LC/l;I)I
    .locals 1

    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0, p1, p2}, LC/F;->j(LC/l;I)I

    move-result p1

    return p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, LC/K;->f:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LC/K;->u:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LC/K;->t:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p3, LC/K$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LC/K$g;

    iget v1, v0, LC/K$g;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC/K$g;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, LC/K$g;

    invoke-direct {v0, p0, p3}, LC/K$g;-><init>(LC/K;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LC/K$g;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LC/K$g;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LC/K$g;->H:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lx7/p;

    iget-object p1, v0, LC/K$g;->G:Ljava/lang/Object;

    check-cast p1, Lv/L;

    iget-object v2, v0, LC/K$g;->F:Ljava/lang/Object;

    check-cast v2, LC/K;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LC/K;->k:LD/b;

    iput-object p0, v0, LC/K$g;->F:Ljava/lang/Object;

    iput-object p1, v0, LC/K$g;->G:Ljava/lang/Object;

    iput-object p2, v0, LC/K$g;->H:Ljava/lang/Object;

    iput v4, v0, LC/K$g;->K:I

    invoke-virtual {p3, v0}, LD/b;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p3, v2, LC/K;->f:Lx/A;

    const/4 v2, 0x0

    iput-object v2, v0, LC/K$g;->F:Ljava/lang/Object;

    iput-object v2, v0, LC/K$g;->G:Ljava/lang/Object;

    iput-object v2, v0, LC/K$g;->H:Ljava/lang/Object;

    iput v3, v0, LC/K$g;->K:I

    invoke-interface {p3, p1, p2, v0}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, LC/K;->f:Lx/A;

    invoke-interface {v0, p1}, Lx/A;->e(F)F

    move-result p1

    return p1
.end method

.method public final j(LC/u;Z)V
    .locals 2

    .prologue
    iget v0, p0, LC/K;->e:F

    invoke-virtual {p1}, LC/u;->o()F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, LC/K;->e:F

    iget-object v0, p0, LC/K;->c:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, LC/u;->m()Z

    move-result v0

    invoke-direct {p0, v0}, LC/K;->F(Z)V

    invoke-virtual {p1}, LC/u;->n()Z

    move-result v0

    invoke-direct {p0, v0}, LC/K;->G(Z)V

    if-eqz p2, :cond_0

    iget-object p2, p0, LC/K;->b:LC/F;

    invoke-virtual {p1}, LC/u;->q()I

    move-result p1

    invoke-virtual {p2, p1}, LC/F;->i(I)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LC/K;->b:LC/F;

    invoke-virtual {p2, p1}, LC/F;->h(LC/u;)V

    iget-boolean p2, p0, LC/K;->h:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, LC/K;->a:LC/B;

    iget-object v0, p0, LC/K;->o:LC/z;

    invoke-interface {p2, v0, p1}, LC/B;->d(LC/z;LC/s;)V

    :cond_1
    :goto_0
    iget p1, p0, LC/K;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LC/K;->g:I

    return-void
.end method

.method public final l()LD/b;
    .locals 1

    iget-object v0, p0, LC/K;->k:LD/b;

    return-object v0
.end method

.method public final m()LD/j;
    .locals 1

    iget-object v0, p0, LC/K;->m:LD/j;

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0}, LC/F;->a()I

    move-result v0

    return v0
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0}, LC/F;->c()I

    move-result v0

    return v0
.end method

.method public final p()Lz/l;
    .locals 1

    iget-object v0, p0, LC/K;->d:Lz/l;

    return-object v0
.end method

.method public final q()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1

    iget-object v0, p0, LC/K;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    return-object v0
.end method

.method public final r()LC/s;
    .locals 1

    iget-object v0, p0, LC/K;->c:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/s;

    return-object v0
.end method

.method public final s()LV/w0;
    .locals 1

    iget-object v0, p0, LC/K;->s:LV/w0;

    return-object v0
.end method

.method public final t()LE7/i;
    .locals 1

    iget-object v0, p0, LC/K;->b:LC/F;

    invoke-virtual {v0}, LC/F;->b()LD/A;

    move-result-object v0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE7/i;

    return-object v0
.end method

.method public final u()LD/D;
    .locals 1

    iget-object v0, p0, LC/K;->q:LD/D;

    return-object v0
.end method

.method public final v()LV/w0;
    .locals 1

    iget-object v0, p0, LC/K;->r:LV/w0;

    return-object v0
.end method

.method public final w()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, LC/K;->n:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public final x()LD0/Z;
    .locals 1

    iget-object v0, p0, LC/K;->i:LD0/Z;

    return-object v0
.end method

.method public final y()LD0/a0;
    .locals 1

    iget-object v0, p0, LC/K;->j:LD0/a0;

    return-object v0
.end method

.method public final z()F
    .locals 1

    iget v0, p0, LC/K;->e:F

    return v0
.end method
