.class final LV0/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV0/e;->m(Landroid/text/Spannable;LM0/P;Ljava/util/List;Lx7/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroid/text/Spannable;

.field final synthetic E:Lx7/r;


# direct methods
.method constructor <init>(Landroid/text/Spannable;Lx7/r;)V
    .locals 0

    iput-object p1, p0, LV0/e$a;->D:Landroid/text/Spannable;

    iput-object p2, p0, LV0/e$a;->E:Lx7/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/C;II)V
    .locals 6

    .prologue
    iget-object v0, p0, LV0/e$a;->D:Landroid/text/Spannable;

    new-instance v1, LP0/o;

    iget-object v2, p0, LV0/e$a;->E:Lx7/r;

    invoke-virtual {p1}, LM0/C;->i()LR0/h;

    move-result-object v3

    invoke-virtual {p1}, LM0/C;->n()LR0/q;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, LR0/q;->D:LR0/q$a;

    invoke-virtual {v4}, LR0/q$a;->d()LR0/q;

    move-result-object v4

    :cond_0
    invoke-virtual {p1}, LM0/C;->l()LR0/o;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LR0/o;->i()I

    move-result v5

    goto :goto_0

    :cond_1
    sget-object v5, LR0/o;->b:LR0/o$a;

    invoke-virtual {v5}, LR0/o$a;->b()I

    move-result v5

    :goto_0
    invoke-static {v5}, LR0/o;->c(I)LR0/o;

    move-result-object v5

    invoke-virtual {p1}, LM0/C;->m()LR0/p;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LR0/p;->k()I

    move-result p1

    goto :goto_1

    :cond_2
    sget-object p1, LR0/p;->b:LR0/p$a;

    invoke-virtual {p1}, LR0/p$a;->a()I

    move-result p1

    :goto_1
    invoke-static {p1}, LR0/p;->e(I)LR0/p;

    move-result-object p1

    invoke-interface {v2, v3, v4, v5, p1}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    invoke-direct {v1, p1}, LP0/o;-><init>(Landroid/graphics/Typeface;)V

    const/16 p1, 0x21

    invoke-interface {v0, v1, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/C;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LV0/e$a;->a(LM0/C;II)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
