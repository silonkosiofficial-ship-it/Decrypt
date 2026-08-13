.class public final LH/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/Q$c;
    }
.end annotation


# static fields
.field public static final f:LH/Q$c;

.field private static final g:Le0/j;


# instance fields
.field private final a:LV/q0;

.field private final b:LV/q0;

.field private c:Ln0/i;

.field private d:J

.field private final e:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH/Q$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH/Q$c;-><init>(Ly7/k;)V

    sput-object v0, LH/Q;->f:LH/Q$c;

    sget-object v0, LH/Q$a;->D:LH/Q$a;

    sget-object v1, LH/Q$b;->D:LH/Q$b;

    invoke-static {v0, v1}, Le0/a;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, LH/Q;->g:Le0/j;

    return-void
.end method

.method public constructor <init>(Lx/s;F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, LV/J0;->a(F)LV/q0;

    move-result-object p2

    iput-object p2, p0, LH/Q;->a:LV/q0;

    const/4 p2, 0x0

    invoke-static {p2}, LV/J0;->a(F)LV/q0;

    move-result-object p2

    iput-object p2, p0, LH/Q;->b:LV/q0;

    sget-object p2, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {p2}, Ln0/i$a;->a()Ln0/i;

    move-result-object p2

    iput-object p2, p0, LH/Q;->c:Ln0/i;

    sget-object p2, LM0/N;->b:LM0/N$a;

    invoke-virtual {p2}, LM0/N$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LH/Q;->d:J

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object p2

    invoke-static {p1, p2}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LH/Q;->e:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(Lx/s;FILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, LH/Q;-><init>(Lx/s;F)V

    return-void
.end method

.method public static final synthetic a()Le0/j;
    .locals 1

    sget-object v0, LH/Q;->g:Le0/j;

    return-object v0
.end method

.method private final g(F)V
    .locals 1

    iget-object v0, p0, LH/Q;->b:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method


# virtual methods
.method public final b(FFI)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LH/Q;->d()F

    move-result v0

    int-to-float p3, p3

    add-float v1, v0, p3

    cmpl-float v2, p2, v1

    if-lez v2, :cond_0

    :goto_0
    sub-float/2addr p2, v1

    goto :goto_1

    :cond_0
    cmpg-float v2, p1, v0

    if-gez v2, :cond_1

    sub-float v3, p2, p1

    cmpl-float v3, v3, p3

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    if-gez v2, :cond_2

    sub-float/2addr p2, p1

    cmpg-float p2, p2, p3

    if-gtz p2, :cond_2

    sub-float p2, p1, v0

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p0}, LH/Q;->d()F

    move-result p1

    add-float/2addr p1, p2

    invoke-virtual {p0, p1}, LH/Q;->h(F)V

    return-void
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, LH/Q;->b:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, LH/Q;->a:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final e(J)I
    .locals 3

    .prologue
    invoke-static {p1, p2}, LM0/N;->n(J)I

    move-result v0

    iget-wide v1, p0, LH/Q;->d:J

    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, LM0/N;->n(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LM0/N;->i(J)I

    move-result v0

    iget-wide v1, p0, LH/Q;->d:J

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-static {p1, p2}, LM0/N;->i(J)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, LM0/N;->l(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f()Lx/s;
    .locals 1

    iget-object v0, p0, LH/Q;->e:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/s;

    return-object v0
.end method

.method public final h(F)V
    .locals 1

    iget-object v0, p0, LH/Q;->a:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, LH/Q;->d:J

    return-void
.end method

.method public final j(Lx/s;Ln0/i;II)V
    .locals 2

    .prologue
    sub-int/2addr p4, p3

    int-to-float p4, p4

    invoke-direct {p0, p4}, LH/Q;->g(F)V

    invoke-virtual {p2}, Ln0/i;->i()F

    move-result v0

    iget-object v1, p0, LH/Q;->c:Ln0/i;

    invoke-virtual {v1}, Ln0/i;->i()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ln0/i;->l()F

    move-result v0

    iget-object v1, p0, LH/Q;->c:Ln0/i;

    invoke-virtual {v1}, Ln0/i;->l()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ln0/i;->l()F

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ln0/i;->i()F

    move-result v0

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ln0/i;->e()F

    move-result p1

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Ln0/i;->j()F

    move-result p1

    :goto_2
    invoke-virtual {p0, v0, p1, p3}, LH/Q;->b(FFI)V

    iput-object p2, p0, LH/Q;->c:Ln0/i;

    :goto_3
    invoke-virtual {p0}, LH/Q;->d()F

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2, p4}, LE7/j;->j(FFF)F

    move-result p1

    invoke-virtual {p0, p1}, LH/Q;->h(F)V

    return-void
.end method
