.class final LH/P$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/P;->d(Landroidx/compose/ui/d;LH/Q;Lz/l;Z)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/Q;

.field final synthetic E:Z

.field final synthetic F:Lz/l;


# direct methods
.method constructor <init>(LH/Q;ZLz/l;)V
    .locals 0

    iput-object p1, p0, LH/P$c;->D:LH/Q;

    iput-boolean p2, p0, LH/P$c;->E:Z

    iput-object p3, p0, LH/P$c;->F:Lz/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 12

    .prologue
    const p1, 0x3001dc2a

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LY0/v;->D:LY0/v;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p3, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    iget-object p3, p0, LH/P$c;->D:LH/Q;

    invoke-virtual {p3}, LH/Q;->f()Lx/s;

    move-result-object p3

    sget-object v2, Lx/s;->C:Lx/s;

    if-eq p3, v2, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v7, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v7, v0

    :goto_2
    iget-object p1, p0, LH/P$c;->D:LH/Q;

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LH/P$c;->D:LH/Q;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_4

    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v2, p1, :cond_5

    :cond_4
    new-instance v2, LH/P$c$a;

    invoke-direct {v2, p3}, LH/P$c$a;-><init>(LH/Q;)V

    invoke-interface {p2, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lx7/l;

    invoke-static {v2, p2, v1}, Lx/B;->b(Lx7/l;LV/n;I)Lx/A;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    iget-object v2, p0, LH/P$c;->D:LH/Q;

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v2, p0, LH/P$c;->D:LH/Q;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez p3, :cond_6

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v3, p3, :cond_7

    :cond_6
    new-instance v3, LH/P$c$b;

    invoke-direct {v3, p1, v2}, LH/P$c$b;-><init>(Lx/A;LH/Q;)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v3

    check-cast v4, LH/P$c$b;

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object p1, p0, LH/P$c;->D:LH/Q;

    invoke-virtual {p1}, LH/Q;->f()Lx/s;

    move-result-object v5

    iget-boolean p1, p0, LH/P$c;->E:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, LH/P$c;->D:LH/Q;

    invoke-virtual {p1}, LH/Q;->c()F

    move-result p1

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    move v6, v0

    goto :goto_4

    :cond_9
    :goto_3
    move v6, v1

    :goto_4
    iget-object v9, p0, LH/P$c;->F:Lz/l;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Landroidx/compose/foundation/gestures/d;->i(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
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

    invoke-virtual {p0, p1, p2, p3}, LH/P$c;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
