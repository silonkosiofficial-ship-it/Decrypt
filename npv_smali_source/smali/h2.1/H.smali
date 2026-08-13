.class public abstract Lh2/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm7/i;

.field private b:Lh2/o;

.field private c:Lh2/X;

.field private d:Lh2/C;

.field private final e:Lh2/v;

.field private final f:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final g:Lh2/V;

.field private volatile h:Z

.field private volatile i:I

.field private final j:LZ8/y;

.field private final k:LZ8/N;

.field private final l:LZ8/x;


# direct methods
.method public constructor <init>(Lm7/i;Lh2/F;)V
    .locals 3

    .prologue
    const-string v0, "mainContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/H;->a:Lm7/i;

    sget-object p1, Lh2/C;->e:Lh2/C$a;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lh2/F;->a()Lh2/x$b;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1, v1}, Lh2/C$a;->a(Lh2/x$b;)Lh2/C;

    move-result-object p1

    iput-object p1, p0, Lh2/H;->d:Lh2/C;

    new-instance p1, Lh2/v;

    invoke-direct {p1}, Lh2/v;-><init>()V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lh2/F;->a()Lh2/x$b;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lh2/x$b;->k()Lh2/s;

    move-result-object v1

    invoke-virtual {p2}, Lh2/x$b;->g()Lh2/s;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lh2/v;->f(Lh2/s;Lh2/s;)V

    :cond_1
    iput-object p1, p0, Lh2/H;->e:Lh2/v;

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Lh2/H;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p2, Lh2/V;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p2, v2, v1, v0}, Lh2/V;-><init>(ZILy7/k;)V

    iput-object p2, p0, Lh2/H;->g:Lh2/V;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object p2

    iput-object p2, p0, Lh2/H;->j:LZ8/y;

    invoke-virtual {p1}, Lh2/v;->e()LZ8/N;

    move-result-object p1

    iput-object p1, p0, Lh2/H;->k:LZ8/N;

    const/16 p1, 0x40

    sget-object p2, LY8/d;->D:LY8/d;

    invoke-static {v2, p1, p2}, LZ8/E;->a(IILY8/d;)LZ8/x;

    move-result-object p1

    iput-object p1, p0, Lh2/H;->l:LZ8/x;

    new-instance p1, Lh2/H$a;

    invoke-direct {p1, p0}, Lh2/H$a;-><init>(Lh2/H;)V

    invoke-virtual {p0, p1}, Lh2/H;->m(Lx7/a;)V

    return-void
.end method

.method public static final synthetic a(Lh2/H;)Lh2/v;
    .locals 0

    iget-object p0, p0, Lh2/H;->e:Lh2/v;

    return-object p0
.end method

.method public static final synthetic b(Lh2/H;)Lh2/o;
    .locals 0

    iget-object p0, p0, Lh2/H;->b:Lh2/o;

    return-object p0
.end method

.method public static final synthetic c(Lh2/H;)LZ8/y;
    .locals 0

    iget-object p0, p0, Lh2/H;->j:LZ8/y;

    return-object p0
.end method

.method public static final synthetic d(Lh2/H;)I
    .locals 0

    iget p0, p0, Lh2/H;->i:I

    return p0
.end method

.method public static final synthetic e(Lh2/H;)Z
    .locals 0

    iget-boolean p0, p0, Lh2/H;->h:Z

    return p0
.end method

.method public static final synthetic f(Lh2/H;)Lm7/i;
    .locals 0

    iget-object p0, p0, Lh2/H;->a:Lm7/i;

    return-object p0
.end method

