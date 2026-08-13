.class public final Ly8/g;
.super Ly8/a;
.source "SourceFile"


# instance fields
.field private final b:LE8/i;


# direct methods
.method public constructor <init>(LE8/n;Lx7/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getScope"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/a;-><init>()V

    new-instance v0, Ly8/g$a;

    invoke-direct {v0, p2}, Ly8/g$a;-><init>(Lx7/a;)V

    invoke-interface {p1, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Ly8/g;->b:LE8/i;

    return-void
.end method

.method public synthetic constructor <init>(LE8/n;Lx7/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, LE8/f;->e:LE8/n;

    const-string p3, "NO_LOCKS"

    invoke-static {p1, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Ly8/g;-><init>(LE8/n;Lx7/a;)V

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 2

    const-string v0, "getScope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1, v0}, Ly8/g;-><init>(LE8/n;Lx7/a;ILy7/k;)V

    return-void
.end method


# virtual methods
.method protected i()Ly8/h;
    .locals 1

    iget-object v0, p0, Ly8/g;->b:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    return-object v0
.end method
