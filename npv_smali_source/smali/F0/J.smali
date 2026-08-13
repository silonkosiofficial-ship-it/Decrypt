.class public final LF0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/l;
.implements LD0/Z;
.implements LF0/p0;
.implements LD0/x;
.implements LF0/g;
.implements LF0/o0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/J$d;,
        LF0/J$e;,
        LF0/J$f;,
        LF0/J$g;,
        LF0/J$h;
    }
.end annotation


# static fields
.field public static final n0:LF0/J$d;

.field public static final o0:I

.field private static final p0:LF0/J$f;

.field private static final q0:Lx7/a;

.field private static final r0:Landroidx/compose/ui/platform/A1;

.field private static final s0:Ljava/util/Comparator;


# instance fields
.field private final C:Z

.field private D:I

.field private E:I

.field private F:Z

.field private G:LF0/J;

.field private H:I

.field private final I:LF0/Y;

.field private J:LX/b;

.field private K:Z

.field private L:LF0/J;

.field private M:LF0/o0;

.field private N:Landroidx/compose/ui/viewinterop/c;

.field private O:I

.field private P:Z

.field private Q:LK0/k;

.field private final R:LX/b;

.field private S:Z

.field private T:LD0/I;

.field private U:LF0/z;

.field private V:LY0/e;

.field private W:LY0/v;

.field private X:Landroidx/compose/ui/platform/A1;

.field private Y:LV/z;

.field private Z:LF0/J$g;

.field private a0:LF0/J$g;

.field private b0:Z

.field private final c0:LF0/b0;

.field private final d0:LF0/O;

.field private e0:LD0/C;

.field private f0:LF0/d0;

.field private g0:Z

.field private h0:Landroidx/compose/ui/d;

.field private i0:Landroidx/compose/ui/d;

.field private j0:Lx7/l;

.field private k0:Lx7/l;

.field private l0:Z

