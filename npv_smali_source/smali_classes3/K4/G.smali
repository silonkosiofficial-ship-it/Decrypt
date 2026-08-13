.class final LK4/G;
.super LK4/y;
.source "SourceFile"


# instance fields
.field final synthetic D:LK4/c;


# direct methods
.method constructor <init>(LK4/c;)V
    .locals 0

    iput-object p1, p0, LK4/G;->D:LK4/c;

    invoke-direct {p0}, LK4/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, LK4/G;->D:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    invoke-static {v0}, LK4/d;->s(LK4/d;)V

    iget-object v0, p0, LK4/G;->D:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LK4/d;->n(LK4/d;Landroid/os/IInterface;)V

    iget-object v0, p0, LK4/G;->D:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LK4/d;->m(LK4/d;Z)V

    return-void
.end method
