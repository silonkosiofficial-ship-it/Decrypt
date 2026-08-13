.class public Le5/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private d:I

.field private e:I

.field private f:Le5/h;

.field private final g:Ljava/util/Set;


# direct methods
.method private varargs constructor <init>(Le5/F;[Le5/F;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le5/c$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le5/c$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Le5/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Le5/c$b;->d:I

    iput v1, p0, Le5/c$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Le5/c$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le5/c$b;->b:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method synthetic constructor <init>(Le5/F;[Le5/F;Le5/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le5/c$b;-><init>(Le5/F;[Le5/F;)V

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le5/c$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le5/c$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Le5/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Le5/c$b;->d:I

    iput v1, p0, Le5/c$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Le5/c$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v3, p0, Le5/c$b;->b:Ljava/util/Set;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Le5/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le5/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic a(Le5/c$b;)Le5/c$b;
    .locals 0

    invoke-direct {p0}, Le5/c$b;->g()Le5/c$b;

    move-result-object p0

    return-object p0
.end method

.method private g()Le5/c$b;
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le5/c$b;->e:I

    return-object p0
.end method

.method private i(I)Le5/c$b;
    .locals 2

    .prologue
    iget v0, p0, Le5/c$b;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Instantiation type has already been set."

    invoke-static {v0, v1}, Le5/E;->d(ZLjava/lang/String;)V

    iput p1, p0, Le5/c$b;->d:I

    return-object p0
.end method

.method private j(Le5/F;)V
    .locals 1

    iget-object v0, p0, Le5/c$b;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-static {p1, v0}, Le5/E;->a(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Le5/r;)Le5/c$b;
    .locals 1

    const-string v0, "Null dependency"

    invoke-static {p1, v0}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Le5/r;->c()Le5/F;

    move-result-object v0

    invoke-direct {p0, v0}, Le5/c$b;->j(Le5/F;)V

    iget-object v0, p0, Le5/c$b;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Le5/c$b;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Le5/c$b;->i(I)Le5/c$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Le5/c;
    .locals 11

    .prologue
    iget-object v0, p0, Le5/c$b;->f:Le5/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Missing required property: factory."

    invoke-static {v0, v1}, Le5/E;->d(ZLjava/lang/String;)V

    new-instance v0, Le5/c;

    iget-object v3, p0, Le5/c$b;->a:Ljava/lang/String;

    new-instance v4, Ljava/util/HashSet;

    iget-object v1, p0, Le5/c$b;->b:Ljava/util/Set;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/HashSet;

    iget-object v1, p0, Le5/c$b;->c:Ljava/util/Set;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget v6, p0, Le5/c$b;->d:I

    iget v7, p0, Le5/c$b;->e:I

    iget-object v8, p0, Le5/c$b;->f:Le5/h;

    iget-object v9, p0, Le5/c$b;->g:Ljava/util/Set;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Le5/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILe5/h;Ljava/util/Set;Le5/c$a;)V

    return-object v0
.end method

.method public e()Le5/c$b;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Le5/c$b;->i(I)Le5/c$b;

    move-result-object v0

    return-object v0
.end method

.method public f(Le5/h;)Le5/c$b;
    .locals 1

    const-string v0, "Null factory"

    invoke-static {p1, v0}, Le5/E;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le5/h;

    iput-object p1, p0, Le5/c$b;->f:Le5/h;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Le5/c$b;
    .locals 0

    iput-object p1, p0, Le5/c$b;->a:Ljava/lang/String;

    return-object p0
.end method
