.class public final Lu/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/s0$a$a;
    }
.end annotation


# instance fields
.field private final a:Lu/x0;

.field private final b:Ljava/lang/String;

.field private final c:LV/w0;

.field final synthetic d:Lu/s0;


# direct methods
.method public constructor <init>(Lu/s0;Lu/x0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu/s0$a;->d:Lu/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/s0$a;->a:Lu/x0;

    iput-object p3, p0, Lu/s0$a;->b:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu/s0$a;->c:LV/w0;

    return-void
.end method


# virtual methods
.method public final a(Lx7/l;Lx7/l;)LV/G1;
    .locals 8

    .prologue
    invoke-virtual {p0}, Lu/s0$a;->b()Lu/s0$a$a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lu/s0$a$a;

    new-instance v7, Lu/s0$d;

    iget-object v2, p0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v2}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v1, p0, Lu/s0$a;->a:Lu/x0;

    iget-object v4, p0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v4}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, Lu/m;->i(Lu/x0;Ljava/lang/Object;)Lu/r;

    move-result-object v4

    iget-object v5, p0, Lu/s0$a;->a:Lu/x0;

    iget-object v6, p0, Lu/s0$a;->b:Ljava/lang/String;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lu/s0$d;-><init>(Lu/s0;Ljava/lang/Object;Lu/r;Lu/x0;Ljava/lang/String;)V

    invoke-direct {v0, p0, v7, p1, p2}, Lu/s0$a$a;-><init>(Lu/s0$a;Lu/s0$d;Lx7/l;Lx7/l;)V

    iget-object v1, p0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {p0, v0}, Lu/s0$a;->c(Lu/s0$a$a;)V

    invoke-virtual {v0}, Lu/s0$a$a;->e()Lu/s0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lu/s0;->c(Lu/s0$d;)Z

    :cond_0
    iget-object v1, p0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v0, p2}, Lu/s0$a$a;->o(Lx7/l;)V

    invoke-virtual {v0, p1}, Lu/s0$a$a;->q(Lx7/l;)V

    invoke-virtual {v1}, Lu/s0;->n()Lu/s0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu/s0$a$a;->r(Lu/s0$b;)V

    return-object v0
.end method

.method public final b()Lu/s0$a$a;
    .locals 1

    iget-object v0, p0, Lu/s0$a;->c:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/s0$a$a;

    return-object v0
.end method

.method public final c(Lu/s0$a$a;)V
    .locals 1

    iget-object v0, p0, Lu/s0$a;->c:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lu/s0$a;->b()Lu/s0$a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v0}, Lu/s0$a$a;->e()Lu/s0$d;

    move-result-object v2

    invoke-virtual {v0}, Lu/s0$a$a;->g()Lx7/l;

    move-result-object v3

    invoke-virtual {v1}, Lu/s0;->n()Lu/s0$b;

    move-result-object v4

    invoke-interface {v4}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lu/s0$a$a;->g()Lx7/l;

    move-result-object v4

    invoke-virtual {v1}, Lu/s0;->n()Lu/s0$b;

    move-result-object v5

    invoke-interface {v5}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Lu/s0$a$a;->n()Lx7/l;

    move-result-object v0

    invoke-virtual {v1}, Lu/s0;->n()Lu/s0$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/I;

    invoke-virtual {v2, v3, v4, v0}, Lu/s0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lu/I;)V

    :cond_0
    return-void
.end method
