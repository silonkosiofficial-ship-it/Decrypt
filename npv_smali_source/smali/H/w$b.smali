.class final LH/w$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/w;-><init>(LH/D;LV/Q0;Landroidx/compose/ui/platform/s1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;


# direct methods
.method constructor <init>(LH/w;)V
    .locals 0

    iput-object p1, p0, LH/w$b;->D:LH/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/V;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LH/w$b;->D:LH/w;

    invoke-virtual {v1}, LH/w;->w()LM0/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LM0/d;->i()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LH/w$b;->D:LH/w;

    sget-object v1, LH/l;->C:LH/l;

    invoke-virtual {v0, v1}, LH/w;->B(LH/l;)V

    :cond_1
    iget-object v0, p0, LH/w$b;->D:LH/w;

    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LH/w;->I(J)V

    iget-object v0, p0, LH/w$b;->D:LH/w;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LH/w;->A(J)V

    iget-object v0, p0, LH/w$b;->D:LH/w;

    invoke-static {v0}, LH/w;->b(LH/w;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LH/w$b;->D:LH/w;

    invoke-virtual {p1}, LH/w;->o()LV/Q0;

    move-result-object p1

    invoke-interface {p1}, LV/Q0;->invalidate()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/V;

    invoke-virtual {p0, p1}, LH/w$b;->a(LS0/V;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
