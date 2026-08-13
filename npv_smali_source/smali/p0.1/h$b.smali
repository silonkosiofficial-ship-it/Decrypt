.class public final Lp0/h$b;
.super Lp0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final h:Lp0/x;

.field private final i:Lp0/x;

.field private final j:[F


# direct methods
.method private constructor <init>(Lp0/x;Lp0/x;I)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lp0/h;-><init>(Lp0/c;Lp0/c;Lp0/c;Lp0/c;I[FLy7/k;)V

    iput-object p1, p0, Lp0/h$b;->h:Lp0/x;

    iput-object p2, p0, Lp0/h$b;->i:Lp0/x;

    invoke-direct {p0, p1, p2, p3}, Lp0/h$b;->b(Lp0/x;Lp0/x;I)[F

    move-result-object p1

    iput-object p1, p0, Lp0/h$b;->j:[F

    return-void
.end method

.method public synthetic constructor <init>(Lp0/x;Lp0/x;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lp0/h$b;-><init>(Lp0/x;Lp0/x;I)V

    return-void
.end method

.method private final b(Lp0/x;Lp0/x;I)[F
    .locals 11

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lp0/x;->N()Lp0/z;

    move-result-object v3

    invoke-virtual {p2}, Lp0/x;->N()Lp0/z;

    move-result-object v4

    invoke-static {v3, v4}, Lp0/d;->f(Lp0/z;Lp0/z;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2}, Lp0/x;->G()[F

    move-result-object p2

    invoke-virtual {p1}, Lp0/x;->M()[F

    move-result-object p1

    invoke-static {p2, p1}, Lp0/d;->l([F[F)[F

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lp0/x;->M()[F

    move-result-object v3

    invoke-virtual {p2}, Lp0/x;->G()[F

    move-result-object v4

    invoke-virtual {p1}, Lp0/x;->N()Lp0/z;

    move-result-object v5

    invoke-virtual {v5}, Lp0/z;->c()[F

    move-result-object v5

    invoke-virtual {p2}, Lp0/x;->N()Lp0/z;

    move-result-object v6

    invoke-virtual {v6}, Lp0/z;->c()[F

    move-result-object v6

    invoke-virtual {p1}, Lp0/x;->N()Lp0/z;

    move-result-object v7

    sget-object v8, Lp0/k;->a:Lp0/k;

    invoke-virtual {v8}, Lp0/k;->b()Lp0/z;

    move-result-object v9

    invoke-static {v7, v9}, Lp0/d;->f(Lp0/z;Lp0/z;)Z

    move-result v7

    const-string v9, "copyOf(this, size)"

    if-nez v7, :cond_1

    sget-object v3, Lp0/a;->b:Lp0/a$d;

    invoke-virtual {v3}, Lp0/a$d;->a()Lp0/a;

    move-result-object v3

    invoke-virtual {v3}, Lp0/a;->b()[F

    move-result-object v3

    invoke-virtual {v8}, Lp0/k;->c()[F

    move-result-object v7

    array-length v10, v7

    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v7

    invoke-static {v7, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5, v7}, Lp0/d;->e([F[F[F)[F

    move-result-object v3

    invoke-virtual {p1}, Lp0/x;->M()[F

    move-result-object p1

    invoke-static {v3, p1}, Lp0/d;->l([F[F)[F

    move-result-object v3

    :cond_1
    invoke-virtual {p2}, Lp0/x;->N()Lp0/z;

    move-result-object p1

    invoke-virtual {v8}, Lp0/k;->b()Lp0/z;

    move-result-object v7

    invoke-static {p1, v7}, Lp0/d;->f(Lp0/z;Lp0/z;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lp0/a;->b:Lp0/a$d;

    invoke-virtual {p1}, Lp0/a$d;->a()Lp0/a;

    move-result-object p1

    invoke-virtual {p1}, Lp0/a;->b()[F

    move-result-object p1

    invoke-virtual {v8}, Lp0/k;->c()[F

    move-result-object v4

    array-length v7, v4

    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v4

    invoke-static {v4, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6, v4}, Lp0/d;->e([F[F[F)[F

    move-result-object p1

    invoke-virtual {p2}, Lp0/x;->M()[F

    move-result-object p2

    invoke-static {p1, p2}, Lp0/d;->l([F[F)[F

    move-result-object p1

    invoke-static {p1}, Lp0/d;->k([F)[F

    move-result-object v4

    :cond_2
    sget-object p1, Lp0/n;->a:Lp0/n$a;

    invoke-virtual {p1}, Lp0/n$a;->a()I

    move-result p1

    invoke-static {p3, p1}, Lp0/n;->e(II)Z

    move-result p1

    if-eqz p1, :cond_3

    aget p1, v5, v2

    aget p2, v6, v2

    div-float/2addr p1, p2

    aget p2, v5, v1

    aget p3, v6, v1

    div-float/2addr p2, p3

    aget p3, v5, v0

    aget v5, v6, v0

    div-float/2addr p3, v5

    const/4 v5, 0x3

    new-array v5, v5, [F

    aput p1, v5, v2

    aput p2, v5, v1

    aput p3, v5, v0

    invoke-static {v5, v3}, Lp0/d;->m([F[F)[F

    move-result-object v3

    :cond_3
    invoke-static {v4, v3}, Lp0/d;->l([F[F)[F

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(J)J
    .locals 6

    invoke-static {p1, p2}, Lo0/y0;->t(J)F

    move-result v0

    invoke-static {p1, p2}, Lo0/y0;->s(J)F

    move-result v1

    invoke-static {p1, p2}, Lo0/y0;->q(J)F

    move-result v2

    invoke-static {p1, p2}, Lo0/y0;->p(J)F

    move-result p1

    iget-object p2, p0, Lp0/h$b;->h:Lp0/x;

    invoke-virtual {p2}, Lp0/x;->E()Lp0/j;

    move-result-object p2

    float-to-double v3, v0

    invoke-interface {p2, v3, v4}, Lp0/j;->a(D)D

    move-result-wide v3

    double-to-float p2, v3

    iget-object v0, p0, Lp0/h$b;->h:Lp0/x;

    invoke-virtual {v0}, Lp0/x;->E()Lp0/j;

    move-result-object v0

    float-to-double v3, v1

    invoke-interface {v0, v3, v4}, Lp0/j;->a(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lp0/h$b;->h:Lp0/x;

    invoke-virtual {v1}, Lp0/x;->E()Lp0/j;

    move-result-object v1

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lp0/j;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, p0, Lp0/h$b;->j:[F

    const/4 v3, 0x0

    aget v3, v2, v3

    mul-float/2addr v3, p2

    const/4 v4, 0x3

    aget v4, v2, v4

    mul-float/2addr v4, v0

    add-float/2addr v3, v4

    const/4 v4, 0x6

    aget v4, v2, v4

    mul-float/2addr v4, v1

    add-float/2addr v3, v4

    const/4 v4, 0x1

    aget v4, v2, v4

    mul-float/2addr v4, p2

    const/4 v5, 0x4

    aget v5, v2, v5

    mul-float/2addr v5, v0

    add-float/2addr v4, v5

    const/4 v5, 0x7

    aget v5, v2, v5

    mul-float/2addr v5, v1

    add-float/2addr v4, v5

    const/4 v5, 0x2

    aget v5, v2, v5

    mul-float/2addr v5, p2

    const/4 p2, 0x5

    aget p2, v2, p2

    mul-float/2addr p2, v0

    add-float/2addr v5, p2

    const/16 p2, 0x8

    aget p2, v2, p2

    mul-float/2addr p2, v1

    add-float/2addr v5, p2

    iget-object p2, p0, Lp0/h$b;->i:Lp0/x;

    invoke-virtual {p2}, Lp0/x;->I()Lp0/j;

    move-result-object p2

    float-to-double v0, v3

    invoke-interface {p2, v0, v1}, Lp0/j;->a(D)D

    move-result-wide v0

    double-to-float p2, v0

    iget-object v0, p0, Lp0/h$b;->i:Lp0/x;

    invoke-virtual {v0}, Lp0/x;->I()Lp0/j;

    move-result-object v0

    float-to-double v1, v4

    invoke-interface {v0, v1, v2}, Lp0/j;->a(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lp0/h$b;->i:Lp0/x;

    invoke-virtual {v1}, Lp0/x;->I()Lp0/j;

    move-result-object v1

    float-to-double v2, v5

    invoke-interface {v1, v2, v3}, Lp0/j;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, p0, Lp0/h$b;->i:Lp0/x;

    invoke-static {p2, v0, v1, p1, v2}, Lo0/A0;->a(FFFFLp0/c;)J

    move-result-wide p1

    return-wide p1
.end method
