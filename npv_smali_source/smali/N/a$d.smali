.class final LN/a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;

.field final synthetic E:Z

.field final synthetic F:Z


# direct methods
.method constructor <init>(LN/i;ZZ)V
    .locals 0

    iput-object p1, p0, LN/a$d;->D:LN/i;

    iput-boolean p2, p0, LN/a$d;->E:Z

    iput-boolean p3, p0, LN/a$d;->F:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 9

    .prologue
    iget-object v0, p0, LN/a$d;->D:LN/i;

    invoke-interface {v0}, LN/i;->a()J

    move-result-wide v3

    invoke-static {}, LN/v;->d()LK0/v;

    move-result-object v0

    new-instance v8, LN/u;

    iget-boolean v1, p0, LN/a$d;->E:Z

    if-eqz v1, :cond_0

    sget-object v1, LH/k;->D:LH/k;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    sget-object v1, LH/k;->E:LH/k;

    goto :goto_0

    :goto_1
    iget-boolean v1, p0, LN/a$d;->F:Z

    if-eqz v1, :cond_1

    sget-object v1, LN/t;->C:LN/t;

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_1
    sget-object v1, LN/t;->E:LN/t;

    goto :goto_2

    :goto_3
    invoke-static {v3, v4}, Ln0/h;->c(J)Z

    move-result v6

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LN/u;-><init>(LH/k;JLN/t;ZLy7/k;)V

    invoke-interface {p1, v0, v8}, LK0/w;->d(LK0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LN/a$d;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
