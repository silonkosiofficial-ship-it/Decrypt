.class final Lu/a$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/a;

.field final synthetic E:Lu/l;

.field final synthetic F:Lx7/l;

.field final synthetic G:Ly7/K;


# direct methods
.method constructor <init>(Lu/a;Lu/l;Lx7/l;Ly7/K;)V
    .locals 0

    iput-object p1, p0, Lu/a$a$a;->D:Lu/a;

    iput-object p2, p0, Lu/a$a$a;->E:Lu/l;

    iput-object p3, p0, Lu/a$a$a;->F:Lx7/l;

    iput-object p4, p0, Lu/a$a$a;->G:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/a$a$a;->D:Lu/a;

    invoke-virtual {v0}, Lu/a;->j()Lu/l;

    move-result-object v0

    invoke-static {p1, v0}, Lu/q0;->o(Lu/i;Lu/l;)V

    iget-object v0, p0, Lu/a$a$a;->D:Lu/a;

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lu/a;->a(Lu/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lu/a$a$a;->D:Lu/a;

    invoke-virtual {v1}, Lu/a;->j()Lu/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Lu/l;->v(Ljava/lang/Object;)V

    iget-object v1, p0, Lu/a$a$a;->E:Lu/l;

    invoke-virtual {v1, v0}, Lu/l;->v(Ljava/lang/Object;)V

    iget-object v0, p0, Lu/a$a$a;->F:Lx7/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lu/a$a$a;->D:Lu/a;

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lu/i;->a()V

    iget-object p1, p0, Lu/a$a$a;->G:Ly7/K;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ly7/K;->C:Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu/a$a$a;->F:Lx7/l;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lu/a$a$a;->D:Lu/a;

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Lu/a$a$a;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
