.class final LS/q1$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->d(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:LW8/N;

.field final synthetic F:LS/c;

.field final synthetic G:F

.field final synthetic H:Z

.field final synthetic I:LV/w0;

.field final synthetic J:LV/w0;


# direct methods
.method constructor <init>(ZLW8/N;LS/c;FZLV/w0;LV/w0;)V
    .locals 0

    iput-boolean p1, p0, LS/q1$h;->D:Z

    iput-object p2, p0, LS/q1$h;->E:LW8/N;

    iput-object p3, p0, LS/q1$h;->F:LS/c;

    iput p4, p0, LS/q1$h;->G:F

    iput-boolean p5, p0, LS/q1$h;->H:Z

    iput-object p6, p0, LS/q1$h;->I:LV/w0;

    iput-object p7, p0, LS/q1$h;->J:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 8

    new-instance v7, LS/q1$h$a;

    iget-object v1, p0, LS/q1$h;->E:LW8/N;

    iget-object v2, p0, LS/q1$h;->F:LS/c;

    iget v3, p0, LS/q1$h;->G:F

    iget-boolean v4, p0, LS/q1$h;->H:Z

    iget-object v5, p0, LS/q1$h;->I:LV/w0;

    iget-object v6, p0, LS/q1$h;->J:LV/w0;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LS/q1$h$a;-><init>(LW8/N;LS/c;FZLV/w0;LV/w0;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v7, v0, v1}, LK0/u;->v(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    iget-boolean v0, p0, LS/q1$h;->D:Z

    invoke-static {p1, v0}, LK0/u;->Y(LK0/w;Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/q1$h;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
