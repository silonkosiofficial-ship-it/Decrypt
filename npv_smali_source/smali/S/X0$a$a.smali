.class final LS/X0$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0$a;->a(Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;


# direct methods
.method constructor <init>(LS/U0;)V
    .locals 0

    iput-object p1, p0, LS/X0$a$a;->D:LS/U0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 3

    sget-object v0, LK0/f;->b:LK0/f$a;

    invoke-virtual {v0}, LK0/f$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LK0/u;->U(LK0/w;I)V

    new-instance v0, LS/X0$a$a$a;

    iget-object v1, p0, LS/X0$a$a;->D:LS/U0;

    invoke-direct {v0, v1}, LS/X0$a$a$a;-><init>(LS/U0;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LK0/u;->l(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/X0$a$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
