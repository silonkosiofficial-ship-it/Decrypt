.class final Lx/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/o;


# instance fields
.field private final a:Lx7/l;

.field private final b:Lx/m;

.field private final c:Lv/N;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/i;->a:Lx7/l;

    new-instance p1, Lx/i$b;

    invoke-direct {p1, p0}, Lx/i$b;-><init>(Lx/i;)V

    iput-object p1, p0, Lx/i;->b:Lx/m;

    new-instance p1, Lv/N;

    invoke-direct {p1}, Lv/N;-><init>()V

    iput-object p1, p0, Lx/i;->c:Lv/N;

    return-void
.end method

.method public static final synthetic b(Lx/i;)Lx/m;
    .locals 0

    iget-object p0, p0, Lx/i;->b:Lx/m;

    return-object p0
.end method

.method public static final synthetic c(Lx/i;)Lv/N;
    .locals 0

    iget-object p0, p0, Lx/i;->c:Lv/N;

    return-object p0
.end method


# virtual methods
.method public a(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Lx/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lx/i$a;-><init>(Lx/i;Lv/L;Lx7/p;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final d()Lx7/l;
    .locals 1

    iget-object v0, p0, Lx/i;->a:Lx7/l;

    return-object v0
.end method
