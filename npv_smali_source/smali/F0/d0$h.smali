.class final LF0/d0$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/d0;->u2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/d0;

.field final synthetic E:Landroidx/compose/ui/d$c;

.field final synthetic F:LF0/d0$f;

.field final synthetic G:J

.field final synthetic H:LF0/v;

.field final synthetic I:Z

.field final synthetic J:Z


# direct methods
.method constructor <init>(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V
    .locals 0

    iput-object p1, p0, LF0/d0$h;->D:LF0/d0;

    iput-object p2, p0, LF0/d0$h;->E:Landroidx/compose/ui/d$c;

    iput-object p3, p0, LF0/d0$h;->F:LF0/d0$f;

    iput-wide p4, p0, LF0/d0$h;->G:J

    iput-object p6, p0, LF0/d0$h;->H:LF0/v;

    iput-boolean p7, p0, LF0/d0$h;->I:Z

    iput-boolean p8, p0, LF0/d0$h;->J:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, LF0/d0$h;->D:LF0/d0;

    iget-object v1, p0, LF0/d0$h;->E:Landroidx/compose/ui/d$c;

    iget-object v2, p0, LF0/d0$h;->F:LF0/d0$f;

    invoke-interface {v2}, LF0/d0$f;->a()I

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    invoke-static {v1, v2, v3}, LF0/e0;->a(LF0/j;II)Landroidx/compose/ui/d$c;

    move-result-object v1

    iget-object v2, p0, LF0/d0$h;->F:LF0/d0$f;

    iget-wide v3, p0, LF0/d0$h;->G:J

    iget-object v5, p0, LF0/d0$h;->H:LF0/v;

    iget-boolean v6, p0, LF0/d0$h;->I:Z

    iget-boolean v7, p0, LF0/d0$h;->J:Z

    invoke-static/range {v0 .. v7}, LF0/d0;->N1(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/d0$h;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
