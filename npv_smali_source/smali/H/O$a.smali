.class final LH/O$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O;->a(Landroidx/compose/ui/d;Lz/l;ZLx7/l;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:Lz/l;


# direct methods
.method constructor <init>(Lx7/l;Lz/l;)V
    .locals 0

    iput-object p1, p0, LH/O$a;->D:Lx7/l;

    iput-object p2, p0, LH/O$a;->E:Lz/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 7

    .prologue
    const p1, -0x620472b

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p1, Lm7/j;->C:Lm7/j;

    invoke-static {p1, p2}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object p1

    new-instance v0, LV/C;

    invoke-direct {v0, p1}, LV/C;-><init>(LW8/N;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_1
    check-cast p1, LV/C;

    invoke-virtual {p1}, LV/C;->a()LW8/N;

    move-result-object v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {v0, v0, p1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p1

    check-cast v2, LV/w0;

    iget-object p1, p0, LH/O$a;->D:Lx7/l;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v4

    iget-object p1, p0, LH/O$a;->E:Lz/l;

    iget-object v3, p0, LH/O$a;->E:Lz/l;

    invoke-interface {p2, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, p0, LH/O$a;->E:Lz/l;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_3

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    :cond_3
    new-instance v6, LH/O$a$a;

    invoke-direct {v6, v2, v5}, LH/O$a$a;-><init>(LV/w0;Lz/l;)V

    invoke-interface {p2, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lx7/l;

    invoke-static {p1, v6, p2, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v6, p0, LH/O$a;->E:Lz/l;

    invoke-interface {p2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, LH/O$a;->E:Lz/l;

    invoke-interface {p2, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {p2, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    iget-object v3, p0, LH/O$a;->E:Lz/l;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_5

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v5, p3, :cond_6

    :cond_5
    new-instance p3, LH/O$a$b;

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, LH/O$a$b;-><init>(LW8/N;LV/w0;Lz/l;LV/G1;Lm7/e;)V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    move-object v5, p3

    :cond_6
    check-cast v5, Lx7/p;

    invoke-static {p1, v6, v5}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/O$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
