.class public abstract LR/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/G;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:LV/G1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZFLV/G1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LR/f;->a:Z

    iput p2, p0, LR/f;->b:F

    iput-object p3, p0, LR/f;->c:LV/G1;

    return-void
.end method

.method public synthetic constructor <init>(ZFLV/G1;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LR/f;-><init>(ZFLV/G1;)V

    return-void
.end method


# virtual methods
.method public final b(Lz/j;LV/n;I)Lv/H;
    .locals 11

    .prologue
    const v0, 0x3aef0613

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LR/s;->d()LV/O0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/r;

    iget-object v1, p0, LR/f;->c:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const v1, -0x12182286

    invoke-interface {p2, v1}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    iget-object v1, p0, LR/f;->c:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    const v1, -0x12175dde    # -8.999566E27f

    invoke-interface {p2, v1}, LV/n;->T(I)V

    invoke-interface {v0, p2, v2}, LR/r;->b(LV/n;I)J

    move-result-wide v3

    invoke-interface {p2}, LV/n;->J()V

    :goto_0
    invoke-static {v3, v4}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v1

    invoke-static {v1, p2, v2}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v7

    invoke-interface {v0, p2, v2}, LR/r;->a(LV/n;I)LR/g;

    move-result-object v0

    invoke-static {v0, p2, v2}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v8

    iget-boolean v5, p0, LR/f;->a:Z

    iget v6, p0, LR/f;->b:F

    and-int/lit8 v0, p3, 0xe

    shl-int/lit8 v1, p3, 0xc

    const/high16 v3, 0x70000

    and-int/2addr v1, v3

    or-int v10, v0, v1

    move-object v3, p0

    move-object v4, p1

    move-object v9, p2

    invoke-virtual/range {v3 .. v10}, LR/f;->c(Lz/j;ZFLV/G1;LV/G1;LV/n;I)LR/o;

    move-result-object v1

    xor-int/lit8 v0, v0, 0x6

    const/4 v3, 0x4

    if-le v0, v3, :cond_2

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_4

    :cond_3
    const/4 v2, 0x1

    :cond_4
    invoke-interface {p2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_6

    :cond_5
    new-instance v2, LR/f$a;

    const/4 v0, 0x0

    invoke-direct {v2, p1, v1, v0}, LR/f$a;-><init>(Lz/j;LR/o;Lm7/e;)V

    invoke-interface {p2, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lx7/p;

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    invoke-static {v1, p1, v2, p2, p3}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    invoke-interface {p2}, LV/n;->J()V

    return-object v1
.end method

.method public abstract c(Lz/j;ZFLV/G1;LV/G1;LV/n;I)LR/o;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, LR/f;->a:Z

    check-cast p1, LR/f;

    iget-boolean v3, p1, LR/f;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LR/f;->b:F

    iget v3, p1, LR/f;->b:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LR/f;->c:LV/G1;

    iget-object p1, p1, LR/f;->c:LV/G1;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LR/f;->a:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LR/f;->b:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LR/f;->c:LV/G1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
