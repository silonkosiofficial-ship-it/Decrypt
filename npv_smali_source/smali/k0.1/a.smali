.class public final Lk0/a;
.super Landroid/view/View$DragShadowBuilder;
.source "SourceFile"


# instance fields
.field private final a:LY0/e;

.field private final b:J

.field private final c:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LY0/e;JLx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$DragShadowBuilder;-><init>()V

    iput-object p1, p0, Lk0/a;->a:LY0/e;

    iput-wide p2, p0, Lk0/a;->b:J

    iput-object p4, p0, Lk0/a;->c:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(LY0/e;JLx7/l;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk0/a;-><init>(LY0/e;JLx7/l;)V

    return-void
.end method


# virtual methods
.method public onDrawShadow(Landroid/graphics/Canvas;)V
    .locals 12

    new-instance v0, Lq0/a;

    invoke-direct {v0}, Lq0/a;-><init>()V

    iget-object v1, p0, Lk0/a;->a:LY0/e;

    iget-wide v2, p0, Lk0/a;->b:J

    sget-object v4, LY0/v;->C:LY0/v;

    invoke-static {p1}, Lo0/H;->b(Landroid/graphics/Canvas;)Lo0/q0;

    move-result-object p1

    iget-object v5, p0, Lk0/a;->c:Lx7/l;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lq0/a$a;->a()LY0/e;

    move-result-object v7

    invoke-virtual {v6}, Lq0/a$a;->b()LY0/v;

    move-result-object v8

    invoke-virtual {v6}, Lq0/a$a;->c()Lo0/q0;

    move-result-object v9

    invoke-virtual {v6}, Lq0/a$a;->d()J

    move-result-wide v10

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v6

    invoke-virtual {v6, v1}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v6, v4}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v6, p1}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v6, v2, v3}, Lq0/a$a;->l(J)V

    invoke-interface {p1}, Lo0/q0;->m()V

    invoke-interface {v5, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object p1

    invoke-virtual {p1, v7}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {p1, v8}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {p1, v9}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {p1, v10, v11}, Lq0/a$a;->l(J)V

    return-void
.end method

.method public onProvideShadowMetrics(Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 4

    iget-object v0, p0, Lk0/a;->a:LY0/e;

    iget-wide v1, p0, Lk0/a;->b:J

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result v1

    invoke-interface {v0, v1}, LY0/e;->q0(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/e;->S0(F)I

    move-result v1

    iget-wide v2, p0, Lk0/a;->b:J

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    invoke-interface {v0, v2}, LY0/e;->q0(F)F

    move-result v2

    invoke-interface {v0, v2}, LY0/e;->S0(F)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Point;->set(II)V

    iget v0, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v0, v0, 0x2

    iget p1, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Point;->set(II)V

    return-void
.end method
