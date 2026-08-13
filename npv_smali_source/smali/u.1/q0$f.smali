.class final Lu/q0$f;
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

.field final synthetic E:F

.field final synthetic F:Lu/e;

.field final synthetic G:Lu/l;

.field final synthetic H:Lx7/l;


# direct methods
.method constructor <init>(Ly7/O;FLu/e;Lu/l;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lu/q0$f;->D:Ly7/O;

    iput p2, p0, Lu/q0$f;->E:F

    iput-object p3, p0, Lu/q0$f;->F:Lu/e;

    iput-object p4, p0, Lu/q0$f;->G:Lu/l;

    iput-object p5, p0, Lu/q0$f;->H:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    iget-object v0, p0, Lu/q0$f;->D:Ly7/O;

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Lu/i;

    iget v4, p0, Lu/q0$f;->E:F

    iget-object v5, p0, Lu/q0$f;->F:Lu/e;

    iget-object v6, p0, Lu/q0$f;->G:Lu/l;

    iget-object v7, p0, Lu/q0$f;->H:Lx7/l;

    move-wide v2, p1

    invoke-static/range {v1 .. v7}, Lu/q0;->a(Lu/i;JFLu/e;Lu/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/q0$f;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
