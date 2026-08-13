.class final LS/T$x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$x;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LE7/i;

.field final synthetic E:LT/f;

.field final synthetic F:LT/j;

.field final synthetic G:Lx7/l;

.field final synthetic H:LT/e;

.field final synthetic I:Ljava/lang/Long;

.field final synthetic J:LS/Q;

.field final synthetic K:LS/P0;

.field final synthetic L:LS/M;


# direct methods
.method constructor <init>(LE7/i;LT/f;LT/j;Lx7/l;LT/e;Ljava/lang/Long;LS/Q;LS/P0;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$x$b;->D:LE7/i;

    iput-object p2, p0, LS/T$x$b;->E:LT/f;

    iput-object p3, p0, LS/T$x$b;->F:LT/j;

    iput-object p4, p0, LS/T$x$b;->G:Lx7/l;

    iput-object p5, p0, LS/T$x$b;->H:LT/e;

    iput-object p6, p0, LS/T$x$b;->I:Ljava/lang/Long;

    iput-object p7, p0, LS/T$x$b;->J:LS/Q;

    iput-object p8, p0, LS/T$x$b;->K:LS/P0;

    iput-object p9, p0, LS/T$x$b;->L:LS/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/A;)V
    .locals 12

    iget-object v0, p0, LS/T$x$b;->D:LE7/i;

    invoke-static {v0}, LS/T;->J(LE7/i;)I

    move-result v2

    new-instance v0, LS/T$x$b$a;

    iget-object v4, p0, LS/T$x$b;->E:LT/f;

    iget-object v5, p0, LS/T$x$b;->F:LT/j;

    iget-object v6, p0, LS/T$x$b;->G:Lx7/l;

    iget-object v7, p0, LS/T$x$b;->H:LT/e;

    iget-object v8, p0, LS/T$x$b;->I:Ljava/lang/Long;

    iget-object v9, p0, LS/T$x$b;->J:LS/Q;

    iget-object v10, p0, LS/T$x$b;->K:LS/P0;

    iget-object v11, p0, LS/T$x$b;->L:LS/M;

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, LS/T$x$b$a;-><init>(LT/f;LT/j;Lx7/l;LT/e;Ljava/lang/Long;LS/Q;LS/P0;LS/M;)V

    const v1, 0x43cde265

    const/4 v3, 0x1

    invoke-static {v1, v3, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LB/z;->b(LB/A;ILx7/l;Lx7/l;Lx7/r;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB/A;

    invoke-virtual {p0, p1}, LS/T$x$b;->a(LB/A;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
