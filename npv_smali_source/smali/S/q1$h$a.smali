.class final LS/q1$h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$h;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LW8/N;

.field final synthetic E:LS/c;

.field final synthetic F:F

.field final synthetic G:Z

.field final synthetic H:LV/w0;

.field final synthetic I:LV/w0;


# direct methods
.method constructor <init>(LW8/N;LS/c;FZLV/w0;LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/q1$h$a;->D:LW8/N;

    iput-object p2, p0, LS/q1$h$a;->E:LS/c;

    iput p3, p0, LS/q1$h$a;->F:F

    iput-boolean p4, p0, LS/q1$h$a;->G:Z

    iput-object p5, p0, LS/q1$h$a;->H:LV/w0;

    iput-object p6, p0, LS/q1$h$a;->I:LV/w0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 9

    iget-object v0, p0, LS/q1$h$a;->D:LW8/N;

    new-instance v8, LS/q1$h$a$a;

    iget-object v2, p0, LS/q1$h$a;->E:LS/c;

    iget v3, p0, LS/q1$h$a;->F:F

    iget-boolean v4, p0, LS/q1$h$a;->G:Z

    iget-object v5, p0, LS/q1$h$a;->H:LV/w0;

    iget-object v6, p0, LS/q1$h$a;->I:LV/w0;

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LS/q1$h$a$a;-><init>(LS/c;FZLV/w0;LV/w0;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v8

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/q1$h$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
