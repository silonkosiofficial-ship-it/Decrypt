.class public final LR0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/h$b;


# instance fields
.field private final a:LR0/w;

.field private final b:LR0/y;

.field private final c:LR0/G;

.field private final d:LR0/m;

.field private final e:LR0/v;

.field private final f:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR0/w;LR0/y;LR0/G;LR0/m;LR0/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/j;->a:LR0/w;

    iput-object p2, p0, LR0/j;->b:LR0/y;

    iput-object p3, p0, LR0/j;->c:LR0/G;

    iput-object p4, p0, LR0/j;->d:LR0/m;

    iput-object p5, p0, LR0/j;->e:LR0/v;

    new-instance p1, LR0/j$a;

    invoke-direct {p1, p0}, LR0/j$a;-><init>(LR0/j;)V

    iput-object p1, p0, LR0/j;->f:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(LR0/w;LR0/y;LR0/G;LR0/m;LR0/v;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p2, LR0/y;->a:LR0/y$a;

    invoke-virtual {p2}, LR0/y$a;->a()LR0/y;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    invoke-static {}, LR0/k;->b()LR0/G;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    new-instance p4, LR0/m;

    invoke-static {}, LR0/k;->a()LR0/e;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p7, 0x2

    invoke-direct {p4, p2, p3, p7, p3}, LR0/m;-><init>(LR0/e;Lm7/i;ILy7/k;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    new-instance p5, LR0/v;

    invoke-direct {p5}, LR0/v;-><init>()V

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LR0/j;-><init>(LR0/w;LR0/y;LR0/G;LR0/m;LR0/v;)V

    return-void
.end method

.method public static final synthetic b(LR0/j;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR0/j;->f:Lx7/l;

    return-object p0
.end method

.method public static final synthetic c(LR0/j;)LR0/m;
    .locals 0

    iget-object p0, p0, LR0/j;->d:LR0/m;

    return-object p0
.end method

.method public static final synthetic d(LR0/j;)LR0/v;
    .locals 0

    iget-object p0, p0, LR0/j;->e:LR0/v;

    return-object p0
.end method

.method public static final synthetic e(LR0/j;LR0/F;)LV/G1;
    .locals 0

    invoke-direct {p0, p1}, LR0/j;->g(LR0/F;)LV/G1;

    move-result-object p0

    return-object p0
.end method

.method private final g(LR0/F;)LV/G1;
    .locals 2

    iget-object v0, p0, LR0/j;->c:LR0/G;

    new-instance v1, LR0/j$b;

    invoke-direct {v1, p0, p1}, LR0/j$b;-><init>(LR0/j;LR0/F;)V

    invoke-virtual {v0, p1, v1}, LR0/G;->c(LR0/F;Lx7/l;)LV/G1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(LR0/h;LR0/q;II)LV/G1;
    .locals 8

    new-instance v7, LR0/F;

    iget-object v0, p0, LR0/j;->b:LR0/y;

    invoke-interface {v0, p1}, LR0/y;->a(LR0/h;)LR0/h;

    move-result-object v1

    iget-object p1, p0, LR0/j;->b:LR0/y;

    invoke-interface {p1, p2}, LR0/y;->c(LR0/q;)LR0/q;

    move-result-object v2

    iget-object p1, p0, LR0/j;->b:LR0/y;

    invoke-interface {p1, p3}, LR0/y;->b(I)I

    move-result v3

    iget-object p1, p0, LR0/j;->b:LR0/y;

    invoke-interface {p1, p4}, LR0/y;->d(I)I

    move-result v4

    iget-object p1, p0, LR0/j;->a:LR0/w;

    invoke-interface {p1}, LR0/w;->a()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LR0/F;-><init>(LR0/h;LR0/q;IILjava/lang/Object;Ly7/k;)V

    invoke-direct {p0, v7}, LR0/j;->g(LR0/F;)LV/G1;

    move-result-object p1

    return-object p1
.end method

.method public final f()LR0/w;
    .locals 1

    iget-object v0, p0, LR0/j;->a:LR0/w;

    return-object v0
.end method
