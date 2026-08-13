.class final Landroidx/compose/foundation/layout/WrapContentElement$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/WrapContentElement$a;->b(Lh0/c;Z)Landroidx/compose/foundation/layout/WrapContentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh0/c;


# direct methods
.method constructor <init>(Lh0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/WrapContentElement$a$b;->D:Lh0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JLY0/v;)J
    .locals 6

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement$a$b;->D:Lh0/c;

    sget-object v1, LY0/t;->b:LY0/t$a;

    invoke-virtual {v1}, LY0/t$a;->a()J

    move-result-wide v1

    move-wide v3, p1

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    check-cast p2, LY0/v;

    invoke-virtual {p0, v0, v1, p2}, Landroidx/compose/foundation/layout/WrapContentElement$a$b;->a(JLY0/v;)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/p;->b(J)LY0/p;

    move-result-object p1

    return-object p1
.end method
