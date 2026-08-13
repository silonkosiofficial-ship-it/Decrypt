.class public final LA/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/A;
.implements LE0/d;
.implements LE0/k;


# instance fields
.field private final b:LA/S;

.field private final c:LV/w0;

.field private final d:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA/S;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/u;->b:LA/S;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    iput-object v2, p0, LA/u;->c:LV/w0;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LA/u;->d:LV/w0;

    return-void
.end method

.method private final g()LA/S;
    .locals 1

    iget-object v0, p0, LA/u;->d:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/S;

    return-object v0
.end method

.method private final j()LA/S;
    .locals 1

    iget-object v0, p0, LA/u;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/S;

    return-object v0
.end method

.method private final m(LA/S;)V
    .locals 1

    iget-object v0, p0, LA/u;->d:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final n(LA/S;)V
    .locals 1

    iget-object v0, p0, LA/u;->c:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->d(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->b(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LA/u;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LA/u;

    iget-object p1, p1, LA/u;->b:LA/S;

    iget-object v0, p0, LA/u;->b:LA/S;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 9

    invoke-direct {p0}, LA/u;->j()LA/S;

    move-result-object v3

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-interface {v3, p1, v4}, LA/S;->d(LY0/e;LY0/v;)I

    move-result v3

    invoke-direct {p0}, LA/u;->j()LA/S;

    move-result-object v4

    invoke-interface {v4, p1}, LA/S;->c(LY0/e;)I

    move-result v4

    invoke-direct {p0}, LA/u;->j()LA/S;

    move-result-object v5

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v6

    invoke-interface {v5, p1, v6}, LA/S;->a(LY0/e;LY0/v;)I

    move-result v5

    invoke-direct {p0}, LA/u;->j()LA/S;

    move-result-object v6

    invoke-interface {v6, p1}, LA/S;->b(LY0/e;)I

    move-result v6

    add-int/2addr v5, v3

    add-int/2addr v6, v4

    neg-int v7, v5

    neg-int v8, v6

    invoke-static {p3, p4, v7, v8}, LY0/c;->n(JII)J

    move-result-wide v7

    invoke-interface {p2, v7, v8}, LD0/G;->U(J)LD0/X;

    move-result-object v7

    invoke-virtual {v7}, LD0/X;->I0()I

    move-result v8

    add-int/2addr v8, v5

    invoke-static {p3, p4, v8}, LY0/c;->i(JI)I

    move-result v5

    invoke-virtual {v7}, LD0/X;->w0()I

    move-result v8

    add-int/2addr v8, v6

    invoke-static {p3, p4, v8}, LY0/c;->h(JI)I

    move-result v2

    new-instance v6, LA/u$a;

    invoke-direct {v6, v7, v3, v4}, LA/u$a;-><init>(LD0/X;II)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move v1, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
.end method

.method public getKey()LE0/m;
    .locals 1

    invoke-static {}, LA/V;->a()LE0/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/u;->l()LA/S;

    move-result-object v0

    return-object v0
.end method

.method public h(LE0/l;)V
    .locals 1

    invoke-static {}, LA/V;->a()LE0/m;

    move-result-object v0

    invoke-interface {p1, v0}, LE0/l;->D0(LE0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/S;

    iget-object v0, p0, LA/u;->b:LA/S;

    invoke-static {v0, p1}, LA/U;->c(LA/S;LA/S;)LA/S;

    move-result-object v0

    invoke-direct {p0, v0}, LA/u;->n(LA/S;)V

    iget-object v0, p0, LA/u;->b:LA/S;

    invoke-static {p1, v0}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object p1

    invoke-direct {p0, p1}, LA/u;->m(LA/S;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LA/u;->b:LA/S;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->a(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public l()LA/S;
    .locals 1

    invoke-direct {p0}, LA/u;->g()LA/S;

    move-result-object v0

    return-object v0
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->c(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
