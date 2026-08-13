.class public final LX7/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX7/D;


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:LE8/f;

.field private final d:LE8/h;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    const-string v0, "states"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/E;->b:Ljava/util/Map;

    new-instance p1, LE8/f;

    const-string v0, "Java nullability annotation states"

    invoke-direct {p1, v0}, LE8/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LX7/E;->c:LE8/f;

    new-instance v0, LX7/E$a;

    invoke-direct {v0, p0}, LX7/E$a;-><init>(LX7/E;)V

    invoke-virtual {p1, v0}, LE8/f;->h(Lx7/l;)LE8/h;

    move-result-object p1

    const-string v0, "createMemoizedFunctionWithNullableValues(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX7/E;->d:LE8/h;

    return-void
.end method


# virtual methods
.method public a(Ln8/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX7/E;->d:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LX7/E;->b:Ljava/util/Map;

    return-object v0
.end method
