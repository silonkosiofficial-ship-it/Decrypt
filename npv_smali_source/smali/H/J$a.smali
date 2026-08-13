.class final LH/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/J;->b(Landroidx/compose/ui/d;LH/w;Lm0/f;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lm0/f;

.field final synthetic E:LH/w;


# direct methods
.method constructor <init>(Lm0/f;LH/w;)V
    .locals 0

    iput-object p1, p0, LH/J$a;->D:Lm0/f;

    iput-object p2, p0, LH/J$a;->E:LH/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 3

    .prologue
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x201

    invoke-virtual {v0, v2}, Landroid/view/InputDevice;->supportsSource(I)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/view/InputDevice;->isVirtual()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lx0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v2, Lx0/c;->a:Lx0/c$a;

    invoke-virtual {v2}, Lx0/c$a;->a()I

    move-result v2

    invoke-static {v0, v2}, Lx0/c;->e(II)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    move-result v0

    const/16 v2, 0x101

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    const/16 v0, 0x13

    invoke-static {p1, v0}, LH/J;->a(Landroid/view/KeyEvent;I)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, LH/J$a;->D:Lm0/f;

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->h()I

    move-result v0

    :goto_0
    invoke-interface {p1, v0}, Lm0/f;->i(I)Z

    move-result v1

    goto :goto_1

    :cond_5
    const/16 v0, 0x14

    invoke-static {p1, v0}, LH/J;->a(Landroid/view/KeyEvent;I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p0, LH/J$a;->D:Lm0/f;

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result v0

    goto :goto_0

    :cond_6
    const/16 v0, 0x15

    invoke-static {p1, v0}, LH/J;->a(Landroid/view/KeyEvent;I)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p0, LH/J$a;->D:Lm0/f;

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->d()I

    move-result v0

    goto :goto_0

    :cond_7
    const/16 v0, 0x16

    invoke-static {p1, v0}, LH/J;->a(Landroid/view/KeyEvent;I)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p0, LH/J$a;->D:Lm0/f;

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->g()I

    move-result v0

    goto :goto_0

    :cond_8
    const/16 v0, 0x17

    invoke-static {p1, v0}, LH/J;->a(Landroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, LH/J$a;->E:LH/w;

    invoke-virtual {p1}, LH/w;->h()Landroidx/compose/ui/platform/s1;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-interface {p1}, Landroidx/compose/ui/platform/s1;->b()V

    :cond_9
    const/4 v1, 0x1

    :cond_a
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b;

    invoke-virtual {p1}, Lx0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, LH/J$a;->a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
