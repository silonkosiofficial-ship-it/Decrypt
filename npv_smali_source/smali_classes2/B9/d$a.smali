.class public final LB9/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/d;->c(Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Le/x;

.field final synthetic D:LB9/f;


# direct methods
.method constructor <init>(Le/x;LB9/f;)V
    .locals 0

    iput-object p1, p0, LB9/d$a;->C:Le/x;

    iput-object p2, p0, LB9/d$a;->D:LB9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic D(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->b(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic H(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->e(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic f(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->d(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/r;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    iget-object v0, p0, LB9/d$a;->C:Le/x;

    iget-object v1, p0, LB9/d$a;->D:LB9/f;

    invoke-virtual {v1}, LB9/f;->j()Le/w;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Le/x;->h(Landroidx/lifecycle/r;Le/w;)V

    return-void
.end method

.method public synthetic o(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->c(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic y(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->f(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method
