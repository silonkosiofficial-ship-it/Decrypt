.class public abstract Laa/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LS8/o;

.field private static final b:Laa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS8/o;

    const-string v1, "%(\\d)\\$[ds]"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Laa/A;->a:LS8/o;

    new-instance v0, Laa/a;

    invoke-direct {v0}, Laa/a;-><init>()V

    sput-object v0, Laa/A;->b:Laa/a;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/String;)Laa/v;
    .locals 0

    invoke-static {p0}, Laa/A;->d(Ljava/lang/String;)Laa/v;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/lang/String;)Laa/w;
    .locals 0

    invoke-static {p0}, Laa/A;->e(Ljava/lang/String;)Laa/w;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ljava/lang/String;)Laa/x;
    .locals 0

    invoke-static {p0}, Laa/A;->f(Ljava/lang/String;)Laa/x;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/String;)Laa/v;
    .locals 8

    .prologue
    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LS8/r;->T0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    sget-object v2, Lu7/a;->d:Lu7/a$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lu7/a;->g(Lu7/a;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B

    move-result-object v1

    invoke-static {v1}, LS8/r;->C([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Laa/v;

    invoke-direct {p0, v0}, Laa/v;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final e(Ljava/lang/String;)Laa/w;
    .locals 12

    .prologue
    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LS8/r;->T0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lj7/S;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, LE7/j;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v2, 0x3a

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v3}, LS8/r;->p1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v3}, LS8/r;->h1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lba/a;->C:Lba/a$a;

    invoke-virtual {v0, v5}, Lba/a$a;->a(Ljava/lang/String;)Lba/a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v6, Lu7/a;->d:Lu7/a$a;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lu7/a;->g(Lu7/a;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B

    move-result-object v2

    invoke-static {v2}, LS8/r;->C([B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Laa/w;

    invoke-direct {p0, v1}, Laa/w;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Laa/x;
    .locals 7

    new-instance v0, Laa/x;

    sget-object v1, Lu7/a;->d:Lu7/a$a;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lu7/a;->g(Lu7/a;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B

    move-result-object p0

    invoke-static {p0}, LS8/r;->C([B)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laa/x;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final g(Laa/q;Laa/r;Lm7/e;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Laa/A;->b:Laa/a;

    invoke-virtual {p0}, Laa/q;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Laa/q;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Laa/q;->d()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laa/A$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Laa/A$a;-><init>(Laa/r;Laa/q;Lm7/e;)V

    invoke-virtual {v0, v1, v2, p2}, Laa/a;->c(Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Laa/A;->a:LS8/o;

    new-instance v1, Laa/A$b;

    invoke-direct {v1, p1}, Laa/A$b;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, p0, v1}, LS8/o;->f(Ljava/lang/CharSequence;Lx7/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
