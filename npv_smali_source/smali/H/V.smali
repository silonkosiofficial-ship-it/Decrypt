.class public final LH/V;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM0/K;

.field private b:LD0/t;

.field private c:LD0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LM0/K;LD0/t;LD0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/V;->a:LM0/K;

    iput-object p2, p0, LH/V;->b:LD0/t;

    iput-object p3, p0, LH/V;->c:LD0/t;

    return-void
.end method

.method public synthetic constructor <init>(LM0/K;LD0/t;LD0/t;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LH/V;-><init>(LM0/K;LD0/t;LD0/t;)V

    return-void
.end method

.method private final a(J)J
    .locals 5

    .prologue
    iget-object v0, p0, LH/V;->b:LD0/t;

    if-eqz v0, :cond_2

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LH/V;->c:LD0/t;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, LD0/s;->a(LD0/t;LD0/t;ZILjava/lang/Object;)Ln0/i;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v2

    :cond_1
    :goto_0
    if-nez v2, :cond_3

    :cond_2
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v2

    :cond_3
    invoke-static {p1, p2, v2}, LH/W;->a(JLn0/i;)J

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic e(LH/V;JZILjava/lang/Object;)I
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LH/V;->d(JZ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b()LD0/t;
    .locals 1

    iget-object v0, p0, LH/V;->c:LD0/t;

    return-object v0
.end method

.method public final c()LD0/t;
    .locals 1

    iget-object v0, p0, LH/V;->b:LD0/t;

    return-object v0
.end method

.method public final d(JZ)I
    .locals 0

    .prologue
    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2}, LH/V;->a(J)J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, LH/V;->j(J)J

    move-result-wide p1

    iget-object p3, p0, LH/V;->a:LM0/K;

    invoke-virtual {p3, p1, p2}, LM0/K;->x(J)I

    move-result p1

    return p1
.end method

.method public final f()LM0/K;
    .locals 1

    iget-object v0, p0, LH/V;->a:LM0/K;

    return-object v0
.end method

.method public final g(J)Z
    .locals 3

    .prologue
    invoke-direct {p0, p1, p2}, LH/V;->a(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LH/V;->j(J)J

    move-result-wide p1

    iget-object v0, p0, LH/V;->a:LM0/K;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    invoke-virtual {v0, v1}, LM0/K;->r(F)I

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    iget-object v2, p0, LH/V;->a:LM0/K;

    invoke-virtual {v2, v0}, LM0/K;->s(I)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p1

    iget-object p2, p0, LH/V;->a:LM0/K;

    invoke-virtual {p2, v0}, LM0/K;->t(I)F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(LD0/t;)V
    .locals 0

    iput-object p1, p0, LH/V;->c:LD0/t;

    return-void
.end method

.method public final i(LD0/t;)V
    .locals 0

    iput-object p1, p0, LH/V;->b:LD0/t;

    return-void
.end method

.method public final j(J)J
    .locals 4

    .prologue
    iget-object v0, p0, LH/V;->b:LD0/t;

    if-eqz v0, :cond_4

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LH/V;->c:LD0/t;

    if-eqz v1, :cond_4

    invoke-interface {v1}, LD0/t;->K()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0, v2, p1, p2}, LD0/t;->G(LD0/t;J)J

    move-result-wide p1

    :cond_4
    :goto_1
    return-wide p1
.end method

.method public final k(J)J
    .locals 4

    .prologue
    iget-object v0, p0, LH/V;->b:LD0/t;

    if-eqz v0, :cond_4

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LH/V;->c:LD0/t;

    if-eqz v1, :cond_4

    invoke-interface {v1}, LD0/t;->K()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v2, v0, p1, p2}, LD0/t;->G(LD0/t;J)J

    move-result-wide p1

    :cond_4
    :goto_1
    return-wide p1
.end method
