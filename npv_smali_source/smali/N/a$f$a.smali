.class final LN/a$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a$f;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:Lx7/a;

.field final synthetic F:Z


# direct methods
.method constructor <init>(JLx7/a;Z)V
    .locals 0

    iput-wide p1, p0, LN/a$f$a;->D:J

    iput-object p3, p0, LN/a$f$a;->E:Lx7/a;

    iput-boolean p4, p0, LN/a$f$a;->F:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll0/d;)Ll0/h;
    .locals 7

    invoke-virtual {p1}, Ll0/d;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, LN/a;->d(Ll0/d;F)Lo0/E1;

    move-result-object v0

    sget-object v1, Lo0/z0;->b:Lo0/z0$a;

    iget-wide v2, p0, LN/a$f$a;->D:J

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lo0/z0$a;->b(Lo0/z0$a;JIILjava/lang/Object;)Lo0/z0;

    move-result-object v1

    new-instance v2, LN/a$f$a$a;

    iget-object v3, p0, LN/a$f$a;->E:Lx7/a;

    iget-boolean v4, p0, LN/a$f$a;->F:Z

    invoke-direct {v2, v3, v4, v0, v1}, LN/a$f$a$a;-><init>(Lx7/a;ZLo0/E1;Lo0/z0;)V

    invoke-virtual {p1, v2}, Ll0/d;->s(Lx7/l;)Ll0/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/d;

    invoke-virtual {p0, p1}, LN/a$f$a;->a(Ll0/d;)Ll0/h;

    move-result-object p1

    return-object p1
.end method
