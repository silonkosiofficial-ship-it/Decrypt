.class public final LF8/H;
.super LF8/v0;
.source "SourceFile"


# instance fields
.field private final D:LE8/n;

.field private final E:Lx7/a;

.field private final F:LE8/i;


# direct methods
.method public constructor <init>(LE8/n;Lx7/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/v0;-><init>()V

    iput-object p1, p0, LF8/H;->D:LE8/n;

    iput-object p2, p0, LF8/H;->E:Lx7/a;

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LF8/H;->F:LE8/i;

    return-void
.end method

.method public static final synthetic c1(LF8/H;)Lx7/a;
    .locals 0

    iget-object p0, p0, LF8/H;->E:Lx7/a;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/H;->d1(LG8/g;)LF8/H;

    move-result-object p1

    return-object p1
.end method

.method protected a1()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/H;->F:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    return-object v0
.end method

.method public b1()Z
    .locals 1

    iget-object v0, p0, LF8/H;->F:LE8/i;

    invoke-interface {v0}, LE8/i;->h()Z

    move-result v0

    return v0
.end method

.method public d1(LG8/g;)LF8/H;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/H;

    iget-object v1, p0, LF8/H;->D:LE8/n;

    new-instance v2, LF8/H$a;

    invoke-direct {v2, p1, p0}, LF8/H$a;-><init>(LG8/g;LF8/H;)V

    invoke-direct {v0, v1, v2}, LF8/H;-><init>(LE8/n;Lx7/a;)V

    return-object v0
.end method
