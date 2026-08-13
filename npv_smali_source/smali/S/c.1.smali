.class public final LS/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS/t1;


# instance fields
.field private final a:LS/t1;

.field private b:F

.field private c:F

.field private d:Lu/a;

.field private final e:Lv/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS/t1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/c;->a:LS/t1;

    invoke-interface {p1}, LS/t1;->b()I

    move-result v0

    rem-int/lit8 v0, v0, 0xc

    int-to-float v0, v0

    const v1, 0x3f060a92

    mul-float/2addr v0, v1

    const v1, 0x3fc90fdb

    sub-float/2addr v0, v1

    iput v0, p0, LS/c;->b:F

    invoke-interface {p1}, LS/t1;->a()I

    move-result p1

    int-to-float p1, p1

    const v0, 0x3dd67750

    mul-float/2addr p1, v0

    sub-float/2addr p1, v1

    iput p1, p0, LS/c;->c:F

    iget p1, p0, LS/c;->b:F

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object p1

    iput-object p1, p0, LS/c;->d:Lu/a;

    new-instance p1, Lv/N;

    invoke-direct {p1}, Lv/N;-><init>()V

    iput-object p1, p0, LS/c;->e:Lv/N;

    return-void
.end method

.method public static synthetic C(LS/c;FZLm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LS/c;->B(FZLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final D(F)I
    .locals 4

    const v0, 0x3e860a92

    float-to-double v0, v0

    const-wide v2, 0x3ff921fb54442d18L    # 1.5707963267948966

    add-double/2addr v0, v2

    float-to-double v2, p1

    add-double/2addr v2, v0

    const p1, 0x3f060a92

    float-to-double v0, p1

    div-double/2addr v2, v0

    double-to-int p1, v2

    rem-int/lit8 p1, p1, 0xc

    return p1
.end method

.method private final E(F)I
    .locals 4

    const v0, 0x3d567750

    float-to-double v0, v0

    const-wide v2, 0x3ff921fb54442d18L    # 1.5707963267948966

    add-double/2addr v0, v2

    float-to-double v2, p1

    add-double/2addr v2, v0

    const p1, 0x3dd67750

    float-to-double v0, p1

    div-double/2addr v2, v0

    double-to-int p1, v2

    rem-int/lit8 p1, p1, 0x3c

    return p1
.end method

.method private final F()V
    .locals 6

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v3

    :try_start_0
    iget-object v4, p0, LS/c;->a:LS/t1;

    invoke-virtual {p0}, LS/c;->a()I

    move-result v5

    invoke-interface {v4, v5}, LS/t1;->e(I)V

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :catchall_0
    move-exception v4

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v4
.end method

.method public static final synthetic j(LS/c;F)F
    .locals 0

    invoke-direct {p0, p1}, LS/c;->t(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic k(LS/c;)Lu/a;
    .locals 0

    iget-object p0, p0, LS/c;->d:Lu/a;

    return-object p0
.end method

.method public static final synthetic l(LS/c;)F
    .locals 0

    iget p0, p0, LS/c;->b:F

    return p0
.end method

.method public static final synthetic m(LS/c;)F
    .locals 0

    iget p0, p0, LS/c;->c:F

    return p0
.end method

.method public static final synthetic n(LS/c;F)F
    .locals 0

    invoke-direct {p0, p1}, LS/c;->z(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic o(LS/c;F)V
    .locals 0

    iput p1, p0, LS/c;->b:F

    return-void
.end method

.method public static final synthetic p(LS/c;F)V
    .locals 0

    iput p1, p0, LS/c;->c:F

    return-void
.end method

.method public static final synthetic q(LS/c;F)I
    .locals 0

    invoke-direct {p0, p1}, LS/c;->D(F)I

    move-result p0

    return p0
.end method

.method public static final synthetic r(LS/c;F)I
    .locals 0

    invoke-direct {p0, p1}, LS/c;->E(F)I

    move-result p0

    return p0
.end method

.method private final t(F)F
    .locals 2

    .prologue
    iget-object v0, p0, LS/c;->d:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float/2addr v0, p1

    :goto_0
    const p1, 0x40490fdb    # (float)Math.PI

    cmpl-float p1, v0, p1

    const v1, 0x40c90fdb

    if-lez p1, :cond_0

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    :goto_1
    const p1, -0x3fb6f025

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_1

    add-float/2addr v0, v1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LS/c;->d:Lu/a;

    invoke-virtual {p1}, Lu/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    sub-float/2addr p1, v0

    return p1
.end method

.method private final x()Z
    .locals 4

    .prologue
    invoke-virtual {p0}, LS/c;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v2

    invoke-static {v0, v2}, LS/s1;->f(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LS/c;->d:Lu/a;

    invoke-virtual {v0}, Lu/a;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-direct {p0, v0}, LS/c;->y(F)F

    move-result v0

    iget v3, p0, LS/c;->b:F

    invoke-direct {p0, v3}, LS/c;->y(F)F

    move-result v3

    cmpg-float v0, v0, v3

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, LS/c;->g()I

    move-result v0

    invoke-virtual {v1}, LS/s1$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LS/c;->d:Lu/a;

    invoke-virtual {v0}, Lu/a;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-direct {p0, v0}, LS/c;->y(F)F

    move-result v0

    iget v1, p0, LS/c;->c:F

    invoke-direct {p0, v1}, LS/c;->y(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private final y(F)F
    .locals 6

    .prologue
    float-to-double v0, p1

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    rem-double/2addr v0, v2

    const-wide/16 v4, 0x0

    cmpg-double p1, v0, v4

    if-gez p1, :cond_0

    add-double/2addr v0, v2

    :cond_0
    double-to-float p1, v0

    return p1
.end method

.method private final z(F)F
    .locals 1

    .prologue
    const v0, 0x3fc90fdb

    add-float/2addr p1, v0

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const v0, 0x40c90fdb

    add-float/2addr p1, v0

    :cond_0
    return p1
.end method


# virtual methods
.method public final A(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-virtual {p0}, LS/c;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LS/c;->b:F

    goto :goto_0

    :cond_0
    iget v0, p0, LS/c;->c:F

    :goto_0
    invoke-direct {p0, v0}, LS/c;->t(F)F

    move-result v0

    iget-object v1, p0, LS/c;->e:Lv/N;

    sget-object v2, Lv/L;->E:Lv/L;

    new-instance v3, LS/c$b;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v0, v4}, LS/c$b;-><init>(LS/c;FLm7/e;)V

    invoke-virtual {v1, v2, v3, p1}, Lv/N;->d(Lv/L;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final B(FZLm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, LS/c;->e:Lv/N;

    sget-object v1, Lv/L;->D:Lv/L;

    new-instance v2, LS/c$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, p2, v3}, LS/c$c;-><init>(LS/c;FZLm7/e;)V

    invoke-virtual {v0, v1, v2, p3}, Lv/N;->d(Lv/L;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public a()I
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0}, LS/t1;->a()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0}, LS/t1;->b()I

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0, p1}, LS/t1;->c(Z)V

    return-void
.end method

.method public d(I)V
    .locals 3

    .prologue
    rem-int/lit8 v0, p1, 0xc

    int-to-float v0, v0

    const v1, 0x3f060a92

    mul-float/2addr v0, v1

    const v1, 0x3fc90fdb

    sub-float/2addr v0, v1

    iput v0, p0, LS/c;->b:F

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0, p1}, LS/t1;->d(I)V

    invoke-virtual {p0}, LS/c;->g()I

    move-result p1

    sget-object v0, LS/s1;->b:LS/s1$a;

    invoke-virtual {v0}, LS/s1$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LS/s1;->f(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, LS/c;->b:F

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object p1

    iput-object p1, p0, LS/c;->d:Lu/a;

    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 3

    .prologue
    const v0, 0x3dd67750

    int-to-float v1, p1

    mul-float/2addr v1, v0

    const v0, 0x3fc90fdb

    sub-float/2addr v1, v0

    iput v1, p0, LS/c;->c:F

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0, p1}, LS/t1;->e(I)V

    invoke-virtual {p0}, LS/c;->g()I

    move-result p1

    sget-object v0, LS/s1;->b:LS/s1$a;

    invoke-virtual {v0}, LS/s1$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LS/s1;->f(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, LS/c;->c:F

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object p1

    iput-object p1, p0, LS/c;->d:Lu/a;

    :cond_0
    invoke-direct {p0}, LS/c;->F()V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0, p1}, LS/t1;->f(I)V

    return-void
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0}, LS/t1;->g()I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0}, LS/t1;->h()Z

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    invoke-interface {v0}, LS/t1;->i()Z

    move-result v0

    return v0
.end method

.method public final s(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-direct {p0}, LS/c;->x()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    invoke-virtual {p0}, LS/c;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LS/c;->b:F

    :goto_0
    invoke-direct {p0, v0}, LS/c;->t(F)F

    move-result v0

    goto :goto_1

    :cond_1
    iget v0, p0, LS/c;->c:F

    goto :goto_0

    :goto_1
    iget-object v1, p0, LS/c;->e:Lv/N;

    sget-object v2, Lv/L;->E:Lv/L;

    new-instance v3, LS/c$a;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v0, v4}, LS/c$a;-><init>(LS/c;FLm7/e;)V

    invoke-virtual {v1, v2, v3, p1}, Lv/N;->d(Lv/L;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final u()Lr/l;
    .locals 2

    .prologue
    invoke-virtual {p0}, LS/c;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LS/q1;->P()Lr/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, LS/q1;->M()Lr/l;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final v()F
    .locals 1

    iget-object v0, p0, LS/c;->d:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final w()LS/t1;
    .locals 1

    iget-object v0, p0, LS/c;->a:LS/t1;

    return-object v0
.end method
