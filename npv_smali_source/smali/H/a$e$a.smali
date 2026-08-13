.class final LH/a$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/a$e;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, LH/a$e$a;->D:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll0/d;)Ll0/h;
    .locals 8

    invoke-virtual {p1}, Ll0/d;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, LN/a;->d(Ll0/d;F)Lo0/E1;

    move-result-object v1

    sget-object v2, Lo0/z0;->b:Lo0/z0$a;

    iget-wide v3, p0, LH/a$e$a;->D:J

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lo0/z0$a;->b(Lo0/z0$a;JIILjava/lang/Object;)Lo0/z0;

    move-result-object v2

    new-instance v3, LH/a$e$a$a;

    invoke-direct {v3, v0, v1, v2}, LH/a$e$a$a;-><init>(FLo0/E1;Lo0/z0;)V

    invoke-virtual {p1, v3}, Ll0/d;->s(Lx7/l;)Ll0/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/d;

    invoke-virtual {p0, p1}, LH/a$e$a;->a(Ll0/d;)Ll0/h;

    move-result-object p1

    return-object p1
.end method