.method public static final synthetic g(Lh2/H;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lh2/H;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic h(Lh2/H;)Lh2/C;
    .locals 0

    iget-object p0, p0, Lh2/H;->d:Lh2/C;

    return-object p0
.end method

.method public static final synthetic i(Lh2/H;)LZ8/x;
    .locals 0

    iget-object p0, p0, Lh2/H;->l:LZ8/x;

    return-object p0
.end method

.method public static final synthetic j(Lh2/H;Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p8}, Lh2/H;->q(Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lh2/H;Z)V
    .locals 0

    iput-boolean p1, p0, Lh2/H;->h:Z

    return-void
.end method

.method public static final synthetic l(Lh2/H;Lh2/X;)V
    .locals 0

    iput-object p1, p0, Lh2/H;->c:Lh2/X;

    return-void
.end method

.method private final q(Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p8, Lh2/H$c;

    if-eqz v0, :cond_0

    move-object v0, p8

    check-cast v0, Lh2/H$c;

    iget v1, v0, Lh2/H$c;->Q:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/H$c;->Q:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/H$c;

    invoke-direct {v0, p0, p8}, Lh2/H$c;-><init>(Lh2/H;Lm7/e;)V

    :goto_0
    iget-object p8, v0, Lh2/H$c;->O:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/H$c;->Q:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p4, v0, Lh2/H$c;->N:Z

    iget p3, v0, Lh2/H$c;->M:I

    iget p2, v0, Lh2/H$c;->L:I

    iget-object p1, v0, Lh2/H$c;->K:Ljava/lang/Object;

    check-cast p1, Lh2/C;

    iget-object p5, v0, Lh2/H$c;->J:Ljava/lang/Object;

    move-object p7, p5

    check-cast p7, Lh2/o;

    iget-object p5, v0, Lh2/H$c;->I:Ljava/lang/Object;

    move-object p6, p5

    check-cast p6, Lh2/s;

    iget-object p5, v0, Lh2/H$c;->H:Ljava/lang/Object;

    check-cast p5, Lh2/s;

    iget-object v1, v0, Lh2/H$c;->G:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lh2/H$c;->F:Ljava/lang/Object;

    check-cast v0, Lh2/H;

    invoke-static {p8}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p8, p1

    move-object p1, v1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p8}, Li7/x;->b(Ljava/lang/Object;)V

    if-eqz p4, :cond_4

    if-eqz p5, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    const/4 p8, 0x0

    iput-boolean p8, p0, Lh2/H;->h:Z

    new-instance p8, Lh2/C;

    invoke-direct {p8, p1, p2, p3}, Lh2/C;-><init>(Ljava/util/List;II)V

    iget-object v2, p0, Lh2/H;->d:Lh2/C;

    const-string v4, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>"

    invoke-static {v2, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p8, p0, Lh2/H;->d:Lh2/C;

    iput-object p7, p0, Lh2/H;->b:Lh2/o;

    new-instance v4, Lh2/G$e;

    invoke-direct {v4, p8, v2}, Lh2/G$e;-><init>(Lh2/N;Lh2/N;)V

    iput-object p0, v0, Lh2/H$c;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/H$c;->G:Ljava/lang/Object;

    iput-object p5, v0, Lh2/H$c;->H:Ljava/lang/Object;

    iput-object p6, v0, Lh2/H$c;->I:Ljava/lang/Object;

    iput-object p7, v0, Lh2/H$c;->J:Ljava/lang/Object;

    iput-object p8, v0, Lh2/H$c;->K:Ljava/lang/Object;

    iput p2, v0, Lh2/H$c;->L:I

    iput p3, v0, Lh2/H$c;->M:I

    iput-boolean p4, v0, Lh2/H$c;->N:Z

    iput v3, v0, Lh2/H$c;->Q:I

    invoke-virtual {p0, v4, v0}, Lh2/H;->r(Lh2/G;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, p0

    :goto_2
    sget-object v1, Lh2/K;->a:Lh2/K;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lh2/K;->a(I)Z

    move-result v4

    if-eqz v4, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Presenting data (\n                            |   first item: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh2/W;

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lh2/W;->b()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-static {v5}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :cond_6
    move-object v5, v6

    :goto_3
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\n                            |   last item: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/W;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lh2/W;->b()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_7
    move-object p1, v6

    :goto_4
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n                            |   placeholdersBefore: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\n                            |   placeholdersAfter: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\n                            |   hintReceiver: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n                            |   sourceLoadStates: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n                        "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p6, :cond_8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|   mediatorLoadStates: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|)"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, v3, v6}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v6}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    if-eqz p4, :cond_a

    iget-object p1, v0, Lh2/H;->e:Lh2/v;

    invoke-static {p5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p5, p6}, Lh2/v;->f(Lh2/s;Lh2/s;)V

    :cond_a
    invoke-virtual {p8}, Lh2/C;->a()I

    move-result p1

    if-nez p1, :cond_b

    iget-object p1, v0, Lh2/H;->b:Lh2/o;

    if-eqz p1, :cond_b

    invoke-virtual {p8}, Lh2/C;->o()Lh2/Z$b;

    move-result-object p2

    invoke-interface {p1, p2}, Lh2/o;->a(Lh2/Z;)V

    :cond_b
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method


# virtual methods
.method public final m(Lx7/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/H;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final n(Lh2/F;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lh2/H;->g:Lh2/V;

    new-instance v2, Lh2/H$b;

    const/4 v1, 0x0

    invoke-direct {v2, p0, p1, v1}, Lh2/H$b;-><init>(Lh2/H;Lh2/F;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lh2/V;->c(Lh2/V;ILx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final o(I)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Lh2/H;->j:LZ8/y;

    :cond_0
    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh2/H;->h:Z

    iput p1, p0, Lh2/H;->i:I

    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lh2/K;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Accessing item index["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lh2/H;->b:Lh2/o;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lh2/H;->d:Lh2/C;

    invoke-virtual {v1, p1}, Lh2/C;->f(I)Lh2/Z$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lh2/o;->a(Lh2/Z;)V

    :cond_2
    iget-object v0, p0, Lh2/H;->d:Lh2/C;

    invoke-virtual {v0, p1}, Lh2/C;->k(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lh2/H;->j:LZ8/y;

    :cond_3
    invoke-interface {v2}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, p1, v0}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-object v1
.end method

.method public final p()LZ8/N;
    .locals 1

    iget-object v0, p0, Lh2/H;->k:LZ8/N;

    return-object v0
.end method

.method public abstract r(Lh2/G;Lm7/e;)Ljava/lang/Object;
.end method

.method public final s()Lh2/q;
    .locals 1

    iget-object v0, p0, Lh2/H;->d:Lh2/C;

    invoke-virtual {v0}, Lh2/C;->r()Lh2/q;

    move-result-object v0

    return-object v0
.end method
