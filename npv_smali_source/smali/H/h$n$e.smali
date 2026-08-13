.class final LH/h$n$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$n;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/L;

.field final synthetic E:Z

.field final synthetic F:LS0/V;

.field final synthetic G:LN/F;

.field final synthetic H:LH/w;


# direct methods
.method constructor <init>(LS0/L;ZLS0/V;LN/F;LH/w;)V
    .locals 0

    iput-object p1, p0, LH/h$n$e;->D:LS0/L;

    iput-boolean p2, p0, LH/h$n$e;->E:Z

    iput-object p3, p0, LH/h$n$e;->F:LS0/V;

    iput-object p4, p0, LH/h$n$e;->G:LN/F;

    iput-object p5, p0, LH/h$n$e;->H:LH/w;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IIZ)Ljava/lang/Boolean;
    .locals 9

    .prologue
    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LH/h$n$e;->D:LS0/L;

    invoke-interface {v0, p1}, LS0/L;->a(I)I

    move-result p1

    :goto_0
    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LH/h$n$e;->D:LS0/L;

    invoke-interface {v0, p2}, LS0/L;->a(I)I

    move-result p2

    :goto_1
    iget-boolean v0, p0, LH/h$n$e;->E:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    iget-object v0, p0, LH/h$n$e;->F:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->n(J)I

    move-result v0

    if-ne p1, v0, :cond_3

    iget-object v0, p0, LH/h$n$e;->F:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->i(J)I

    move-result v0

    if-ne p2, v0, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, p0, LH/h$n$e;->F:LS0/V;

    invoke-virtual {v2}, LS0/V;->f()LM0/d;

    move-result-object v2

    invoke-virtual {v2}, LM0/d;->length()I

    move-result v2

    if-gt v0, v2, :cond_6

    const/4 v0, 0x1

    if-nez p3, :cond_5

    if-ne p1, p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p0, LH/h$n$e;->G:LN/F;

    const/4 v2, 0x0

    invoke-static {p3, v1, v0, v2}, LN/F;->w(LN/F;ZILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, LH/h$n$e;->G:LN/F;

    invoke-virtual {p3}, LN/F;->x()V

    :goto_3
    iget-object p3, p0, LH/h$n$e;->H:LH/w;

    invoke-virtual {p3}, LH/w;->m()Lx7/l;

    move-result-object p3

    new-instance v8, LS0/V;

    iget-object v1, p0, LH/h$n$e;->F:LS0/V;

    invoke-virtual {v1}, LS0/V;->f()LM0/d;

    move-result-object v2

    invoke-static {p1, p2}, LM0/O;->b(II)J

    move-result-wide v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LS0/V;-><init>(LM0/d;JLM0/N;ILy7/k;)V

    invoke-interface {p3, v8}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v0

    goto :goto_4

    :cond_6
    iget-object p1, p0, LH/h$n$e;->G:LN/F;

    invoke-virtual {p1}, LN/F;->x()V

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/h$n$e;->a(IIZ)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
