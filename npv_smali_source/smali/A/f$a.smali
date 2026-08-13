.class final LA/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/f;->a(Landroidx/compose/ui/d;Lh0/c;ZLx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/I;

.field final synthetic E:Lx7/q;


# direct methods
.method constructor <init>(LD0/I;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LA/f$a;->D:LD0/I;

    iput-object p2, p0, LA/f$a;->E:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/j0;J)LD0/K;
    .locals 4

    new-instance v0, LA/h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, LA/h;-><init>(LY0/e;JLy7/k;)V

    sget-object v1, Li7/M;->a:Li7/M;

    new-instance v2, LA/f$a$a;

    iget-object v3, p0, LA/f$a;->E:Lx7/q;

    invoke-direct {v2, v3, v0}, LA/f$a$a;-><init>(Lx7/q;LA/h;)V

    const v0, -0x73eea2c7

    const/4 v3, 0x1

    invoke-static {v0, v3, v2}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LA/f$a;->D:LD0/I;

    invoke-interface {v1, p1, v0, p2, p3}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/j0;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LA/f$a;->a(LD0/j0;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
