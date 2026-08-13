.class public final LD/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/q$a;
    }
.end annotation


# instance fields
.field private final a:Le0/d;

.field private final b:Lx7/a;

.field private final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le0/d;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/q;->a:Le0/d;

    iput-object p2, p0, LD/q;->b:Lx7/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LD/q;->c:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(LD/q;)Le0/d;
    .locals 0

    iget-object p0, p0, LD/q;->a:Le0/d;

    return-object p0
.end method


# virtual methods
.method public final b(ILjava/lang/Object;Ljava/lang/Object;)Lx7/p;
    .locals 2

    .prologue
    iget-object v0, p0, LD/q;->c:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/q$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LD/q$a;->f()I

    move-result v1

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, LD/q$a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    invoke-virtual {v0}, LD/q$a;->d()Lx7/p;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance v0, LD/q$a;

    invoke-direct {v0, p0, p1, p2, p3}, LD/q$a;-><init>(LD/q;ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, LD/q;->c:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, LD/q;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/q$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LD/q$a;->e()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LD/q;->b:Lx7/a;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/s;

    invoke-interface {v1, p1}, LD/s;->d(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_2

    invoke-interface {v1, p1}, LD/s;->e(I)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final d()Lx7/a;
    .locals 1

    iget-object v0, p0, LD/q;->b:Lx7/a;

    return-object v0
.end method
