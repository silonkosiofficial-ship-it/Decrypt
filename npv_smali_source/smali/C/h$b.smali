.class final LC/h$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/h;->d(LC/b;LA/b$e;LA/B;LV/n;I)LC/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/B;

.field final synthetic E:LC/b;

.field final synthetic F:LA/b$e;


# direct methods
.method constructor <init>(LA/B;LC/b;LA/b$e;)V
    .locals 0

    iput-object p1, p0, LC/h$b;->D:LA/B;

    iput-object p2, p0, LC/h$b;->E:LC/b;

    iput-object p3, p0, LC/h$b;->F:LA/b$e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/e;J)LC/G;
    .locals 7

    .prologue
    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LC/h$b;->D:LA/B;

    sget-object v5, LY0/v;->C:LY0/v;

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/m;->g(LA/B;LY0/v;)F

    move-result v0

    iget-object v1, p0, LC/h$b;->D:LA/B;

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/m;->f(LA/B;LY0/v;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result p2

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result p3

    sub-int v3, p2, p3

    iget-object p2, p0, LC/h$b;->E:LC/b;

    iget-object v1, p0, LC/h$b;->F:LA/b$e;

    invoke-interface {v1}, LA/b$e;->a()F

    move-result p3

    invoke-interface {p1, p3}, LY0/e;->S0(F)I

    move-result p3

    invoke-interface {p2, p1, v3, p3}, LC/b;->a(LY0/e;II)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lj7/v;->S0(Ljava/util/Collection;)[I

    move-result-object p2

    array-length p3, p2

    new-array p3, p3, [I

    move-object v2, p1

    move-object v4, p2

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, LA/b$e;->c(LY0/e;I[ILY0/v;[I)V

    new-instance p1, LC/G;

    invoke-direct {p1, p2, p3}, LC/G;-><init>([I[I)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "LazyVerticalGrid\'s width should be bound by parent."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/e;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LC/h$b;->a(LY0/e;J)LC/G;

    move-result-object p1

    return-object p1
.end method
