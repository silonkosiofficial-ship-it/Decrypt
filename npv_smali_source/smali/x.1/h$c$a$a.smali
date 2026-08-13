.class final Lx/h$c$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/h$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/h;

.field final synthetic E:Lx/I;

.field final synthetic F:LW8/z0;

.field final synthetic G:Lx/r;


# direct methods
.method constructor <init>(Lx/h;Lx/I;LW8/z0;Lx/r;)V
    .locals 0

    iput-object p1, p0, Lx/h$c$a$a;->D:Lx/h;

    iput-object p2, p0, Lx/h$c$a$a;->E:Lx/I;

    iput-object p3, p0, Lx/h$c$a$a;->F:LW8/z0;

    iput-object p4, p0, Lx/h$c$a$a;->G:Lx/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    .prologue
    iget-object v0, p0, Lx/h$c$a$a;->D:Lx/h;

    invoke-static {v0}, Lx/h;->W1(Lx/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    mul-float v1, v0, p1

    iget-object v2, p0, Lx/h$c$a$a;->D:Lx/h;

    invoke-static {v2}, Lx/h;->X1(Lx/h;)Lx/C;

    move-result-object v2

    iget-object v3, p0, Lx/h$c$a$a;->G:Lx/r;

    invoke-virtual {v2, v1}, Lx/C;->B(F)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lx/C;->u(J)J

    move-result-wide v4

    sget-object v1, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {v1}, Ly0/f$a;->b()I

    move-result v1

    invoke-interface {v3, v4, v5, v1}, Lx/r;->b(JI)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lx/C;->u(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lx/C;->A(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    iget-object v1, p0, Lx/h$c$a$a;->F:LW8/z0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scroll animation cancelled because scroll was not consumed ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " < "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v1, p1, v2, v0, v2}, LW8/C0;->e(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lx/h$c$a$a;->a(F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
