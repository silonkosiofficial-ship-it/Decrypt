.class final Lf4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/x;


# instance fields
.field private final a:Lf4/h;

.field private final b:Lf4/V0;

.field private final c:Lf4/V0;

.field private final d:Lf4/V0;

.field private final e:Lf4/V0;

.field private final f:Lf4/V0;


# direct methods
.method synthetic constructor <init>(Lf4/h;Lf4/S;Lf4/m;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/n;->a:Lf4/h;

    invoke-static {p1}, Lf4/h;->e(Lf4/h;)Lf4/V0;

    move-result-object p3

    new-instance v0, Lf4/a0;

    invoke-direct {v0, p3}, Lf4/a0;-><init>(Lf4/W0;)V

    invoke-static {v0}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object p3

    iput-object p3, p0, Lf4/n;->b:Lf4/V0;

    invoke-static {p2}, Lf4/T0;->b(Ljava/lang/Object;)Lf4/S0;

    move-result-object p2

    iput-object p2, p0, Lf4/n;->c:Lf4/V0;

    new-instance v0, Lf4/Q0;

    invoke-direct {v0}, Lf4/Q0;-><init>()V

    iput-object v0, p0, Lf4/n;->d:Lf4/V0;

    invoke-static {p1}, Lf4/h;->e(Lf4/h;)Lf4/V0;

    move-result-object v2

    invoke-static {}, Lf4/s;->a()Lf4/t;

    move-result-object v4

    invoke-static {}, Lf4/u;->a()Lf4/v;

    move-result-object v5

    invoke-static {p1}, Lf4/h;->f(Lf4/h;)Lf4/V0;

    move-result-object v6

    invoke-static {p1}, Lf4/h;->h(Lf4/h;)Lf4/V0;

    move-result-object v7

    invoke-static {p1}, Lf4/h;->i(Lf4/h;)Lf4/V0;

    move-result-object v9

    new-instance v10, Lf4/f0;

    move-object v1, v10

    move-object v3, p3

    move-object v8, v0

    invoke-direct/range {v1 .. v9}, Lf4/f0;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V

    iput-object v10, p0, Lf4/n;->e:Lf4/V0;

    invoke-static {}, Lf4/s;->a()Lf4/t;

    move-result-object v1

    new-instance v7, Lf4/Y;

    invoke-direct {v7, p3, v1, v10}, Lf4/Y;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;)V

    iput-object v7, p0, Lf4/n;->f:Lf4/V0;

    invoke-static {p1}, Lf4/h;->e(Lf4/h;)Lf4/V0;

    move-result-object v2

    invoke-static {p1}, Lf4/h;->g(Lf4/h;)Lf4/V0;

    move-result-object v3

    invoke-static {p1}, Lf4/h;->i(Lf4/h;)Lf4/V0;

    move-result-object v5

    new-instance p1, Lf4/E;

    move-object v1, p1

    move-object v4, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Lf4/E;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V

    invoke-static {p1}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object p1

    invoke-static {v0, p1}, Lf4/Q0;->b(Lf4/V0;Lf4/V0;)V

    return-void
.end method


# virtual methods
.method public final a()Lf4/D;
    .locals 1

    iget-object v0, p0, Lf4/n;->d:Lf4/V0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/D;

    return-object v0
.end method
