.class final Lu/q0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/q0;->c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:Lu/e;

.field final synthetic G:Lu/r;

.field final synthetic H:Lu/l;

.field final synthetic I:F

.field final synthetic J:Lx7/l;


# direct methods
.method constructor <init>(Ly7/O;Ljava/lang/Object;Lu/e;Lu/r;Lu/l;FLx7/l;)V
    .locals 0

    iput-object p1, p0, Lu/q0$d;->D:Ly7/O;

    iput-object p2, p0, Lu/q0$d;->E:Ljava/lang/Object;

    iput-object p3, p0, Lu/q0$d;->F:Lu/e;

    iput-object p4, p0, Lu/q0$d;->G:Lu/r;

    iput-object p5, p0, Lu/q0$d;->H:Lu/l;

    iput p6, p0, Lu/q0$d;->I:F

    iput-object p7, p0, Lu/q0$d;->J:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 13

    iget-object v0, p0, Lu/q0$d;->D:Ly7/O;

    new-instance v12, Lu/i;

    iget-object v2, p0, Lu/q0$d;->E:Ljava/lang/Object;

    iget-object v1, p0, Lu/q0$d;->F:Lu/e;

    invoke-interface {v1}, Lu/e;->c()Lu/x0;

    move-result-object v3

    iget-object v4, p0, Lu/q0$d;->G:Lu/r;

    iget-object v1, p0, Lu/q0$d;->F:Lu/e;

    invoke-interface {v1}, Lu/e;->g()Ljava/lang/Object;

    move-result-object v7

    new-instance v11, Lu/q0$d$a;

    iget-object v1, p0, Lu/q0$d;->H:Lu/l;

    invoke-direct {v11, v1}, Lu/q0$d$a;-><init>(Lu/l;)V

    const/4 v10, 0x1

    move-object v1, v12

    move-wide v5, p1

    move-wide v8, p1

    invoke-direct/range {v1 .. v11}, Lu/i;-><init>(Ljava/lang/Object;Lu/x0;Lu/r;JLjava/lang/Object;JZLx7/a;)V

    iget v4, p0, Lu/q0$d;->I:F

    iget-object v5, p0, Lu/q0$d;->F:Lu/e;

    iget-object v6, p0, Lu/q0$d;->H:Lu/l;

    iget-object v7, p0, Lu/q0$d;->J:Lx7/l;

    move-wide v2, p1

    invoke-static/range {v1 .. v7}, Lu/q0;->a(Lu/i;JFLu/e;Lu/l;Lx7/l;)V

    iput-object v12, v0, Ly7/O;->C:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/q0$d;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
