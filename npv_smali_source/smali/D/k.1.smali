.class public final LD/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/k;
.implements LD0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/k$b;,
        LD/k$c;
    }
.end annotation


# static fields
.field public static final g:LD/k$b;

.field private static final h:LD/k$a;


# instance fields
.field private final b:LD/m;

.field private final c:LD/j;

.field private final d:Z

.field private final e:LY0/v;

.field private final f:Lx/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD/k$b;-><init>(Ly7/k;)V

    sput-object v0, LD/k;->g:LD/k$b;

    new-instance v0, LD/k$a;

    invoke-direct {v0}, LD/k$a;-><init>()V

    sput-object v0, LD/k;->h:LD/k$a;

    return-void
.end method

.method public constructor <init>(LD/m;LD/j;ZLY0/v;Lx/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/k;->b:LD/m;

    iput-object p2, p0, LD/k;->c:LD/j;

    iput-boolean p3, p0, LD/k;->d:Z

    iput-object p4, p0, LD/k;->e:LY0/v;

    iput-object p5, p0, LD/k;->f:Lx/s;

    return-void
.end method

.method public static final synthetic j(LD/k;LD/j$a;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LD/k;->n(LD/j$a;I)Z

    move-result p0

    return p0
.end method

.method private final l(LD/j$a;I)LD/j$a;
    .locals 1

    .prologue
    invoke-virtual {p1}, LD/j$a;->b()I

    move-result v0

    invoke-virtual {p1}, LD/j$a;->a()I

    move-result p1

    invoke-direct {p0, p2}, LD/k;->o(I)Z

    move-result p2

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget-object p2, p0, LD/k;->c:LD/j;

    invoke-virtual {p2, v0, p1}, LD/j;->a(II)LD/j$a;

    move-result-object p1

    return-object p1
.end method

.method private final n(LD/j$a;I)Z
    .locals 2

    .prologue
    invoke-direct {p0, p2}, LD/k;->p(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p2}, LD/k;->o(I)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LD/j$a;->a()I

    move-result p1

    iget-object p2, p0, LD/k;->b:LD/m;

    invoke-interface {p2}, LD/m;->a()I

    move-result p2

    sub-int/2addr p2, v0

    if-ge p1, p2, :cond_2

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LD/j$a;->b()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method private final o(I)Z
    .locals 5

    .prologue
    sget-object v0, LD0/e$b;->a:LD0/e$b$a;

    invoke-virtual {v0}, LD0/e$b$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, LD0/e$b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    :goto_0
    move v2, v3

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, LD0/e$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    :goto_1
    iget-boolean v2, p0, LD/k;->d:Z

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, LD0/e$b$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-boolean p1, p0, LD/k;->d:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LD0/e$b$a;->e()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    const/4 v4, 0x2

    if-eqz v1, :cond_6

    iget-object p1, p0, LD/k;->e:LY0/v;

    sget-object v0, LD/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_2

    if-ne p1, v4, :cond_5

    iget-boolean p1, p0, LD/k;->d:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_5
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_6
    invoke-virtual {v0}, LD0/e$b$a;->f()I

    move-result v0

    invoke-static {p1, v0}, LD0/e$b;->h(II)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, LD/k;->e:LY0/v;

    sget-object v0, LD/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_8

    if-ne p1, v4, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_8
    iget-boolean p1, p0, LD/k;->d:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    :goto_2
    return v2

    :cond_a
    invoke-static {}, LD/l;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method private final p(I)Z
    .locals 4

    .prologue
    sget-object v0, LD0/e$b;->a:LD0/e$b$a;

    invoke-virtual {v0}, LD0/e$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LD0/e$b$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object p1, p0, LD/k;->f:Lx/s;

    sget-object v0, Lx/s;->D:Lx/s;

    if-ne p1, v0, :cond_1

    goto :goto_4

    :cond_1
    :goto_1
    move v2, v3

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, LD0/e$b$a;->e()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, LD0/e$b$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_4

    iget-object p1, p0, LD/k;->f:Lx/s;

    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, LD0/e$b$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LD0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, LD0/e$b$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LD0/e$b;->h(II)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_6

    goto :goto_1

    :goto_4
    return v2

    :cond_6
    invoke-static {}, LD/l;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method


# virtual methods
.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public g(ILx7/l;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, LD/k;->b:LD/m;

    invoke-interface {v0}, LD/m;->a()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, LD/k;->b:LD/m;

    invoke-interface {v0}, LD/m;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, p1}, LD/k;->o(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LD/k;->b:LD/m;

    invoke-interface {v0}, LD/m;->b()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LD/k;->b:LD/m;

    invoke-interface {v0}, LD/m;->e()I

    move-result v0

    :goto_0
    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iget-object v2, p0, LD/k;->c:LD/j;

    invoke-virtual {v2, v0, v0}, LD/j;->a(II)LD/j$a;

    move-result-object v0

    iput-object v0, v1, Ly7/O;->C:Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    iget-object v2, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v2, LD/j$a;

    invoke-direct {p0, v2, p1}, LD/k;->n(LD/j$a;I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, LD/j$a;

    invoke-direct {p0, v0, p1}, LD/k;->l(LD/j$a;I)LD/j$a;

    move-result-object v0

    iget-object v2, p0, LD/k;->c:LD/j;

    iget-object v3, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v3, LD/j$a;

    invoke-virtual {v2, v3}, LD/j;->e(LD/j$a;)V

    iput-object v0, v1, Ly7/O;->C:Ljava/lang/Object;

    iget-object v0, p0, LD/k;->b:LD/m;

    invoke-interface {v0}, LD/m;->c()V

    new-instance v0, LD/k$d;

    invoke-direct {v0, p0, v1, p1}, LD/k$d;-><init>(LD/k;Ly7/O;I)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object p1, p0, LD/k;->c:LD/j;

    iget-object p2, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast p2, LD/j$a;

    invoke-virtual {p1, p2}, LD/j;->e(LD/j$a;)V

    iget-object p1, p0, LD/k;->b:LD/m;

    invoke-interface {p1}, LD/m;->c()V

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, LD/k;->h:LD/k$a;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getKey()LE0/m;
    .locals 1

    invoke-static {}, LD0/f;->a()LE0/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD/k;->m()LD0/e;

    move-result-object v0

    return-object v0
.end method

.method public m()LD0/e;
    .locals 0

    return-object p0
.end method