.field private m0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/J$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/J$d;-><init>(Ly7/k;)V

    sput-object v0, LF0/J;->n0:LF0/J$d;

    const/16 v0, 0x8

    sput v0, LF0/J;->o0:I

    new-instance v0, LF0/J$c;

    invoke-direct {v0}, LF0/J$c;-><init>()V

    sput-object v0, LF0/J;->p0:LF0/J$f;

    sget-object v0, LF0/J$a;->D:LF0/J$a;

    sput-object v0, LF0/J;->q0:Lx7/a;

    new-instance v0, LF0/J$b;

    invoke-direct {v0}, LF0/J$b;-><init>()V

    sput-object v0, LF0/J;->r0:Landroidx/compose/ui/platform/A1;

    new-instance v0, LF0/I;

    invoke-direct {v0}, LF0/I;-><init>()V

    sput-object v0, LF0/J;->s0:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LF0/J;->C:Z

    iput p2, p0, LF0/J;->D:I

    new-instance p1, LF0/Y;

    new-instance p2, LX/b;

    const/16 v0, 0x10

    new-array v1, v0, [LF0/J;

    const/4 v2, 0x0

    invoke-direct {p2, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    new-instance v1, LF0/J$i;

    invoke-direct {v1, p0}, LF0/J$i;-><init>(LF0/J;)V

    invoke-direct {p1, p2, v1}, LF0/Y;-><init>(LX/b;Lx7/a;)V

    iput-object p1, p0, LF0/J;->I:LF0/Y;

    new-instance p1, LX/b;

    new-array p2, v0, [LF0/J;

    invoke-direct {p1, p2, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LF0/J;->R:LX/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, LF0/J;->S:Z

    sget-object p2, LF0/J;->p0:LF0/J$f;

    iput-object p2, p0, LF0/J;->T:LD0/I;

    invoke-static {}, LF0/N;->a()LY0/e;

    move-result-object p2

    iput-object p2, p0, LF0/J;->V:LY0/e;

    sget-object p2, LY0/v;->C:LY0/v;

    iput-object p2, p0, LF0/J;->W:LY0/v;

    sget-object p2, LF0/J;->r0:Landroidx/compose/ui/platform/A1;

    iput-object p2, p0, LF0/J;->X:Landroidx/compose/ui/platform/A1;

    sget-object p2, LV/z;->e:LV/z$a;

    invoke-virtual {p2}, LV/z$a;->a()LV/z;

    move-result-object p2

    iput-object p2, p0, LF0/J;->Y:LV/z;

    sget-object p2, LF0/J$g;->E:LF0/J$g;

    iput-object p2, p0, LF0/J;->Z:LF0/J$g;

    iput-object p2, p0, LF0/J;->a0:LF0/J$g;

    new-instance p2, LF0/b0;

    invoke-direct {p2, p0}, LF0/b0;-><init>(LF0/J;)V

    iput-object p2, p0, LF0/J;->c0:LF0/b0;

    new-instance p2, LF0/O;

    invoke-direct {p2, p0}, LF0/O;-><init>(LF0/J;)V

    iput-object p2, p0, LF0/J;->d0:LF0/O;

    iput-boolean p1, p0, LF0/J;->g0:Z

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iput-object p1, p0, LF0/J;->h0:Landroidx/compose/ui/d;

    return-void
.end method

.method public synthetic constructor <init>(ZIILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-static {}, LK0/n;->b()I

    move-result p2

    :cond_1
    invoke-direct {p0, p1, p2}, LF0/J;-><init>(ZI)V

    return-void
.end method

.method public static synthetic A0(LF0/J;JLF0/v;ZZILjava/lang/Object;)V
    .locals 7

    .prologue
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    move v6, p5

    :goto_1
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, LF0/J;->z0(JLF0/v;ZZ)V

    return-void
.end method

.method private final C0()V
    .locals 9

    .prologue
    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    const/16 v1, 0x400

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    const/16 v3, 0x800

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v4

    or-int/2addr v2, v4

    const/16 v4, 0x1000

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v0, v2}, LF0/b0;->p(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_0

    move v2, v6

    goto :goto_1

    :cond_0
    move v2, v5

    :goto_1
    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v7

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v7, v8

    if-eqz v7, :cond_1

    move v7, v6

    goto :goto_2

    :cond_1
    move v7, v5

    :goto_2
    or-int/2addr v2, v7

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v7

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v7, v8

    if-eqz v7, :cond_2

    move v5, v6

    :cond_2
    or-int/2addr v2, v5

    if-eqz v2, :cond_3

    invoke-static {v0}, LF0/g0;->a(Landroidx/compose/ui/d$c;)V

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_4
    return-void
.end method

.method private final E1(LF0/J;)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->G:LF0/J;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LF0/J;->G:LF0/J;

    if-eqz p1, :cond_0

    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->q()V

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object p1

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF0/d0;->Z1()V

    invoke-virtual {p1}, LF0/d0;->o2()LF0/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/J;->F0()V

    :cond_1
    return-void
.end method

.method private final J0()V
    .locals 1

    .prologue
    iget v0, p0, LF0/J;->H:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/J;->K:Z

    :cond_0
    iget-boolean v0, p0, LF0/J;->C:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/J;->L:LF0/J;

    if-eqz v0, :cond_1

    invoke-direct {v0}, LF0/J;->J0()V

    :cond_1
    return-void
.end method

.method private final Q()LF0/d0;
    .locals 4

    .prologue
    iget-boolean v0, p0, LF0/J;->g0:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->p2()LF0/d0;

    move-result-object v1

    const/4 v2, 0x0

    iput-object v2, p0, LF0/J;->f0:LF0/d0;

    :goto_0
    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->i2()LF0/m0;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_1

    iput-object v0, p0, LF0/J;->f0:LF0/d0;

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, LF0/J;->f0:LF0/d0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LF0/d0;->i2()LF0/m0;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "layer was not set"

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_5
    :goto_3
    return-object v0
.end method

.method public static synthetic Q0(LF0/J;LY0/b;ILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->z()LY0/b;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LF0/J;->P0(LY0/b;)Z

    move-result p0

    return p0
.end method

.method private final f1(LF0/J;)V
    .locals 4

    .prologue
    iget-object v0, p1, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->s()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->s()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, LF0/O;->W(I)V

    :cond_0
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LF0/J;->z()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p1, LF0/J;->L:LF0/J;

    invoke-virtual {p1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    invoke-virtual {v1, v0}, LF0/d0;->T2(LF0/d0;)V

    iget-boolean v1, p1, LF0/J;->C:Z

    if-eqz v1, :cond_3

    iget v1, p0, LF0/J;->H:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LF0/J;->H:I

    iget-object p1, p1, LF0/J;->I:LF0/Y;

    invoke-virtual {p1}, LF0/Y;->f()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    :cond_2
    aget-object v3, p1, v2

    check-cast v3, LF0/J;

    invoke-virtual {v3}, LF0/J;->m0()LF0/d0;

    move-result-object v3

    invoke-virtual {v3, v0}, LF0/d0;->T2(LF0/d0;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_2

    :cond_3
    invoke-direct {p0}, LF0/J;->J0()V

    invoke-virtual {p0}, LF0/J;->h1()V

    return-void
.end method

.method private final g1()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->F0()V

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->D0()V

    :cond_0
    invoke-virtual {p0}, LF0/J;->E0()V

    return-void
.end method

.method private final j1()V
    .locals 6

    .prologue
    iget-boolean v0, p0, LF0/J;->K:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/J;->K:Z

    iget-object v1, p0, LF0/J;->J:LX/b;

    if-nez v1, :cond_0

    new-instance v1, LX/b;

    const/16 v2, 0x10

    new-array v2, v2, [LF0/J;

    invoke-direct {v1, v2, v0}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v1, p0, LF0/J;->J:LX/b;

    :cond_0
    invoke-virtual {v1}, LX/b;->j()V

    iget-object v2, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v2}, LF0/Y;->f()LX/b;

    move-result-object v2

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    :cond_1
    aget-object v4, v2, v0

    check-cast v4, LF0/J;

    iget-boolean v5, v4, LF0/J;->C:Z

    if-eqz v5, :cond_2

    invoke-virtual {v4}, LF0/J;->w0()LX/b;

    move-result-object v4

    invoke-virtual {v1}, LX/b;->t()I

    move-result v5

    invoke-virtual {v1, v5, v4}, LX/b;->e(ILX/b;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v4}, LX/b;->d(Ljava/lang/Object;)Z

    :goto_0
    add-int/lit8 v0, v0, 0x1

    if-lt v0, v3, :cond_1

    :cond_3
    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->N()V

    :cond_4
    return-void
.end method

.method private final l0()LF0/z;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->U:LF0/z;

    if-nez v0, :cond_0

    new-instance v0, LF0/z;

    invoke-virtual {p0}, LF0/J;->f0()LD0/I;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LF0/z;-><init>(LF0/J;LD0/I;)V

    iput-object v0, p0, LF0/J;->U:LF0/z;

    :cond_0
    return-object v0
.end method

.method public static synthetic l1(LF0/J;LY0/b;ILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->y()LY0/b;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LF0/J;->k1(LY0/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(LF0/J;LF0/J;)I
    .locals 0

    invoke-static {p0, p1}, LF0/J;->o(LF0/J;LF0/J;)I

    move-result p0

    return p0
.end method

.method private static final o(LF0/J;LF0/J;)I
    .locals 2

    .prologue
    invoke-direct {p0}, LF0/J;->u0()F

    move-result v0

    invoke-direct {p1}, LF0/J;->u0()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LF0/J;->p0()I

    move-result p0

    invoke-virtual {p1}, LF0/J;->p0()I

    move-result p1

    invoke-static {p0, p1}, Ly7/t;->g(II)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LF0/J;->u0()F

    move-result p0

    invoke-direct {p1}, LF0/J;->u0()F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final synthetic q()Lx7/a;
    .locals 1

    sget-object v0, LF0/J;->q0:Lx7/a;

    return-object v0
.end method

.method public static synthetic q1(LF0/J;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LF0/J;->p1(Z)V

    return-void
.end method

.method public static final synthetic r()Ljava/util/Comparator;
    .locals 1

    sget-object v0, LF0/J;->s0:Ljava/util/Comparator;

    return-object v0
.end method

.method public static final synthetic s(LF0/J;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/J;->P:Z

    return-void
.end method

.method public static synthetic s1(LF0/J;ZZZILjava/lang/Object;)V
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LF0/J;->r1(ZZZ)V

    return-void
.end method

.method private final t(Landroidx/compose/ui/d;)V
    .locals 1

    .prologue
    iput-object p1, p0, LF0/J;->h0:Landroidx/compose/ui/d;

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0, p1}, LF0/b0;->E(Landroidx/compose/ui/d;)V

    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->c0()V

    iget-object p1, p0, LF0/J;->G:LF0/J;

    if-nez p1, :cond_0

    iget-object p1, p0, LF0/J;->c0:LF0/b0;

    const/16 v0, 0x200

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LF0/b0;->q(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p0}, LF0/J;->E1(LF0/J;)V

    :cond_0
    return-void
.end method

.method private final u0()F
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->u1()F

    move-result v0

    return v0
.end method

.method public static synthetic u1(LF0/J;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LF0/J;->t1(Z)V

    return-void
.end method

.method private final w()V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    iput-object v0, p0, LF0/J;->a0:LF0/J$g;

    sget-object v0, LF0/J$g;->E:LF0/J$g;

    iput-object v0, p0, LF0/J;->Z:LF0/J$g;

    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    iget-object v4, v3, LF0/J;->Z:LF0/J$g;

    sget-object v5, LF0/J$g;->D:LF0/J$g;

    if-ne v4, v5, :cond_1

    invoke-direct {v3}, LF0/J;->w()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public static synthetic w1(LF0/J;ZZZILjava/lang/Object;)V
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LF0/J;->v1(ZZZ)V

    return-void
.end method

.method private final x(I)Ljava/lang/String;
    .locals 7

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    const-string v3, "  "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "|-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v2

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    move v4, v1

    :cond_1
    aget-object v5, v2, v4

    check-cast v5, LF0/J;

    add-int/lit8 v6, p1, 0x1

    invoke-direct {v5, v6}, LF0/J;->x(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method static synthetic y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, LF0/J;->x(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(LF0/J;JLF0/v;ZZILjava/lang/Object;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x1

    :cond_1
    move v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LF0/J;->x0(JLF0/v;ZZ)V

    return-void
.end method

.method private final y1()V
    .locals 1

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->x()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 11

    .prologue
    invoke-virtual {p0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$e;->G:LF0/J$e;

    if-ne v0, v1, :cond_a

    invoke-virtual {p0}, LF0/J;->W()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, LF0/J;->e0()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, LF0/J;->k()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    const/16 v1, 0x100

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    invoke-static {v0}, LF0/b0;->c(LF0/b0;)I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_a

    invoke-virtual {v0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    instance-of v6, v4, LF0/u;

    if-eqz v6, :cond_2

    check-cast v4, LF0/u;

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v6

    invoke-static {v4, v6}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v6

    invoke-interface {v4, v6}, LF0/u;->s(LD0/t;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v2

    if-eqz v6, :cond_8

    instance-of v6, v4, LF0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_2
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v2

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LX/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v9, v7}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_2

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_a
    :goto_5
    return-void
.end method

.method public final A1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/J;->b0:Z

    return-void
.end method

.method public final B(Lo0/q0;Lr0/c;)V
    .locals 1

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF0/d0;->W1(Lo0/q0;Lr0/c;)V

    return-void
.end method

.method public final B0(ILF0/J;)V
    .locals 7

    .prologue
    iget-object v0, p2, LF0/J;->L:LF0/J;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, " Other tree: "

    const-string v4, "Cannot insert "

    const/4 v5, 0x0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " because it already has a parent. This tree: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v5}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p2, LF0/J;->L:LF0/J;

    if-eqz v6, :cond_1

    invoke-static {v6, v1, v2, v5}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p2, LF0/J;->M:LF0/o0;

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " because it already has an owner. This tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v5}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, v1, v2, v5}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_4
    iput-object p0, p2, LF0/J;->L:LF0/J;

    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0, p1, p2}, LF0/Y;->a(ILjava/lang/Object;)V

    invoke-virtual {p0}, LF0/J;->h1()V

    iget-boolean p1, p2, LF0/J;->C:Z

    if-eqz p1, :cond_5

    iget p1, p0, LF0/J;->H:I

    add-int/2addr p1, v2

    iput p1, p0, LF0/J;->H:I

    :cond_5
    invoke-direct {p0}, LF0/J;->J0()V

    iget-object p1, p0, LF0/J;->M:LF0/o0;

    if-eqz p1, :cond_6

    invoke-virtual {p2, p1}, LF0/J;->u(LF0/o0;)V

    :cond_6
    iget-object p1, p2, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->s()I

    move-result p1

    if-lez p1, :cond_7

    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->s()I

    move-result p2

    add-int/2addr p2, v2

    invoke-virtual {p1, p2}, LF0/O;->W(I)V

    :cond_7
    return-void
.end method

.method public final B1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/J;->g0:Z

    return-void
.end method

.method public final C()Z
    .locals 3

    .prologue
    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->r()LF0/b;

    move-result-object v1

    invoke-interface {v1}, LF0/b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1}, LF0/a;->k()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {v0}, LF0/O;->C()LF0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/a;->k()Z

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public final C1(Landroidx/compose/ui/viewinterop/c;)V
    .locals 0

    iput-object p1, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    return-void
.end method

.method public final D()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/J;->i0:Landroidx/compose/ui/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D0()V
    .locals 1

    .prologue
    invoke-direct {p0}, LF0/J;->Q()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->y2()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/J;->D0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final D1(LF0/J$g;)V
    .locals 0

    iput-object p1, p0, LF0/J;->Z:LF0/J$g;

    return-void
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, LF0/J;->b0:Z

    return v0
.end method

.method public final E0()V
    .locals 3

    .prologue
    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v1

    :goto_0
    if-eq v0, v1, :cond_1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LF0/F;

    invoke-virtual {v0}, LF0/d0;->i2()LF0/m0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LF0/m0;->invalidate()V

    :cond_0
    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->i2()LF0/m0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LF0/m0;->invalidate()V

    :cond_2
    return-void
.end method

.method public final F()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/O$a;->j1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final F0()V
    .locals 13

    .prologue
    iget-object v0, p0, LF0/J;->G:LF0/J;

    if-eqz v0, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final F1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/J;->l0:Z

    return-void
.end method

.method public final G()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->o1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final G0()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->W()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LF0/J;->e0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, LF0/J;->l0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0, p0}, LF0/o0;->n(LF0/J;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final G1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LF0/J;->j0:Lx7/l;

    return-void
.end method

.method public final H()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final H0()V
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->M()V

    return-void
.end method

.method public final H1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LF0/J;->k0:Lx7/l;

    return-void
.end method

.method public final I()LK0/k;
    .locals 3

    .prologue
    invoke-virtual {p0}, LF0/J;->K0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, LF0/b0;->q(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LF0/J;->Q:LK0/k;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, LK0/k;

    invoke-direct {v1}, LK0/k;-><init>()V

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v1

    new-instance v2, LF0/J$j;

    invoke-direct {v2, p0, v0}, LF0/J$j;-><init>(LF0/J;Ly7/O;)V

    invoke-virtual {v1, p0, v2}, LF0/q0;->j(LF0/J;Lx7/a;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LK0/k;

    iput-object v1, p0, LF0/J;->Q:LK0/k;

    check-cast v0, LK0/k;

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, LF0/J;->Q:LK0/k;

    return-object v0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final I0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LF0/J;->Q:LK0/k;

    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->t()V

    return-void
.end method

.method public I1(I)V
    .locals 0

    iput p1, p0, LF0/J;->D:I

    return-void
.end method

.method public J()LV/z;
    .locals 1

    iget-object v0, p0, LF0/J;->Y:LV/z;

    return-object v0
.end method

.method public final J1(LD0/C;)V
    .locals 0

    iput-object p1, p0, LF0/J;->e0:LD0/C;

    return-void
.end method

.method public K()LY0/e;
    .locals 1

    iget-object v0, p0, LF0/J;->V:LY0/e;

    return-object v0
.end method

.method public K0()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K1()V
    .locals 1

    .prologue
    iget v0, p0, LF0/J;->H:I

    if-lez v0, :cond_0

    invoke-direct {p0}, LF0/J;->j1()V

    :cond_0
    return-void
.end method

.method public final L()I
    .locals 1

    iget v0, p0, LF0/J;->O:I

    return v0
.end method

.method public L0()Z
    .locals 1

    iget-boolean v0, p0, LF0/J;->m0:Z

    return v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0}, LF0/Y;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final M0()Z
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->x1()Z

    move-result v0

    return v0
.end method

.method public final N()Z
    .locals 3

    .prologue
    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->h2()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final N0()Ljava/lang/Boolean;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O$a;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public O()I
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->x()I

    move-result v0

    return v0
.end method

.method public final O0()Z
    .locals 1

    iget-boolean v0, p0, LF0/J;->F:Z

    return v0
.end method

.method public final P()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->l()LF0/x;

    move-result-object v0

    return-object v0
.end method

.method public final P0(LY0/b;)Z
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, LF0/J;->G:LF0/J;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF0/O$a;->B1(J)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public R()Z
    .locals 1

    invoke-virtual {p0}, LF0/J;->K0()Z

    move-result v0

    return v0
.end method

.method public final R0()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LF0/J;->w()V

    :cond_0
    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/O$a;->C1()V

    return-void
.end method

.method public S()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getInteropView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final S0()V
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->O()V

    return-void
.end method

.method public final T()Landroidx/compose/ui/viewinterop/c;
    .locals 1

    iget-object v0, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    return-object v0
.end method

.method public final T0()V
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->P()V

    return-void
.end method

.method public final U()LF0/J$g;
    .locals 1

    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    return-object v0
.end method

.method public final U0()V
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->Q()V

    return-void
.end method

.method public final V()LF0/O;
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    return-object v0
.end method

.method public final V0()V
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->R()V

    return-void
.end method

.method public final W()Z
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->A()Z

    move-result v0

    return v0
.end method

.method public final W0(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->b(I)I

    move-result p1

    return p1
.end method

.method public final X()LF0/J$e;
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->B()LF0/J$e;

    move-result-object v0

    return-object v0
.end method

.method public final X0(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->c(I)I

    move-result p1

    return p1
.end method

.method public final Y()Z
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->F()Z

    move-result v0

    return v0
.end method

.method public final Y0(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->d(I)I

    move-result p1

    return p1
.end method

.method public final Z()Z
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->G()Z

    move-result v0

    return v0
.end method

.method public final Z0(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->e(I)I

    move-result p1

    return p1
.end method

.method public a(LY0/e;)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->V:LY0/e;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LF0/J;->V:LY0/e;

    invoke-direct {p0}, LF0/J;->g1()V

    iget-object p1, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LF0/v0;

    invoke-interface {v0}, LF0/v0;->t0()V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ll0/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll0/c;

    invoke-interface {v0}, Ll0/c;->N()V

    :cond_1
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a0()LF0/O$a;
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->H()LF0/O$a;

    move-result-object v0

    return-object v0
.end method

.method public final a1(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->f(I)I

    move-result p1

    return p1
.end method

.method public b(LY0/v;)V
    .locals 9

    .prologue
    iget-object v0, p0, LF0/J;->W:LY0/v;

    if-eq v0, p1, :cond_8

    iput-object p1, p0, LF0/J;->W:LY0/v;

    invoke-direct {p0}, LF0/J;->g1()V

    iget-object p1, p0, LF0/J;->c0:LF0/b0;

    const/4 v0, 0x4

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p1}, LF0/b0;->c(LF0/b0;)I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, v1

    :goto_1
    if-eqz v2, :cond_7

    instance-of v4, v2, LF0/s;

    if-eqz v4, :cond_0

    check-cast v2, LF0/s;

    instance-of v4, v2, Ll0/c;

    if-eqz v4, :cond_6

    check-cast v2, Ll0/c;

    invoke-interface {v2}, Ll0/c;->N()V

    goto :goto_4

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v2, LF0/m;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, LF0/m;

    invoke-virtual {v4}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LX/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/d$c;

    invoke-direct {v3, v7, v5}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_3
    invoke-virtual {v3, v4}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v3}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final b0()LF0/J;
    .locals 1

    iget-object v0, p0, LF0/J;->G:LF0/J;

    return-object v0
.end method

.method public final b1(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->g(I)I

    move-result p1

    return p1
.end method

.method public c()V
    .locals 11

    .prologue
    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    const/16 v1, 0x80

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {v1}, LF0/g0;->i(I)Z

    move-result v2

    invoke-virtual {v0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v3

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v3

    if-nez v3, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {v0, v2}, LF0/d0;->M1(LF0/d0;Z)Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    move-object v4, v0

    move-object v5, v2

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, LF0/C;

    if-eqz v6, :cond_2

    check-cast v4, LF0/C;

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v6

    invoke-interface {v4, v6}, LF0/C;->m1(LD0/t;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    instance-of v6, v4, LF0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LX/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v9, v7}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v4, v2

    :cond_5
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_3

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v0, v3, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public final c0()LF0/L;
    .locals 1

    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getSharedDrawScope()LF0/L;

    move-result-object v0

    return-object v0
.end method

.method public final c1(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->h(I)I

    move-result p1

    return p1
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, LF0/J;->E:I

    return-void
.end method

.method public final d0()LF0/O$b;
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->I()LF0/O$b;

    move-result-object v0

    return-object v0
.end method

.method public final d1(I)I
    .locals 1

    invoke-direct {p0}, LF0/J;->l0()LF0/z;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/z;->i(I)I

    move-result p1

    return p1
.end method

.method public e(LD0/I;)V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/J;->T:LD0/I;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LF0/J;->T:LD0/I;

    iget-object p1, p0, LF0/J;->U:LF0/z;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LF0/J;->f0()LD0/I;

    move-result-object v0

    invoke-virtual {p1, v0}, LF0/z;->k(LD0/I;)V

    :cond_0
    invoke-virtual {p0}, LF0/J;->F0()V

    :cond_1
    return-void
.end method

.method public final e0()Z
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->J()Z

    move-result v0

    return v0
.end method

.method public final e1(III)V
    .locals 4

    .prologue
    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    if-le p1, p2, :cond_1

    add-int v1, p1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-le p1, p2, :cond_2

    add-int v2, p2, v0

    goto :goto_2

    :cond_2
    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x2

    :goto_2
    iget-object v3, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v3, v1}, LF0/Y;->g(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF0/J;

    iget-object v3, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v3, v2, v1}, LF0/Y;->a(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LF0/J;->h1()V

    invoke-direct {p0}, LF0/J;->J0()V

    invoke-virtual {p0}, LF0/J;->F0()V

    return-void
.end method

.method public f()V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->f()V

    :cond_0
    iget-object v0, p0, LF0/J;->e0:LD0/C;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LD0/C;->f()V

    :cond_1
    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->o2()LF0/d0;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/d0;->I2()V

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public f0()LD0/I;
    .locals 1

    iget-object v0, p0, LF0/J;->T:LD0/I;

    return-object v0
.end method

.method public g(Landroidx/compose/ui/d;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, LF0/J;->C:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LF0/J;->i0()Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez v0, :cond_3

    const-string v0, "modifier is updated when deactivated"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, LF0/J;->K0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, LF0/J;->t(Landroidx/compose/ui/d;)V

    goto :goto_2

    :cond_4
    iput-object p1, p0, LF0/J;->i0:Landroidx/compose/ui/d;

    :goto_2
    return-void
.end method

.method public final g0()LF0/J$g;
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->s1()LF0/J$g;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LF0/J;->W:LY0/v;

    return-object v0
.end method

.method public h(LV/z;)V
    .locals 9

    .prologue
    iput-object p1, p0, LF0/J;->Y:LV/z;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/z;->b(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    invoke-virtual {p0, v0}, LF0/J;->a(LY0/e;)V

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/z;->b(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/v;

    invoke-virtual {p0, v0}, LF0/J;->b(LY0/v;)V

    invoke-static {}, Landroidx/compose/ui/platform/p0;->r()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/z;->b(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/A1;

    invoke-virtual {p0, p1}, LF0/J;->m(Landroidx/compose/ui/platform/A1;)V

    iget-object p1, p0, LF0/J;->c0:LF0/b0;

    const v0, 0x8000

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p1}, LF0/b0;->c(LF0/b0;)I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, v1

    :goto_1
    if-eqz v2, :cond_8

    instance-of v4, v2, LF0/h;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    check-cast v2, LF0/h;

    invoke-interface {v2}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, LF0/g0;->e(Landroidx/compose/ui/d$c;)V

    goto :goto_4

    :cond_0
    invoke-virtual {v2, v5}, Landroidx/compose/ui/d$c;->Q1(Z)V

    goto :goto_4

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_7

    instance-of v4, v2, LF0/m;

    if-eqz v4, :cond_7

    move-object v4, v2

    check-cast v4, LF0/m;

    invoke-virtual {v4}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v4

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_5

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v5, :cond_2

    move-object v2, v4

    goto :goto_3

    :cond_2
    if-nez v3, :cond_3

    new-instance v3, LX/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/d$c;

    invoke-direct {v3, v8, v6}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v3, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_4
    invoke-virtual {v3, v4}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_6
    if-ne v7, v5, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-static {v3}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_9
    return-void
.end method

.method public final h0()LF0/J$g;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O$a;->o1()LF0/J$g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LF0/J$g;->E:LF0/J$g;

    :cond_1
    return-object v0
.end method

.method public final h1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/J;->C:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/J;->h1()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/J;->S:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public i()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->i()V

    :cond_0
    iget-object v0, p0, LF0/J;->e0:LD0/C;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LD0/C;->i()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/J;->m0:Z

    invoke-direct {p0}, LF0/J;->y1()V

    invoke-virtual {p0}, LF0/J;->K0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LF0/J;->I0()V

    :cond_2
    return-void
.end method

.method public i0()Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, LF0/J;->h0:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public final i1(II)V
    .locals 8

    .prologue
    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LF0/J;->w()V

    :cond_0
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/T;->s1()LD0/X$a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getPlacementScope()LD0/X$a;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move v3, p1

    move v4, p2

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public j()V
    .locals 13

    .prologue
    iget-object v0, p0, LF0/J;->G:LF0/J;

    if-eqz v0, :cond_0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :goto_0
    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->y()LY0/b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LF0/J;->M:LF0/o0;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v2

    invoke-interface {v1, p0, v2, v3}, LF0/o0;->l(LF0/J;J)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LF0/n0;->c(LF0/o0;ZILjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final j0()Z
    .locals 1

    iget-boolean v0, p0, LF0/J;->l0:Z

    return v0
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->k()Z

    move-result v0

    return v0
.end method

.method public final k0()LF0/b0;
    .locals 1

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    return-object v0
.end method

.method public final k1(LY0/b;)Z
    .locals 3

    .prologue
    if-eqz p1, :cond_1

    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LF0/J;->v()V

    :cond_0
    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF0/O$b;->I1(J)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l()LD0/t;
    .locals 1

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public m(Landroidx/compose/ui/platform/A1;)V
    .locals 10

    .prologue
    iget-object v0, p0, LF0/J;->X:Landroidx/compose/ui/platform/A1;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iput-object p1, p0, LF0/J;->X:Landroidx/compose/ui/platform/A1;

    iget-object p1, p0, LF0/J;->c0:LF0/b0;

    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {p1}, LF0/b0;->c(LF0/b0;)I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    move-object v3, p1

    move-object v4, v2

    :goto_1
    if-eqz v3, :cond_7

    instance-of v5, v3, LF0/v0;

    if-eqz v5, :cond_0

    check-cast v3, LF0/v0;

    invoke-interface {v3}, LF0/v0;->f1()V

    goto :goto_4

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v3, LF0/m;

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v3, v5

    goto :goto_3

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LX/b;

    new-array v8, v0, [Landroidx/compose/ui/d$c;

    invoke-direct {v4, v8, v6}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_3
    invoke-virtual {v4, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v4}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v3

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final m0()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->n()LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public final m1()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0}, LF0/Y;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    iget-object v1, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v1, v0}, LF0/Y;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF0/J;

    invoke-direct {p0, v1}, LF0/J;->f1(LF0/J;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0}, LF0/Y;->c()V

    return-void
.end method

.method public final n0()LF0/o0;
    .locals 1

    iget-object v0, p0, LF0/J;->M:LF0/o0;

    return-object v0
.end method

.method public final n1(II)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ltz p2, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") must be greater than 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LC0/a;->a(Ljava/lang/String;)V

    :cond_1
    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    if-gt p1, p2, :cond_2

    :goto_1
    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0, p2}, LF0/Y;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-direct {p0, v0}, LF0/J;->f1(LF0/J;)V

    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0, p2}, LF0/Y;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eq p2, p1, :cond_2

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final o0()LF0/J;
    .locals 3

    .prologue
    iget-object v0, p0, LF0/J;->L:LF0/J;

    :goto_0
    if-eqz v0, :cond_0

    iget-boolean v1, v0, LF0/J;->C:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, LF0/J;->L:LF0/J;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final o1()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LF0/J;->w()V

    :cond_0
    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->J1()V

    return-void
.end method

.method public p()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "onReuse is only expected on attached node"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LF0/J;->N:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->p()V

    :cond_1
    iget-object v0, p0, LF0/J;->e0:LD0/C;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LD0/C;->p()V

    :cond_2
    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/J;->m0:Z

    invoke-virtual {p0}, LF0/J;->I0()V

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LF0/J;->y1()V

    :goto_0
    invoke-static {}, LK0/n;->b()I

    move-result v0

    invoke-virtual {p0, v0}, LF0/J;->I1(I)V

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->s()V

    iget-object v0, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v0}, LF0/b0;->y()V

    invoke-virtual {p0, p0}, LF0/J;->x1(LF0/J;)V

    return-void
.end method

.method public final p0()I
    .locals 1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->t1()I

    move-result v0

    return v0
.end method

.method public final p1(Z)V
    .locals 2

    .prologue
    iget-boolean v0, p0, LF0/J;->C:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/J;->M:LF0/o0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p0, v1, p1}, LF0/o0;->h(LF0/J;ZZ)V

    :cond_0
    return-void
.end method

.method public q0()I
    .locals 1

    iget v0, p0, LF0/J;->D:I

    return v0
.end method

.method public final r0()LD0/C;
    .locals 1

    iget-object v0, p0, LF0/J;->e0:LD0/C;

    return-object v0
.end method

.method public final r1(ZZZ)V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/J;->G:LF0/J;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-boolean v2, p0, LF0/J;->P:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, LF0/J;->C:Z

    if-nez v2, :cond_3

    invoke-interface {v0, p0, v1, p1, p2}, LF0/o0;->q(LF0/J;ZZZ)V

    if-eqz p3, :cond_3

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, LF0/O$a;->r1(Z)V

    :cond_3
    return-void
.end method

.method public s0()Landroidx/compose/ui/platform/A1;
    .locals 1

    iget-object v0, p0, LF0/J;->X:Landroidx/compose/ui/platform/A1;

    return-object v0
.end method

.method public t0()I
    .locals 1

    iget-object v0, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v0}, LF0/O;->L()I

    move-result v0

    return v0
.end method

.method public final t1(Z)V
    .locals 7

    .prologue
    iget-boolean v0, p0, LF0/J;->C:Z

    if-nez v0, :cond_0

    iget-object v1, p0, LF0/J;->M:LF0/o0;

    if-eqz v1, :cond_0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move v4, p1

    invoke-static/range {v1 .. v6}, LF0/n0;->e(LF0/o0;LF0/J;ZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroidx/compose/ui/platform/J0;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " children: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " measurePolicy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->f0()LD0/I;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LF0/o0;)V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v3, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot attach "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " as it already is attached.  Tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v3}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LF0/J;->L:LF0/J;

    if-eqz v0, :cond_4

    if-eqz v0, :cond_2

    iget-object v0, v0, LF0/J;->M:LF0/o0;

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v2

    :goto_3
    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attaching to a different owner("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ") than the parent\'s owner("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v4, v4, LF0/J;->M:LF0/o0;

    goto :goto_4

    :cond_5
    move-object v4, v3

    :goto_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "). This tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v3}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Parent tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LF0/J;->L:LF0/J;

    if-eqz v4, :cond_6

    invoke-static {v4, v1, v2, v3}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_6
    move-object v4, v3

    :goto_5
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v4

    invoke-virtual {v4, v2}, LF0/O$b;->M1(Z)V

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4, v2}, LF0/O$a;->G1(Z)V

    :cond_8
    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v4

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LF0/J;->P()LF0/d0;

    move-result-object v5

    goto :goto_6

    :cond_9
    move-object v5, v3

    :goto_6
    invoke-virtual {v4, v5}, LF0/d0;->T2(LF0/d0;)V

    iput-object p1, p0, LF0/J;->M:LF0/o0;

    if-eqz v0, :cond_a

    iget v4, v0, LF0/J;->O:I

    goto :goto_7

    :cond_a
    const/4 v4, -0x1

    :goto_7
    add-int/2addr v4, v2

    iput v4, p0, LF0/J;->O:I

    iget-object v4, p0, LF0/J;->i0:Landroidx/compose/ui/d;

    if-eqz v4, :cond_b

    invoke-direct {p0, v4}, LF0/J;->t(Landroidx/compose/ui/d;)V

    :cond_b
    iput-object v3, p0, LF0/J;->i0:Landroidx/compose/ui/d;

    iget-object v3, p0, LF0/J;->c0:LF0/b0;

    const/16 v4, 0x8

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LF0/b0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {p0}, LF0/J;->I0()V

    :cond_c
    invoke-interface {p1, p0}, LF0/o0;->b(LF0/J;)V

    iget-boolean v3, p0, LF0/J;->F:Z

    if-eqz v3, :cond_d

    :goto_8
    invoke-direct {p0, p0}, LF0/J;->E1(LF0/J;)V

    goto :goto_9

    :cond_d
    iget-object v3, p0, LF0/J;->L:LF0/J;

    if-eqz v3, :cond_e

    iget-object v3, v3, LF0/J;->G:LF0/J;

    if-nez v3, :cond_f

    :cond_e
    iget-object v3, p0, LF0/J;->G:LF0/J;

    :cond_f
    invoke-direct {p0, v3}, LF0/J;->E1(LF0/J;)V

    iget-object v3, p0, LF0/J;->G:LF0/J;

    if-nez v3, :cond_10

    iget-object v3, p0, LF0/J;->c0:LF0/b0;

    const/16 v4, 0x200

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LF0/b0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_8

    :cond_10
    :goto_9
    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v3

    if-nez v3, :cond_11

    iget-object v3, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v3}, LF0/b0;->s()V

    :cond_11
    iget-object v3, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v3}, LF0/Y;->f()LX/b;

    move-result-object v3

    invoke-virtual {v3}, LX/b;->t()I

    move-result v4

    if-lez v4, :cond_13

    invoke-virtual {v3}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    :cond_12
    aget-object v5, v3, v1

    check-cast v5, LF0/J;

    invoke-virtual {v5, p1}, LF0/J;->u(LF0/o0;)V

    add-int/2addr v1, v2

    if-lt v1, v4, :cond_12

    :cond_13
    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result v1

    if-nez v1, :cond_14

    iget-object v1, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v1}, LF0/b0;->y()V

    :cond_14
    invoke-virtual {p0}, LF0/J;->F0()V

    if-eqz v0, :cond_15

    invoke-virtual {v0}, LF0/J;->F0()V

    :cond_15
    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {p0}, LF0/J;->P()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->o2()LF0/d0;

    move-result-object v1

    :goto_a
    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    if-eqz v0, :cond_16

    invoke-virtual {v0}, LF0/d0;->E2()V

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    goto :goto_a

    :cond_16
    iget-object v0, p0, LF0/J;->j0:Lx7/l;

    if-eqz v0, :cond_17

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    iget-object p1, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {p1}, LF0/O;->c0()V

    invoke-virtual {p0}, LF0/J;->L0()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-direct {p0}, LF0/J;->C0()V

    :cond_18
    return-void
.end method

.method public final v()V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/J;->Z:LF0/J$g;

    iput-object v0, p0, LF0/J;->a0:LF0/J$g;

    sget-object v0, LF0/J$g;->E:LF0/J$g;

    iput-object v0, p0, LF0/J;->Z:LF0/J$g;

    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    iget-object v4, v3, LF0/J;->Z:LF0/J$g;

    sget-object v5, LF0/J$g;->E:LF0/J$g;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, LF0/J;->v()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public final v0()LX/b;
    .locals 3

    .prologue
    iget-boolean v0, p0, LF0/J;->S:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/J;->R:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    iget-object v0, p0, LF0/J;->R:LX/b;

    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v1

    invoke-virtual {v0}, LX/b;->t()I

    move-result v2

    invoke-virtual {v0, v2, v1}, LX/b;->e(ILX/b;)Z

    iget-object v0, p0, LF0/J;->R:LX/b;

    sget-object v1, LF0/J;->s0:Ljava/util/Comparator;

    invoke-virtual {v0, v1}, LX/b;->N(Ljava/util/Comparator;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/J;->S:Z

    :cond_0
    iget-object v0, p0, LF0/J;->R:LX/b;

    return-object v0
.end method

.method public final v1(ZZZ)V
    .locals 8

    .prologue
    iget-boolean v0, p0, LF0/J;->P:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LF0/J;->C:Z

    if-nez v0, :cond_1

    iget-object v1, p0, LF0/J;->M:LF0/o0;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move v4, p1

    move v5, p2

    invoke-static/range {v1 .. v7}, LF0/n0;->d(LF0/o0;LF0/J;ZZZILjava/lang/Object;)V

    if-eqz p3, :cond_1

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object p2

    invoke-virtual {p2, p1}, LF0/O$b;->v1(Z)V

    :cond_1
    return-void
.end method

.method public final w0()LX/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/J;->K1()V

    iget v0, p0, LF0/J;->H:I

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v0}, LF0/Y;->f()LX/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF0/J;->J:LX/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public final x0(JLF0/v;ZZ)V
    .locals 13

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LF0/d0;->c2(LF0/d0;JZILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v6

    sget-object v0, LF0/d0;->n0:LF0/d0$e;

    invoke-virtual {v0}, LF0/d0$e;->a()LF0/d0$f;

    move-result-object v7

    move-object/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    invoke-virtual/range {v6 .. v12}, LF0/d0;->w2(LF0/d0$f;JLF0/v;ZZ)V

    return-void
.end method

.method public final x1(LF0/J;)V
    .locals 8

    .prologue
    invoke-virtual {p1}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$h;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LF0/J;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LF0/J;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v1}, LF0/J;->p1(Z)V

    :cond_1
    invoke-virtual {p1}, LF0/J;->e0()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LF0/J;->W()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v1}, LF0/J;->t1(Z)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LF0/J;->X()LF0/J$e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()V
    .locals 8

    .prologue
    iget-object v0, p0, LF0/J;->M:LF0/o0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot detach node that is already detached!  Tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4, v3, v1, v2}, LF0/J;->y(LF0/J;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LF0/J;->D0()V

    invoke-virtual {v4}, LF0/J;->F0()V

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v4

    sget-object v5, LF0/J$g;->E:LF0/J$g;

    invoke-virtual {v4, v5}, LF0/O$b;->L1(LF0/J$g;)V

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4, v5}, LF0/O$a;->E1(LF0/J$g;)V

    :cond_2
    iget-object v4, p0, LF0/J;->d0:LF0/O;

    invoke-virtual {v4}, LF0/O;->V()V

    iget-object v4, p0, LF0/J;->k0:Lx7/l;

    if-eqz v4, :cond_3

    invoke-interface {v4, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v4, p0, LF0/J;->c0:LF0/b0;

    const/16 v5, 0x8

    invoke-static {v5}, LF0/f0;->a(I)I

    move-result v5

    invoke-virtual {v4, v5}, LF0/b0;->q(I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0}, LF0/J;->I0()V

    :cond_4
    iget-object v4, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v4}, LF0/b0;->z()V

    invoke-static {p0, v1}, LF0/J;->s(LF0/J;Z)V

    iget-object v4, p0, LF0/J;->I:LF0/Y;

    invoke-virtual {v4}, LF0/Y;->f()LX/b;

    move-result-object v4

    invoke-virtual {v4}, LX/b;->t()I

    move-result v5

    if-lez v5, :cond_6

    invoke-virtual {v4}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v4

    move v6, v3

    :cond_5
    aget-object v7, v4, v6

    check-cast v7, LF0/J;

    invoke-virtual {v7}, LF0/J;->z()V

    add-int/2addr v6, v1

    if-lt v6, v5, :cond_5

    :cond_6
    invoke-static {p0, v3}, LF0/J;->s(LF0/J;Z)V

    iget-object v1, p0, LF0/J;->c0:LF0/b0;

    invoke-virtual {v1}, LF0/b0;->t()V

    invoke-interface {v0, p0}, LF0/o0;->m(LF0/J;)V

    iput-object v2, p0, LF0/J;->M:LF0/o0;

    invoke-direct {p0, v2}, LF0/J;->E1(LF0/J;)V

    iput v3, p0, LF0/J;->O:I

    invoke-virtual {p0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->E1()V

    invoke-virtual {p0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LF0/O$a;->y1()V

    :cond_7
    return-void
.end method

.method public final z0(JLF0/v;ZZ)V
    .locals 13

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LF0/d0;->c2(LF0/d0;JZILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object v6

    sget-object v0, LF0/d0;->n0:LF0/d0$e;

    invoke-virtual {v0}, LF0/d0$e;->b()LF0/d0$f;

    move-result-object v7

    const/4 v11, 0x1

    move-object/from16 v10, p3

    move/from16 v12, p5

    invoke-virtual/range {v6 .. v12}, LF0/d0;->w2(LF0/d0$f;JLF0/v;ZZ)V

    return-void
.end method

.method public final z1()V
    .locals 6

    .prologue
    invoke-virtual {p0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    iget-object v4, v3, LF0/J;->a0:LF0/J$g;

    iput-object v4, v3, LF0/J;->Z:LF0/J$g;

    sget-object v5, LF0/J$g;->E:LF0/J$g;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, LF0/J;->z1()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method
