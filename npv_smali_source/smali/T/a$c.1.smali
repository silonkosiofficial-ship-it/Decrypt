.class final LT/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a;->a(Landroidx/lifecycle/r;Lx7/l;Lx7/a;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/lifecycle/r;

.field final synthetic E:Lx7/l;

.field final synthetic F:Lx7/a;


# direct methods
.method constructor <init>(Landroidx/lifecycle/r;Lx7/l;Lx7/a;)V
    .locals 0

    iput-object p1, p0, LT/a$c;->D:Landroidx/lifecycle/r;

    iput-object p2, p0, LT/a$c;->E:Lx7/l;

    iput-object p3, p0, LT/a$c;->F:Lx7/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lx7/l;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, LT/a$c;->f(Lx7/l;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method private static final f(Lx7/l;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-interface {p0, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(LV/N;)LV/M;
    .locals 3

    iget-object p1, p0, LT/a$c;->E:Lx7/l;

    new-instance v0, LT/b;

    invoke-direct {v0, p1}, LT/b;-><init>(Lx7/l;)V

    iget-object p1, p0, LT/a$c;->D:Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    iget-object p1, p0, LT/a$c;->F:Lx7/a;

    iget-object v1, p0, LT/a$c;->D:Landroidx/lifecycle/r;

    new-instance v2, LT/a$c$a;

    invoke-direct {v2, p1, v1, v0}, LT/a$c$a;-><init>(Lx7/a;Landroidx/lifecycle/r;Landroidx/lifecycle/o;)V

    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LT/a$c;->e(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
