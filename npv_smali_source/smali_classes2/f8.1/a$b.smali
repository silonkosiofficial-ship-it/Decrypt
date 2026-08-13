.class final Lf8/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/a;->b(LJ8/i;Ljava/lang/Iterable;Lf8/q;Z)Lx7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf8/q;

.field final synthetic E:[Lf8/e;


# direct methods
.method constructor <init>(Lf8/q;[Lf8/e;)V
    .locals 0

    iput-object p1, p0, Lf8/a$b;->D:Lf8/q;

    iput-object p2, p0, Lf8/a$b;->E:[Lf8/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Lf8/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lf8/a$b;->D:Lf8/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf8/q;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf8/e;

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lf8/a$b;->E:[Lf8/e;

    if-ltz p1, :cond_1

    invoke-static {v0}, Lj7/n;->e0([Ljava/lang/Object;)I

    move-result v1

    if-gt p1, v1, :cond_1

    aget-object v0, v0, p1

    goto :goto_0

    :cond_1
    sget-object p1, Lf8/e;->e:Lf8/e$a;

    invoke-virtual {p1}, Lf8/e$a;->a()Lf8/e;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lf8/a$b;->a(I)Lf8/e;

    move-result-object p1

    return-object p1
.end method
