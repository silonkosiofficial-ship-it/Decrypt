.class final LM0/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/j;->x(II)Lo0/Q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/Q1;

.field final synthetic E:I

.field final synthetic F:I


# direct methods
.method constructor <init>(Lo0/Q1;II)V
    .locals 0

    iput-object p1, p0, LM0/j$b;->D:Lo0/Q1;

    iput p2, p0, LM0/j$b;->E:I

    iput p3, p0, LM0/j$b;->F:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/q;)V
    .locals 6

    iget-object v0, p0, LM0/j$b;->D:Lo0/Q1;

    iget v1, p0, LM0/j$b;->E:I

    iget v2, p0, LM0/j$b;->F:I

    invoke-virtual {p1}, LM0/q;->e()LM0/p;

    move-result-object v3

    invoke-virtual {p1, v1}, LM0/q;->r(I)I

    move-result v1

    invoke-virtual {p1, v2}, LM0/q;->r(I)I

    move-result v2

    invoke-interface {v3, v1, v2}, LM0/p;->y(II)Lo0/Q1;

    move-result-object v1

    invoke-virtual {p1, v1}, LM0/q;->j(Lo0/Q1;)Lo0/Q1;

    move-result-object v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lo0/P1;->a(Lo0/Q1;Lo0/Q1;JILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/q;

    invoke-virtual {p0, p1}, LM0/j$b;->a(LM0/q;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
