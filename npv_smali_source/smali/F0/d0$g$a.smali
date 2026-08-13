.class final LF0/d0$g$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/d0$g;->a(Lo0/q0;Lr0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/d0;

.field final synthetic E:Lo0/q0;

.field final synthetic F:Lr0/c;


# direct methods
.method constructor <init>(LF0/d0;Lo0/q0;Lr0/c;)V
    .locals 0

    iput-object p1, p0, LF0/d0$g$a;->D:LF0/d0;

    iput-object p2, p0, LF0/d0$g$a;->E:Lo0/q0;

    iput-object p3, p0, LF0/d0$g$a;->F:Lr0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LF0/d0$g$a;->D:LF0/d0;

    iget-object v1, p0, LF0/d0$g$a;->E:Lo0/q0;

    iget-object v2, p0, LF0/d0$g$a;->F:Lr0/c;

    invoke-static {v0, v1, v2}, LF0/d0;->E1(LF0/d0;Lo0/q0;Lr0/c;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/d0$g$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
