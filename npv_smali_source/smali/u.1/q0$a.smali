.class final Lu/q0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/q0;->d(Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lu/j;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lu/x0;


# direct methods
.method constructor <init>(Lx7/p;Lu/x0;)V
    .locals 0

    iput-object p1, p0, Lu/q0$a;->D:Lx7/p;

    iput-object p2, p0, Lu/q0$a;->E:Lu/x0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 3

    iget-object v0, p0, Lu/q0$a;->D:Lx7/p;

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lu/q0$a;->E:Lu/x0;

    invoke-interface {v2}, Lu/x0;->b()Lx7/l;

    move-result-object v2

    invoke-virtual {p1}, Lu/i;->g()Lu/r;

    move-result-object p1

    invoke-interface {v2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Lu/q0$a;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
