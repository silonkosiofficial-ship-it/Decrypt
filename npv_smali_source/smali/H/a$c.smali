.class final LH/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/a;->a(LN/i;Landroidx/compose/ui/d;JLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;


# direct methods
.method constructor <init>(LN/i;)V
    .locals 0

    iput-object p1, p0, LH/a$c;->D:LN/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 9

    invoke-static {}, LN/v;->d()LK0/v;

    move-result-object v0

    new-instance v8, LN/u;

    sget-object v2, LH/k;->C:LH/k;

    iget-object v1, p0, LH/a$c;->D:LN/i;

    invoke-interface {v1}, LN/i;->a()J

    move-result-wide v3

    sget-object v5, LN/t;->D:LN/t;

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LN/u;-><init>(LH/k;JLN/t;ZLy7/k;)V

    invoke-interface {p1, v0, v8}, LK0/w;->d(LK0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LH/a$c;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
