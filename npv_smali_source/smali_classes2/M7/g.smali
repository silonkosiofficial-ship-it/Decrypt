.class public final LM7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM7/g$a;,
        LM7/g$b;
    }
.end annotation


# static fields
.field public static final c:LM7/g$a;

.field private static final d:LM7/g;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LM7/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM7/g$a;-><init>(Ly7/k;)V

    sput-object v0, LM7/g;->c:LM7/g$a;

    new-instance v0, LM7/g;

    const/4 v1, 0x4

    new-array v1, v1, [LM7/f;

    sget-object v2, LM7/f$a;->e:LM7/f$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, LM7/f$d;->e:LM7/f$d;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, LM7/f$b;->e:LM7/f$b;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, LM7/f$c;->e:LM7/f$c;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LM7/g;-><init>(Ljava/util/List;)V

    sput-object v0, LM7/g;->d:LM7/g;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4

    .prologue
    const-string v0, "kinds"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM7/g;->a:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LM7/f;

    invoke-virtual {v2}, LM7/f;->b()Ln8/c;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object v0, p0, LM7/g;->b:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a()LM7/g;
    .locals 1

    sget-object v0, LM7/g;->d:LM7/g;

    return-object v0
.end method

.method private final d(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 6

    .prologue
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v4, v4, -0x30

    if-ltz v4, :cond_1

    const/16 v5, 0xa

    if-ge v4, v5, :cond_1

    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Ln8/c;Ljava/lang/String;)LM7/f;
    .locals 1

    .prologue
    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LM7/g;->c(Ln8/c;Ljava/lang/String;)LM7/g$b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LM7/g$b;->c()LM7/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final c(Ln8/c;Ljava/lang/String;)LM7/g$b;
    .locals 5

    .prologue
    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM7/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM7/f;

    invoke-virtual {v1}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p2, v2, v3, v4, v0}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, LM7/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2}, LM7/g;->d(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance p2, LM7/g$b;

    invoke-direct {p2, v1, p1}, LM7/g$b;-><init>(LM7/f;I)V

    return-object p2

    :cond_2
    return-object v0
.end method
