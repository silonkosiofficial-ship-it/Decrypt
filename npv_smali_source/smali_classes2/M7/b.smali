.class public final LM7/b;
.super LR7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM7/b$a;,
        LM7/b$b;
    }
.end annotation


# static fields
.field public static final P:LM7/b$a;

.field private static final Q:Ln8/b;

.field private static final R:Ln8/b;


# instance fields
.field private final H:LE8/n;

.field private final I:LO7/K;

.field private final J:LM7/f;

.field private final K:I

.field private final L:LM7/b$b;

.field private final M:LM7/d;

.field private final N:Ljava/util/List;

.field private final O:LM7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LM7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM7/b$a;-><init>(Ly7/k;)V

    sput-object v0, LM7/b;->P:LM7/b$a;

    new-instance v0, Ln8/b;

    sget-object v1, LL7/j;->y:Ln8/c;

    const-string v2, "Function"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    sput-object v0, LM7/b;->Q:Ln8/b;

    new-instance v0, Ln8/b;

    sget-object v1, LL7/j;->v:Ln8/c;

    const-string v2, "KFunction"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    sput-object v0, LM7/b;->R:Ln8/b;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/K;LM7/f;I)V
    .locals 3

    .prologue
    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionTypeKind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, LM7/f;->c(I)Ln8/f;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LR7/a;-><init>(LE8/n;Ln8/f;)V

    iput-object p1, p0, LM7/b;->H:LE8/n;

    iput-object p2, p0, LM7/b;->I:LO7/K;

    iput-object p3, p0, LM7/b;->J:LM7/f;

    iput p4, p0, LM7/b;->K:I

    new-instance p2, LM7/b$b;

    invoke-direct {p2, p0}, LM7/b$b;-><init>(LM7/b;)V

    iput-object p2, p0, LM7/b;->L:LM7/b$b;

    new-instance p2, LM7/d;

    invoke-direct {p2, p1, p0}, LM7/d;-><init>(LE8/n;LM7/b;)V

    iput-object p2, p0, LM7/b;->M:LM7/d;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, LE7/i;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p4}, LE7/i;-><init>(II)V

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, Lj7/O;

    invoke-virtual {p4}, Lj7/O;->b()I

    move-result p4

    sget-object v0, LF8/u0;->H:LF8/u0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x50

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p0, v0, p4}, LM7/b;->T0(Ljava/util/ArrayList;LM7/b;LF8/u0;Ljava/lang/String;)V

    sget-object p4, Li7/M;->a:Li7/M;

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p2, LF8/u0;->I:LF8/u0;

    const-string p3, "R"

    invoke-static {p1, p0, p2, p3}, LM7/b;->T0(Ljava/util/ArrayList;LM7/b;LF8/u0;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LM7/b;->N:Ljava/util/List;

    sget-object p1, LM7/c;->C:LM7/c$a;

    iget-object p2, p0, LM7/b;->J:LM7/f;

    invoke-virtual {p1, p2}, LM7/c$a;->a(LM7/f;)LM7/c;

    move-result-object p1

    iput-object p1, p0, LM7/b;->O:LM7/c;

    return-void
.end method

.method private static final T0(Ljava/util/ArrayList;LM7/b;LF8/u0;Ljava/lang/String;)V
    .locals 8

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    invoke-static {p3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v6

    iget-object v7, p1, LM7/b;->H:LE8/n;

    const/4 v3, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-static/range {v1 .. v7}, LR7/K;->a1(LO7/m;LP7/g;ZLF8/u0;Ln8/f;ILE8/n;)LO7/f0;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final synthetic U0(LM7/b;)LO7/K;
    .locals 0

    iget-object p0, p0, LM7/b;->I:LO7/K;

    return-object p0
.end method

.method public static final synthetic V0()Ln8/b;
    .locals 1

    sget-object v0, LM7/b;->Q:Ln8/b;

    return-object v0
.end method

.method public static final synthetic W0()Ln8/b;
    .locals 1

    sget-object v0, LM7/b;->R:Ln8/b;

    return-object v0
.end method

.method public static final synthetic X0(LM7/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LM7/b;->N:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic Y0(LM7/b;)LE8/n;
    .locals 0

    iget-object p0, p0, LM7/b;->H:LE8/n;

    return-object p0
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM7/b;->N:Ljava/util/List;

    return-object v0
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public E()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic O()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LM7/b;->e1()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public P()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Q(LG8/g;)Ly8/h;
    .locals 0

    invoke-virtual {p0, p1}, LM7/b;->g1(LG8/g;)LM7/d;

    move-result-object p1

    return-object p1
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic X()LO7/d;
    .locals 1

    invoke-virtual {p0}, LM7/b;->h1()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LO7/d;

    return-object v0
.end method

.method public bridge synthetic Y()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LM7/b;->f1()Ly8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public final Z0()I
    .locals 1

    iget v0, p0, LM7/b;->K:I

    return v0
.end method

.method public bridge synthetic a0()LO7/e;
    .locals 1

    invoke-virtual {p0}, LM7/b;->a1()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LO7/e;

    return-object v0
.end method

.method public a1()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()LO7/m;
    .locals 1

    invoke-virtual {p0}, LM7/b;->c1()LO7/K;

    move-result-object v0

    return-object v0
.end method

.method public b1()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c1()LO7/K;
    .locals 1

    iget-object v0, p0, LM7/b;->I:LO7/K;

    return-object v0
.end method

.method public final d1()LM7/f;
    .locals 1

    iget-object v0, p0, LM7/b;->J:LM7/f;

    return-object v0
.end method

.method public e1()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f1()Ly8/h$b;
    .locals 1

    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    return-object v0
.end method

.method protected g1(LG8/g;)LM7/d;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LM7/b;->M:LM7/d;

    return-object p1
.end method

.method public h()LO7/u;
    .locals 2

    sget-object v0, LO7/t;->e:LO7/u;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h1()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j()LO7/f;
    .locals 1

    sget-object v0, LO7/f;->E:LO7/f;

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()LO7/a0;
    .locals 2

    sget-object v0, LO7/a0;->a:LO7/a0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public p()LF8/e0;
    .locals 1

    iget-object v0, p0, LM7/b;->L:LM7/b$b;

    return-object v0
.end method

.method public q()LO7/D;
    .locals 1

    sget-object v0, LO7/D;->G:LO7/D;

    return-object v0
.end method

.method public bridge synthetic r()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LM7/b;->b1()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
