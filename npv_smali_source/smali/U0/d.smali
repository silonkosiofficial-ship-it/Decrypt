.class public final LU0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/s;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LM0/P;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:LR0/h$b;

.field private final f:LY0/e;

.field private final g:LU0/g;

.field private final h:Ljava/lang/CharSequence;

.field private final i:LN0/M;

.field private j:LU0/s;

.field private final k:Z

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LR0/h$b;LY0/e;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU0/d;->a:Ljava/lang/String;

    iput-object p2, p0, LU0/d;->b:LM0/P;

    iput-object p3, p0, LU0/d;->c:Ljava/util/List;

    iput-object p4, p0, LU0/d;->d:Ljava/util/List;

    iput-object p5, p0, LU0/d;->e:LR0/h$b;

    iput-object p6, p0, LU0/d;->f:LY0/e;

    new-instance p1, LU0/g;

    invoke-interface {p6}, LY0/e;->getDensity()F

    move-result p4

    const/4 p5, 0x1

    invoke-direct {p1, p5, p4}, LU0/g;-><init>(IF)V

    iput-object p1, p0, LU0/d;->g:LU0/g;

    invoke-static {p2}, LU0/e;->b(LM0/P;)Z

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    sget-object p4, LU0/m;->a:LU0/m;

    invoke-virtual {p4}, LU0/m;->a()LV/G1;

    move-result-object p4

    invoke-interface {p4}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    :goto_0
    iput-boolean p4, p0, LU0/d;->k:Z

    invoke-virtual {p2}, LM0/P;->B()I

    move-result p4

    invoke-virtual {p2}, LM0/P;->u()LT0/h;

    move-result-object v1

    invoke-static {p4, v1}, LU0/e;->d(ILT0/h;)I

    move-result p4

    iput p4, p0, LU0/d;->l:I

    new-instance v7, LU0/d$a;

    invoke-direct {v7, p0}, LU0/d$a;-><init>(LU0/d;)V

    invoke-virtual {p2}, LM0/P;->E()LX0/t;

    move-result-object p4

    invoke-static {p1, p4}, LV0/f;->e(LU0/g;LX0/t;)V

    invoke-virtual {p2}, LM0/P;->M()LM0/C;

    move-result-object p2

    move-object p4, p3

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    xor-int/2addr p4, p5

    invoke-static {p1, p2, v7, p6, p4}, LV0/f;->a(LU0/g;LM0/C;Lx7/r;LY0/e;Z)LM0/C;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    add-int/2addr p2, p5

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    move p4, v0

    :goto_1
    if-ge p4, p2, :cond_2

    if-nez p4, :cond_1

    new-instance p5, LM0/d$c;

    iget-object p6, p0, LU0/d;->a:Ljava/lang/String;

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result p6

    invoke-direct {p5, p1, v0, p6}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    goto :goto_2

    :cond_1
    iget-object p5, p0, LU0/d;->c:Ljava/util/List;

    add-int/lit8 p6, p4, -0x1

    invoke-interface {p5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LM0/d$c;

    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    move-object v4, p3

    iget-object v1, p0, LU0/d;->a:Ljava/lang/String;

    iget-object p1, p0, LU0/d;->g:LU0/g;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iget-object v3, p0, LU0/d;->b:LM0/P;

    iget-object v5, p0, LU0/d;->d:Ljava/util/List;

    iget-object v6, p0, LU0/d;->f:LY0/e;

    iget-boolean v8, p0, LU0/d;->k:Z

    invoke-static/range {v1 .. v8}, LU0/c;->a(Ljava/lang/String;FLM0/P;Ljava/util/List;Ljava/util/List;LY0/e;Lx7/r;Z)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LU0/d;->h:Ljava/lang/CharSequence;

    new-instance p2, LN0/M;

    iget-object p3, p0, LU0/d;->g:LU0/g;

    iget p4, p0, LU0/d;->l:I

    invoke-direct {p2, p1, p3, p4}, LN0/M;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object p2, p0, LU0/d;->i:LN0/M;

    return-void
.end method

.method public static final synthetic d(LU0/d;)LU0/s;
    .locals 0

    iget-object p0, p0, LU0/d;->j:LU0/s;

    return-object p0
.end method

.method public static final synthetic e(LU0/d;LU0/s;)V
    .locals 0

    iput-object p1, p0, LU0/d;->j:LU0/s;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, LU0/d;->i:LN0/M;

    invoke-virtual {v0}, LN0/M;->c()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LU0/d;->i:LN0/M;

    invoke-virtual {v0}, LN0/M;->b()F

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 2

    .prologue
    iget-object v0, p0, LU0/d;->j:LU0/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU0/s;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-boolean v0, p0, LU0/d;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LU0/d;->b:LM0/P;

    invoke-static {v0}, LU0/e;->b(LM0/P;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LU0/m;->a:LU0/m;

    invoke-virtual {v0}, LU0/m;->a()LV/G1;

    move-result-object v0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LU0/d;->h:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final g()LR0/h$b;
    .locals 1

    iget-object v0, p0, LU0/d;->e:LR0/h$b;

    return-object v0
.end method

.method public final h()LN0/M;
    .locals 1

    iget-object v0, p0, LU0/d;->i:LN0/M;

    return-object v0
.end method

.method public final i()LM0/P;
    .locals 1

    iget-object v0, p0, LU0/d;->b:LM0/P;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, LU0/d;->l:I

    return v0
.end method

.method public final k()LU0/g;
    .locals 1

    iget-object v0, p0, LU0/d;->g:LU0/g;

    return-object v0
.end method
