.class final LI4/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LI4/v;

.field private final b:LK4/m;

.field private final c:LK4/m;

.field private final d:LK4/m;

.field private final e:LK4/m;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;LI4/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LI4/v;->a:LI4/v;

    invoke-static {p1}, LK4/k;->b(Ljava/lang/Object;)LK4/j;

    move-result-object p1

    iput-object p1, p0, LI4/v;->b:LK4/m;

    invoke-static {}, LI4/B;->a()LI4/C;

    move-result-object p2

    invoke-static {p2}, LK4/i;->b(LK4/m;)LK4/m;

    move-result-object p2

    iput-object p2, p0, LI4/v;->c:LK4/m;

    new-instance v0, LI4/m;

    invoke-direct {v0, p1, p2}, LI4/m;-><init>(LK4/m;LK4/m;)V

    invoke-static {v0}, LK4/i;->b(LK4/m;)LK4/m;

    move-result-object p1

    iput-object p1, p0, LI4/v;->d:LK4/m;

    new-instance p2, LI4/A;

    invoke-direct {p2, p1}, LI4/A;-><init>(LK4/m;)V

    invoke-static {p2}, LK4/i;->b(LK4/m;)LK4/m;

    move-result-object p1

    iput-object p1, p0, LI4/v;->e:LK4/m;

    return-void
.end method


# virtual methods
.method public final a()LI4/a;
    .locals 1

    iget-object v0, p0, LI4/v;->e:LK4/m;

    invoke-interface {v0}, LK4/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI4/a;

    return-object v0
.end method
